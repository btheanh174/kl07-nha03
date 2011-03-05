package view;

import java.util.ArrayList;
import java.util.List;

import pojo.ChuyenXe;
import pojo.TuyenXe;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.ChuyenXeDAO;
import dao.TuyenXeDAO;

public class ChuyenXeAction extends ActionSupport implements ModelDriven<ChuyenXe>, Preparable {
	private ChuyenXe chuyen;
	private List<ChuyenXe> dsChuyenTheoTuyen = new ArrayList<ChuyenXe>();
	
	// Id Tuyen duoc chon
	private int idTuyen;
	private TuyenXe tuyen = new TuyenXe();
	// Danh sach cac tuyen
	private List<TuyenXe> dsTuyen = new ArrayList<TuyenXe>();
	
	@Override
	public ChuyenXe getModel() {
		// TODO Auto-generated method stub
		chuyen = new ChuyenXe();
		return chuyen;
	}
	
	/*
	 * Lay danh sach cac chuyen xe theo tuyen
	 */
	public String list(){
		dsChuyenTheoTuyen = new ChuyenXeDAO().layChuyenTheoTuyen(1);
		return SUCCESS;
	}
	
	public String add(){
		
		tuyen = new TuyenXeDAO().getById(idTuyen);
		System.out.println("Ten Tuyen: " + tuyen.getTen());
		chuyen.setTuyen(tuyen);
		boolean rs = new ChuyenXeDAO().themChuyen(chuyen);
		
		//System.out.println("Ten Tuyen: " + tuyen.getTen());
		if(rs)
			return SUCCESS;
		return ERROR;
	}
	
	public String delete(){
		return SUCCESS;
	}

	public ChuyenXe getChuyen() {
		return chuyen;
	}

	public void setChuyen(ChuyenXe chuyen) {
		this.chuyen = chuyen;
	}

	public List<ChuyenXe> getDsChuyenTheoTuyen() {
		return dsChuyenTheoTuyen;
	}

	public void setDsChuyenTheoTuyen(List<ChuyenXe> dsChuyenTheoTuyen) {
		this.dsChuyenTheoTuyen = dsChuyenTheoTuyen;
	}

	public ChuyenXeAction() {
		super();
		// TODO Auto-generated constructor stub
		dsTuyen = new TuyenXeDAO().getAll();
	}

	public List<TuyenXe> getDsTuyen() {
		return dsTuyen;
	}

	public void setDsTuyen(List<TuyenXe> dsTuyen) {
		this.dsTuyen = dsTuyen;
	}
	public int getIdTuyen() {
		return idTuyen;
	}

	public void setIdTuyen(int idTuyen) {
		this.idTuyen = idTuyen;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
	}
	
}
