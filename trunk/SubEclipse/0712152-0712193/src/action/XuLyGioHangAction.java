package action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import model.dao.SanPhamDAO;
import model.pojo.GioHang;
import model.pojo.MatHang;
import model.pojo.SanPham;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class XuLyGioHangAction extends ActionSupport implements ModelDriven<MatHang>, ServletRequestAware, SessionAware{
	
	
	private MatHang matHang;
	private int soLuong;
	private int maSanPham;
	private GioHang gioHang = new GioHang();
	private HttpServletRequest servletRequest;
	private Map<String, Object> session;
	@Override
	public String execute() throws Exception {
		System.out.println("Execute");
		return SUCCESS;
	}

	public String them(){
		gioHang = (GioHang)session.get("gh"); 
		if(gioHang == null){
			gioHang = new GioHang();
			session.put("gh", gioHang);
		}
		SanPham sp = new SanPhamDAO().lay(maSanPham);
		matHang = new MatHang(sp, soLuong);
		System.out.println("Them vao gio hang");
		System.out.println(matHang.getSoLuong());
		gioHang.themMatHang(matHang);
		System.out.println(gioHang.laySoLuongMatHang());
		
		return SUCCESS;
	}

	public void capNhat(){
		
	}
	
	public void xoaTatca(){
		
	}
	
	public void thanhToan(){
		
	}

	public MatHang getMatHang() {
		return matHang;
	}

	public void setMatHang(MatHang matHang) {
		this.matHang = matHang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	@Override
	public MatHang getModel() {
		// TODO Auto-generated method stub
		matHang = new MatHang();
		return matHang;
	}

	

	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		// TODO Auto-generated method stub
		this.servletRequest = servletRequest;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
