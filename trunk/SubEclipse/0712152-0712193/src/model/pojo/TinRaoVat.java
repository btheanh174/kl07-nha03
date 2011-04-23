package model.pojo;

import java.util.Date;

public class TinRaoVat {
	private int maTinRaoVat;
	private String tieuDe;
	private String noiDung;
	private Date ngayDang;
	private Date ngayHetHan;
	private ThanhVien thanhVien;
	private DanhMuc danhMuc;
	public int getMaTinRaoVat() {
		return maTinRaoVat;
	}
	public void setMaTinRaoVat(int maTinRaoVat) {
		this.maTinRaoVat = maTinRaoVat;
	}
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public Date getNgayDang() {
		return ngayDang;
	}
	public void setNgayDang(Date ngayDang) {
		this.ngayDang = ngayDang;
	}
	public Date getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public DanhMuc getDanhMuc() {
		return danhMuc;
	}
	public void setDanhMuc(DanhMuc danhMuc) {
		this.danhMuc = danhMuc;
	}
	public ThanhVien getThanhVien() {
		return thanhVien;
	}
	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}
	
}
