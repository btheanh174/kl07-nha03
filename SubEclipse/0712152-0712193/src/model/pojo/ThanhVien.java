package model.pojo;

import java.util.Date;
import java.util.List;

public class ThanhVien {
	private int maTaiKhoan;
	private String hoTen;
	private String dienThoai;
	private String diaChi;
	private String website;
	private String email;
	private Date ngaySinh;
	private String hinh;
	private TaiKhoan taiKhoan;
	private TinhThanhPho tinhThanhPho;
	private List<TinNhan> dsTinNhan;
	private List<NguoiNhan> dsNguoiNhan;
	private List<TinRaoVat> dsTinRaoVat;
	private List<HoaDon> dsHoaDon;

	public ThanhVien() {
		super();
	}

	public ThanhVien(String hoTen, String dienThoai, String diaChi,
			String email, String website ,Date ngaySinh, TaiKhoan taiKhoan,
			TinhThanhPho tinhThanhPho, List<TinNhan> dsTinNhan,
			List<NguoiNhan> dsNguoiNhan, List<TinRaoVat> dsTinRaoVat,
			List<HoaDon> dsHoaDon) {
		super();
		this.hoTen = hoTen;
		this.dienThoai = dienThoai;
		this.diaChi = diaChi;
		this.website = website;
		this.email = email;
		this.ngaySinh = ngaySinh;
		this.taiKhoan = taiKhoan;
		this.tinhThanhPho = tinhThanhPho;
		this.dsTinNhan = dsTinNhan;
		this.dsNguoiNhan = dsNguoiNhan;
		this.dsTinRaoVat = dsTinRaoVat;
		this.dsHoaDon = dsHoaDon;
	}

	public ThanhVien(ThanhVien thanhVien) {
		this.taiKhoan = thanhVien.taiKhoan;
		this.hoTen = thanhVien.hoTen;
		this.dienThoai = thanhVien.dienThoai;
		this.diaChi = thanhVien.diaChi;
		this.website = thanhVien.website;
		this.email = thanhVien.email;
		this.ngaySinh = thanhVien.ngaySinh;
		this.taiKhoan = thanhVien.taiKhoan;
		this.dsTinNhan = thanhVien.dsTinNhan;
		this.dsNguoiNhan = thanhVien.dsNguoiNhan;
		this.dsTinRaoVat = thanhVien.dsTinRaoVat;
		this.dsHoaDon = thanhVien.dsHoaDon;
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

	public TinhThanhPho getTinhThanhPho() {
		return tinhThanhPho;
	}

	public void setTinhThanhPho(TinhThanhPho tinhThanhPho) {
		this.tinhThanhPho = tinhThanhPho;
	}

	public List<TinNhan> getDsTinNhan() {
		return dsTinNhan;
	}

	public void setDsTinNhan(List<TinNhan> dsTinNhan) {
		this.dsTinNhan = dsTinNhan;
	}

	public List<NguoiNhan> getDsNguoiNhan() {
		return dsNguoiNhan;
	}

	public void setDsNguoiNhan(List<NguoiNhan> dsNguoiNhan) {
		this.dsNguoiNhan = dsNguoiNhan;
	}

	public List<TinRaoVat> getDsTinRaoVat() {
		return dsTinRaoVat;
	}

	public void setDsTinRaoVat(List<TinRaoVat> dsTinRaoVat) {
		this.dsTinRaoVat = dsTinRaoVat;
	}

	public List<HoaDon> getDsHoaDon() {
		return dsHoaDon;
	}

	public void setDsHoaDon(List<HoaDon> dsHoaDon) {
		this.dsHoaDon = dsHoaDon;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getHinh() {
		return hinh;
	}

	public void setHinh(String hinh) {
		this.hinh = hinh;
	}
}
