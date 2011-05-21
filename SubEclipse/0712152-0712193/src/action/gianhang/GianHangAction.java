package action.gianhang;

import java.io.File;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import model.dao.GianHangDAO;
import model.pojo.GianHang;
import model.pojo.TaiKhoan;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class GianHangAction extends ActionSupport implements
		ModelDriven<GianHang>, Preparable, SessionAware, ServletRequestAware {
	private int maGianHang;
	private GianHang gianHang = new GianHang();
	private GianHangDAO ghDao = new GianHangDAO();
	private Map<String, Object> session;
	private HttpServletRequest servletRequest;

	private TaiKhoan tk = new TaiKhoan();
	// Danh cho upload
	private File[] images;
	private String[] imagesFileName;
	private String[] imagesContentType;

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

		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk != null) {
			gianHang = tk.getGianHang();
		} else {
			gianHang = new GianHang();
		}

		ServletContext servletContext = ServletActionContext
				.getServletContext();
		String dataDir = servletContext.getRealPath("/WEB-INF");

		if (images != null) {
			String logo = "logo_" + gianHang.getMaGianHang();
			String banner = "banner_" + gianHang.getMaGianHang();
			for (int i = 0; i < images.length; i++) {
				File savedFile = new File(dataDir, imagesFileName[i]);
				images[i].renameTo(savedFile);
			}

			gianHang.setLogo(logo);
			gianHang.setBanner(banner);
		}

		ghDao.capNhat(gianHang);
		return SUCCESS;
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

	public File[] getImages() {
		return images;
	}

	public void setImages(File[] images) {
		this.images = images;
	}

	public String[] getImagesFileName() {
		return imagesFileName;
	}

	public void setImagesFileName(String[] imagesFileName) {
		this.imagesFileName = imagesFileName;
	}

	public String[] getImagesContentType() {
		return imagesContentType;
	}

	public void setImagesContentType(String[] imagesContentType) {
		this.imagesContentType = imagesContentType;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.servletRequest = request;
	}
}
