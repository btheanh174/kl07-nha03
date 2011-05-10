package action;

import model.pojo.GioHang;

import com.opensymphony.xwork2.ActionSupport;

public class GioHangAction extends ActionSupport{
	private GioHang gioHang;
	
	
	public String capNhat(){
		return SUCCESS;
	}
	public String xoaTatca(){
		return SUCCESS;
	}
	public String xoa(){
		return SUCCESS;
	}
	
	
	public GioHang getGioHang() {
		return gioHang;
	}
	public void setGioHang(GioHang gioHang) {
		this.gioHang = gioHang;
	}
	
}
