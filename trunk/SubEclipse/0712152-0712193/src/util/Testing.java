 package util;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import model.dao.DanhMucDAO;
import model.dao.DienThoaiDAO;
import model.dao.GianHangDAO;
import model.dao.GianHangSanPhamDAO;
import model.dao.LaptopDAO;
import model.dao.NhomDanhMucDAO;
import model.dao.NhomNguoiDungDAO;
import model.dao.SanPhamDAO;
import model.dao.TaiKhoanDAO;
import model.pojo.DanhMuc;
import model.pojo.DienThoai;
import model.pojo.GianHang;
import model.pojo.GianHangDanhMuc;
import model.pojo.GianHangSanPham;
import model.pojo.Laptop;
import model.pojo.NhomDanhMuc;
import model.pojo.NhomNguoiDung;
import model.pojo.SanPham;
import model.pojo.TaiKhoan;
import model.pojo.ThanhVien;


public class Testing {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		 /*ThamSoDAO tsDao = new ThamSoDAO(); 
		 List<ThamSo> ts = tsDao.layDsThamSo(); 
		 System.out.println("So luong tham so = " + ts.size());
		 */
		/*
		 * ThamSo ts = tsDao.layThamSo(1); System.out.println(ts.getTenThamSo()+
		 * " = " + ts.getGiaTri());
		 */

		
		 /*DanhMucDAO dmDao = new DanhMucDAO(); 
		 List<DanhMuc> dm = dmDao.layDanhSach(1);
		 System.out.println("So luong danh muc = " + dm.size());
		for (DanhMuc danhMuc : dm) {
			System.out.println(" - " + danhMuc.getTenDanhMuc());
		}
		 
		 // Them san pham vao danh muc
		 DanhMuc danhMuc = dmDao.lay(9);
		 Set<SanPham> dsSP = new HashSet();
		 dsSP = danhMuc.getDsSanPham();
		 System.out.println(dsSP.size());
		 */
		 
		
		/*TinhThanhPhoDAO ttpDao = new TinhThanhPhoDAO(); 
		List<TinhThanhPho> ttpList = ttpDao.layDanhSach(); 
		System.out.println("So tinh thanh pho = " + ttpList.size());*/
		/*// Them tinh thanh pho
		TinhThanhPho ttp = new TinhThanhPho();
		ttp.setTenTinhThanhPho("Tây Ninh");
		ttpDao.them(ttp);*/

		
		/* TinhTrangHoaDonDAO ttDao = new TinhTrangHoaDonDAO();
		 List<TinhTrangHoaDon> ds = ttDao.layDanhSach();
		 System.out.println("So tinh trang = "+ds.size());
		*/ 

		/*NhomNguoiDungDAO nndDao = new NhomNguoiDungDAO();
		NhomNguoiDung nnd = nndDao.lay(1);
		System.out.println("Ten nhom = " + nnd.getTenNhom());
		List nndList = nndDao.layDanhSach();
		System.out.println("So Nhom = " + nndList.size());
		//nndDao.them(new NhomNguoiDung("Test"));
		// Them nguoi dung vao nhom 1
		TaiKhoanDAO tkDao = new TaiKhoanDAO();
		System.out.println("Them tai khoan - llh");
		TaiKhoan tk = new TaiKhoan("llh", "123456", null, null);
		tk.setNhomNguoiDung(nnd);
		tkDao.them(tk);
		*/
		/*HinhThucVanChuyenDAO htvcDao = new HinhThucVanChuyenDAO();
		List<HinhThucVanChuyen> htvtList = htvcDao.layDanhSach();
		System.out.println("So hinh thuc van chuyen = " + htvtList.size());
		*/
		// Lay danh sach san pham cua danh muc co ma = 9
		/*SanPhamDAO spDao = new SanPhamDAO();
		List<SanPham> spList =  spDao.layDanhSach(9);
		System.out.println("So luong san pham = " + spList.size());*/
		
		//SanPham sp = spDao.lay(1);
		//System.out.println(sp.getDanhMuc().getMaDanhMuc());
		/*SanPham sp = new SanPham();
		sp.setTenSanPham("AAA");
		sp.setGia(50000);
		sp.setDanhMuc(9);
		sp.setMoTaNgan("AAA - A");
		
		spDao.them(sp);*/
		// Xoa san pham
		/*SanPham sp = spDao.lay(6);
		spDao.xoa(sp);
		*/
		/*
		DanhMucAction dmAction = new DanhMucAction();
		dmAction.execute();
		List ds = dmAction.getDsDanhMuc();
		System.out.println(ds.size());
		
		*/
		
		TaiKhoanDAO tkDao = new TaiKhoanDAO();
		TaiKhoan tk = tkDao.lay(14);
		/*
		tk.setTenTruyCap("llh");
		tk.setSalt("llh");
		tk.setMatKhau("123456");
		tk.setNgayKichHoat(new Date());
		NhomNguoiDung nnd = new NhomNguoiDungDAO().lay(1);
		tk.setNhomNguoiDung(nnd);*/
		
		/*ThanhVien tv = tk.getThanhVien();
		tv.setHoTen("Le Long Ho");
		tv.setDiaChi("TN");
		tv.setDienThoai("123456789");
		tv.setEmail("dragonlake89@yahoo.com.vn");
		
		tk.setThanhVien(tv);
		tv.setTaiKhoan(tk);
		
		tkDao.capNhat(tk);
		System.out.println("Cap nhat xong");*/
		
/*		String hashed = HashUtil.generateHash("123457");
		System.out.println(hashed);
*/	

/*		DanhMucDAO dmDao = new DanhMucDAO();
		List<DanhMuc> ds = dmDao.layDanhSach();
		System.out.print(ds.size());
		for(int i = 0; i < ds.size(); i++){
			System.out.println(ds.get(i).getTenDanhMuc());
		}
*/	
		/*TinhThanhPhoBean ttpData = new TinhThanhPhoBean();
		List<TinhThanhPho> ds = ttpData.getDsTinhThanhPho();
		System.out.println(ds.size());*/
		
		/*DanhMucBean dmBean = new DanhMucBean();
		List<DanhMuc> dsDM = dmBean.getDsDanhMuc();
		dmBean.setMaDanhMuc(9);
		Set<SanPham> dsSP = dmBean.getDsSanPham();
		System.out.println(dsDM.size());
		System.out.println(dsSP.size());
		for(Iterator<SanPham> iter = dsSP.iterator(); iter.hasNext();){
			SanPham sp = (SanPham)iter.next();
			System.out.println(sp.getTenSanPham());
		}*/
		/*int kq = NumberUtil.parse("1200");
		System.out.println(kq);
		
		TaiKhoanDAO tkDao = new TaiKhoanDAO();
		TaiKhoan taiKhoan = tkDao.lay(7);
		ThanhVien thanhVien = taiKhoan.getThanhVien();
		
		System.out.println(thanhVien.getHoTen());*/
		
		/*DanhMucDAO dmDao = new DanhMucDAO();
		List<DanhMuc> dsdm = dmDao.layDanhSach();
		System.out.println(dsdm.size());
		
		String temp  = "    ";
		for(int i = 0; i < dsdm.size(); i++){
			System.out.println(dsdm.get(i).getTenDanhMuc() + "("+ dsdm.get(i).getDsDanhMucCon().size()+")");
			if(dsdm.get(i).getDsDanhMucCon() != null){
				xuat(dsdm.get(i).getDsDanhMucCon(), temp);
			}
		}
		*/
		/*		DanhMuc dm = dmDao.lay(1);
			System.out.println(dm.getDsSanPham().size());
		 */		
		
		// Kiem tra thao tac voi sản phẩm
		/*SanPhamDAO spDao = new SanPhamDAO();
		// SanPham
		SanPham sp = new SanPham();
		sp.setTenSanPham("test");
		sp.setGia(1000);
		sp.setNhaSanXuat("Chính hãng");
		DanhMuc danhMuc = new DanhMucDAO().lay(3);
		sp.setDanhMuc(danhMuc);
		
		// Laptop
		Laptop laptop = new Laptop("Acer", 2000000, "VN", null, danhMuc, null);
		laptop.setMainboard("Intel chipset");
		laptop.setCpu("Core i7 2.5GHz");
		laptop.setChuot("Touchpad");
		laptop.setHdd("500 TB 7200rpm");
		laptop.setHeDieuHanh("Window 7 Home premium");
		laptop.setLan("100mps");
		laptop.setWifi("100g/n/b");
		laptop.setRam("4GB");
		laptop.setTrongLuong("2.5kg");
		laptop.setPin("6 cells");
		
		spDao.them(sp);
		spDao.them(laptop);*/
		
		//themTaiKhoan();
		
		//testSanPham();
		
		/* Test cap nhat gio hang
		XuLyGioHangAction action = new XuLyGioHangAction();
		
		action.setDsMaSanPham("6, 12");
		action.setDsSoLuong("2, 3");
		action.capNhat();
		*/
		
		/*GianHangDAO ghDao = new GianHangDAO();
		GianHang gh  = ghDao.lay(1);
		
		SanPhamDAO spDao = new SanPhamDAO();
		DanhMucDAO dmDao = new DanhMucDAO();
		DanhMuc danhMuc = dmDao.lay(9);
		SanPham sp = spDao.lay(17);
		
		GianHangSanPham ghsp = new GianHangSanPham();
		
		
		ghsp.setSanPham(sp);
		ghsp.setGianHang(gh);
		ghsp.setBaoHanh(12);
		ghsp.setGiaRieng(12234000);
		ghsp.setSoLuong(100);
		
		
		sp.getDsGianHangSanPham().add(ghsp);
		
		spDao.capNhat(sp);
		
		System.out.println("Xong");
		
		*/

		/* Them hoa don */		
		 
		 /*GianHang gh = new GianHangDAO().lay(1);
		
		ThanhVienDAO tvDao = new ThanhVienDAO();
		ThanhVien tv = tvDao.lay(14);
		// Day la truong hop khi them hoa don se them nguoi nhan luon
		//NguoiNhan nn = new NguoiNhan("LLH", "TN", "email", "12345678", "abcxyz", null);
		//tv.getDsNguoiNhan().add(nn);
		//nn.setThanhVien(tv);
		
		// Truong hop ko them nguoi nhan
		NguoiNhan nn = new NguoiNhanDAO().lay(49);
		
		SanPham sanPham  = new SanPhamDAO().lay(17);
		ChiTietHoaDon ct = new ChiTietHoaDon(2, 100, sanPham);
		ChiTietHoaDon ct1 = new ChiTietHoaDon(3, 1, sanPham);
		List<ChiTietHoaDon> ds = new ArrayList<ChiTietHoaDon>();
		ds.add(ct);
		ds.add(ct1);
		
		HoaDon hd = new HoaDon(tv,null, null, nn, null, ds, gh);
		
		HoaDonDAO hdDao = new HoaDonDAO();
		
		hdDao.them(hd);
		//tvDao.capNhat(tv);
		
		System.out.println("Xong");
		System.out.println(tv.getDsHoaDon().size());*/
		/* Xoa hoa don */
		/*HoaDonDAO hdDao = new HoaDonDAO();
		HoaDon t = hdDao.lay(17);
		hdDao.xoa(t);*/
		/*
		HoaDonDAO hdDao = new HoaDonDAO();
		HoaDon hd = hdDao.lay(20);
		
		//List<ChiTietHoaDon> list = new ChiTietHoaDonDAO().layDanhSach(hd);
		for (ChiTietHoaDon ct : hd.getDsChiTietHoaDon()) {
			System.out.println(ct.getSanPham().getTenSanPham());
		}
		System.out.println(hd.getDsChiTietHoaDon().size());
		System.out.println(hd.getThanhVien().getHoTen());
		System.out.println(hd.getGianHang().getTenGianHang());
*/		
		/*List<HoaDon> list = hdDao.layDanhSach();
		System.out.println(list.size());
		for (HoaDon hoaDon : list) {
			System.out.println(hoaDon.getThanhVien().getHoTen());
		}*/
		
		/*ThanhVienDAO tvDao = new ThanhVienDAO();
		TaiKhoanDAO tkDao = new TaiKhoanDAO();
		ThanhVien tv = tvDao.lay(16);
		TaiKhoan tk = tkDao.lay(16);
		System.out.println(tv.getMaTaiKhoan());
		System.out.println(tk.getGianHang().getTenGianHang());*/
		/*SanPhamDAO spDao = new SanPhamDAO();
		
		List<SanPhamGH> ghsp = spDao.layDsSanPhamGH(17);
		for (SanPhamGH g : ghsp) {
			System.out.println(g.getGianHang().getTenGianHang() + " - " + g.getGia() + " - " + g.getCapNhat().toString());	
		}
		
		HoaDonDAO hdDao = new HoaDonDAO();
		ThanhVienDAO tvDao = new ThanhVienDAO();
		ThanhVien thanhVien  = tvDao.lay(14);
		List<HoaDon> list = hdDao.layDanhSach(thanhVien);
		for (HoaDon hoaDon : list) {
			System.out.println(hoaDon.getNguoiNhan().getTenNguoiNhan());
			for (ChiTietHoaDon ct : hoaDon.getDsChiTietHoaDon()) {
				System.out.println("    " + ct.getSanPham().getTenSanPham());
			}
		}
		System.out.println(list.size());*/
		
		// Test gian hang danh muc
		/*System.out.println("test gian hang danh muc");
		testGianHangDanhMuc();
		System.out.println("Xong");*/
		
		//
		/*System.out.println("test san pham gian hang");
		testSanPhamGianHang();
		System.out.println("Xong");*/
		
		
		//testSanPhamGianHang();
		
		// Lay nhom danh muc theo thu tu
		/*GianHangDAO ghDao = new GianHangDAO();
		GianHang gianHang = ghDao.lay(1);
		NhomDanhMucDAO ndmDao = new NhomDanhMucDAO();
		List<NhomDanhMuc> list = ndmDao.layDanhSach(gianHang);
		
		for (NhomDanhMuc nhomDanhMuc : list) {
			System.out.println(nhomDanhMuc.getMaNhom());
		}
		
		// Thay đổi thông tin gian hàng sản phẩm
		List<GianHangSanPham> ls = gianHang.getDsGianHangSanPham();
		
		for (GianHangSanPham gianHangSanPham : ls) {
			gianHangSanPham.setCapNhat(new Date());
		}
		
		// cập nhật thông tin gian hàng sản phẩm
		ghDao.capNhat(gianHang);
		System.out.println("Xong");*/
		
		// Test ve nhom danh muc
		GianHang gianHang = new GianHangDAO().lay(1);
		NhomDanhMucDAO ndmDao = new NhomDanhMucDAO();
		
		List<NhomDanhMuc> ds = gianHang.getDsNhomDanhMuc();
		for(int i = 0; i < ds.size(); i++){
			if(ds.get(i) != null)
			ds.get(i).setThuTu(i+1);
		}
		
		new GianHangDAO().capNhat(gianHang);
		
		for (int i = 0; i < gianHang.getDsNhomDanhMuc().size(); i++) {
			System.out.println(gianHang.getDsNhomDanhMuc().get(i).getThuTu());
		}
	}
	

	private static void testGianHangDanhMuc(){
		
		DanhMucDAO dmDao = new DanhMucDAO();
		GianHangDAO ghDao = new GianHangDAO();
		
		// Lay 2 danh muc
		DanhMuc dm1 = dmDao.lay(8);
		DanhMuc dm2 = dmDao.lay(9);
		
		// Lay gian hang
		GianHang gh1 = ghDao.lay(1);
		
		// Them nhóm danh mục trước
		NhomDanhMucDAO ndmDao = new NhomDanhMucDAO();
		NhomDanhMuc ndm1 = ndmDao.lay(1);
		
		
		// Tao đối tượng GianHangDanhMuc
		GianHangDanhMuc ghdm1 = new GianHangDanhMuc(gh1, dm1, ndm1);
		GianHangDanhMuc ghdm2 = new GianHangDanhMuc(gh1, dm2, ndm1);
		
		// Cap nhat gian hàng
		gh1.getDsGianHangDanhMuc().add(ghdm1);
		gh1.getDsGianHangDanhMuc().add(ghdm2);
		gh1.getDsNhomDanhMuc().add(ndm1);
		
		ghDao.capNhat(gh1);
	}
	
	
	private static void testSanPhamGianHang(){
		GianHangDAO ghDao = new GianHangDAO();
		GianHang gianHang = ghDao.lay(2);
		
		SanPhamDAO spDao = new SanPhamDAO();
		SanPham sp1 = spDao.lay(19);
		SanPham sp2 = spDao.lay(20);
		
		GianHangSanPham ghsp1 = new GianHangSanPham(gianHang, sp1, 14500000, 12, 10, new Date());
		GianHangSanPham ghsp2 = new GianHangSanPham(gianHang, sp2, 19000000, 24, 5, new Date());
		
		gianHang.getDsGianHangSanPham().add(ghsp1);
		gianHang.getDsGianHangSanPham().add(ghsp2);
		
		ghDao.capNhat(gianHang);
		
		
	}
	
	private static void xuatSanPham(SanPham sp){
		System.out.println(sp.getMaSanPham() + " - " + sp.getTenSanPham() + " - " + sp.getGia());
	}
	private static void testSanPham(){
		DanhMuc danhMuc = new DanhMucDAO().lay(8);
		// Laptop
		Laptop laptop = new Laptop("Dell Inspiron", 2000000, "VN", null, danhMuc, null);
		laptop.setMainboard("Intel chipset");
		laptop.setCpu("Core i7 2.5GHz");
		laptop.setChuot("Touchpad");
		laptop.setHdd("500 TB 7200rpm");
		laptop.setHeDieuHanh("Window 7 Home premium");
		laptop.setLan("100mps");
		laptop.setWifi("100g/n/b");
		laptop.setRam("4GB");
		laptop.setTrongLuong("2.5kg");
		laptop.setPin("6 cells");
		
		LaptopDAO laptopDao = new LaptopDAO();
		laptopDao.them(laptop);
		
		DienThoai dienThoai = new DienThoai();
		dienThoai.setTenSanPham("Nokia c3 wifi");
		dienThoai.setGia(2300000);
		danhMuc = new DanhMucDAO().lay(8);
		dienThoai.setDanhMuc(danhMuc);
		
		
		DienThoaiDAO dtDao = new DienThoaiDAO();
		dtDao.them(dienThoai);
	}
	
	private static void xuat(List<DanhMuc> dsDanhMuc, String  temp){
		
		for(int i = 0; i < dsDanhMuc.size(); i++){
			System.out.println(temp + dsDanhMuc.get(i).getTenDanhMuc());
		}
		
		temp +="    ";
	}

	private static void themTaiKhoan() throws UnsupportedEncodingException{
		TaiKhoan tk = new TaiKhoan();
		tk.setTenTruyCap("llho");
		tk.setNgayKichHoat(new Date());
		String salt = HashUtil.generateSalt(6);
		tk.setSalt(salt);
		String mk = salt + "123456";
		tk.setMatKhau(HashUtil.generateHash(mk));
		NhomNguoiDung nnd = new NhomNguoiDungDAO().lay(1);
		tk.setNhomNguoiDung(nnd);
		
		ThanhVien tv = new ThanhVien();
		tv.setHoTen("LLH");
		tv.setDiaChi("Tây Ninh");
		tv.setDienThoai("01674560436");
		tv.setEmail("dragon_TN@yahoo.com");
		
		tk.setThanhVien(tv);
		tv.setTaiKhoan(tk);
		
		TaiKhoanDAO tkDao = new TaiKhoanDAO();
		tkDao.them(tk);
	}
	
}
