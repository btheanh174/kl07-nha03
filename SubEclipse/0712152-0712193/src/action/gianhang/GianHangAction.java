package action.gianhang;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import model.dao.GianHangDAO;
import model.pojo.GianHang;
import model.pojo.TaiKhoan;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class GianHangAction extends ActionSupport implements
		ModelDriven<GianHang>, Preparable, SessionAware, ServletRequestAware {
	private int maGianHang;
	private String module;
	private GianHang gianHang = new GianHang();
	private GianHangDAO ghDao = new GianHangDAO();

	private Map<String, Object> session;
	private HttpServletRequest servletRequest;

	private TaiKhoan tk = new TaiKhoan();
	// Danh cho upload
	private List<File> images = new ArrayList<File>(2);
	private List<String> imagesFileName = new ArrayList<String>(2);
	private List<String> imagesContentType = new ArrayList<String>(2);

	public String hienThi() {
		System.out.println("Hien thi store");
		tk = (TaiKhoan) session.get("tk");
		if (tk != null) {
			gianHang = tk.getGianHang();
		}
		return SUCCESS;
	}

	public String capNhat() {
		System.out.println("Cap nhat store");

		this.session = ActionContext.getContext().getSession();
		TaiKhoan tk = (TaiKhoan) session.get("tk");
		GianHang gh = null;
		if (tk != null) {
			gh = tk.getGianHang();
		} else {
			gh = new GianHang();
		}

		ServletContext servletContext = ServletActionContext
				.getServletContext();
		String dataDir = servletContext.getRealPath("/WEB-INF");

		String logo = "logo_" + gh.getMaGianHang();
		String banner = "banner_" + gh.getMaGianHang();

		File logoFile = new File(dataDir, logo);
		File bannerFile = new File(dataDir, banner);
		if (images.get(0) != null) {
			images.get(0).renameTo(logoFile);
			gh.setLogo(logo);
		}
		if (images.get(1) != null) {
			images.get(1).renameTo(bannerFile);
			gh.setBanner(banner);
		}

		ghDao.capNhat(gianHang);
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		// Hien thi store

		System.out.println("invoke execute in GianHangAction");
		System.out.println(module);
		try {
			gianHang = ghDao.lay(maGianHang);
		} catch (NullPointerException e) {
			return "error";
		}
		if (module != null) {
			return module;
		}
		return "index";
	}

	@Override
	public GianHang getModel() {
		return gianHang;
	}

	@Override
	public void prepare() throws Exception {
		if (maGianHang != 0) {
			gianHang = ghDao.lay(maGianHang);
		}
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public List<File> getImages() {
		return images;
	}

	public void setImages(List<File> images) {
		this.images = images;
	}

	public List<String> getImagesFileName() {
		return imagesFileName;
	}

	public void setImagesFileName(List<String> imagesFileName) {
		this.imagesFileName = imagesFileName;
	}

	public List<String> getImagesContentType() {
		return imagesContentType;
	}

	public void setImagesContentType(List<String> imagesContentType) {
		this.imagesContentType = imagesContentType;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.servletRequest = request;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}
}
