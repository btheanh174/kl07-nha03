 package util;

import java.io.UnsupportedEncodingException;
import java.util.List;

import model.dao.DanhMucDAO;
import model.dao.GianHangDAO;
import model.dao.HinhAnhDAO;
import model.dao.NhomNguoiDungDAO;
import model.dao.ThamSoDAO;
import model.pojo.DanhMuc;
import model.pojo.ThamSo;


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
		
		ThamSoDAO tsDao = new ThamSoDAO();
		List<ThamSo> dsTS = tsDao.layDanhSach();
		System.out.println(dsTS.size());
		
		NhomNguoiDungDAO nndDao = new NhomNguoiDungDAO();
		System.out.println(nndDao.layDanhSach().size());
		
		HinhAnhDAO spDao = new HinhAnhDAO();
		System.out.println(spDao.layDanhSach().size());
		
		DanhMucDAO dmDao = new DanhMucDAO();
		List<DanhMuc> dm = dmDao.layDanhSach();
		System.out.println(dm.size());
		
		GianHangDAO ghDao  = new GianHangDAO();
		System.out.println(ghDao.layDanhSach().size());
	}
	private static void xuat(List<DanhMuc> dsDanhMuc, String  temp){
		
		for(int i = 0; i < dsDanhMuc.size(); i++){
			System.out.println(temp + dsDanhMuc.get(i).getTenDanhMuc());
		}
		temp +="    ";
	}
}
