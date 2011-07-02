package com.estore.shop.action.user;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.estore.core.model.dao.GianHangDAO;
import com.estore.core.model.dao.NhomNguoiDungDAO;
import com.estore.core.model.dao.TaiKhoanDAO;
import com.estore.core.model.dao.ThanhVienDAO;
import com.estore.core.model.dao.TinhThanhPhoDAO;
import com.estore.core.model.pojo.GianHang;
import com.estore.core.model.pojo.NhomNguoiDung;
import com.estore.core.model.pojo.TaiKhoan;
import com.estore.core.model.pojo.ThanhVien;
import com.estore.core.model.pojo.TinhThanhPho;
import com.estore.core.util.HashUtil;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport implements
		ServletRequestAware, SessionAware {
	private String tenTruyCap;
	private String matKhau;
	private String xacNhanMatKhau;
	private String hoTen;
	private String email;
	private String xacNhanEmail;
	private String diaChi;
	private String gioiTinh;
	private String dienThoai;
	private int tinhThanhPho;
	private ArrayList<TinhThanhPho> dsTinhThanhPho;
	private Boolean moGianHang;

	private GianHang gianHang;
	private File logo;
	private String logoContentType;
	private String logoFileName;
	private File banner;
	private String bannerContentType;
	private String bannerFileName;
	private int vung;

	Map session;
	HttpServletRequest servletRequest;
	TaiKhoanDAO tkDao = new TaiKhoanDAO();
	ThanhVienDAO tvDao = new ThanhVienDAO();
	NhomNguoiDungDAO nndDao = new NhomNguoiDungDAO();

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String register() throws UnsupportedEncodingException {
		System.out.println("Dang ky");
		
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
		thanhVien.setDiaChi(getDiaChi());
		thanhVien.setDienThoai(getDienThoai());

		TinhThanhPho ttp = new TinhThanhPhoDAO().lay(getTinhThanhPho());
		thanhVien.setTinhThanhPho(ttp);

		taiKhoan.setThanhVien(thanhVien);
		thanhVien.setTaiKhoan(taiKhoan);
		

		if (moGianHang == true) {
			
			member = nndDao.lay(2);
			taiKhoan.setNhomNguoiDung(member);
			tkDao.them(taiKhoan);
			// Thêm gian hàng tại đây
			System.out.println(vung);
			TinhThanhPho t = new TinhThanhPhoDAO().lay(vung);
			gianHang.setTinhThanhPho(t);
			
			ServletContext servletContext = ServletActionContext
					.getServletContext();
			String dataDir = servletContext.getRealPath("/WEB-INF")
					+ "\\uploadPicture";
			File folder = new File(dataDir);
			if (!folder.exists()) {
				folder.mkdir();
			}
			
			if (logo != null)
			{
				File savedFile = new File(dataDir, logoFileName);
				logo.renameTo(savedFile);
				gianHang.setLogo(logoFileName);
			}
			if (banner != null)
			{
				File savedFile = new File(dataDir, bannerFileName);
				banner.renameTo(savedFile);
				gianHang.setLogo(bannerFileName);
			}
			gianHang.setTaiKhoan(taiKhoan);
			GianHangDAO ghDao = new GianHangDAO();
			ghDao.them(gianHang);
			
		}
		else
		{
			tkDao.them(taiKhoan);
		}

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

	public int getTinhThanhPho() {
		return tinhThanhPho;
	}

	public void setTinhThanhPho(int tinhThanhPho) {
		this.tinhThanhPho = tinhThanhPho;
	}

	public ArrayList<TinhThanhPho> getDsTinhThanhPho() {
		return dsTinhThanhPho;
	}

	public void setDsTinhThanhPho(ArrayList<TinhThanhPho> dsTinhThanhPho) {
		this.dsTinhThanhPho = dsTinhThanhPho;
	}

	
	public File getLogo() {
		return logo;
	}

	public void setLogo(File logo) {
		this.logo = logo;
	}

	public String getLogoContentType() {
		return logoContentType;
	}

	public void setLogoContentType(String logoContentType) {
		this.logoContentType = logoContentType;
	}

	public String getLogoFileName() {
		return logoFileName;
	}

	public void setLogoFileName(String logoFileName) {
		this.logoFileName = logoFileName;
	}

	public File getBanner() {
		return banner;
	}

	public void setBanner(File banner) {
		this.banner = banner;
	}

	public String getBannerContentType() {
		return bannerContentType;
	}

	public void setBannerContentType(String bannerContentType) {
		this.bannerContentType = bannerContentType;
	}

	public String getBannerFileName() {
		return bannerFileName;
	}

	public void setBannerFileName(String bannerFileName) {
		this.bannerFileName = bannerFileName;
	}

	public Boolean getMoGianHang() {
		return moGianHang;
	}

	public void setMoGianHang(Boolean moGianHang) {
		this.moGianHang = moGianHang;
	}


	public int getVung() {
		return vung;
	}

	public void setVung(int vung) {
		this.vung = vung;
	}

	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}
}
