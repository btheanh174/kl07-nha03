package com.estore.shop.action.gianhang;

import com.estore.core.model.dao.GianHangDAO;
import com.estore.core.model.pojo.GianHang;
import com.opensymphony.xwork2.ActionSupport;

public class GianHangRedirect extends ActionSupport {
	private int maGianHang;
	private GianHang gianHang;
	private GianHangDAO ghDao = new GianHangDAO();
	private String url;
	private String module = "intro";
	private String index;

	private String[] MODULES_NAME = { "contact", "intro", "policy" };

	@Override
	public String execute() throws Exception {

		String tmp = "/store?maGianHang=" + maGianHang + "&module=";
		for (String str : MODULES_NAME) {
			if (str.equals(module)) {
				url = tmp + str;
				break;
			}
		}
		gianHang = ghDao.lay(maGianHang);
		System.out.println(module);
		System.out.println(url);
		return url;
	}

	public String index() {
		System.out.println("invoke index");
		gianHang = ghDao.lay(maGianHang);
		index = String.valueOf(maGianHang);
		return "redirect";
	}

	public int getMaGianHang() {
		return maGianHang;
	}

	public void setMaGianHang(int maGianHang) {
		this.maGianHang = maGianHang;
	}

	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}
}
