package util;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import model.pojo.MatHang;
import model.pojo.SanPham;

import org.apache.struts2.interceptor.SessionAware;

public class GioHangUtil implements SessionAware {

	Map<String, Object> gioHang;

	public void themMonHang(int soLuong, SanPham sanPham) {

		String key = String.valueOf(sanPham.getMaSanPham());
		MatHang monHang = (MatHang) gioHang.get(key);
		if (monHang == null) {
			monHang = new MatHang(sanPham, soLuong);
			gioHang.put(key, monHang);
		} else {
			monHang.setSoLuong(soLuong + monHang.getSoLuong());
		}
	}

	public void xoaMonHang(SanPham sanPham) {
		String key = String.valueOf(sanPham.getMaSanPham());
		gioHang.remove(key);
	}

	public Set layGioHang() {
		return new HashSet(gioHang.values());
	}
	
	public void setSoLuongSanPham(int soLuong, SanPham sanPham){
		if(soLuong <= 0){
			gioHang.remove(sanPham);
		}
		String key = String.valueOf(sanPham.getMaSanPham());
		MatHang monHang = (MatHang)gioHang.get(key);
		if(monHang == null){
			monHang = new MatHang(sanPham, soLuong);
			gioHang.put(key, monHang);
		}else{
			monHang.setSoLuong(soLuong + monHang.getSoLuong());
		}
		
	}

	public int getSoLuongCuaSanPham(SanPham sanPham) {
		String key = String.valueOf(sanPham.getMaSanPham());
		MatHang monHang = (MatHang) gioHang.get(key);
		return (monHang == null) ? 0 : monHang.getSoLuong();
	}

	public GioHangUtil() {
		super();
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.gioHang = session;
	}
}
