
package model.pojo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SanPham {
	protected int maSanPham;
	protected String tenSanPham;
	protected float gia;
	protected String nhaSanXuat;
	
	protected DanhMuc danhMuc;
	protected List<HinhAnh> dsHinhAnh;
	protected Set<GianHang> dsGianHang = new HashSet<GianHang>();
	
	
	public SanPham() {
		super();
	}
	
	
	
	public SanPham(String tenSanPham, float gia, String nhaSanXuat,
			List<HinhAnh> dsHinhAnh, DanhMuc danhMuc, Set<GianHang> dsGianHang) {
		super();
		this.tenSanPham = tenSanPham;
		this.gia = gia;
		this.nhaSanXuat = nhaSanXuat;
		this.dsHinhAnh = dsHinhAnh;
		this.danhMuc = danhMuc;
		this.dsGianHang = dsGianHang;
	}



	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	
	public DanhMuc getDanhMuc() {
		return danhMuc;
	}
	public void setDanhMuc(DanhMuc danhMuc) {
		this.danhMuc = danhMuc;
	}

	public List<HinhAnh> getDsHinhAnh() {
		return dsHinhAnh;
	}

	public void setDsHinhAnh(List<HinhAnh> dsHinhAnh) {
		this.dsHinhAnh = dsHinhAnh;
	}

	public Set<GianHang> getDsGianHang() {
		return dsGianHang;
	}

	public void setDsGianHang(Set<GianHang> dsGianHang) {
		this.dsGianHang = dsGianHang;
	}
	
	
}
