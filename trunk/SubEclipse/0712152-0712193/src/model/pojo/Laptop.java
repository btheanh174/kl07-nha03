
package model.pojo;

import java.util.List;
import java.util.Set;

public class Laptop extends SanPham {

	private String mainboard;
	private String cpu;
	private String hdd;
	private String ram;
	private String vga;
	private String usb;
	private String lan;
	private String wifi;
	private String heDieuHanh;
	private String chuot;
	private String pin;
	private String trongLuong;
	private String kichThuocManHinh;
	private String doPhanGiai;
	private String tinhNangKhac;
	
	
	public Laptop() {
	}

	
	public Laptop(String tenSanPham, float gia, String hangSanXuat,
			List<HinhAnh> dsHinhAnh, DanhMuc danhMuc, Set<GianHang> dsGianHang) {
		super(tenSanPham, gia, hangSanXuat, dsHinhAnh, danhMuc, dsGianHang);
	}




	public Laptop(String tenSanPham, float gia, String hangSanXuat,
			List<HinhAnh> dsHinhAnh, DanhMuc danhMuc, Set<GianHang> dsGianHang,
			String loaiSanPham, String mainboard, String cpu, String hdd,
			String ram, String vga, String usb, String lan, String wifi,
			String heDieuHanh, String chuot, String pin, String trongLuong,
			String kichThuocManHinh, String doPhanGiai, String tinhNangKhac) {
		super(tenSanPham, gia, hangSanXuat, dsHinhAnh, danhMuc, dsGianHang);
		this.mainboard = mainboard;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.vga = vga;
		this.usb = usb;
		this.lan = lan;
		this.wifi = wifi;
		this.heDieuHanh = heDieuHanh;
		this.chuot = chuot;
		this.pin = pin;
		this.trongLuong = trongLuong;
		this.kichThuocManHinh = kichThuocManHinh;
		this.doPhanGiai = doPhanGiai;
		this.tinhNangKhac = tinhNangKhac;
	}
	

	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append("Hãng sản xuất: " + hangSanXuat);
		str.append("/Mainboard: " + mainboard);
		str.append("/CPU: " + cpu);
		str.append("/HDD: " + hdd);
		str.append("/RAM: " +  ram);
		str.append("/VGA: " + vga);
		str.append("/Cổng USB: " + usb);
		str.append("/Lan: " + lan);
		str.append("Wifi: " + wifi);
		str.append("/Hệ điều hành: " + heDieuHanh);
		str.append("/Chuột: " + chuot);
		str.append("/Pin: " + pin);
		str.append("/Trọng lượng: " +  trongLuong);
		str.append("/Kích thước màn hình: " + kichThuocManHinh);
		str.append("/Độ phân giải: " + doPhanGiai);
		str.append("/Tính năng khác: " + tinhNangKhac);
		return str.toString();
	}


	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getMainboard() {
		return mainboard;
	}
	public void setMainboard(String mainboard) {
		this.mainboard = mainboard;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getVga() {
		return vga;
	}
	public void setVga(String vga) {
		this.vga = vga;
	}
	public String getUsb() {
		return usb;
	}
	public void setUsb(String usb) {
		this.usb = usb;
	}
	public String getLan() {
		return lan;
	}
	public void setLan(String lan) {
		this.lan = lan;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getHeDieuHanh() {
		return heDieuHanh;
	}
	public void setHeDieuHanh(String heDieuHanh) {
		this.heDieuHanh = heDieuHanh;
	}
	public String getChuot() {
		return chuot;
	}
	public void setChuot(String chuot) {
		this.chuot = chuot;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getTrongLuong() {
		return trongLuong;
	}
	public void setTrongLuong(String trongLuong) {
		this.trongLuong = trongLuong;
	}
	public String getKichThuocManHinh() {
		return kichThuocManHinh;
	}
	public void setKichThuocManHinh(String kichThuocManHinh) {
		this.kichThuocManHinh = kichThuocManHinh;
	}
	public String getDoPhanGiai() {
		return doPhanGiai;
	}
	public void setDoPhanGiai(String doPhanGiai) {
		this.doPhanGiai = doPhanGiai;
	}
	public String getTinhNangKhac() {
		return tinhNangKhac;
	}
	public void setTinhNangKhac(String tinhNangKhac) {
		this.tinhNangKhac = tinhNangKhac;
	}
}
