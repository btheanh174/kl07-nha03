package action.user;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import model.dao.NhomNguoiDungDAO;
import model.dao.TaiKhoanDAO;
import model.dao.ThanhVienDAO;
import model.dao.TinhThanhPhoDAO;
import model.pojo.NhomNguoiDung;
import model.pojo.TaiKhoan;
import model.pojo.ThanhVien;
import model.pojo.TinhThanhPho;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import util.HashUtil;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction  extends ActionSupport implements ServletRequestAware, SessionAware{
	private String tenTruyCap;
	private String matKhau;
	private String xacNhanMatKhau;
	private String hoTen;
	private String email;
	private String xacNhanEmail;
	private String diaChi;
	private String gioiTinh;
	private String dienThoai;
	private String tinhThanhPho;
	private ArrayList<TinhThanhPho> dsTinhThanhPho;
	
	Map session;
	HttpServletRequest servletRequest;
	TaiKhoanDAO tkDao = new TaiKhoanDAO();
	ThanhVienDAO tvDao = new ThanhVienDAO();
	NhomNguoiDungDAO nndDao = new NhomNguoiDungDAO();
	
	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	
	public String register() throws UnsupportedEncodingException{
		String salt = HashUtil.generateSalt(6);
		String saltedPassword = salt + getMatKhau();
		String hashedPassword = HashUtil.generateHash(saltedPassword);
		TaiKhoan taiKhoan = new TaiKhoan();
		taiKhoan.setTenTruyCap(getTenTruyCap());
		taiKhoan.setSalt(salt);
		taiKhoan.setMatKhau(hashedPassword);
		
		NhomNguoiDung member = nndDao.lay(1);
		taiKhoan.setNhomNguoiDung(member);
		
		ThanhVien thanhVien = new ThanhVien();
		thanhVien.setHoTen(getHoTen());
		thanhVien.setEmail(getEmail());
		thanhVien.setDiaChi("TN");
		thanhVien.setDienThoai("1674560436");
		
		taiKhoan.setThanhVien(thanhVien);
		thanhVien.setTaiKhoan(taiKhoan);
		
		tkDao.them(taiKhoan);
		
		session.put("tk", taiKhoan);
		
		return SUCCESS;
	}
	
	public String getTenTruyCap() {
		return tenTruyCap;
	}
	public void setTenTruyCap(String tenTruyCap) {
		this.tenTruyCap = tenTruyCap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getXacNhanMatKhau() {
		return xacNhanMatKhau;
	}
	public void setXacNhanMatKhau(String xacNhanMatKhau) {
		this.xacNhanMatKhau = xacNhanMatKhau;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getXacNhanEmail() {
		return xacNhanEmail;
	}
	public void setXacNhanEmail(String xacNhanEmail) {
		this.xacNhanEmail = xacNhanEmail;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public String getTinhThanhPho() {
		return tinhThanhPho;
	}
	public void setTinhThanhPho(String tinhThanhPho) {
		this.tinhThanhPho = tinhThanhPho;
	}
	public ArrayList<TinhThanhPho> getDsTinhThanhPho() {
		return dsTinhThanhPho;
	}
	public void setDsTinhThanhPho(ArrayList<TinhThanhPho> dsTinhThanhPho) {
		this.dsTinhThanhPho = dsTinhThanhPho;
	}
}
