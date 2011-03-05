package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import pojo.TuyenXe;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.TuyenXeDAO;

public class TuyenXeAction extends ActionSupport implements ModelDriven<TuyenXe>{
	
	private TuyenXe tuyen;
	private List dsTuyen = new ArrayList<TuyenXe>();
	
	
	
	@Override
	public TuyenXe getModel() {
		// TODO Auto-generated method stub
		tuyen = new TuyenXe();
		return tuyen;
	}
	
	public String add(){
		boolean rs = new TuyenXeDAO().insert(tuyen);
		if(rs)
			return SUCCESS;
		return ERROR;
	}
	
	public String edit() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("idTuyen"));
		HttpServletResponse response =  ServletActionContext.getResponse();
		
		tuyen = new TuyenXeDAO().getById(id);
		
		return SUCCESS;
	}
	
	public String delete(){
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("idTuyen"));
		
		boolean rs = new TuyenXeDAO().delete(id);
		if(rs)
			return SUCCESS;
		return ERROR;
	}
	
	public String list(){
		
		dsTuyen = new TuyenXeDAO().getAll();
		return SUCCESS;
	}
	

	

	public String execute(){
		return SUCCESS;
	}

	public TuyenXe getTuyen() {
		return tuyen;
	}

	public void setTuyen(TuyenXe tuyen) {
		this.tuyen = tuyen;
	}

	public List getDsTuyen() {
		return dsTuyen;
	}

	public void setDsTuyen(List dsTuyen) {
		this.dsTuyen = dsTuyen;
	}
}
