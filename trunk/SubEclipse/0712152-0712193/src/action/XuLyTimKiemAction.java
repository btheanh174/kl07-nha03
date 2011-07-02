package com.estore.shop.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.opensymphony.xwork2.ActionSupport;

public class XuLyTimKiemAction extends ActionSupport implements ServletContextListener{
	
	private String loaiSanPham;
	/*
	 * Nhung thuoc tinh dung de khoi tao du lieu cho form tim kiem dien thoai
	 * 
	 */
	private List<String> dsHangSanXuat;
	private List<String> dsMang;
	private List<String> dsKieuDang;
	private List<String> dsTrongLuong;
	private Map<String, String> dsLoaiManHinh;
	private Map<String, String> dsDoPhanGiai;
	private List<String> dsKieuChuong;
	private List<String> dsLoaiTheNho;
	private Map<Integer, String> dsBoNhoTrong;
	private List<String> dsRam;
	private List<String> dsHeDieuHanh;
	private List<String> dsTinNhan;
	private Map<String, String> dsCamera;
	private List<String> dsMauSac;
	private List<String> dsTinhNangCoBan;
	private Map<String, String> dsPin;
	private Map<String, String> dsThoiGianCho;
	private Map<String, String> dsThoiGianDamThoai;
	
	@Override
	public String execute() throws Exception {
		if("DIENTHOAI".equalsIgnoreCase(loaiSanPham)){
			populate_dienthoai();
			return "dienthoai";
		}else if("LAPTOP".equalsIgnoreCase(loaiSanPham)){
			populate_laptop();
			return "laptop";
		}else{
			return "error";
		}
	}
	
	public void populate_dienthoai(){
		khoiTaoDsHangSanXuat();
		khoiTaoDsMang();
		khoiTaoDsKieuDang();
		khoiTaoDsLoaiManHinh();
		khoiTaoDsDoPhanGiai();
		khoiTaoDsKieuChuong();
		khoiTaoDsLoaiTheNho();
		khoiTaoDsBoNhoTrong();
		khoiTaoDsRam();
		khoiTaoDsHeDieuHanh();
		khoiTaoDsTinNhan();
		khoiTaoDsCamera();
		khoiTaoDsMauSac();
		khoiTaoDsTinhNangCoBan();
		khoiTaoDsPin();
		khoiTaoDsThoiGianCho();
		khoiTaoDsThoiGianDamThoai();
	}
	private void khoiTaoDsHangSanXuat(){
		dsHangSanXuat = new ArrayList<String>();
		dsHangSanXuat.add("--[Báº¡n hÃ£y chá»�n]--");
		dsHangSanXuat.add("Samsung");
		dsHangSanXuat.add("Nokia");
		dsHangSanXuat.add("LG");
		dsHangSanXuat.add("Siemens");
		dsHangSanXuat.add("Sanyo");
		dsHangSanXuat.add("Motorola");
		dsHangSanXuat.add("O2");
		dsHangSanXuat.add("Vertu");
		dsHangSanXuat.add("Lenovo");
		dsHangSanXuat.add("T-Mobile");
		dsHangSanXuat.add("Welcom");
		dsHangSanXuat.add("Lenovo");
		dsHangSanXuat.add("Nec");
		dsHangSanXuat.add("Apple");
	}
	private void khoiTaoDsMang(){
		dsMang = new ArrayList<String>();
		dsMang.add("--[Báº¡n hÃ£y chá»�n]--");
		dsMang.add("GSM900");
		dsMang.add("GSM850");
		dsMang.add("GSM1800");
		dsMang.add("GSM1900");
		dsMang.add("UMTS 850");
		dsMang.add("CDMA 2000 1x");
		dsMang.add("HSDPA");
		dsMang.add("CDMA 800 MHZ");
		dsMang.add("CDMA");
		dsMang.add("DCS1800");
		dsMang.add("CDMA 800");
		dsMang.add("CDMA 1900");
	}
	
	private void khoiTaoDsKieuDang(){
		dsKieuDang = new ArrayList<String>();
		dsKieuDang.add("--[Báº¡n hÃ£y chá»�n]--");
		dsKieuDang.add("Dual Slide");
		dsKieuDang.add("Kiá»ƒu gáº­p");
		dsKieuDang.add("Kiá»ƒu tháº³ng");
		dsKieuDang.add("Kiá»ƒu trÆ°á»£t");
		dsKieuDang.add("Kiá»ƒu xoay");
		dsKieuDang.add("Kiá»ƒu Ä‘eo tay");
	}
	
	private void khoiTaoDsLoaiManHinh(){
		dsLoaiManHinh = new HashMap<String,String>();
		dsLoaiManHinh.put("0", "--[Báº¡n hÃ£y chá»�n]--");
		dsLoaiManHinh.put("1", "MÃ n hÃ¬nh Ä‘Æ¡n sáº¯c");
		dsLoaiManHinh.put("65","65K mÃ u");
		dsLoaiManHinh.put("256", "256K mÃ u");
		dsLoaiManHinh.put("1600", "16M mÃ u");
		dsLoaiManHinh.put("1670", "16.7M mÃ u TFT");
	}
	
	private void khoiTaoDsDoPhanGiai(){
		dsDoPhanGiai = new HashMap<String, String>();
		dsDoPhanGiai.put("0", "--[Báº¡n hÃ£y chá»�n]--");
		dsDoPhanGiai.put("94", "94 x 64 pixels");
		dsDoPhanGiai.put("128", "128 x 96 pixels");
		dsDoPhanGiai.put("240", "240 x 320 pixels");
		dsDoPhanGiai.put("320", "320 x 240 pixels");
		dsDoPhanGiai.put("480", "480 x 272 pixels");
		dsDoPhanGiai.put("800", "800 x 480 pixels");
	}
	
	private void khoiTaoDsKieuChuong(){
		dsKieuChuong = new ArrayList<String>();
		dsKieuChuong.add("--[Báº¡n hÃ£y chá»�n]--");
		dsKieuChuong.add("Nháº¡c chuÃ´ng Ä‘Æ¡n Ã¢m sáº¯c");
		dsKieuChuong.add("Nháº¡c chuÃ´ng Ä‘a Ã¢m sáº¯c");
		dsKieuChuong.add("MP3");
		dsKieuChuong.add("AMR");
		dsKieuChuong.add("MIDI");
		dsKieuChuong.add("AAC");
		dsKieuChuong.add("M4A");
		dsKieuChuong.add("WMA");
		dsKieuChuong.add("WAV");
	}
	private void khoiTaoDsLoaiTheNho(){
		dsLoaiTheNho = new ArrayList<String>();
		dsLoaiTheNho.add("--[Báº¡n hÃ£y chá»�n]--");
		dsLoaiTheNho.add("KhÃ´ng há»• trá»£");
		dsLoaiTheNho.add("SDI0");
		dsLoaiTheNho.add("SD");
		dsLoaiTheNho.add("MMC");
		dsLoaiTheNho.add("MicroSD");
		dsLoaiTheNho.add("RS-MMC");
		dsLoaiTheNho.add("MSDuo");
		dsLoaiTheNho.add("DV");
		dsLoaiTheNho.add("-");
		dsLoaiTheNho.add("TransFlash");
	}
	
	private void khoiTaoDsBoNhoTrong(){
		dsBoNhoTrong = new HashMap<Integer, String>();
		dsBoNhoTrong.put(0, "--[Báº¡n hÃ£y chá»�n]--");
		dsBoNhoTrong.put(10, "10Mb");
		dsBoNhoTrong.put(50, "50Mb");
		dsBoNhoTrong.put(100, "100Mb");
		dsBoNhoTrong.put(512, "512Mb");
		dsBoNhoTrong.put(1000, "1Gb");
		dsBoNhoTrong.put(2000, "2Gb");
		dsBoNhoTrong.put(4000, "4Gb");
		dsBoNhoTrong.put(5000, "16Gb");
		dsBoNhoTrong.put(64000, "64Gb");
	}
	
	private void khoiTaoDsHeDieuHanh(){
		dsHeDieuHanh = new ArrayList<String>();
		dsHeDieuHanh.add("--[Báº¡n hÃ£y chá»�n]--");
		dsHeDieuHanh.add("Android OS");
		dsHeDieuHanh.add("Bada OS");
		dsHeDieuHanh.add("Blackberry OS");
		dsHeDieuHanh.add("iPhone OS");
		dsHeDieuHanh.add("Symbian");
		dsHeDieuHanh.add("Linux");
	}
	
	private void khoiTaoDsTinNhan(){
		dsTinNhan = new ArrayList<String>();
		dsTinNhan.add("--[Báº¡n hÃ£y chá»�n]--");
		dsTinNhan.add("Email");
		dsTinNhan.add("EMS");
		dsTinNhan.add("Instant Messaging");
		dsTinNhan.add("MMS");
		dsTinNhan.add("SMS");
		dsTinNhan.add("SMS");
		dsTinNhan.add("Fax");
		dsTinNhan.add("Push E-Mail");
		dsTinNhan.add("KhÃ´ng xÃ¡c Ä‘á»‹nh");
	}
	
	private void khoiTaoDsCamera(){
		dsCamera = new HashMap<String, String>();
		dsCamera.put("0", "--[Báº¡n hÃ£y chá»�n]--");
		dsCamera.put("1.3", "1.3 Megapixel");
		dsCamera.put("2", "2 Megapixel");
		dsCamera.put("3.2", "3.2 Megapixel");
		dsCamera.put("5", "5 Megapixel");
		dsCamera.put("8", "8 Megapixel");
		dsCamera.put("12", "12 Megapixel");
	}
	
	private void khoiTaoDsMauSac(){
		dsMauSac = new ArrayList<String>();
		dsMauSac.add("--[Báº¡n hÃ£y chá»�n]--");
		dsMauSac.add("-");
		dsMauSac.add("Há»“ng");
		dsMauSac.add("Than chÃ¬");
		dsMauSac.add("Tráº¯ng");
		dsMauSac.add("XÃ¡m báº¡c");
		dsMauSac.add("Xanh");
		dsMauSac.add("Ä�en");
		dsMauSac.add("Ä�á»�");
		dsMauSac.add("NÃ¢u");
		dsMauSac.add("Báº¡c");
		dsMauSac.add("Ghi");
		dsMauSac.add("XÃ¡m tro");
		dsMauSac.add("Gold");
	}
	
	private void khoiTaoDsTinhNangCoBan(){
		dsTinhNangCoBan = new ArrayList<String>();
		dsTinhNangCoBan.add("--[Báº¡n hÃ£y chá»�n]--");
		dsTinhNangCoBan.add("Loa thoáº¡i ráº£nh tay tÃ­ch há»£p");
		dsTinhNangCoBan.add("Nghe nháº¡c");
		dsTinhNangCoBan.add("CÃ i Ä‘áº·t hÃ¬nh ná»�n nháº¡c chuÃ´ng");
		dsTinhNangCoBan.add("Chá»‰nh sá»­a áº£nh");
		dsTinhNangCoBan.add("Karaoke");
		dsTinhNangCoBan.add("Káº¿t ná»‘i GPS");
		dsTinhNangCoBan.add("Ghi Ã¢m");
		dsTinhNangCoBan.add("Hiá»ƒn thá»‹ hÃ¬nh áº£nh ngÆ°á»�i gá»�i");
		dsTinhNangCoBan.add("Xem tivi");
		dsTinhNangCoBan.add("FM radio");
		dsTinhNangCoBan.add("MP4");
		dsTinhNangCoBan.add("Quay video");
		dsTinhNangCoBan.add("CÃ´ng nghá»‡ 3G");
		dsTinhNangCoBan.add("Video call");
		dsTinhNangCoBan.add("Loa ngoÃ i");
	}
	private void khoiTaoDsThoiGianDamThoai() {
		dsThoiGianDamThoai = new HashMap<String, String>();
		dsThoiGianDamThoai.put("0", "--[Báº¡n hÃ£y chá»�n]--");
	}

	private void khoiTaoDsThoiGianCho() {
		dsThoiGianCho = new HashMap<String, String>();
		dsThoiGianCho.put("0", "--[Báº¡n hÃ£y chá»�n]--");
	}

	private void khoiTaoDsPin() {
		dsPin = new HashMap<String, String>();
		dsPin.put("0", "--[Báº¡n hÃ£y chá»�n]--");
	}

	private void khoiTaoDsRam() {
		dsRam = new ArrayList<String>();
		dsRam.add("--[Báº¡n hÃ£y chá»�n]--");
	}

	public void populate_laptop(){
		
	}

	public String getLoaiSanPham() {
		return loaiSanPham;
	}

	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	public List<String> getDsHangSanXuat() {
		return dsHangSanXuat;
	}

	public void setDsHangSanXuat(List<String> dsHangSanXuat) {
		this.dsHangSanXuat = dsHangSanXuat;
	}

	public List<String> getDsMang() {
		return dsMang;
	}

	public void setDsMang(List<String> dsMang) {
		this.dsMang = dsMang;
	}

	public List<String> getDsKieuDang() {
		return dsKieuDang;
	}

	public void setDsKieuDang(List<String> dsKieuDang) {
		this.dsKieuDang = dsKieuDang;
	}

	public List<String> getDsTrongLuong() {
		return dsTrongLuong;
	}

	public void setDsTrongLuong(List<String> dsTrongLuong) {
		this.dsTrongLuong = dsTrongLuong;
	}



	public List<String> getDsKieuChuong() {
		return dsKieuChuong;
	}

	public void setDsKieuChuong(List<String> dsKieuChuong) {
		this.dsKieuChuong = dsKieuChuong;
	}

	public List<String> getDsLoaiTheNho() {
		return dsLoaiTheNho;
	}

	public void setDsLoaiTheNho(List<String> dsLoaiTheNho) {
		this.dsLoaiTheNho = dsLoaiTheNho;
	}

	public Map<Integer, String> getDsBoNhoTrong() {
		return dsBoNhoTrong;
	}

	public void setDsBoNhoTrong(Map<Integer, String> dsBoNhoTrong) {
		this.dsBoNhoTrong = dsBoNhoTrong;
	}

	public List<String> getDsRam() {
		return dsRam;
	}

	public void setDsRam(List<String> dsRam) {
		this.dsRam = dsRam;
	}

	public List<String> getDsHeDieuHanh() {
		return dsHeDieuHanh;
	}

	public void setDsHeDieuHanh(List<String> dsHeDieuHanh) {
		this.dsHeDieuHanh = dsHeDieuHanh;
	}

	public List<String> getDsTinNhan() {
		return dsTinNhan;
	}

	public void setDsTinNhan(List<String> dsTinNhan) {
		this.dsTinNhan = dsTinNhan;
	}

	public List<String> getDsMauSac() {
		return dsMauSac;
	}

	public void setDsMauSac(List<String> dsMauSac) {
		this.dsMauSac = dsMauSac;
	}

	public List<String> getDsTinhNangCoBan() {
		return dsTinhNangCoBan;
	}

	public void setDsTinhNangCoBan(List<String> dsTinhNangCoBan) {
		this.dsTinhNangCoBan = dsTinhNangCoBan;
	}

	public Map<String, String> getDsLoaiManHinh() {
		return dsLoaiManHinh;
	}

	public void setDsLoaiManHinh(Map<String, String> dsLoaiManHinh) {
		this.dsLoaiManHinh = dsLoaiManHinh;
	}

	public Map<String, String> getDsDoPhanGiai() {
		return dsDoPhanGiai;
	}

	public void setDsDoPhanGiai(Map<String, String> dsDoPhanGiai) {
		this.dsDoPhanGiai = dsDoPhanGiai;
	}

	public Map<String, String> getDsCamera() {
		return dsCamera;
	}

	public void setDsCamera(Map<String, String> dsCamera) {
		this.dsCamera = dsCamera;
	}

	public Map<String, String> getDsPin() {
		return dsPin;
	}

	public void setDsPin(Map<String, String> dsPin) {
		this.dsPin = dsPin;
	}

	public Map<String, String> getDsThoiGianCho() {
		return dsThoiGianCho;
	}

	public void setDsThoiGianCho(Map<String, String> dsThoiGianCho) {
		this.dsThoiGianCho = dsThoiGianCho;
	}

	public Map<String, String> getDsThoiGianDamThoai() {
		return dsThoiGianDamThoai;
	}

	public void setDsThoiGianDamThoai(Map<String, String> dsThoiGianDamThoai) {
		this.dsThoiGianDamThoai = dsThoiGianDamThoai;
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		ServletContext servletContext = sce.getServletContext();
		// Dat gia tri cac Map vao application
		//servletContext.setAttribute("dsTrongLuong", dsTrongLuong);
		/*khoiTaoDsLoaiManHinh();
		servletContext.setAttribute("dsLoaiManHinh", dsLoaiManHinh);
		khoiTaoDsDoPhanGiai();
		servletContext.setAttribute("dsDoPhanGiai", dsDoPhanGiai);
		khoiTaoDsBoNhoTrong();
		servletContext.setAttribute("dsBoNhoTrong", dsBoNhoTrong);
		khoiTaoDsCamera();
		servletContext.setAttribute("dsCamera", dsCamera);
		khoiTaoDsPin();
		servletContext.setAttribute("dsPin", dsPin);
		khoiTaoDsThoiGianCho();
		servletContext.setAttribute("dsThoiGianCho", dsThoiGianCho);
		khoiTaoDsThoiGianDamThoai();
		servletContext.setAttribute("dsThoiGianDamThoai", dsThoiGianDamThoai);*/
	}
}
