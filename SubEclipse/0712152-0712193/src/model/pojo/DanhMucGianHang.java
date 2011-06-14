package model.pojo;

import java.io.Serializable;

public class DanhMucGianHang {

	// Tao composite id cho DanhMucGianHang
	public static class Id implements Serializable{
		private Integer maDanhMuc;
		private Integer maNhomDanhMuc;
		
		public Id(){}
		public Id(Integer maDanhMuc, Integer maNhomDanhMuc){
			this.maDanhMuc = maDanhMuc;
			this.maNhomDanhMuc = maNhomDanhMuc;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((maDanhMuc == null) ? 0 : maDanhMuc.hashCode());
			result = prime * result
					+ ((maNhomDanhMuc == null) ? 0 : maNhomDanhMuc.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if(obj != null && obj instanceof Id){
				Id that = (Id)obj;
				return that.maDanhMuc.equals(this.maDanhMuc) && that.maNhomDanhMuc.equals(this.maNhomDanhMuc);
			}else{
				return false;
			}
		}
		
	}
	//
	
	private Id ma = new Id();
	private DanhMuc danhMuc;
	private NhomDanhMuc nhomDanhMuc;
	
	private Integer soSanPham;
	
	public DanhMucGianHang() {
	}
	
	public DanhMucGianHang(DanhMuc danhMuc, NhomDanhMuc nhomDanhMuc, Integer soSanPham){
		this.danhMuc = danhMuc;
		this.nhomDanhMuc = nhomDanhMuc;
		this.soSanPham = soSanPham;
		// set id values
		ma.maDanhMuc = danhMuc.getMaDanhMuc();
		ma.maNhomDanhMuc = nhomDanhMuc.getMaNhom();
		//
		//danhMuc.getDsDanhMucGianHang().add(this);
		nhomDanhMuc.getDsDanhMucGianHang().add(this);
	}

	public Id getMa() {
		return ma;
	}

	public void setMa(Id ma) {
		this.ma = ma;
	}

	public DanhMuc getDanhMuc() {
		return danhMuc;
	}

	public void setDanhMuc(DanhMuc danhMuc) {
		this.danhMuc = danhMuc;
	}

	public NhomDanhMuc getNhomDanhMuc() {
		return nhomDanhMuc;
	}

	public void setNhomDanhMuc(NhomDanhMuc nhomDanhMuc) {
		this.nhomDanhMuc = nhomDanhMuc;
	}

	public Integer getSoSanPham() {
		return soSanPham;
	}

	public void setSoSanPham(Integer soSanPham) {
		this.soSanPham = soSanPham;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ma == null) ? 0 : ma.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof DanhMucGianHang){
			DanhMucGianHang that  =(DanhMucGianHang)obj;
			return that.getMa().equals(this.ma);
		}else{
			return false;
		}
	}
}
