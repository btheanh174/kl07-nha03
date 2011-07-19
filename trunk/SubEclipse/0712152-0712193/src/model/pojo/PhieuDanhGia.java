package model.pojo;

public class PhieuDanhGia {
	private int maPhieuDanhGia;
	private String danhGia;
	private String tieuDe;
	private String noiDung;
	private GianHang gianHang;
	private TaiKhoan taiKhoan;
	
	public PhieuDanhGia(){}
	
	public PhieuDanhGia(String danhGia, String tieuDe, String noiDung,
			GianHang gianHang, TaiKhoan taiKhoan) {
		super();
		this.danhGia = danhGia;
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.gianHang = gianHang;
		this.taiKhoan = taiKhoan;
	}


	public int getMaPhieuDanhGia() {
		return maPhieuDanhGia;
	}
	public void setMaPhieuDanhGia(int maPhieuDanhGia) {
		this.maPhieuDanhGia = maPhieuDanhGia;
	}
	public String getDanhGia() {
		return danhGia;
	}
	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
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
	public GianHang getGianHang() {
		return gianHang;
	}
	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}
	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	
}
