package action.gianhang;

import model.dao.GianHangDAO;
import model.dao.SanPhamDAO;

import com.opensymphony.xwork2.ActionSupport;

public class GianHangSanPhamAction extends ActionSupport {
	
	private int maGianHang;
	private GianHangDAO ghDao = new GianHangDAO();
	
	private int maSanPham;
	private SanPhamDAO spDao = new SanPhamDAO();
	@Override
	public String execute() throws Exception {
		return super.execute();
	}
	
}
