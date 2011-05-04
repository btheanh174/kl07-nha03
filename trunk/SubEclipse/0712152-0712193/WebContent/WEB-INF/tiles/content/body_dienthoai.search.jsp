<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>

<div class="center_title_bar">Tìm kiếm điện thoại</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
		<s:form method="post" action="">
			<s:actionerror />

			<s:textfield name="tenSanPham" label="Tên sản phẩm"></s:textfield>
			<!-- Thông tin cơ bản -->
			<s:select list="{'Nokia','Samsung','Sony Ericson','Lenovo','Apple','BenQ','Motorola','LG'}" label="Hãng sản xuất"></s:select>
			<s:select list="{'GPRS','GSM'}" label="Mạng"></s:select>
			<s:select list="{'Gập', 'Thanh', 'Trượt'}" label="Kiểu dáng"></s:select>
			<s:select list="{'100g','200g'}" label="Trọng lượng (>)"></s:select>
			<s:select list="{'200x160 pixel'}" label="Kích thước"></s:select>
			<s:select list="{'Đơn sẵc','65k Màu', '256k Màu'}" label="Loại màn hình"></s:select>
			<s:select list="{'280 x 178'}" label="Độ phân giải"></s:select>
			<s:select list="{'wav','MP3'}" label="Kiểu chuông"></s:select>
			<s:select list="{'1 sim', '2 sim'}" label="Số sim"></s:select>
			<!-- Bộ nhớ -->
			
			<s:select list="{'10MB','50MB','100MB'}" label="Bộ nhớ trong (>)"></s:select>
			<s:select list="{'128MB','256MB','512MB','1GB'}" label="Ram"></s:select>
			<s:select list="{'Không hổ trợ', 'SD', 'MicroSD','TransFlash'}" label="Loại thẻ nhớ"></s:select>
			<!-- Dữ liệu -->
			<s:select list="{'Android','Symbian', 'Bada','Sony Ericson', 'iPhone'}" label="Hệ điều hành"></s:select>
			<s:select list="{'Email', 'SMS', 'MMS', 'Fax'}" label="Tin nhắn"></s:select>
			
			<!-- Tính năng nổi bật -->
			<s:select list="{'Hồng', 'Trắng', 'Đen', 'Than chì'}" label="Màu sắc"></s:select>
			<s:select list="{'1.3 Megapixel', '2.0 Megapixel', '3.2 Megapixel', '5.0 Megapixel'}" label="Camera"></s:select>
			<s:select list="{'Nghe nhạc', 'Mp4', 'Xem tivi', 'Karaoke'}" label="Tính năng cơ bản"></s:select>
			
			<!-- Pin -->
			<s:select list="{'Pin tiêu chuẩn', '500mAh', '1000mAh'}" label="Pin"></s:select>
			<s:select list="{'3 giờ', '5 giờ', '10 giờ'}" label="Thời gian đàm thoại"></s:select>
			<s:select list="{'50 giờ','100 giờ','200 giờ'}" label="Thời gian chờ"></s:select>
			
			<!-- Giá -->
			<s:textfield label="Giá từ"></s:textfield><s:text name="VNĐ"></s:text>
			<s:textfield label="Đến"></s:textfield><s:text name="VNĐ"></s:text>
			
			<s:submit value="Tìm kiếm"></s:submit>
		</s:form>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>
