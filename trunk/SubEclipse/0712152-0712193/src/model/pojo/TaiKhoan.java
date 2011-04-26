package model.pojo;

import java.util.Date;

public class TaiKhoan {
	private int maTaiKhoan;
	private String tenTruyCap;
	private String salt;
	private String matKhau;
	private Date ngayKichHoat;
	private NhomNguoiDung nhomNguoiDung;
	private ThanhVien thanhVien;
	private GianHang gianHang;
	
	public TaiKhoan() {
		super();
	}
	
	
	
	public TaiKhoan(String tenTruyCap, String salt, String matKhau,
			Date ngayKichHoat, NhomNguoiDung nhomNguoiDung,
			ThanhVien thanhVien, GianHang gianHang) {
		super();
		this.tenTruyCap = tenTruyCap;
		this.salt = salt;
		this.matKhau = matKhau;
		this.ngayKichHoat = ngayKichHoat;
		this.nhomNguoiDung = nhomNguoiDung;
		this.thanhVien = thanhVien;
		this.gianHang = gianHang;
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

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}
}
