package action;

import java.util.ArrayList;
import java.util.List;

import model.dao.DienThoaiDAO;
import model.pojo.DienThoai;
import model.pojo.DienThoaiTieuChi;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class DienThoaiTimKiemAction extends ActionSupport implements ModelDriven<DienThoaiTieuChi>, Preparable{
	
	
	private DienThoaiTieuChi tieuChi  = new DienThoaiTieuChi();
	private List<DienThoai> dsDienThoai = new ArrayList<DienThoai>();
	private DienThoaiDAO dtDao = new DienThoaiDAO();
	
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("Tìm kiếm điện thoại");
		System.out.println(tieuChi.getHangSanXuat());
		//dsDienThoai = dtDao.timKiem(tieuChi);
		return SUCCESS;
	}
	
		
	public void prepare() throws Exception {
		
	}
	public DienThoaiTieuChi getModel() {
		return tieuChi;
	}
	public DienThoaiTieuChi getTieuChi() {
		return tieuChi;
	}
	public void setTieuChi(DienThoaiTieuChi tieuChi) {
		this.tieuChi = tieuChi;
	}
	public List<DienThoai> getDsDienThoai() {
		return dsDienThoai;
	}
	public void setDsDienThoai(List<DienThoai> dsDienThoai) {
		this.dsDienThoai = dsDienThoai;
	}	
}

