package model.pojo;

import java.util.Date;
import java.util.List;

public class ThanhVien {
	private int maTaiKhoan;
	private String hoTen;
	private String dienThoai;
	private String diaChi;
	private String email;
	private Date ngaySinh;
	private TaiKhoan taiKhoan;
	private TinhThanhPho tinhThanhPho;
	private List dsTinNhan;
	private List dsNguoiNhan;
	private List dsTinRaoVat;

	public ThanhVien() {
		super();
	}

	public ThanhVien(String hoTen, String dienThoai, String diaChi,
			String email, Date ngaySinh, TaiKhoan taiKhoan, List dsTinNhan,
			List dsNguoiNhan, List dsTinRaoVat) {
		super();
		this.hoTen = hoTen;
		this.dienThoai = dienThoai;
		this.diaChi = diaChi;
		this.email = email;
		this.ngaySinh = ngaySinh;
		this.taiKhoan = taiKhoan;
		this.dsTinNhan = dsTinNhan;
		this.dsNguoiNhan = dsNguoiNhan;
		this.dsTinRaoVat = dsTinRaoVat;
	}

	public ThanhVien(ThanhVien thanhVien) {
		this.taiKhoan = thanhVien.taiKhoan;
		this.hoTen = thanhVien.hoTen;
		this.dienThoai = thanhVien.dienThoai;
		this.diaChi = thanhVien.diaChi;
		this.email = thanhVien.email;
		this.ngaySinh = thanhVien.ngaySinh;
		this.taiKhoan = thanhVien.taiKhoan;
		this.dsTinNhan = thanhVien.dsTinNhan;
		this.dsNguoiNhan = thanhVien.dsNguoiNhan;
		this.dsTinRaoVat = thanhVien.dsTinRaoVat;
	}

	public int getMaTaiKhoan() {
		return maTaiKhoan;
	}

	public void setMaTaiKhoan(int maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
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

	public List getDsNguoiNhan() {
		return dsNguoiNhan;
	}

	public void setDsNguoiNhan(List dsNguoiNhan) {
		this.dsNguoiNhan = dsNguoiNhan;
	}

	public List getDsTinRaoVat() {
		return dsTinRaoVat;
	}

	public void setDsTinRaoVat(List dsTinRaoVat) {
		this.dsTinRaoVat = dsTinRaoVat;
	}
}
