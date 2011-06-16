package action.gianhang.admin;


import java.util.ArrayList;

import java.util.List;

import java.util.Map;

import model.dao.DanhMucDAO;
import model.dao.DanhMucGianHangDAO;
import model.dao.GianHangDAO;
import model.dao.NhomDanhMucDAO;
import model.pojo.DanhMuc;
import model.pojo.DanhMucGianHang;
import model.pojo.GianHang;
import model.pojo.NhomDanhMuc;
import model.pojo.TaiKhoan;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class DanhMucAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<NhomDanhMuc> dsNhomDanhMuc;

	private List<DanhMucGianHang> dsDanhMucGianHang;
	private DanhMucGianHang danhMucGianHang;
	private GianHang gianHang;
	private NhomDanhMuc nhomDanhMuc;
	private int echo;
	private int maDanhMuc;

	private NhomDanhMucDAO ndmDao = new NhomDanhMucDAO();

	private GianHangDAO ghDao = new GianHangDAO();
	Map<String, Object> session;

	public String execute() {

		return SUCCESS;
	}

	public String layDanhSachNhomDanhMuc() {
		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null) {
			return ERROR;
		}

		GianHang gianHang = ghDao.lay(tk);
		dsNhomDanhMuc = ndmDao.layDanhSach(gianHang);
		session.put("dsNhomDanhMuc", dsNhomDanhMuc);
		return SUCCESS;
	}

	public String themNhomDanhMuc() {
		try {
			TaiKhoan tk = (TaiKhoan) session.get("tk");
			if (tk == null) {
				return ERROR;
			}

			gianHang = ghDao.lay(tk);
			dsNhomDanhMuc = ndmDao.layDanhSach(gianHang);
			nhomDanhMuc.setGianHang(gianHang);
			sapXepLaiViTriNhomDanhMuc();
			// Sắp xếp lại vị trí các nhóm danh mục trước khi ghi nhóm mới vào
			// Giả sử các nhóm danh mục sẵn có đã theo 1 xếp hạng tăng dần.

			ndmDao.them(nhomDanhMuc);
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
		return ERROR;

	}

	

	private void sapXepLaiViTriNhomDanhMuc() {
		if (nhomDanhMuc.getThuTu() > dsNhomDanhMuc.size()) {
			nhomDanhMuc.setThuTu(dsNhomDanhMuc.size() + 1);
		}
		for (int i = nhomDanhMuc.getThuTu() - 1; i < dsNhomDanhMuc.size(); i++) {
			dsNhomDanhMuc.get(i).setThuTu(i + 2);
		}
		ghDao.capNhat(gianHang);
	}
	
	public String layThongTinNhomDanhMuc()
	{
		dsNhomDanhMuc = (List<NhomDanhMuc>) session.get("dsNhomDanhMuc");
		for (int i = 0; i < dsNhomDanhMuc.size(); i++)
		{
			if (dsNhomDanhMuc.get(i).getMaNhom() == echo)
			{
				nhomDanhMuc = dsNhomDanhMuc.get(i);
			}
		}
		return SUCCESS;
	}
	
	public String capNhatNhomDanhMuc()
	{
		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null) {
			return ERROR;
		}

		gianHang = ghDao.lay(tk);
		nhomDanhMuc.setGianHang(gianHang);
		nhomDanhMuc.setMaNhom(echo);
		ndmDao.capNhat(nhomDanhMuc);	
		return SUCCESS;
	}
	
	public String xoaNhomDanhMuc()
	{
		nhomDanhMuc = ndmDao.lay(echo);
		ndmDao.xoa(nhomDanhMuc);
		return SUCCESS;
	}

	public String themDanhMucGianHang() {
		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null) {
			return ERROR;
		}

		gianHang = ghDao.lay(tk);
		DanhMucDAO dmDao = new DanhMucDAO();
		DanhMuc danhMuc = dmDao.lay(maDanhMuc);
		nhomDanhMuc = ndmDao.lay(echo);
		//ghDanhMuc = new GianHangDanhMuc(gianHang, danhMuc, nhomDanhMuc);
		//ghDao.capNhat(gianHang);
		danhMucGianHang = new DanhMucGianHang(danhMuc, nhomDanhMuc, null);	
		ndmDao.capNhat(nhomDanhMuc);
		return SUCCESS;
	}

	
	public String layDanhSachGianHangDanhMuc() {

		try {
			TaiKhoan tk = (TaiKhoan) session.get("tk");
			if (tk == null) {
				return ERROR;
			}
			
			DanhMucGianHangDAO dmghDao = new DanhMucGianHangDAO();
			GianHang gianHang = ghDao.lay(tk);
			dsDanhMucGianHang = dmghDao.layDanhSach(gianHang);
			session.put("dsDanhMucGianHang",dsDanhMucGianHang);
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
		return ERROR;
	}
	
	public String layDanhSachDanhMucGianHang() {

		try {
			TaiKhoan tk = (TaiKhoan) session.get("tk");
			if (tk == null) {
				return ERROR;
			}
			DanhMucGianHangDAO dmghDao = new DanhMucGianHangDAO();
			GianHang gianHang = ghDao.lay(tk);
			dsDanhMucGianHang = dmghDao.layDanhSach(gianHang);
			session.put("dsDanhMucGianHang",dsDanhMucGianHang);
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
		return ERROR;
	}
	
	
	public String xacNhanXoaGianHangSanPham()
	{
		dsDanhMucGianHang = (List<DanhMucGianHang>) session.get("dsDanhMucGianHang");
		for (DanhMucGianHang dmgh : dsDanhMucGianHang) {
			if(dmgh.getDanhMuc().getMaDanhMuc() == echo){
				danhMucGianHang = dmgh;
				return SUCCESS;
			}
		}
		return SUCCESS;
	}
	
	public String xoaGianHangDanhMuc()
	{
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	public List<NhomDanhMuc> getDsNhomDanhMuc() {
		return dsNhomDanhMuc;
	}

	public void setDsNhomDanhMuc(List<NhomDanhMuc> dsNhomDanhMuc) {
		this.dsNhomDanhMuc = dsNhomDanhMuc;
	}

	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}

	public int getEcho() {
		return echo;
	}

	public void setEcho(int echo) {
		this.echo = echo;
	}

	public void setNhomDanhMuc(NhomDanhMuc nhomDanhMuc) {
		this.nhomDanhMuc = nhomDanhMuc;
	}

	public NhomDanhMuc getNhomDanhMuc() {
		return nhomDanhMuc;
	}

	public int getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
	
	public List<DanhMucGianHang> getDsDanhMucGianHang() {
		return dsDanhMucGianHang;
	}

	public void setDsDanhMucGianHang(List<DanhMucGianHang> dsDanhMucGianHang) {
		this.dsDanhMucGianHang = dsDanhMucGianHang;
	}

	public DanhMucGianHang getDanhMucGianHang() {
		return danhMucGianHang;
	}

	public void setDanhMucGianHang(DanhMucGianHang danhMucGianHang) {
		this.danhMucGianHang = danhMucGianHang;
	}

}
