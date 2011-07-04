package com.estore.core.model.pojo;

public class SanPhamTieuChi {

	private String tenSanPham;
	private String giaTren;
	private String giaDuoi;
	private String loaiSanPham;
	
	public SanPhamTieuChi() {
		
	}

	public SanPhamTieuChi(String tenSanPham, String giaTren, String giaDuoi,
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

	public String getGiaTren() {
		return giaTren;
	}

	public void setGiaTren(String giaTren) {
		this.giaTren = giaTren;
	}

	public String getGiaDuoi() {
		return giaDuoi;
	}



	public void setGiaDuoi(String giaDuoi) {
		this.giaDuoi = giaDuoi;
	}



	public String getLoaiSanPham() {
		return loaiSanPham;
	}

	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	@Override
	public String toString() {
		String kq = tenSanPham+":"+loaiSanPham+":"+":"+giaDuoi+":"+giaTren;
		return kq;
	}
	
	
}
