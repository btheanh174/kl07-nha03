package action;

import java.util.ArrayList;
import java.util.List;

import model.dao.DanhMucDAO;
import model.pojo.DanhMuc;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DanhMucAction extends ActionSupport implements ModelDriven<DanhMuc>{
	
	private DanhMuc danhMuc;
	private List<DanhMuc> dsDanhMuc = new ArrayList<DanhMuc>();

	public String populate(){
		
		return "populate";
	}
	
	public String execute(){
		DanhMucDAO dmDao = new DanhMucDAO();
		
		dsDanhMuc = dmDao.layDanhSach();
		
		return SUCCESS;
	}
	
	public List<DanhMuc> getDsDanhMuc() {
		return dsDanhMuc;
	}

	public void setDsDanhMuc(List<DanhMuc> dsDanhMuc) {
		this.dsDanhMuc = dsDanhMuc;
	}

	@Override
	public DanhMuc getModel() {
		// TODO Auto-generated method stub
		return danhMuc;
	}
}
