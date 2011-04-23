package model.pojo;

public class HinhThucVanChuyen {
	private int maHinhThuc;
	private String tenHinhThuc;
	
	public HinhThucVanChuyen()
	{}

	
	public HinhThucVanChuyen(String tenHinhThuc) {
		super();
		this.tenHinhThuc = tenHinhThuc;
	}

	public int getMaHinhThuc() {
		return maHinhThuc;
	}

	public void setMaHinhThuc(int maHinhThuc) {
		this.maHinhThuc = maHinhThuc;
	}

	public String getTenHinhThuc() {
		return tenHinhThuc;
	}

	public void setTenHinhThuc(String tenHinhThuc) {
		this.tenHinhThuc = tenHinhThuc;
	}	
}
