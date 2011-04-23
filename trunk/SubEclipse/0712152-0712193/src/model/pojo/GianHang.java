package model.pojo;

public class GianHang {
	
	private int maGianHang;
	private String tenGianHang;
	private TaiKhoan taiKhoan;
	private TinhThanhPho tinhThanhPho;
	
	public GianHang() {
	
	}

	public GianHang(String tenGianHang, TaiKhoan taiKhoan,
			TinhThanhPho tinhThanhPho) {
		super();
		this.tenGianHang = tenGianHang;
		this.taiKhoan = taiKhoan;
		this.tinhThanhPho = tinhThanhPho;
	}



	public int getMaGianHang() {
		return maGianHang;
	}

	public void setMaGianHang(int maGianHang) {
		this.maGianHang = maGianHang;
	}

	public String getTenGianHang() {
		return tenGianHang;
	}

	public void setTenGianHang(String tenGianHang) {
		this.tenGianHang = tenGianHang;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public TinhThanhPho getTinhThanhPho() {
		return tinhThanhPho;
	}

	public void setTinhThanhPho(TinhThanhPho tinhThanhPho) {
		this.tinhThanhPho = tinhThanhPho;
	}
}
