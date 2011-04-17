package model.pojo;

import java.util.Date;
import java.util.List;

public class ThanhVien {
	private int maThanhVien;
	private String hoTen;
	private String dienThoai;
	private String diaChi;
	private String email;
	private Date ngaySinh;
	private TaiKhoan taiKhoan;
	private TinhThanhPho tinhThanhPho;
	private List dsTinNhan;
	
	public ThanhVien() {
		super();
		
	}
	
	public ThanhVien(String hoTen, String dienThoai, String diaChi,
			String email, Date ngaySinh, TaiKhoan taiKhoan, List dsTinNhan) {
		super();
		this.hoTen = hoTen;
		this.dienThoai = dienThoai;
		this.diaChi = diaChi;
		this.email = email;
		this.ngaySinh = ngaySinh;
		this.taiKhoan = taiKhoan;
		this.dsTinNhan = dsTinNhan;
	}


	public ThanhVien(ThanhVien thanhVien){
		this.maThanhVien = thanhVien.maThanhVien;
		this.hoTen = thanhVien.hoTen;
		this.dienThoai = thanhVien.dienThoai;
		this.diaChi = thanhVien.diaChi;
		this.email = thanhVien.email;
		this.ngaySinh = thanhVien.ngaySinh;
		this.dsTinNhan = thanhVien.dsTinNhan;
	}
	
	public int getMaThanhVien() {
		return maThanhVien;
	}
	public void setMaThanhVien(int maThanhVien) {
		this.maThanhVien = maThanhVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public List getDsTinNhan() {
		return dsTinNhan;
	}

	public void setDsTinNhan(List dsTinNhan) {
		this.dsTinNhan = dsTinNhan;
	}

	public TinhThanhPho getTinhThanhPho() {
		return tinhThanhPho;
	}

	public void setTinhThanhPho(TinhThanhPho tinhThanhPho) {
		this.tinhThanhPho = tinhThanhPho;
	}
}
