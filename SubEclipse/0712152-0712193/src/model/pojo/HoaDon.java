package model.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoaDon {

	private int maHoaDon;
	private Date ngayLap;
	private ThanhVien thanhVien;
	private PhuongThucThanhToan phuongThuc;
	private HinhThucVanChuyen hinhThuc;
	private NguoiNhan nguoiNhan;
	private TinhTrangHoaDon tinhTrang;
	private List<ChiTietHoaDon> dsChiTietHoaDon = new ArrayList<ChiTietHoaDon>();
	
	private GianHang gianHang;
	
	public HoaDon() {
	}
	
	public HoaDon(ThanhVien thanhVien, PhuongThucThanhToan phuongThuc,
			HinhThucVanChuyen hinhThuc, NguoiNhan nguoiNhan,
			TinhTrangHoaDon tinhTrang, List<ChiTietHoaDon> dsChiTietHoaDon,
			GianHang gianHang) {
		super();
		this.thanhVien = thanhVien;
		this.phuongThuc = phuongThuc;
		this.hinhThuc = hinhThuc;
		this.nguoiNhan = nguoiNhan;
		this.tinhTrang = tinhTrang;
		this.dsChiTietHoaDon = dsChiTietHoaDon;
		this.gianHang = gianHang;
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
}
