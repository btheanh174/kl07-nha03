 package util;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.dao.DanhMucDAO;
import model.dao.DienThoaiDAO;
import model.dao.GianHangDAO;
import model.dao.LaptopDAO;
import model.dao.NhomNguoiDungDAO;
import model.dao.SanPhamDAO;
import model.dao.TaiKhoanDAO;
import model.dao.ThamSoDAO;
import model.pojo.DanhMuc;
import model.pojo.DienThoai;
import model.pojo.GianHang;
import model.pojo.Laptop;
import model.pojo.NhomNguoiDung;
import model.pojo.SanPham;
import model.pojo.SanPhamTieuChi;
import model.pojo.TaiKhoan;
import model.pojo.ThamSo;
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
		
		/*TaiKhoanDAO tkDao = new TaiKhoanDAO();
		TaiKhoan tk = new TaiKhoan();
		tk.setTenTruyCap("llh");
		tk.setSalt("llh");
		tk.setMatKhau("123456");
		tk.setNgayKichHoat(new Date());
		NhomNguoiDung nnd = new NhomNguoiDungDAO().lay(1);
		tk.setNhomNguoiDung(nnd);
		
		ThanhVien tv = new ThanhVien();
		tv.setHoTen("Le Long Ho");
		tv.setDiaChi("TN");
		tv.setDienThoai("123456789");
		tv.setEmail("dragonlake89@yahoo.com.vn");
		
		tk.setThanhVien(tv);
		tv.setTaiKhoan(tk);
		
		tkDao.them(tk);
	*/
		
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
		
		int kq = new ThamSoDAO().layGiaTri(1);
		System.out.println(kq);
		
		SanPhamDAO spDao = new SanPhamDAO();
		SanPham sp = spDao.lay(12);
		System.out.println(sp.getLoaiSanPham());
		SanPhamTieuChi tieuChi = new SanPhamTieuChi("", "", "1", "DIENTHOAI");
		List<SanPham> list = spDao.timKiem(tieuChi);
		System.out.println(list.size());
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
	
	private static void testGianHangDanhMuc(){
		TaiKhoan tk = new TaiKhoanDAO().lay(1);
		System.out.println(tk.getTenTruyCap());
		
		Set<GianHang> dsGianHang = new HashSet<GianHang>();
		
		GianHang gh1 = new GianHang();
		gh1.setTenGianHang("LLH");
		gh1.setDiaChi("Tay Ninh");
		gh1.setDienThoai("01674560436");
		gh1.setTaiKhoan(tk);
		
		GianHang gh2 = new GianHang();
		gh2.setTenGianHang("MTH");
		gh2.setDiaChi("Vung Tau");
		gh2.setDienThoai("0902615194");
		gh2.setTaiKhoan(tk);
		
		dsGianHang.add(gh1);
		dsGianHang.add(gh2);
		
		
		DanhMuc dm1 = new DanhMucDAO().lay(8);
		DanhMuc dm2 = new DanhMucDAO().lay(9);
		
		dm1.setDsGianHang(dsGianHang);
		dm2.setDsGianHang(dsGianHang);
		
		
		Set<DanhMuc> dsDanhMuc = new HashSet<DanhMuc>();
		dsDanhMuc.add(dm1);
		dsDanhMuc.add(dm2);
		
		gh1.setDsDanhMuc(dsDanhMuc);
		gh2.setDsDanhMuc(dsDanhMuc);
		
		GianHangDAO ghDao = new GianHangDAO();
		DanhMucDAO dmDao = new DanhMucDAO();
		
		dmDao.them(dm1);
		dmDao.them(dm2);
		
		ghDao.them(gh1);
		ghDao.them(gh2);
	}
}