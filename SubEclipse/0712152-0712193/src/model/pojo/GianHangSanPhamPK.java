package model.pojo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class GianHangSanPhamPK  implements Serializable {
	private GianHang gianHang;
	private SanPham sanPham;
	
	@ManyToOne
	public GianHang getGianHang() {
		return gianHang;
	}
	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}
	
	@ManyToOne
	public SanPham getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || getClass() != o.getClass())
			return false;
		GianHangSanPhamPK that = (GianHangSanPhamPK)o;
		if(sanPham != null ? !sanPham.equals(that.sanPham) : that.sanPham != null)
			return false;
		if(gianHang != null ? !gianHang.equals(that.gianHang) : that.gianHang != null)
			return false;
		
		return true;
	}
	@Override
	public int hashCode() {
		int result;
		int spCode = (sanPham != null)? sanPham.hashCode():0;
		int ghCode = (gianHang != null)? gianHang.hashCode(): 0;
		result  = spCode * 31 + ghCode;
		return result;
	}
	
	
}
