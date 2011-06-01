package model.pojo;

public class SanPhamGH {
	
	private GianHang gianHang;
	private Integer gia;
	private Integer baoHanh;
	private Integer soLuong;
	
	
	public SanPhamGH() {
	}
	
	public SanPhamGH(GianHang gianHang, Integer gia, Integer baoHanh,
			Integer soLuong) {
		super();
		this.gianHang = gianHang;
		this.gia = gia;
		this.baoHanh = baoHanh;
		this.soLuong = soLuong;
	}

	public GianHang getGianHang() {
		return gianHang;
	}
	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}
	public Integer getGia() {
		return gia;
	}
	public void setGia(Integer gia) {
		this.gia = gia;
	}

	public Integer getBaoHanh() {
		return baoHanh;
	}

	public void setBaoHanh(Integer baoHanh) {
		this.baoHanh = baoHanh;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}
}
