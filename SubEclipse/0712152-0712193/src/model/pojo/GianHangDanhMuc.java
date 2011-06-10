package model.pojo;

import java.io.Serializable;
import java.util.Date;

public class GianHangDanhMuc {

	public static class Id implements Serializable{
		private Integer maGianHang;
		private Integer maDanhMuc;
		public Id() {
		}
		public Id(Integer maGianHang, Integer maDanhMuc){
			this.maGianHang = maGianHang;
			this.maDanhMuc = maDanhMuc;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj != null && obj instanceof Id){
				Id that = (Id)obj;
				return this.maGianHang.equals(that.maGianHang) && this.maDanhMuc.equals(that.maDanhMuc);
			}else{
				return false;
			}
		}
		@Override
		public int hashCode() {
			
			return maGianHang.hashCode() + maDanhMuc.hashCode();
		}
		
	}
	
	private Id ma = new Id();
	private GianHang gianHang;
	private DanhMuc danhMuc;
	private NhomDanhMuc nhomDanhMuc;

	public GianHangDanhMuc() {
	}

	public GianHangDanhMuc(GianHang gianHang, DanhMuc danhMuc,
			NhomDanhMuc nhomDanhMuc) {
		super();
		this.gianHang = gianHang;
		this.danhMuc = danhMuc;
		this.nhomDanhMuc = nhomDanhMuc;
		
		// set id values
		this.ma.maGianHang = gianHang.getMaGianHang();
		this.ma.maDanhMuc = danhMuc.getMaDanhMuc();
		//
		
	}

	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
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
}
