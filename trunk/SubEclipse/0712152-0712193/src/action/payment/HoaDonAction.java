package action.payment;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import util.SendMail;

import model.dao.GianHangDAO;
import model.dao.HoaDonDAO;
import model.dao.NguoiNhanDAO;
import model.dao.TinhThanhPhoDAO;
import model.dao.TinhTrangHoaDonDAO;
import model.pojo.ChiTietHoaDon;
import model.pojo.GianHang;
import model.pojo.GioHang;
import model.pojo.HinhThucVanChuyen;
import model.pojo.HoaDon;
import model.pojo.MatHang;
import model.pojo.MiniCart;
import model.pojo.NguoiNhan;
import model.pojo.PhuongThucThanhToan;
import model.pojo.TaiKhoan;
import model.pojo.ThanhVien;
import model.pojo.TinhTrangHoaDon;

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
		TinhTrangHoaDon tthd = tthdDao.lay(4); // Khách hàng đã thanh toán

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

		// Gửi email cho người dùng:
		try {
			String to = tv.getEmail();
			String subject = "Estore - Hóa đơn mua hàng";
			String body = "Chào " + tv.getHoTen() + "\n";
			body += "Bạn đã thực hiện thành công giao dịch, chi tiết giao dịch...";
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