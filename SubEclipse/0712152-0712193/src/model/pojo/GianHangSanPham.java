package model.pojo;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "gian_hang_san_pham")
@AssociationOverrides({
		@AssociationOverride(name = "pk.sanPham", joinColumns = @JoinColumn(name = "MA_SAN_PHAM")),
		@AssociationOverride(name = "pk.gianHang", joinColumns = @JoinColumn(name = "MA_GIAN_HANG")) })
public class GianHangSanPham {

	private GianHangSanPhamPK pk = new GianHangSanPhamPK();

	private Integer giaRieng;
	private Integer baoHanh; // don vi tinh theo thang
	private Integer soLuong; // so luong san pham ma cua hang co

	public GianHangSanPham() {
	}

	@EmbeddedId
	public GianHangSanPhamPK getPk() {
		return pk;
	}

	public void setPk(GianHangSanPhamPK pk) {
		this.pk = pk;
	}

	@Transient
	public SanPham getSanPham() {
		return getPk().getSanPham();
	}

	public void setSanPham(SanPham sanPham) {
		getPk().setSanPham(sanPham);
	}

	@Transient
	public GianHang getGianHang() {
		return getPk().getGianHang();
	}

	public void setGianHang(GianHang gianHang) {
		getPk().setGianHang(gianHang);
	}

	@Column(name="GIA_RIENG")
	public Integer getGiaRieng() {
		return giaRieng;
	}

	public void setGiaRieng(Integer giaRieng) {
		this.giaRieng = giaRieng;
	}

	@Column(name="BAO_HANH", length=10)
	public Integer getBaoHanh() {
		return baoHanh;
	}

	public void setBaoHanh(Integer baoHanh) {
		this.baoHanh = baoHanh;
	}

	@Column(name="SO_LUONG", length=10)
	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);	
	}

	@Override
	public int hashCode() {
		return ((getPk() != null) ? getPk().hashCode() : 0);
	}

}
