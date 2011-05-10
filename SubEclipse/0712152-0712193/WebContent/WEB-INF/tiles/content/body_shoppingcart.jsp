<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="center_title_bar">Giỏ hàng</div>
<div class="prod_box_big">
	<div class="top_prod_box_big"></div>
	<div class="center_prod_box_big">
		<s:if test="#session['gioHang'] == null">
		Giỏ hàng chưa có sản phẩm nào!
		<s:a action="show_index">Tiếp tục mua</s:a>
		</s:if>
		<s:else>
			<s:form method="post" action="">
				<table width="100%" border="1" align="center" bordercolor="#CCCCCC"
					style="border-collapse: collapse;">
					<tr class="table_header">
						<th width="5%" scope="col">&nbsp;</th>
						<th width="12%" scope="col">H&igrave;nh</th>
						<th width="24%" scope="col">T&ecirc;n s&#7843;n ph&#7849;m</th>
						<th width="25%" scope="col">S&#7889; l&#432;&#7907;ng</th>
						<th width="21%" scope="col">&#272;&#417;n gi&aacute;</th>
						<th width="13%" scope="col">Th&agrave;nh ti&#7873;n</th>
					</tr>
					<tr>
						<td><label> <input name="ckbXoa" type="checkbox"
								id="ckbXoa" value="checkbox" /> </label></td>
						<td>SmallImage</td>
						<td>iPhone 4 32GB Black</td>
						<td align="center"><label> <input name="txtSoLuong"
								type="text" id="txtSoLuong" value="1" align="right" /> </label></td>
						<td align="right">17.800.000 VN&#272;</td>
						<td align="right">17.800.000 VN&#272;</td>
					</tr>
					<tr>
						<td colspan="6" align="right"><label></label> <label></label>
							T&#7893;ng ti&#7873;n: 17.800.000 VN&#272;</td>
					</tr>
					<tr>
						<td><input name="btnXoa" type="submit" id="btnXoa"
							value="X&oacute;a" /></td>
						<td colspan="3" align="center"><input name="btnCapNhat"
							type="submit" id="btnCapNhat" value="C&#7853;p nh&#7853;t" /> <input
							name="btnXoaHet" type="submit" id="btnXoaHet"
							value="X&oacute;a h&#7871;t" /> <input name="btnTiepTucMua"
							type="submit" id="btnTiepTucMua" value="Ti&#7871;p t&#7909;c mua" />
						</td>
						<td colspan="2" align="right"><input name="btnThanhToan"
							type="submit" id="btnThanhToan" value="Thanh to&aacute;n" /></td>
					</tr>
				</table>
			</s:form>
		</s:else>
	</div>
	<div class="bottom_prod_box_big"></div>
</div>
