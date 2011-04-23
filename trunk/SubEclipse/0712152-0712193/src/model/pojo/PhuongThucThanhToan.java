package model.pojo;

public class PhuongThucThanhToan {

	private int maPhuongThuc;
	private String tenPhuongThuc;
	
	
	public PhuongThucThanhToan() {
		super();
	}


	public PhuongThucThanhToan(String tenPhuongThuc) {
		super();
		this.tenPhuongThuc = tenPhuongThuc;
	}


	public int getMaPhuongThuc() {
		return maPhuongThuc;
	}


	public void setMaPhuongThuc(int maPhuongThuc) {
		this.maPhuongThuc = maPhuongThuc;
	}


	public String getTenPhuongThuc() {
		return tenPhuongThuc;
	}


	public void setTenPhuongThuc(String tenPhuongThuc) {
		this.tenPhuongThuc = tenPhuongThuc;
	}
}
