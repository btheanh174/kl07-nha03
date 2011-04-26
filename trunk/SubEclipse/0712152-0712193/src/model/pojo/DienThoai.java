package model.pojo;

import java.util.List;
import java.util.Set;

public class DienThoai extends SanPham {
	
	private String mang;
	private String kieuDang;
	private String manHinh;
	private String doPhanGiai;
	private String heDieuHanh;
	private String boNhoTrong;
	private String ram;
	private String tinNhan;
	private String trongLuong;
	private String kichThuoc;
	private String kieuChuong;
	private String camera;
	private String mauSac;
	private String pin;
	private String thoiGianDamThoai;
	private String thoiGianCho;
	private String sim;
	private String theNho;
	private String tinhNang;
	private String tinhNangKhac;
	public DienThoai() {
	}
	
	
	
	public DienThoai(String tenSanPham, float gia, String nhaSanXuat,
			List<HinhAnh> dsHinhAnh, DanhMuc danhMuc, Set<GianHang> dsGianHang) {
		super(tenSanPham, gia, nhaSanXuat, dsHinhAnh, danhMuc, dsGianHang);
		// TODO Auto-generated constructor stub
	}


	public DienThoai(String mang, String kieuDang, String manHinh,
			String doPhanGiai, String heDieuHanh, String boNhoTrong,
			String ram, String tinNhan, String trongLuong, String kichThuoc,
			String kieuChuong, String camera, String mauSac, String pin,
			String thoiGianDamThoai, String thoiGianCho, String sim,
			String theNho, String tinhNang, String tinhNangKhac) {
		super();
		this.mang = mang;
		this.kieuDang = kieuDang;
		this.manHinh = manHinh;
		this.doPhanGiai = doPhanGiai;
		this.heDieuHanh = heDieuHanh;
		this.boNhoTrong = boNhoTrong;
		this.ram = ram;
		this.tinNhan = tinNhan;
		this.trongLuong = trongLuong;
		this.kichThuoc = kichThuoc;
		this.kieuChuong = kieuChuong;
		this.camera = camera;
		this.mauSac = mauSac;
		this.pin = pin;
		this.thoiGianDamThoai = thoiGianDamThoai;
		this.thoiGianCho = thoiGianCho;
		this.sim = sim;
		this.theNho = theNho;
		this.tinhNang = tinhNang;
		this.tinhNangKhac = tinhNangKhac;
	}



	public DienThoai(String tenSanPham, float gia, String nhaSanXuat,
			List<HinhAnh> dsHinhAnh, DanhMuc danhMuc, Set<GianHang> dsGianHang,
			String mang, String kieuDang, String manHinh, String doPhanGiai,
			String heDieuHanh, String boNhoTrong, String ram, String tinNhan,
			String trongLuong, String kichThuoc, String kieuChuong,
			String camera, String mauSac, String pin, String thoiGianDamThoai,
			String thoiGianCho, String sim, String theNho, String tinhNang,
			String tinhNangKhac) {
		super(tenSanPham, gia, nhaSanXuat, dsHinhAnh, danhMuc, dsGianHang);
		this.mang = mang;
		this.kieuDang = kieuDang;
		this.manHinh = manHinh;
		this.doPhanGiai = doPhanGiai;
		this.heDieuHanh = heDieuHanh;
		this.boNhoTrong = boNhoTrong;
		this.ram = ram;
		this.tinNhan = tinNhan;
		this.trongLuong = trongLuong;
		this.kichThuoc = kichThuoc;
		this.kieuChuong = kieuChuong;
		this.camera = camera;
		this.mauSac = mauSac;
		this.pin = pin;
		this.thoiGianDamThoai = thoiGianDamThoai;
		this.thoiGianCho = thoiGianCho;
		this.sim = sim;
		this.theNho = theNho;
		this.tinhNang = tinhNang;
		this.tinhNangKhac = tinhNangKhac;
	}



	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getMang() {
		return mang;
	}
	public void setMang(String mang) {
		this.mang = mang;
	}
	public String getKieuDang() {
		return kieuDang;
	}
	public void setKieuDang(String kieuDang) {
		this.kieuDang = kieuDang;
	}
	public String getManHinh() {
		return manHinh;
	}
	public void setManHinh(String manHinh) {
		this.manHinh = manHinh;
	}
	public String getDoPhanGiai() {
		return doPhanGiai;
	}
	public void setDoPhanGiai(String doPhanGiai) {
		this.doPhanGiai = doPhanGiai;
	}
	public String getHeDieuHanh() {
		return heDieuHanh;
	}
	public void setHeDieuHanh(String heDieuHanh) {
		this.heDieuHanh = heDieuHanh;
	}
	public String getBoNhoTrong() {
		return boNhoTrong;
	}
	public void setBoNhoTrong(String boNhoTrong) {
		this.boNhoTrong = boNhoTrong;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getTinNhan() {
		return tinNhan;
	}
	public void setTinNhan(String tinNhan) {
		this.tinNhan = tinNhan;
	}
	public String getTrongLuong() {
		return trongLuong;
	}
	public void setTrongLuong(String trongLuong) {
		this.trongLuong = trongLuong;
	}
	public String getKichThuoc() {
		return kichThuoc;
	}
	public void setKichThuoc(String kichThuoc) {
		this.kichThuoc = kichThuoc;
	}
	public String getKieuChuong() {
		return kieuChuong;
	}
	public void setKieuChuong(String kieuChuong) {
		this.kieuChuong = kieuChuong;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getThoiGianDamThoai() {
		return thoiGianDamThoai;
	}
	public void setThoiGianDamThoai(String thoiGianDamThoai) {
		this.thoiGianDamThoai = thoiGianDamThoai;
	}
	public String getThoiGianCho() {
		return thoiGianCho;
	}
	public void setThoiGianCho(String thoiGianCho) {
		this.thoiGianCho = thoiGianCho;
	}
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public String getTheNho() {
		return theNho;
	}
	public void setTheNho(String theNho) {
		this.theNho = theNho;
	}
	public String getTinhNang() {
		return tinhNang;
	}
	public void setTinhNang(String tinhNang) {
		this.tinhNang = tinhNang;
	}
	public String getTinhNangKhac() {
		return tinhNangKhac;
	}
	public void setTinhNangKhac(String tinhNangKhac) {
		this.tinhNangKhac = tinhNangKhac;
	}
}