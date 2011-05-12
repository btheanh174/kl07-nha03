package action;

import model.dao.SanPhamDAO;
import model.pojo.SanPham;
import util.GioHangUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class XuLyGioHangAction extends ActionSupport implements ModelDriven<SanPham>{
	
	private int maSanPham;
	private SanPham sanPham;
	private SanPhamDAO spDao = new SanPhamDAO();
	private int soLuong = 1;
	private GioHangUtil gh = new GioHangUtil();
	@Override
	public String execute() throws Exception {
		System.out.println(getMaSanPham());
		
		return SUCCESS;
	}
	
	public String them(){
		sanPham = spDao.lay(maSanPham);
		System.out.println("Them vao gio hang");
		System.out.println(getMaSanPham());
		System.out.println(getSoLuong());
		gh.themMonHang(soLuong, sanPham);
		return SUCCESS;
	}

	public void capNhat(){
		
	}
	
	public void xoaTatca(){
		
	}
	
	public void thanhToan(){
		
	}
	

	@Override
	public SanPham getModel() {
		return sanPham;
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

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
}
