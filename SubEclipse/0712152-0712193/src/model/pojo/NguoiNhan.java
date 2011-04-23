package model.pojo;

public class NguoiNhan {

	private int maNguoiNhan;
	private String tenNguoiNhan;
	private String diaChi;
	private String email;
	private String dienThoai;
	private String ghiChu;
	private ThanhVien thanhVien;
	
	public NguoiNhan() {
		
	}

	public NguoiNhan(int maNguoiNhan, String tenNguoiNhan, String diaChi,
			String email, String dienThoai, String ghiChu, ThanhVien thanhVien) {
		super();
		this.maNguoiNhan = maNguoiNhan;
		this.tenNguoiNhan = tenNguoiNhan;
		this.diaChi = diaChi;
		this.email = email;
		this.dienThoai = dienThoai;
		this.ghiChu = ghiChu;
		this.thanhVien = thanhVien;
	}

	public int getMaNguoiNhan() {
		return maNguoiNhan;
	}

	public void setMaNguoiNhan(int maNguoiNhan) {
		this.maNguoiNhan = maNguoiNhan;
	}

	public String getTenNguoiNhan() {
		return tenNguoiNhan;
	}

	public void setTenNguoiNhan(String tenNguoiNhan) {
		this.tenNguoiNhan = tenNguoiNhan;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}

}
