package model.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

public class GianHangSanPham {

	public static class Id implements Serializable{
		private Integer maGianHang;
		private Integer maSanPham;
		
		public Id(){}
		public Id(Integer maGianHang, Integer maSanPham){
			this.maGianHang = maGianHang;
			this.maSanPham = maSanPham;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj != null && obj instanceof Id){
				Id that = (Id)obj;
				return this.maGianHang.equals(that.maGianHang) && this.maSanPham.equals(that.maSanPham);
			}else{
				return false;
			}
		}
		@Override
		public int hashCode() {
			return maGianHang.hashCode() + maSanPham.hashCode();
		}
		
		
	}
	
	private Id ma = new Id();
	private GianHang gianHang;
	private SanPham sanPham;
	
	private Integer giaRieng;
	private Integer baoHanh; // don vi tinh theo thang
	private Integer soLuong; // so luong san pham ma cua hang co
	private Date capNhat;
	
	public GianHangSanPham() {
	}
	
	public GianHangSanPham(GianHang gianHang, SanPham sanPham,
			Integer giaRieng, Integer baoHanh, Integer soLuong, Date capNhat) {
		super();
		this.gianHang = gianHang;
		this.sanPham = sanPham;
		this.giaRieng = giaRieng;
		this.baoHanh = baoHanh;
		this.soLuong = soLuong;
		this.capNhat = capNhat;
		// set id values
		this.ma.maGianHang = gianHang.getMaGianHang();
		this.ma.maSanPham = sanPham.getMaSanPham();
		//
		gianHang.getDsGianHangSanPham().add(this);
		sanPham.getDsGianHangSanPham().add(this);
	}
	
	

	public Id getMa() {
		return ma;
	}

	public void setMa(Id ma) {
		this.ma = ma;
	}

	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	
	//@Column(name="GIA_RIENG")
	public Integer getGiaRieng() {
		return giaRieng;
	}

	public void setGiaRieng(Integer giaRieng) {
		this.giaRieng = giaRieng;
	}

	//@Column(name="BAO_HANH", length=10)
	public Integer getBaoHanh() {
		return baoHanh;
	}

	public void setBaoHanh(Integer baoHanh) {
		this.baoHanh = baoHanh;
	}

	//@Column(name="SO_LUONG", length=10)
	public Integer getSoLuong() {
		return soLuong;
	}
	
	//@Column(name="CAP_NHAT")
	public Date getCapNhat() {
		return capNhat;
	}

	public void setCapNhat(Date capNhat) {
		this.capNhat = capNhat;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof GianHangSanPham){
			GianHangSanPham that = (GianHangSanPham)obj;
			return this.getMa().equals(that.getMa());
		}else{
			return false;
		}
	}

	@Override
	public int hashCode(){
		return ma.hashCode();
	}

}
