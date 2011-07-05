package action.sanpham;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.dao.SanPhamDAO;
import model.pojo.SanPham;

import org.apache.struts2.interceptor.SessionAware;

import util.SanPhamUtil;

import com.opensymphony.xwork2.ActionSupport;

public class JsonTable extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 5078264277068533593L;

	private List<SanPham> gridModel;
	private List<SanPham> myProducts;
	private Integer rows = 0;
	private Integer page = 0;
	private Integer total = 0;
	private Integer record = 0;
	private String sord;
	private String sidx;
	private String searchField;
	private String searchString;
	private String searchOper;
	private boolean loadonce = false;
	private Map<String, Object> session;
	private SanPhamDAO spDao = new SanPhamDAO();
	private SanPhamUtil spUtil = new SanPhamUtil();

	public String execute() {
		return SUCCESS;
	}

	public String getJSON() {
		Object list = session.get("mylist");
		if (list != null) {
			myProducts = (List<SanPham>) list;
		} else {
			// myCustomers = spDao.buildList();
			myProducts = spDao.layDanhSach();
			for (int i = 0; i < myProducts.size(); i++) {

				myProducts.get(i).setTenDanhMuc(
						myProducts.get(i).getDanhMuc().getTenDanhMuc());
				/*for (int j = 0; i < myProducts.get(i).getDsHinhAnh().size(); j++) {
					if (j == 0)
						myProducts.get(i).setUrlHinh1(
								myProducts.get(i).getDsHinhAnh().get(0)
										.getUrlHinhAnh());
					if (j == 1)
						myProducts.get(i).setUrlHinh2(
								myProducts.get(i).getDsHinhAnh().get(1)
										.getUrlHinhAnh());
					if (j == 2)
						myProducts.get(i).setUrlHinh3(
								myProducts.get(i).getDsHinhAnh().get(2)
										.getUrlHinhAnh());
				}*/
				
				/*myProducts.get(i).setUrlHinh1(myProducts.get(i).getDsHinhAnh().get(0)
										.getUrlHinhAnh());*/
				myProducts.get(i).setUrlHinh1("<img src=\"http://vnexpress.net/Files/Subject/3b/a2/b9/08/ronnie.jpg\" alt=\"\" />");
				myProducts.get(i).setDanhMuc(null);
				myProducts.get(i).setDsGianHangSanPham(null);
				myProducts.get(i).setDsHinhAnh(null);
			}
		}

		if (getSord() != null && getSord().equalsIgnoreCase("asc")) {
			// Collections.sort(myProducts);
		}
		if (getSord() != null && getSord().equalsIgnoreCase("desc")) {
			// Collections.sort(myCustomers);
			// Collections.reverse(myCustomers);
		}

		setRecord(myProducts.size());

		int to = (getRows() * getPage());
		int from = to - getRows();

		if (to > getRecord())
			to = getRecord();

		if (loadonce) {
			setGridModel(myProducts);
		} else {
			if (searchString != null && searchOper != null) {
				int id = Integer.parseInt(searchString);
				if (searchOper.equalsIgnoreCase("eq")) {

					List<SanPham> cList = new ArrayList<SanPham>();
					cList.add(spUtil.findById(myProducts, id));
					setGridModel(cList);
				} else if (searchOper.equalsIgnoreCase("ne")) {

					setGridModel(spUtil.findNotById(myProducts, id, from, to));
				} else if (searchOper.equalsIgnoreCase("lt")) {

					setGridModel(spUtil
							.findLesserAsId(myProducts, id, from, to));
				} else if (searchOper.equalsIgnoreCase("gt")) {

					setGridModel(spUtil.findGreaterAsId(myProducts, id, from,
							to));
				}
			} else {
				setGridModel(spUtil.getCustomers(myProducts, from, to));
			}
		}

		setTotal((int) Math.ceil((double) getRecord() / (double) getRows()));

		session.put("mylist", myProducts);

		return SUCCESS;
	}

	/**
	 * @return how many rows we want to have into the grid
	 */
	public Integer getRows() {
		return rows;
	}

	/**
	 * @param rows
	 *            how many rows we want to have into the grid
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
	}

	/**
	 * @return current page of the query
	 */
	public Integer getPage() {
		return page;
	}

	/**
	 * @param page
	 *            current page of the query
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * @return total pages for the query
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            total pages for the query
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * @return total number of records for the query. e.g. select count(*) from
	 *         table
	 */
	public Integer getRecord() {
		return record;
	}

	/**
	 * @param record
	 *            total number of records for the query. e.g. select count(*)
	 *            from table
	 */
	public void setRecord(Integer record) {

		this.record = record;

		if (this.record > 0 && this.rows > 0) {
			this.total = (int) Math.ceil((double) this.record
					/ (double) this.rows);
		} else {
			this.total = 0;
		}
	}

	/**
	 * @return an collection that contains the actual data
	 */
	public List<SanPham> getGridModel() {
		return gridModel;
	}

	/**
	 * @param gridModel
	 *            an collection that contains the actual data
	 */
	public void setGridModel(List<SanPham> gridModel) {
		this.gridModel = gridModel;
	}

	/**
	 * @return sorting order
	 */
	public String getSord() {
		return sord;
	}

	/**
	 * @param sord
	 *            sorting order
	 */
	public void setSord(String sord) {
		this.sord = sord;
	}

	/**
	 * @return get index row - i.e. user click to sort.
	 */
	public String getSidx() {
		return sidx;
	}

	/**
	 * @param sidx
	 *            get index row - i.e. user click to sort.
	 */
	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public void setSearchOper(String searchOper) {
		this.searchOper = searchOper;
	}

	public void setLoadonce(boolean loadonce) {
		this.loadonce = loadonce;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
