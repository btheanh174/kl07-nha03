package action.gianhang.admin;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import model.dao.GianHangDAO;
import model.dao.SanPhamDeNghiDAO;
import model.pojo.GianHang;
import model.pojo.SanPhamDeNghi;
import model.pojo.TaiKhoan;
import model.pojo.TinhTrangEnum;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import action.FileUploadAction;
import java.io.File;
import com.opensymphony.xwork2.ActionSupport;

public class SanPhamDeNghiAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SanPhamDeNghi spDeNghi;
	private List<SanPhamDeNghi> dsSPDN;
	private File attachment;
	private String attachmentFileName;
	private String attachmentContentType;
	private String dataDir;

	private SanPhamDeNghiDAO spdnDao = new SanPhamDeNghiDAO();

	Map<String, Object> session;

	public String execute() {

		return SUCCESS;
	}

	public String themSanPhamDeNghi() {
		// TinhTrangEnum tinhTrang = ;
		// spDeNghi.setTinhTrang(tinhTrang.ChuaDuyet);

		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null) {
			return ERROR;
		}
		GianHangDAO ghDao = new GianHangDAO();
		GianHang gianHang = ghDao.lay(tk);
		spDeNghi.setGianHang(gianHang);
		spDeNghi.setTinhTrang(TinhTrangEnum.ChuaDuyet);
		ServletContext servletContext = ServletActionContext
				.getServletContext();
		if (attachment != null) {
			// attachment will be null if there's an error,
			// such as if the uploaded file is too large
			dataDir = servletContext.getRealPath("/WEB-INF")
					+ "/uploadPicture/SanPhamDeNghi";
			File folder = new File(dataDir);
			if (!folder.exists()) {
				folder.mkdir();
			}
			File savedFile = new File(dataDir, attachmentFileName);
			attachment.renameTo(savedFile);
			spDeNghi.setHinhAnh(attachmentFileName);
		}

		spdnDao.them(spDeNghi);
		return SUCCESS;
	}

	public String layDanhSachSanPhamDeNghi() {
		dsSPDN = spdnDao.layDanhSach();
		ServletContext servletContext = ServletActionContext
				.getServletContext();
		
		dataDir = servletContext.getRealPath("/WEB-INF")
				+ "/uploadPicture/SanPhamDeNghi/";
		
		for (SanPhamDeNghi temp : dsSPDN)
		{
			temp.setHinhAnh(dataDir + temp.getHinhAnh());
		}
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	public SanPhamDeNghi getSpDeNghi() {
		return spDeNghi;
	}

	public void setSpDeNghi(SanPhamDeNghi spDeNghi) {
		this.spDeNghi = spDeNghi;
	}

	public File getAttachment() {
		return attachment;
	}

	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}

	public String getAttachmentFileName() {
		return attachmentFileName;
	}

	public void setAttachmentFileName(String attachmentFileName) {
		this.attachmentFileName = attachmentFileName;
	}

	public String getAttachmentContentType() {
		return attachmentContentType;
	}

	public void setAttachmentContentType(String attachmentContentType) {
		this.attachmentContentType = attachmentContentType;
	}

	public List<SanPhamDeNghi> getDsSPDN() {
		return dsSPDN;
	}

	public void setDsSPDN(List<SanPhamDeNghi> dsSPDN) {
		this.dsSPDN = dsSPDN;
	}

	public String getDataDir() {
		return dataDir;
	}

	public void setDataDir(String dataDir) {
		this.dataDir = dataDir;
	}

}
