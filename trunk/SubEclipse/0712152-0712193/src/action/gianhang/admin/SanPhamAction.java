package action.gianhang.admin;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import model.dao.DanhMucDAO;
import model.dao.GianHangDAO;
import model.dao.SanPhamDAO;
import model.pojo.GianHang;
import model.pojo.GianHangSanPham;
import model.pojo.SanPham;
import model.pojo.TaiKhoan;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class SanPhamAction extends ActionSupport implements SessionAware {
	
	
	public static final String DUPLICATE = "duplicate";
	/**
	 * 
	 */
	private List<GianHangSanPham> dsGHSanPham;
	private GianHangSanPham ghSanPham;
	private List<SanPham> dsSanPham;
	private int favSanPham;
	private int echo;
	private String thongBao;
	private SanPham sanPham;
	private SanPhamDAO spDao = new SanPhamDAO();
	private GianHangDAO ghDao = new GianHangDAO();
	
	private int tongSoTrang;
	private int soLuongSP1Trang;
	private int trangHienTai;
	private List<GianHangSanPham> dsGHSanPhamShow;

	private static final long serialVersionUID = 1L;
	Map<String, Object> session;

	public String execute() {

		return SUCCESS;
	}

	public String layDanhSachSanPhamTheoGianHang() {
		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null) {
			return ERROR;
		}


		GianHang gianHang = ghDao.lay(tk);
		dsGHSanPham = gianHang.getDsGianHangSanPham();
		//System.out.println("URL = " + dsGHSanPham.get(0).getSanPham().getHinhAnh());
		//System.out.println("DSURL = " + dsGHSanPham.get(0).getSanPham().getDsHinhAnh().get(0));	
		soLuongSP1Trang = 7;
		trangHienTai = 1;
		tongSoTrang = dsGHSanPham.size() / soLuongSP1Trang;
		if (dsGHSanPham.size() % soLuongSP1Trang != 0) {
			tongSoTrang++;
		}
		System.out.println("Tong so trang = " + tongSoTrang);
		dsGHSanPhamShow = new ArrayList<GianHangSanPham>();
		for (int i = 0; i < soLuongSP1Trang; i++) {
			dsGHSanPhamShow.add(dsGHSanPham.get(i));
		}
		session.put("dsGHSanPham", dsGHSanPham);
		session.put("soLuongSP1Trang", soLuongSP1Trang);
		session.put("tongSoTrang", tongSoTrang);
		return SUCCESS;
	}

	public String layDanhSachSanPhamTheoGianHangTheoTrang() {
		dsGHSanPham = (List<GianHangSanPham>) session.get("dsGHSanPham");
		soLuongSP1Trang = (Integer) session.get("soLuongSP1Trang");
		tongSoTrang = (Integer) session.get("tongSoTrang");

		int from = (trangHienTai - 1) * soLuongSP1Trang;
		int to = from + soLuongSP1Trang;
		if (trangHienTai == tongSoTrang) {
			to = from + (dsGHSanPham.size() % soLuongSP1Trang);
		}
		dsGHSanPhamShow = new ArrayList<GianHangSanPham>();
		for (int i = from; i < to; i++) {
			dsGHSanPhamShow.add(dsGHSanPham.get(i));
		}
		return SUCCESS;
	}

	public String layChiTietSanPhamGianHang() {
		SanPhamDAO spDao = new SanPhamDAO();
		sanPham = spDao.lay(echo);
		return SUCCESS;
	}

	public String xemThongSoGianHangSanPham() {
		dsGHSanPham = (List<GianHangSanPham>) session.get("dsGHSanPham");
		for (int i = 0; i < dsGHSanPham.size(); i++) {
			if (dsGHSanPham.get(i).getSanPham().getMaSanPham() == echo) {
				ghSanPham = dsGHSanPham.get(i);
				return SUCCESS;
			}
		}
		return ERROR;
	}

	public String xacNhanXoaGianHangSanPham() {
		dsGHSanPham = (List<GianHangSanPham>) session.get("dsGHSanPham");
		for (int i = 0; i < dsGHSanPham.size(); i++) {
			if (dsGHSanPham.get(i).getSanPham().getMaSanPham() == echo) {
				ghSanPham = dsGHSanPham.get(i);
				return SUCCESS;
			}
		}
		return SUCCESS;
	}

	public String xoaGianHangSanPham() {

		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null) {
			return ERROR;
		}
		GianHang gianHang = ghDao.lay(tk);
		dsGHSanPham = gianHang.getDsGianHangSanPham();
		for (int i = 0; i < dsGHSanPham.size(); i++) {
			if (dsGHSanPham.get(i).getSanPham().getMaSanPham() == echo) {
				System.out.println("Before: " + dsGHSanPham.size());
				dsGHSanPham.remove(dsGHSanPham.get(i));
				System.out.println("After: " + dsGHSanPham.size());
				ghDao.capNhat(gianHang);
				return SUCCESS;
			}
		}

		return ERROR;
	}

	public String capNhatThongTinGianHangSanPham() {
		
		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null) {
			return ERROR;
		}
		GianHang gianHang = ghDao.lay(tk);
		dsGHSanPham = gianHang.getDsGianHangSanPham();
		for (int i = 0; i < dsGHSanPham.size(); i++) {
			if (dsGHSanPham.get(i).getSanPham().getMaSanPham() == echo) {
				GianHangSanPham ghsp = dsGHSanPham.get(i);
				dsGHSanPham.get(i).setGiaRieng(ghSanPham.getGiaRieng());
				dsGHSanPham.get(i).setBaoHanh(ghSanPham.getBaoHanh());
				dsGHSanPham.get(i).setSoLuong(ghSanPham.getSoLuong());
				ghDao.capNhat(gianHang);
				return SUCCESS;
			}
		}

		return ERROR;
	}

	public String layDanhSachSanPhamTheoDanhMuc() {
		if (echo != 0) {
			DanhMucDAO dmDao = new DanhMucDAO();
			dsSanPham = spDao.layDanhSach(dmDao.lay(echo));
		} else {
			dsSanPham = new ArrayList<SanPham>();
		}
		return SUCCESS;
	}

	public String themChiTietSanPhamDuocChon() {
		
		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null) {
			return ERROR;
		}
		GianHang gianHang = ghDao.lay(tk);
		dsGHSanPham = gianHang.getDsGianHangSanPham();
		for (int i = 0; i < dsGHSanPham.size(); i++)
		{
			if (dsGHSanPham.get(i).getSanPham().getMaSanPham() ==  favSanPham)
			{
				thongBao = "Sản phẩm đã có trong cửa hàng của bạn";
				return DUPLICATE;
			}
		}
		sanPham = spDao.lay(favSanPham);
		session.put("sanPham", sanPham);
		//session.put("favSanPham",favSanPham);
		return SUCCESS;

	}

	public String themSanPhamVaoGianHang_Step3() {
		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null) {
			return ERROR;
		}

		try {
			sanPham = (SanPham) session.get("sanPham");
			if (ghSanPham != null) {
				GianHang gianHang = ghDao.lay(tk);
				ghSanPham.setGianHang(gianHang);
				ghSanPham.setSanPham(sanPham);
				ghSanPham.setCapNhat(new Date());
				gianHang.getDsGianHangSanPham().add(ghSanPham);
				sanPham.getDsGianHangSanPham().add(ghSanPham);
				ghDao.capNhat(gianHang);

			}
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " +  e.toString());
		}
		return ERROR;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	public List<GianHangSanPham> getDsGHSanPham() {
		return dsGHSanPham;
	}

	public void setDsGHSanPham(List<GianHangSanPham> dsGHSanPham) {
		this.dsGHSanPham = dsGHSanPham;
	}

	public GianHangSanPham getGhSanPham() {
		return ghSanPham;
	}

	public void setGhSanPham(GianHangSanPham ghSanPham) {
		this.ghSanPham = ghSanPham;
	}

	public void setEcho(int echo) {
		this.echo = echo;
	}

	public int getEcho() {
		return echo;
	}

	public void setDsSanPham(List<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public List<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setFavSanPham(int favSanPham) {
		this.favSanPham = favSanPham;
	}

	public int getFavSanPham() {
		return favSanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public int getTongSoTrang() {
		return tongSoTrang;
	}

	public void setTongSoTrang(int tongSoTrang) {
		this.tongSoTrang = tongSoTrang;
	}

	public int getSoLuongSP1Trang() {
		return soLuongSP1Trang;
	}

	public void setSoLuongSP1Trang(int soLuongSP1Trang) {
		this.soLuongSP1Trang = soLuongSP1Trang;
	}

	public int getTrangHienTai() {
		return trangHienTai;
	}

	public void setTrangHienTai(int trangHienTai) {
		this.trangHienTai = trangHienTai;
	}

	public void setDsGHSanPhamShow(List<GianHangSanPham> dsGHSanPhamShow) {
		this.dsGHSanPhamShow = dsGHSanPhamShow;
	}

	public List<GianHangSanPham> getDsGHSanPhamShow() {
		return dsGHSanPhamShow;
	}

	public String getThongBao() {
		return thongBao;
	}

	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
	}

	
}
