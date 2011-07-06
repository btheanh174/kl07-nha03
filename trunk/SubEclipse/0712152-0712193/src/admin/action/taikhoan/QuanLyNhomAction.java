package admin.action.taikhoan;

import java.util.ArrayList;
import java.util.List;

import model.dao.NhomNguoiDungDAO;
import model.dao.TaiKhoanDAO;
import model.pojo.NhomNguoiDung;
import model.pojo.TaiKhoan;

import com.opensymphony.xwork2.ActionSupport;

public class QuanLyNhomAction extends ActionSupport {
	private int maTaiKhoan;
	private TaiKhoan taiKhoan;
	private int maNhom;
	private NhomNguoiDung nhom;
	private TaiKhoanDAO tkDao = new TaiKhoanDAO();
	private NhomNguoiDungDAO nhomDao = new NhomNguoiDungDAO();
	
	private List<NhomNguoiDung> dsNhom = new ArrayList<NhomNguoiDung>();
	private List<TaiKhoan> dsTaiKhoan = new ArrayList<TaiKhoan>();
	
	private int trang = 1;
	private int tongSoTrang;
	private List<Integer> soTrang = new ArrayList<Integer>();
	private int soTaiKhoanTrenTrang = 5;
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	
	public String danhSach(){
		
		int soTaiKhoan  = tkDao.layDanhSach().size();
		tongSoTrang = soTaiKhoan / soTaiKhoanTrenTrang;
		if(soTaiKhoan % soTaiKhoanTrenTrang != 0){
			tongSoTrang++;
		}
		dsTaiKhoan = tkDao.layDanhSach(trang, soTaiKhoanTrenTrang);
		
		return SUCCESS;
	}
	
	public String xoa(){
		taiKhoan = tkDao.lay(maTaiKhoan);
		tkDao.xoa(taiKhoan);
		return SUCCESS;
	}
	
	public String sua(){
		taiKhoan = tkDao.lay(maTaiKhoan);
		return SUCCESS;
	}
	
	public String capNhat(){
		tkDao.capNhat(taiKhoan);
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

	public int getTrang() {
		return trang;
	}

	public void setTrang(int trang) {
		this.trang = trang;
	}

	public int getTongSoTrang() {
		return tongSoTrang;
	}

	public void setTongSoTrang(int tongSoTrang) {
		this.tongSoTrang = tongSoTrang;
	}

	public List<Integer> getSoTrang() {
		for (int i = 1; i <= getTongSoTrang(); i++) {
			this.soTrang.add(i);
		}
		return soTrang;
	}

	public void setSoTrang(List<Integer> soTrang) {
		this.soTrang = soTrang;
	}

	public int getMaTaiKhoan() {
		return maTaiKhoan;
	}

	public void setMaTaiKhoan(int maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}

	public int getMaNhom() {
		return maNhom;
	}

	public void setMaNhom(int maNhom) {
		this.maNhom = maNhom;
	}
}
