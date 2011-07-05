package action;

import java.io.File;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File fileUpload;
	private String fileUploadContentType;
	private String fileUploadFileName;
 
	public String getFileUploadContentType() {
		return fileUploadContentType;
	}
 
	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}
 
	public String getFileUploadFileName() {
		return fileUploadFileName;
	}
 
	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}
 
	public File getFileUpload() {
		return fileUpload;
	}
 
	public void setFileUpload(File fileUpload) {
		this.fileUpload = fileUpload;
	}
 
	public String execute() throws Exception{
 
		return SUCCESS;
 
	}
	
	public String saveFile(String path)
	{
		ServletContext servletContext = ServletActionContext.getServletContext(); 
		if (fileUpload != null) 
		{ 
			// fileUpload will be null if there's an error, 
			// such as if the uploaded file is too large 
			String dataDir = servletContext.getRealPath("/WEB-INF") +  path; 
			File savedFile = new File(dataDir, fileUploadFileName); 
			fileUpload.renameTo(savedFile); 
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String display() {
		return NONE;
	}
 
}