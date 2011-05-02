package action.user;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import model.dao.TaiKhoanDAO;
import model.dao.ThanhVienDAO;
import model.pojo.TaiKhoan;
import model.pojo.ThanhVien;

import org.apache.struts2.interceptor.SessionAware;

import util.HashUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ProfileAction extends ActionSupport implements SessionAware, Preparable, ModelDriven<ThanhVien>{
	
	private Map<String,Object> sessionMap;
	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}
	
	private int maTaiKhoan;
	private TaiKhoan taiKhoan;
	private ThanhVien thanhVien;
	private TaiKhoanDAO tkDao = new TaiKhoanDAO();
	private ThanhVienDAO tvDao = new ThanhVienDAO();
	
	private String matKhauCu;
	private String matKhauMoi;
	private String xacNhanMatKhau;
	@Override
	public String execute() throws Exception {
		
		return super.execute();
	}

	public String capNhatThongTin(){
		tkDao.capNhat(getTaiKhoan());
		tvDao.capNhat(getThanhVien());
		return SUCCESS;
	}

	public String doiMatKhau(){
		System.out.println("Doi Mat Khau");
		taiKhoan = (TaiKhoan)sessionMap.get("tk");
		String salt = taiKhoan.getSalt();
		String hashedPassword = null;
		try {
			hashedPassword = HashUtil.generateHash(salt + getMatKhauCu());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!taiKhoan.getMatKhau().equals(hashedPassword)){
			System.out.println("Mật khẩu cũ không đúng");
			addFieldError(matKhauCu, "Mật khẩu cũ không đúng!");
			return INPUT;
		}
		if(!getMatKhauMoi().equals(getXacNhanMatKhau())){
			System.out.println("Xác nhận mật khẩu sai");
			addFieldError(xacNhanMatKhau, "Xác nhận mật khẩu sai!");
			return INPUT;
		}
		try {
			hashedPassword = HashUtil.generateHash(salt + getMatKhauMoi());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		taiKhoan.setMatKhau(hashedPassword);
		tkDao.capNhat(taiKhoan);
		return SUCCESS;
	}
	
	public String hienThi(){
		taiKhoan  = tkDao.lay(maTaiKhoan);
		thanhVien = tvDao.lay(maTaiKhoan);
		return SUCCESS;
	}
	
	public int getMaTaiKhoan() {
		return maTaiKhoan;
	}

	public void setMaTaiKhoan(int maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}

	
	@Override
	public void prepare() throws Exception {
		
		if(maTaiKhoan != 0){
			taiKhoan = tkDao.lay(maTaiKhoan);
			thanhVien = taiKhoan.getThanhVien();
		}else{
			taiKhoan = new TaiKhoan();
			thanhVien = new ThanhVien();
		}
	}

	@Override
	public ThanhVien getModel() {
		// TODO Auto-generated method stub
		return thanhVien;
	}

	public String getMatKhauCu() {
		return matKhauCu;
	}

	public void setMatKhauCu(String matKhauCu) {
		this.matKhauCu = matKhauCu;
	}

	public String getMatKhauMoi() {
		return matKhauMoi;
	}

	public void setMatKhauMoi(String matKhauMoi) {
		this.matKhauMoi = matKhauMoi;
	}

	public String getXacNhanMatKhau() {
		return xacNhanMatKhau;
	}

	public void setXacNhanMatKhau(String xacNhanMatKhau) {
		this.xacNhanMatKhau = xacNhanMatKhau;
	}
	
}
