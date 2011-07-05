package admin.action.taikhoan;

import java.util.ArrayList;
import java.util.List;

import model.dao.NhomNguoiDungDAO;
import model.dao.TaiKhoanDAO;
import model.pojo.NhomNguoiDung;
import model.pojo.TaiKhoan;

import com.opensymphony.xwork2.ActionSupport;

public class QuanLyNhomAction extends ActionSupport {
	
	private TaiKhoan taiKhoan;
	private NhomNguoiDung nhom;
	private TaiKhoanDAO tkDao = new TaiKhoanDAO();
	private NhomNguoiDungDAO nhomDao = new NhomNguoiDungDAO();
	
	private List<NhomNguoiDung> dsNhom = new ArrayList<NhomNguoiDung>();
	private List<TaiKhoan> dsTaiKhoan = new ArrayList<TaiKhoan>();
	@Override
	public String execute() throws Exception {
		dsNhom = nhomDao.layDanhSach();
		dsTaiKhoan = tkDao.layDanhSach();
		System.out.println("So tai khoan = " + dsTaiKhoan.size());
		for (TaiKhoan tk : dsTaiKhoan) {
			System.out.println(tk.getTenTruyCap());
		}
		return SUCCESS;
	}
	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public NhomNguoiDung getNhom() {
		return nhom;
	}
	public void setNhom(NhomNguoiDung nhom) {
		this.nhom = nhom;
	}
	public List<NhomNguoiDung> getDsNhom() {
		return dsNhom;
	}
	public void setDsNhom(List<NhomNguoiDung> dsNhom) {
		this.dsNhom = dsNhom;
	}
	public List<TaiKhoan> getDsTaiKhoan() {
		return dsTaiKhoan;
	}
	public void setDsTaiKhoan(List<TaiKhoan> dsTaiKhoan) {
		this.dsTaiKhoan = dsTaiKhoan;
	}
}
