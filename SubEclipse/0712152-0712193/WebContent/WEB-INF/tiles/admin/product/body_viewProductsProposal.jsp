<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>


<!-- start content-outer ........................................................................................................................START -->
<div id="content-outer">
	<!-- start content -->
	<div id="content">

		<!--  start page-heading -->

		<div id="page-heading">

			<h1>Sản phẩm đề nghị</h1>

		</div>

		<!-- end page-heading -->



		<table border="0" width="100%" cellpadding="0" cellspacing="0"
			id="content-table">
			<tr>
				<th rowspan="3" class="sized"><img
					src="images/shared/side_shadowleft.jpg" width="20" height="300"
					alt="" />
				</th>
				<th class="topleft"></th>
				<td id="tbl-border-top">&nbsp;</td>
				<th class="topright"></th>
				<th rowspan="3" class="sized"><img
					src="images/shared/side_shadowright.jpg" width="20" height="300"
					alt="" />
				</th>
			</tr>

			<tr>
				<td id="tbl-border-left"></td>
				<td>
					<!--  start content-table-inner ...................................................................... START -->
					<div id="content-table-inner">

						<!--  start table-content  -->
						<div id="table-content">
							<!--  start product-table ..................................................................................... -->
							<form id="mainform" action="">
								<table border="0" width="100%" cellpadding="0" cellspacing="0"
									id="product-table">
									<tr>
										<th class="table-header-check"><a id="toggle-all"></a></th>
										<th class="table-header-repeat line-left minwidth-1"><a
											href="">Hình ảnh</a></th>
										<th class="table-header-repeat line-left minwidth-1"><a
											href="">Tên sản phẩm</a>
										</th>
										<th class="table-header-repeat line-left"><a href="">Giá</a>
										</th>
										<th class="table-header-repeat line-left" width=""><a
											href="">Số lượng</a></th>
										<th class="table-header-repeat line-left"><a href="">Bảo
												hành</a></th>
										<th class="table-header-repeat line-left"><a href="">Chất
												lượng</a>
										</th>

										<th class="table-header-repeat line-left"><a href="">Chi
												tiết khác</a>
										</th>

										<th class="table-header-repeat line-left"><a href="">Gian
												hàng</a>
										</th>

										<th class="table-header-options line-left"><a href="">Đã
												duyệt</a></th>
									</tr>

									<s:iterator value="dsSPDN" status="status">
										<s:if test="#status.odd == true">
											<tr>
										</s:if>
										<s:else>
											<tr class="alternate-row">
										</s:else>
										<td><input type="checkbox" />
										</td>
										<td><img alt="" height="50px" 
										src="<%= request.getContextPath()%>/images/yourImage.gif">
										src="<s:property value="hinhAnh"/>"/> 
										</td>
										<td><s:property value="tenSanPham" />
										</td>
										<td><s:property value="gia" />
										</td>
										<td><s:property value="soLuong" />
										</td>
										<td><s:property value="baoHanh" />
										</td>
										<td><s:property value="chatLuong" />
										</td>
										<td><a style="color: blue;" href="">Chi tiết...</a>
										</td>
										<td><s:property value="gianHang.tenGianHang" />
										</td>
										<td class="options-width"><s:if
												test="getTinhTrang().name().equals(\"DaDuyet\")">
												<img alt="" src="images/table/check.png" height="24px" />
										</td>
										</s:if>
										</tr>

									</s:iterator>

								</table>
								<!--  end product-table................................... -->
							</form>
						</div>

						<!--  end content-table  -->

						<!--  start actions-box ............................................... -->
						<div id="actions-box">
							<a href="" class="action-slider"></a>
							<div id="actions-box-slider">
								<a href="" class="action-edit">Edit</a> <a href=""
									class="action-delete">Delete</a>
							</div>
							<div class="clear"></div>
						</div>
						<!-- end actions-box........... -->
						<!--  start paging..................................................... -->
						<table border="0" cellpadding="0" cellspacing="0"
							id="paging-table">
							<tr>
								<td><a href="" class="page-far-left"></a> <a href=""
									class="page-left"></a>
									<div id="page-info">
										Page <strong>1</strong> / 15
									</div> <a href="" class="page-right"></a> <a href=""
									class="page-far-right"></a></td>
								<td><select class="styledselect_pages">
										<option value="">Number of rows</option>
										<option value="">1</option>
										<option value="">2</option>
										<option value="">3</option>
								</select></td>
							</tr>
						</table>
						<!--  end paging................ -->
						<div class="clear"></div>
					</div> <!--  end content-table-inner ............................................END  -->
				</td>
				<td id="tbl-border-right"></td>
			</tr>
			<tr>
				<th class="sized bottomleft"></th>
				<td id="tbl-border-bottom">&nbsp;</td>
				<th class="sized bottomright"></th>
			</tr>
		</table>
		<div class="clear">&nbsp;</div>
	</div>

	<!--  end content-outer........................................................END -->
</div>
