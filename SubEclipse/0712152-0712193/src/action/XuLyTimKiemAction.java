package action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.collections.map.HashedMap;

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
		dsHangSanXuat.add("--[Bạn hãy chọn]--");
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
		dsMang.add("--[Bạn hãy chọn]--");
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
		dsKieuDang.add("--[Bạn hãy chọn]--");
		dsKieuDang.add("Dual Slide");
		dsKieuDang.add("Kiểu gập");
		dsKieuDang.add("Kiểu thẳng");
		dsKieuDang.add("Kiểu trượt");
		dsKieuDang.add("Kiểu xoay");
		dsKieuDang.add("Kiểu đeo tay");
	}
	
	private void khoiTaoDsLoaiManHinh(){
		dsLoaiManHinh = new HashMap<String,String>();
		dsLoaiManHinh.put("0", "--[Bạn hãy chọn]--");
		dsLoaiManHinh.put("1", "Màn hình đơn sắc");
		dsLoaiManHinh.put("65","65K màu");
		dsLoaiManHinh.put("256", "256K màu");
		dsLoaiManHinh.put("1600", "16M màu");
		dsLoaiManHinh.put("1670", "16.7M màu TFT");
	}
	
	private void khoiTaoDsDoPhanGiai(){
		dsDoPhanGiai = new HashMap<String, String>();
		dsDoPhanGiai.put("0", "--[Bạn hãy chọn]--");
		dsDoPhanGiai.put("94", "94 x 64 pixels");
		dsDoPhanGiai.put("128", "128 x 96 pixels");
		dsDoPhanGiai.put("240", "240 x 320 pixels");
		dsDoPhanGiai.put("320", "320 x 240 pixels");
		dsDoPhanGiai.put("480", "480 x 272 pixels");
		dsDoPhanGiai.put("800", "800 x 480 pixels");
	}
	
	private void khoiTaoDsKieuChuong(){
		dsKieuChuong = new ArrayList<String>();
		dsKieuChuong.add("--[Bạn hãy chọn]--");
		dsKieuChuong.add("Nhạc chuông đơn âm sắc");
		dsKieuChuong.add("Nhạc chuông đa âm sắc");
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
		dsLoaiTheNho.add("--[Bạn hãy chọn]--");
		dsLoaiTheNho.add("Không hổ trợ");
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
		dsBoNhoTrong.put(0, "--[Bạn hãy chọn]--");
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
		dsHeDieuHanh.add("--[Bạn hãy chọn]--");
		dsHeDieuHanh.add("Android OS");
		dsHeDieuHanh.add("Bada OS");
		dsHeDieuHanh.add("Blackberry OS");
		dsHeDieuHanh.add("iPhone OS");
		dsHeDieuHanh.add("Symbian");
		dsHeDieuHanh.add("Linux");
	}
	
	private void khoiTaoDsTinNhan(){
		dsTinNhan = new ArrayList<String>();
		dsTinNhan.add("--[Bạn hãy chọn]--");
		dsTinNhan.add("Email");
		dsTinNhan.add("EMS");
		dsTinNhan.add("Instant Messaging");
		dsTinNhan.add("MMS");
		dsTinNhan.add("SMS");
		dsTinNhan.add("SMS");
		dsTinNhan.add("Fax");
		dsTinNhan.add("Push E-Mail");
		dsTinNhan.add("Không xác định");
	}
	
	private void khoiTaoDsCamera(){
		dsCamera = new HashMap<String, String>();
		dsCamera.put("0", "--[Bạn hãy chọn]--");
		dsCamera.put("1.3", "1.3 Megapixel");
		dsCamera.put("2", "2 Megapixel");
		dsCamera.put("3.2", "3.2 Megapixel");
		dsCamera.put("5", "5 Megapixel");
		dsCamera.put("8", "8 Megapixel");
		dsCamera.put("12", "12 Megapixel");
	}
	
	private void khoiTaoDsMauSac(){
		dsMauSac = new ArrayList<String>();
		dsMauSac.add("--[Bạn hãy chọn]--");
		dsMauSac.add("-");
		dsMauSac.add("Hồng");
		dsMauSac.add("Than chì");
		dsMauSac.add("Trắng");
		dsMauSac.add("Xám bạc");
		dsMauSac.add("Xanh");
		dsMauSac.add("Đen");
		dsMauSac.add("Đỏ");
		dsMauSac.add("Nâu");
		dsMauSac.add("Bạc");
		dsMauSac.add("Ghi");
		dsMauSac.add("Xám tro");
		dsMauSac.add("Gold");
	}
	
	private void khoiTaoDsTinhNangCoBan(){
		dsTinhNangCoBan = new ArrayList<String>();
		dsTinhNangCoBan.add("--[Bạn hãy chọn]--");
		dsTinhNangCoBan.add("Loa thoại rảnh tay tích hợp");
		dsTinhNangCoBan.add("Nghe nhạc");
		dsTinhNangCoBan.add("Cài đặt hình nền nhạc chuông");
		dsTinhNangCoBan.add("Chỉnh sửa ảnh");
		dsTinhNangCoBan.add("Karaoke");
		dsTinhNangCoBan.add("Kết nối GPS");
		dsTinhNangCoBan.add("Ghi âm");
		dsTinhNangCoBan.add("Hiển thị hình ảnh người gọi");
		dsTinhNangCoBan.add("Xem tivi");
		dsTinhNangCoBan.add("FM radio");
		dsTinhNangCoBan.add("MP4");
		dsTinhNangCoBan.add("Quay video");
		dsTinhNangCoBan.add("Công nghệ 3G");
		dsTinhNangCoBan.add("Video call");
		dsTinhNangCoBan.add("Loa ngoài");
	}
	private void khoiTaoDsThoiGianDamThoai() {
		dsThoiGianDamThoai = new HashMap<String, String>();
		dsThoiGianDamThoai.put("0", "--[Bạn hãy chọn]--");
	}

	private void khoiTaoDsThoiGianCho() {
		dsThoiGianCho = new HashMap<String, String>();
		dsThoiGianCho.put("0", "--[Bạn hãy chọn]--");
	}

	private void khoiTaoDsPin() {
		dsPin = new HashMap<String, String>();
		dsPin.put("0", "--[Bạn hãy chọn]--");
	}

	private void khoiTaoDsRam() {
		dsRam = new ArrayList<String>();
		dsRam.add("--[Bạn hãy chọn]--");
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

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}

	@Override
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
