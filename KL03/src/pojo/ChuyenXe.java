package pojo;

import java.util.Date;

public class ChuyenXe {
	private int id;
	private String ten;
	private String gioKhoiHanh;
	private String gioDenNoi;
	private TuyenXe tuyen;
	
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
	public String getGioKhoiHanh() {
		return gioKhoiHanh;
	}
	public void setGioKhoiHanh(String gioKhoiHanh) {
		this.gioKhoiHanh = gioKhoiHanh;
	}
	public String getGioDenNoi() {
		return gioDenNoi;
	}
	public void setGioDenNoi(String gioDenNoi) {
		this.gioDenNoi = gioDenNoi;
	}
	
	public TuyenXe getTuyen() {
		return tuyen;
	}
	public void setTuyen(TuyenXe tuyen) {
//		this.tuyen = tuyen;
	}
	public ChuyenXe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChuyenXe(String ten, String gioKhoiHanh, String gioDenNoi, TuyenXe tuyen) {
		super();
		this.ten = ten;
		this.gioKhoiHanh = gioKhoiHanh;
		this.gioDenNoi = gioDenNoi;
		this.tuyen = tuyen;
	}
	
}
