package action;

import model.pojo.MatHang;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class XuLyGioHangAction extends ActionSupport{
	
	private MatHang matHang;
	@Override
	public String execute() throws Exception {
		System.out.println("Execute");
		
		return SUCCESS;
	}
	
	public String them(){
		System.out.println("Them vao gio hang");
		System.out.println(matHang.getSoLuong());
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
}
