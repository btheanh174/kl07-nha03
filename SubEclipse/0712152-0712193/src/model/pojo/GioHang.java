package model.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GioHang {

	private List<MonHang> dsMonHang = new ArrayList<MonHang>();
	private BigDecimal tongTien;

	public void themMonHang(MonHang monHang) {
		
		if (this.dsMonHang.contains(monHang)) {
			MonHang mh = dsMonHang.get(dsMonHang.indexOf(monHang));
			mh.setSoLuong(mh.getSoLuong() + monHang.getSoLuong());
		} else {
			this.dsMonHang.add(monHang);
		}
	}
	
	public MonHang layMonHang(int i){
		if(i > (dsMonHang.size()-1) || i < 0){
			return null;
		}else{
			return dsMonHang.get(i);
		}
	}
	
	public boolean xoaMonHang(int maSanPham){
		MonHang mh = new MonHang();
		mh.setMaSanPham(maSanPham);
		if(!dsMonHang.contains(mh)){
			return false;
		}else{
			dsMonHang.remove(mh);
			return true;
		}
	}
	
	public BigDecimal tinhTien(){
		BigDecimal kq = new BigDecimal(0);
		for (MonHang mh : dsMonHang) {
			tongTien = tongTien.add(mh.getDonGia().multiply(new BigDecimal(mh.getSoLuong())));
		}
		return kq;
	}

	public GioHang() {
		super();
	}
	
	public GioHang(List<MonHang> dsMonHang, BigDecimal tongTien) {
		super();
		this.dsMonHang = dsMonHang;
		this.tongTien = tongTien;
	}

	public List<MonHang> getDsMonHang() {
		return dsMonHang;
	}

	public void setDsMonHang(List<MonHang> dsMonHang) {
		this.dsMonHang = dsMonHang;
	}

	public BigDecimal getTongTien() {
		return tongTien;
	}

	public void setTongTien(BigDecimal tongTien) {
		this.tongTien = tongTien;
	}

}
