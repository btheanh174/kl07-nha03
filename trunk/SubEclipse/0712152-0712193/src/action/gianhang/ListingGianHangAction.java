package action.gianhang;

import java.util.List;

import model.dao.GianHangDAO;
import model.pojo.GianHang;
import model.pojo.SanPham;

import com.opensymphony.xwork2.ActionSupport;

public class ListingGianHangAction extends ActionSupport {
	private GianHang gianHang;
	private List<GianHang> dsGianHang;
	private SanPham sanPham;
	private GianHangDAO ghDao = new GianHangDAO();
	@Override
	public String execute() throws Exception {
		dsGianHang = ghDao.layDanhSach();
		return "list";
	}
	
}
