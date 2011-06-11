package model.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Transient;

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
		gianHang.getDsGianHangDanhMuc().add(this);
		//danhMuc.getDsGianHangDanhMuc().add(this);
	}

	public Id getMa() {
		return ma;
	}

	public void setMa(Id ma) {
		this.ma = ma;
	}

	@Transient
	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}
	@Transient
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ma == null) ? 0 : ma.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GianHangDanhMuc other = (GianHangDanhMuc) obj;
		if (ma == null) {
			if (other.ma != null)
				return false;
		} else if (!ma.equals(other.ma))
			return false;
		return true;
	}
	
	
}
