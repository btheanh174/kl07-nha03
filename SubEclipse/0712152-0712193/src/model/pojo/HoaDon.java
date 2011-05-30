package model.pojo;

import java.util.Date;
import java.util.List;

public class HoaDon {

	private int maHoaDon;
	private Date ngayLap;
	private ThanhVien thanhVien;
	private NguoiNhan nguoiNhan;
	private PhuongThucThanhToan phuongThuc;
	private HinhThucVanChuyen hinhThuc;
	private TinhTrangHoaDon tinhTrang;
	private List<ChiTietHoaDon> dsChiTietHoaDon;
	
	private GianHang gianHang;
	
	public HoaDon() {
	}

	public int getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}

	public NguoiNhan getNguoiNhan() {
		return nguoiNhan;
	}

	public void setNguoiNhan(NguoiNhan nguoiNhan) {
		this.nguoiNhan = nguoiNhan;
	}

	public PhuongThucThanhToan getPhuongThuc() {
		return phuongThuc;
	}

	public void setPhuongThuc(PhuongThucThanhToan phuongThuc) {
		this.phuongThuc = phuongThuc;
	}

	public HinhThucVanChuyen getHinhThuc() {
		return hinhThuc;
	}

	public void setHinhThuc(HinhThucVanChuyen hinhThuc) {
		this.hinhThuc = hinhThuc;
	}

	public TinhTrangHoaDon getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(TinhTrangHoaDon tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public List<ChiTietHoaDon> getDsChiTietHoaDon() {
		return dsChiTietHoaDon;
	}

	public void setDsChiTietHoaDon(List<ChiTietHoaDon> dsChiTietHoaDon) {
		this.dsChiTietHoaDon = dsChiTietHoaDon;
	}

	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}
	
}
