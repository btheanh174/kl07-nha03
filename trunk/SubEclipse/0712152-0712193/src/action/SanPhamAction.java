package action;


import java.util.List;

import model.dao.SanPhamDAO;
import model.pojo.SanPham;
import model.pojo.SanPhamTieuChi;

import com.opensymphony.xwork2.ActionContext;
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
	private List<SanPham> dsSanPham;
	private SanPhamTieuChi tieuChi;
	
	public String execute(){
		dsSanPham = spDao.layDanhSach();
		return SUCCESS;
	}
	
	public String chiTiet(){
		sanPham = spDao.lay(maSanPham);
		return SUCCESS;
	}
	
	public String timNhanh(){
		System.out.println(tieuChi.toString());
		dsSanPham = spDao.timKiem(getTieuChi());
		System.out.println(dsSanPham.size());
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


	public List<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(List<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
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
}
