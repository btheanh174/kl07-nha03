<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<tr>
	<td align="center">Tên sản phẩm:</td>
	<td align="center"><s:property value="dienthoai.tenSanPham" /></td>
</tr>
<tr>
	<td align="center">Giá tham khảo:</td>
	<td align="center"><s:property value="dienthoai.gia" /></td>
</tr>
<tr>
	<td align="center">Danh mục:</td>
	<td align="center"><s:property
			value="dienthoai.danhMuc.tenDanhMuc" /></td>
</tr>
<tr>
	<td align="center">Hãng sản xuất:</td>
	<td align="center"><s:property value="dienthoai.hangSanXuat" /></td>
</tr>
<tr>
	<td align="center">Mạng:</td>
	<td align="center"><s:property value="dienthoai.mang" /></td>
</tr>
<tr>
	<td align="center">Kiểu dáng:</td>
	<td align="center"><s:property value="dienthoai.kieuDang" /></td>
</tr>
<tr>
	<td align="center">Màn hình:</td>
	<td align="center"><s:property value="dienthoai.manHinh" /></td>
</tr>
<tr>
	<td align="center">Độ phân giải:</td>
	<td align="center"><s:property value="dienthoai.doPhanGiai" /></td>
</tr>
<tr>
	<td align="center">Hệ điều hành:</td>
	<td align="center"><s:property value="dienthoai.heDieuHanh" /></td>
</tr>
<tr>
	<td align="center">Bộ nhớ trong:</td>
	<td align="center"><s:property value="dienthoai.boNhoTrong" /></td>
</tr>
<tr>
	<td align="center">Ram:</td>
	<td align="center"><s:property value="dienthoai.ram" /></td>
</tr>
<tr>
	<td align="center">Tin nhắn:</td>
	<td align="center"><s:property value="dienthoai.tinNhan" /></td>
</tr>
<tr>
	<td align="center">Trọng lượng:</td>
	<td align="center"><s:property value="dienthoai.trongLuong" /></td>
</tr>
<tr>
	<td align="center">Kích thước:</td>
	<td align="center"><s:property value="dienthoai.kichThuoc" /></td>
</tr>
<tr>
	<td align="center">Kiểu chuông:</td>
	<td align="center"><s:property value="dienthoai.kieuChuong" /></td>
</tr>
<tr>
	<td align="center">Rung:</td>
	<td align="center"><s:if test="dienthoai.rung == 1">Có</s:if>
		<s:else>Không có</s:else></td>
</tr>
<tr>
	<td align="center">Camera:</td>
	<td align="center"><s:property value="dienthoai.camera" /></td>
</tr>
<tr>
	<td align="center">Màu sắc:</td>
	<td align="center"><s:property value="dienthoai.mauSac" /></td>
</tr>
<tr>
	<td align="center">Pin:</td>
	<td align="center"><s:property value="dienthoai.pin" /></td>
</tr>
<tr>
	<td align="center">Thời gian đàm thoại:</td>
	<td align="center"><s:property value="dienthoai.thoiGianDamThoai" />
	</td>
</tr>
<tr>
	<td align="center">Thời gian chờ:</td>
	<td align="center"><s:property value="dienthoai.thoiGianCho" /></td>
</tr>
<tr>
	<td align="center">Số sim:</td>
	<td align="center"><s:property value="dienthoai.sim" /></td>
</tr>
<tr>
	<td align="center">Loại thẻ nhớ tích hợp:</td>
	<td align="center"><s:property value="dienthoai.theNho" /></td>
</tr>
<tr>
	<td align="center">Tính năng:</td>
	<td align="center"><s:property value="dienthoai.tinhNang" /></td>
</tr>
<tr>
	<td align="center">Tính năng khác:</td>
	<td align="center"><s:property value="dienthoai.tinhNangKhac" />
	</td>
</tr>