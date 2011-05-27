package action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import model.dao.GianHangDAO;
import model.dao.SanPhamDAO;
import model.pojo.GioHang;
import model.pojo.MatHang;
import model.pojo.SanPham;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class XuLyGioHangAction extends ActionSupport implements
		ModelDriven<MatHang>, ServletRequestAware, SessionAware {

	
	private MatHang matHang;

	private int soLuong;
	private String dsSoLuong;
	private int maGianHang;
	private int maSanPham;
	private String dsMaSanPham;

	private List<Integer> dsDuocChon;

	private GioHang gioHang;
	private SanPhamDAO spDao = new SanPhamDAO();
	private GianHangDAO ghDao = new GianHangDAO();

	private HttpServletRequest servletRequest;
	private Map<String, Object> session;

	
	@Override
	public String execute() throws Exception {
		System.out.println("Execute");
		gioHang = (GioHang)session.get("gh");
		// Dung de test thoi
		//gioHang = new GioHang();
		
		return SUCCESS;
	}
	
	public GioHang getGioHang() {
		return gioHang;
	}

	public void setGioHang(GioHang gioHang) {
		this.gioHang = gioHang;
	}

	/*public String them() {
		gioHang = (GioHang) session.get("gh");
		if (gioHang == null) {
			gioHang = new GioHang();
			session.put("gh", gioHang);
		}
		SanPham sp = spDao.lay(maSanPham);
		matHang = new MatHang(sp, soLuong);
		System.out.println("Them vao gio hang");
		System.out.println(matHang.getSoLuong());
		gioHang.themMatHang(matHang);
		System.out.println(gioHang.laySoLuongMatHang());

		return SUCCESS;
	}

	public String capNhat() {

		gioHang = (GioHang) session.get("gh");
		String[] ds1 = dsMaSanPham.split(", ");
		String[] ds2 = dsSoLuong.split(", ");
		if (ds1 != null) {
			if (ds2.length == 1) {
				int sl = Integer.parseInt(ds2[0]);
				int masp = Integer.parseInt(ds1[0]);
				gioHang.capNhatSoLuong(masp, sl);
			} else {
				for (int i = 0; i < ds1.length; i++) {
					try {
						int sl = Integer.parseInt(ds2[i]);
						int masp = Integer.parseInt(ds1[i]);
						gioHang.capNhatSoLuong(masp, sl);
					} catch (Exception e) {
					}
				}
			}
		}
		if (dsDuocChon != null) {
			for (Integer i : dsDuocChon) {
				gioHang.xoaMatHang(i);
			}
		}

		return SUCCESS;
	}
*/
	
	public String them(){
		gioHang = (GioHang) session.get("gh");
		if (gioHang == null) {
			gioHang = new GioHang();
			session.put("gh", gioHang);
		}
		SanPham sp = spDao.lay(maSanPham);
		matHang = new MatHang(sp, soLuong);
		System.out.println("Them vao gio hang");
		System.out.println(matHang.getSoLuong());
		gioHang.themMatHang(maGianHang, matHang);
		
		return SUCCESS;
	}
	public String capNhat(){
		System.out.println("Cap nhat gio hang");
		System.out.println(maGianHang);
		gioHang = (GioHang) session.get("gh");
		String[] ds1 = dsMaSanPham.split(", ");
		String[] ds2 = dsSoLuong.split(", ");
		if (ds1 != null) {
			if (ds2.length == 1) {
				int sl = Integer.parseInt(ds2[0]);
				int masp = Integer.parseInt(ds1[0]);
				gioHang.capNhatSoLuong(maGianHang, masp, sl);
			} else {
				for (int i = 0; i < ds1.length; i++) {
					try {
						int sl = Integer.parseInt(ds2[i]);
						int masp = Integer.parseInt(ds1[i]);
						gioHang.capNhatSoLuong(maGianHang, masp, sl);
					} catch (Exception e) {
					}
				}
			}
		}
		if (dsDuocChon != null) {
			for (Integer i : dsDuocChon) {
				gioHang.xoaMatHang(maGianHang, i);
			}
		}

		return SUCCESS;
	}
	public String xoaTatCa() {
		gioHang = (GioHang) session.get("gh");
		if (gioHang != null)
			gioHang.xoaTatCa();
		return SUCCESS;
	}

	public void thanhToan() {

	}

	public MatHang getMatHang() {
		return matHang;
	}

	public void setMatHang(MatHang matHang) {
		this.matHang = matHang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getDsSoLuong() {
		return dsSoLuong;
	}

	public void setDsSoLuong(String dsSoLuong) {
		this.dsSoLuong = dsSoLuong;
	}

	public String getDsMaSanPham() {
		return dsMaSanPham;
	}

	public void setDsMaSanPham(String dsMaSanPham) {
		this.dsMaSanPham = dsMaSanPham;
	}

	public List<Integer> getDsDuocChon() {
		return dsDuocChon;
	}

	public void setDsDuocChon(List<Integer> dsDuocChon) {
		this.dsDuocChon = dsDuocChon;
	}

	public int getMaGianHang() {
		return maGianHang;
	}

	public void setMaGianHang(int maGianHang) {
		this.maGianHang = maGianHang;
	}

	@Override
	public MatHang getModel() {
		// TODO Auto-generated method stub
		matHang = new MatHang();
		return matHang;
	}

	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		// TODO Auto-generated method stub
		this.servletRequest = servletRequest;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
