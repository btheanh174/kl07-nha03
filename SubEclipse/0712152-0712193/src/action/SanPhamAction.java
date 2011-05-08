package action;


import java.util.ArrayList;
import java.util.List;

import model.dao.SanPhamDAO;
import model.dao.ThamSoDAO;
import model.pojo.DuLieuTrang;
import model.pojo.SanPham;
import model.pojo.SanPhamTieuChi;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class SanPhamAction extends ActionSupport implements ModelDriven<SanPham>,Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6399634351690725889L;
	
	SanPhamDAO spDao = new SanPhamDAO();
	private int maSanPham;
	private SanPham sanPham;
	private List<SanPham> listSanPham;
	private SanPhamTieuChi tieuChi;
	private int trang = 1;
	private int tongSoTrang;
	private List<Integer> soTrang = new ArrayList<Integer>();
	
	public String execute(){
		listSanPham = spDao.layDanhSach();
		return SUCCESS;
	}
	
	public String chiTiet(){
		sanPham = spDao.lay(maSanPham);
		return SUCCESS;
	}
	
	public String timNhanh(){
		System.out.println(tieuChi.toString());
		System.out.println("Trang hien tai = " +  trang);
		DuLieuTrang duLieuTrang = spDao.timKiem(tieuChi, trang);
		tongSoTrang = duLieuTrang.getTongSoTrang();
		listSanPham = duLieuTrang.getDsDuLieu();
		return SUCCESS;
	}
	
	public String timNangCao(){
		return SUCCESS;
	}

	@Override
	public SanPham getModel() {
		// TODO Auto-generated method stub
		return sanPham;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	

	public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}

	public int getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	@Override
	public void prepare() throws Exception {
		if(maSanPham != 0){
			sanPham = spDao.lay(maSanPham);
		}else{
			sanPham = new SanPham();
		}
	}

	public SanPhamTieuChi getTieuChi() {
		return tieuChi;
	}

	public void setTieuChi(SanPhamTieuChi tieuChi) {
		this.tieuChi = tieuChi;
	}

	public int getTrang() {
		return trang;
	}

	public void setTrang(int trang) {
		this.trang = trang;
	}

	public List<Integer> getSoTrang() {
		for(int i = 1; i <= getTongSoTrang(); i++){
			soTrang.add(i);
		}
		return soTrang;
	}

	public void setSoTrang(List<Integer> soTrang) {
		this.soTrang = soTrang;
	}

	public int getTongSoTrang() {
		return tongSoTrang;
	}

	public void setTongSoTrang(int tongSoTrang) {
		this.tongSoTrang = tongSoTrang;
	}
	
}
