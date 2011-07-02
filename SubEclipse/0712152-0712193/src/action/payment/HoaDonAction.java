package com.estore.shop.action.payment;

import java.util.Enumeration;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.estore.core.model.dao.GianHangDAO;
import com.estore.core.model.dao.HoaDonDAO;
import com.estore.core.model.dao.NguoiNhanDAO;
import com.estore.core.model.dao.TinhTrangHoaDonDAO;
import com.estore.core.model.pojo.ChiTietHoaDon;
import com.estore.core.model.pojo.GianHang;
import com.estore.core.model.pojo.GioHang;
import com.estore.core.model.pojo.HoaDon;
import com.estore.core.model.pojo.MatHang;
import com.estore.core.model.pojo.MiniCart;
import com.estore.core.model.pojo.NguoiNhan;
import com.estore.core.model.pojo.TaiKhoan;
import com.estore.core.model.pojo.ThanhVien;
import com.estore.core.model.pojo.TinhTrangHoaDon;
import com.estore.core.util.SendMail;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HoaDonAction extends ActionSupport implements SessionAware {

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

	public String xulyNguoiNhanHang() {
		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null)
			return ERROR;
		nguoiNhan.setThanhVien(tk.getThanhVien());

		session.put("nguoiNhan", nguoiNhan);
		return SUCCESS;
	}

	public String xulyThongTinHoaDon() {
		khoiTaoMiniCart();
		String soTienThanhToan = miniCart.layChuoiTongTienUSD();
		GianHangDAO ghDao = new GianHangDAO();
		gianHang = ghDao.lay(miniCart.getMaGianHang());
		nguoiNhan = (NguoiNhan) session.get("nguoiNhan");
		session.put("gianHang", gianHang);
		String test = (String) session.get("soTienThanhToan");
		System.out.println("test soTienThanhToan = " + test);
		return SUCCESS;
	}

	public String xuLyMiniCardDuocThanhToan() {
		session.put("maGioHangMini", maGioHangMini);
		khoiTaoMiniCart();
		String soTienThanhToan = miniCart.layChuoiTongTienUSD();
		session.put("soTienThanhToan", soTienThanhToan);
		return SUCCESS;
	}

	public String xuLyLuuHoaDon() {
		khoiTaoMiniCart();
		session = ActionContext.getContext().getSession();
		TaiKhoan tk = (TaiKhoan) session.get("tk");
		ThanhVien tv = tk.getThanhVien();
		nguoiNhan = (NguoiNhan) session.get("nguoiNhan");
		gianHang = (GianHang) session.get("gianHang");

		TinhTrangHoaDonDAO tthdDao = new TinhTrangHoaDonDAO();
		TinhTrangHoaDon tthd = tthdDao.lay(4); // KhÃ¡ch hÃ ng Ä‘Ã£ thanh toÃ¡n

		NguoiNhanDAO nnDAO = new NguoiNhanDAO();
		nnDAO.them(nguoiNhan);
		HoaDon hoaDon = new HoaDon(tv, nguoiNhan, tthd, gianHang);

		Enumeration<MatHang> dsmh = miniCart.layDsMatHang();
		while (dsmh.hasMoreElements()) {
			MatHang mh = (MatHang) dsmh.nextElement();
			ChiTietHoaDon cthd = new ChiTietHoaDon(mh.getSoLuong(), mh
					.getSanPham().getGia(), mh.getSanPham());
			hoaDon.getDsChiTietHoaDon().add(cthd);
		}

		HoaDonDAO hdDao = new HoaDonDAO();
		hdDao.them(hoaDon);

		// Gá»­i email cho ngÆ°á»�i dÃ¹ng:
		try {
			String to = tv.getEmail();
			String subject = "Estore - HÃ³a Ä‘Æ¡n mua hÃ ng";
			String body = "ChÃ o " + tv.getHoTen() + "\n";
			body += "Báº¡n Ä‘Ã£ thá»±c hiá»‡n thÃ nh cÃ´ng giao dá»‹ch, chi tiáº¿t giao dá»‹ch...";
			SendMail.sendMail(to, subject, body);
			System.out.println("Finish!");
		} catch (Exception ex) {
			System.out.println("Usage: " + ex.getMessage());
		}
		return SUCCESS;
	}

	public void setNguoiNhan(NguoiNhan nguoiNhan) {
		this.nguoiNhan = nguoiNhan;
	}

	public NguoiNhan getNguoiNhan() {
		return nguoiNhan;
	}

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

	public void khoiTaoMiniCart() {
		session = ActionContext.getContext().getSession();
		GioHang gh = (GioHang) session.get("gh");
		maGioHangMini = (Integer) session.get("maGioHangMini");
		miniCart = gh.layMiniCart(maGioHangMini);
	}

	public GianHang getGianHang() {
		return gianHang;
	}

}
