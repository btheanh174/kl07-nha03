package action.sanpham;

import java.util.ArrayList;
import java.util.List;

import model.dao.DanhMucDAO;
import model.dao.SanPhamDAO;
import model.dao.ThamSoDAO;
import model.pojo.DanhMuc;
import model.pojo.SanPham;

import com.opensymphony.xwork2.ActionSupport;

public class ListingSanPhamAction extends ActionSupport {
	private int maSanPham;
	private SanPham sanPham;
	private List<SanPham> dsSanPham;
	private int maDanhMuc;
	
	private int trang = 1;
	private int tongSoTrang;
	private List<Integer> soTrang = new ArrayList<Integer>();
	
	private ThamSoDAO tsDao = new ThamSoDAO();
	private SanPhamDAO spDao =  new SanPhamDAO();
	private DanhMucDAO dmDao = new DanhMucDAO();
	@Override
	public String execute() throws Exception {
		int soSanPhamTrenTrang = tsDao.layGiaTri(1);
		int soSanPham = 0;
		
		if(maDanhMuc > 0){
			DanhMuc danhMuc = dmDao.lay(maDanhMuc);
			soSanPham = spDao.layDanhSach(danhMuc).size();
			tongSoTrang = soSanPham / soSanPhamTrenTrang;
			if(soSanPham % soSanPhamTrenTrang != 0){
				tongSoTrang++;
			}
			dsSanPham = spDao.layDanhSach(danhMuc, trang, soSanPhamTrenTrang);
		}
		else{
			soSanPham  = spDao.layDanhSach().size();
			tongSoTrang = soSanPham / soSanPhamTrenTrang;
			if(soSanPham % soSanPhamTrenTrang != 0){
				tongSoTrang++;
			}
			dsSanPham = spDao.layDanhSach(trang, soSanPhamTrenTrang);
		}
		return "list";
	}
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public SanPham getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	public List<SanPham> getDsSanPham() {
		return dsSanPham;
	}
	public void setDsSanPham(List<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}
	public int getTrang() {
		return trang;
	}
	public void setTrang(int trang) {
		this.trang = trang;
	}
	public int getTongSoTrang() {
		return tongSoTrang;
	}
	public void setTongSoTrang(int tongSoTrang) {
		this.tongSoTrang = tongSoTrang;
	}
	public List<Integer> getSoTrang() {
		for (int i = 1; i <= getTongSoTrang(); i++) {
			this.soTrang.add(i);
		}
		return soTrang;
	}
	public void setSoTrang(List<Integer> soTrang) {
		this.soTrang = soTrang;
	}
	public int getMaDanhMuc() {
		return maDanhMuc;
	}
	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
}
