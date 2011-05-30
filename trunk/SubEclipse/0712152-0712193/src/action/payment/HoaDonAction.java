package action.payment;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import model.dao.GianHangDAO;
import model.dao.HoaDonDAO;
import model.dao.NguoiNhanDAO;
import model.pojo.GianHang;
import model.pojo.GioHang;
import model.pojo.MiniCart;
import model.pojo.NguoiNhan;
import model.pojo.TaiKhoan;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HoaDonAction extends ActionSupport implements SessionAware{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NguoiNhan nguoiNhan;
	private int maGioHangMini;
	private MiniCart miniCart;
	private GianHang gianHang;
	

	private Map<String, Object> session;
	private NguoiNhanDAO nnDao = new NguoiNhanDAO();
	private HoaDonDAO hdDao = new HoaDonDAO();
	
	public String execute() {
		return SUCCESS;
	}

	
	public String xulyNguoiNhanHang()
	{
		TaiKhoan tk = (TaiKhoan)session.get("tk");
		if (tk == null)
			return ERROR;
		nguoiNhan.setThanhVien(tk.getThanhVien());

		session.put("nguoiNhan", nguoiNhan);
		return SUCCESS;
	}
	
	public String xulyThongTinHoaDon()
	{
		khoiTaoMiniCart();
		GianHangDAO ghDao = new GianHangDAO();
		gianHang = ghDao.lay(miniCart.getMaGianHang());
		nguoiNhan = (NguoiNhan) session.get("nguoiNhan");
		return SUCCESS;
	}
	
	public String xuLyMiniCardDuocThanhToan()
	{
		session.put("maGioHangMini", maGioHangMini);
		return SUCCESS;
	}
	
	public String xuLyLuuHoaDon()
	{
		khoiTaoMiniCart();
		nguoiNhan = (NguoiNhan) session.get("nguoiNhan");
		return SUCCESS;
	}
	
	public void setNguoiNhan(NguoiNhan nguoiNhan) {
		this.nguoiNhan = nguoiNhan;
	}

	public NguoiNhan getNguoiNhan() {
		return nguoiNhan;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
		
	}



	public void setMaGioHangMini(int maGioHangMini) {
		this.maGioHangMini = maGioHangMini;
	}


	public int getMaGioHangMini() {
		return maGioHangMini;
	}


	public void setMiniCart(MiniCart miniCart) {
		this.miniCart = miniCart;
	}


	public MiniCart getMiniCart() {
		return miniCart;
	}


	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}

	
	public void khoiTaoMiniCart()
	{
		session = ActionContext.getContext().getSession();
		GioHang gh = (GioHang)session.get("gh");
		maGioHangMini = (Integer) session.get("maGioHangMini");
		miniCart = gh.layMiniCart(maGioHangMini);
	}
	public GianHang getGianHang() {
		return gianHang;
	}
	
	

}
