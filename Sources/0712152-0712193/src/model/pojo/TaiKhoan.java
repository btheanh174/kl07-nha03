package model.pojo;

import java.util.Date;

public class TaiKhoan {
	private int maTaiKhoan;
	private String tenTruyCap;
	private String matKhau;
	private Date ngayKichHoat;
	private NhomNguoiDung nhomNguoiDung;
	private ThanhVien thanhVien;
	
	public TaiKhoan() {
		super();
	}
	
	public TaiKhoan(String tenTruyCap, String matKhau,
			Date ngayKichHoat, NhomNguoiDung nhomNguoiDung) {
		super();
		this.tenTruyCap = tenTruyCap;
		this.matKhau = matKhau;
		this.ngayKichHoat = ngayKichHoat;
		this.nhomNguoiDung = nhomNguoiDung;
	}
	
	
	public TaiKhoan(String tenTruyCap, String matKhau, Date ngayKichHoat,
			NhomNguoiDung nhomNguoiDung, ThanhVien thanhVien) {
		super();
		this.tenTruyCap = tenTruyCap;
		this.matKhau = matKhau;
		this.ngayKichHoat = ngayKichHoat;
		this.nhomNguoiDung = nhomNguoiDung;
		this.thanhVien = thanhVien;
	}

	public TaiKhoan(TaiKhoan taiKhoan){
		this.maTaiKhoan = taiKhoan.maTaiKhoan;
		this.tenTruyCap = taiKhoan.tenTruyCap;
		this.matKhau = taiKhoan.matKhau;
		this.ngayKichHoat = taiKhoan.ngayKichHoat;
		this.nhomNguoiDung = taiKhoan.nhomNguoiDung;
	}

	public int getMaTaiKhoan() {
		return maTaiKhoan;
	}
	public void setMaTaiKhoan(int maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
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
	public Date getNgayKichHoat() {
		return ngayKichHoat;
	}
	public void setNgayKichHoat(Date ngayKichHoat) {
		this.ngayKichHoat = ngayKichHoat;
	}
	public NhomNguoiDung getNhomNguoiDung() {
		return nhomNguoiDung;
	}
	public void setNhomNguoiDung(NhomNguoiDung nhomNguoiDung) {
		this.nhomNguoiDung = nhomNguoiDung;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}
	
}
