package model.pojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SanPham {
	protected int maSanPham;
	protected String tenSanPham;
	protected float gia;
	protected String hangSanXuat;
	protected String loaiSanPham;

	protected DanhMuc danhMuc;
	protected List<HinhAnh> dsHinhAnh;
	protected Set<GianHang> dsGianHang = new HashSet<GianHang>();

	protected String hinhAnh;
	
	public SanPham() {
		super();
	}

	public SanPham(String tenSanPham, float gia, String hangSanXuat,
			List<HinhAnh> dsHinhAnh, DanhMuc danhMuc, Set<GianHang> dsGianHang) {
		super();
		this.tenSanPham = tenSanPham;
		this.gia = gia;
		this.hangSanXuat = hangSanXuat;
		this.dsHinhAnh = dsHinhAnh;
		this.danhMuc = danhMuc;
		this.dsGianHang = dsGianHang;
	}

	public String toShortString() {
		return "";
	}

	public String toLongString() {
		return "";
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

	public String getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
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

	public String getLoaiSanPham() {
		return loaiSanPham;
	}

	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}
	
	
	public String getHinhAnh() {
		
		if(dsHinhAnh == null)
			this.hinhAnh = "";
		else
			this.hinhAnh = dsHinhAnh.get(0).getUrlHinhAnh();
		return this.hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

}
