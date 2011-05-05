package model.pojo;

public class SanPhamTieuChi {

	private String tenSanPham;
	private float giaTren;
	private float giaDuoi;
	private String loaiSanPham;
	
	public SanPhamTieuChi() {
		
	}

	public SanPhamTieuChi(String tenSanPham, float giaTren, float giaDuoi,
			String loaiSanPham) {
		super();
		this.tenSanPham = tenSanPham;
		this.giaTren = giaTren;
		this.giaDuoi = giaDuoi;
		this.loaiSanPham = loaiSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public float getGiaTren() {
		return giaTren;
	}

	public void setGiaTren(float giaTren) {
		this.giaTren = giaTren;
	}

	public float getGiaDuoi() {
		return giaDuoi;
	}

	public void setGiaDuoi(float giaDuoi) {
		this.giaDuoi = giaDuoi;
	}

	public String getLoaiSanPham() {
		return loaiSanPham;
	}

	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}
}
