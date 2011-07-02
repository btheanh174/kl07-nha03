package com.estore.core.util;

import java.util.ArrayList;
import java.util.List;

import com.estore.core.model.pojo.SanPham;


public class SanPhamUtil {

	public SanPham findById(List<SanPham> myProducts, int id) {
		for (int i = 0; i < myProducts.size(); i++) {
			if (myProducts.get(i).getMaSanPham() == id)
				return myProducts.get(i);
		}
		return null;
	}

	public List<SanPham> findNotById(List<SanPham> myProducts, int id,
			int from, int to) {
		List<SanPham> result = new ArrayList<SanPham>();
		for (int i = from; i < to; i++) {
			if (myProducts.get(i).getMaSanPham() != id)
				result.add(myProducts.get(i));
		}
		return result;
	}
	
	public List<SanPham> findLesserAsId(List<SanPham> myProducts, int id,
			int from, int to) {
		List<SanPham> result = new ArrayList<SanPham>();
		for (int i = from; i < to; i++) {
			if (myProducts.get(i).getMaSanPham() < id)
				result.add(myProducts.get(i));
		}
		return result;
	}

	public List<SanPham> findGreaterAsId(List<SanPham> myProducts, int id,
			int from, int to) {
		List<SanPham> result = new ArrayList<SanPham>();
		for (int i = from; i < to; i++) {
			if (myProducts.get(i).getMaSanPham() > id)
				result.add(myProducts.get(i));
		}
		return result;
	}
	
	public List<SanPham> getCustomers(List<SanPham> myProducts, int from, int to) {
		List<SanPham> result = new ArrayList<SanPham>();
		for (int i = from; i < to; i++) {
			result.add(myProducts.get(i));
		}
		return result;
	}
}
