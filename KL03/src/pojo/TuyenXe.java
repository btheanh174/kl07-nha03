package pojo;

import java.util.HashSet;
import java.util.Set;

public class TuyenXe {
	private int id;
	private String ten;
	private String tramDi;
	private String tramDen;
	private Set danhSachChuyen = new HashSet<ChuyenXe>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTramDi() {
		return tramDi;
	}
	public void setTramDi(String tramDi) {
		this.tramDi = tramDi;
	}
	public String getTramDen() {
		return tramDen;
	}
	public void setTramDen(String tramDen) {
		this.tramDen = tramDen;
	}
	
	public Set getDanhSachChuyen() {
		return danhSachChuyen;
	}
	public void setDanhSachChuyen(Set danhSachChuyen) {
		this.danhSachChuyen = danhSachChuyen;
	}
	
	
	public TuyenXe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TuyenXe(String ten, String tramDi, String tramDen,
			Set danhSachChuyen) {
		super();
		this.ten = ten;
		this.tramDi = tramDi;
		this.tramDen = tramDen;
		this.danhSachChuyen = danhSachChuyen;
	}
	public TuyenXe(String ten, String tramDi, String tramDen) {
		super();
		this.ten = ten;
		this.tramDi = tramDi;
		this.tramDen = tramDen;
	}
}
