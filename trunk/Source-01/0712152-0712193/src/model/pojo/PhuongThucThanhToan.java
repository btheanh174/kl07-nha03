package model.pojo;

public class PhuongThucThanhToan {

	private int maPhuongThucThanhToan;
	private String tenPhuongThucThanhToan;
	
	
	public PhuongThucThanhToan() {
		super();
	}


	public PhuongThucThanhToan(int maPhuongThucThanhToan,
			String tenPhuongThucThanhToan) {
		super();
		this.maPhuongThucThanhToan = maPhuongThucThanhToan;
		this.tenPhuongThucThanhToan = tenPhuongThucThanhToan;
	}


	public int getMaPhuongThucThanhToan() {
		return maPhuongThucThanhToan;
	}


	public void setMaPhuongThucThanhToan(int maPhuongThucThanhToan) {
		this.maPhuongThucThanhToan = maPhuongThucThanhToan;
	}

	public String getTenPhuongThucThanhToan() {
		return tenPhuongThucThanhToan;
	}

	public void setTenPhuongThucThanhToan(String tenPhuongThucThanhToan) {
		this.tenPhuongThucThanhToan = tenPhuongThucThanhToan;
	}
	
}
