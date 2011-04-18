package model.pojo;

public class HinhThucVanChuyen {
	private int maHinhThucVanChuyen;
	private String tenHinhThucVanChuyen;
	
	public HinhThucVanChuyen()
	{}
	
	public HinhThucVanChuyen(int maHinhThucVanChuyen,
			String tenHinhThucVanChuyen) {
		super();
		this.maHinhThucVanChuyen = maHinhThucVanChuyen;
		this.tenHinhThucVanChuyen = tenHinhThucVanChuyen;
	}

	public int getMaHinhThucVanChuyen() {
		return maHinhThucVanChuyen;
	}

	public void setMaHinhThucVanChuyen(int maHinhThucVanChuyen) {
		this.maHinhThucVanChuyen = maHinhThucVanChuyen;
	}

	public String getTenHinhThucVanChuyen() {
		return tenHinhThucVanChuyen;
	}

	public void setTenHinhThucVanChuyen(String tenHinhThucVanChuyen) {
		this.tenHinhThucVanChuyen = tenHinhThucVanChuyen;
	}
	
	
}
