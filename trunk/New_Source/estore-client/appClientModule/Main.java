import java.util.List;

import com.estore.core.model.dao.SanPhamDAO;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		SanPhamDAO spDao = new SanPhamDAO();
		List ds = spDao.layDanhSach();
		System.out.println(ds.size());
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}