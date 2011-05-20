package action.gianhang;

import java.util.Map;

import model.dao.GianHangDAO;
import model.pojo.GianHang;
import model.pojo.TaiKhoan;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class GianHangAction extends ActionSupport implements ModelDriven<GianHang>, Preparable, SessionAware{
	private int maGianHang;
	private GianHang gianHang = new GianHang();
	private GianHangDAO ghDao = new GianHangDAO();
	private Map<String, Object> session;
	
	public String hienThi(){
		System.out.println("Hien thi store");
		TaiKhoan tk = (TaiKhoan)session.get("tk");
		if(tk != null){
			gianHang = tk.getGianHang();
			//session.put("gianhang", gianHang);
		}
		return SUCCESS;
	}
	
	public String capNhat(){
		System.out.println("Cap nhat store");
		ghDao.capNhat(gianHang);
		return SUCCESS;
	}
	
	@Override
	public GianHang getModel() {
		return gianHang;
	}

	@Override
	public void prepare() throws Exception {
		if(maGianHang != 0){
			gianHang = ghDao.lay(maGianHang); 
		}
	}

	public int getMaGianHang() {
		return maGianHang;
	}

	public void setMaGianHang(int maGianHang) {
		this.maGianHang = maGianHang;
	}

	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
