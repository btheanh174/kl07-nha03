package action.user;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import model.dao.NhomNguoiDungDAO;
import model.dao.TaiKhoanDAO;
import model.dao.ThanhVienDAO;
import model.pojo.NhomNguoiDung;
import model.pojo.TaiKhoan;
import model.pojo.ThanhVien;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import util.HashUtil;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction  extends ActionSupport implements ServletRequestAware, SessionAware{
	
	private String tenTruyCap;
	private String matKhau;
	private String xacNhanMatKhau;
	private String hoTen;
	private String email;
	private String xacNhanEmail;
	
	
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
}
