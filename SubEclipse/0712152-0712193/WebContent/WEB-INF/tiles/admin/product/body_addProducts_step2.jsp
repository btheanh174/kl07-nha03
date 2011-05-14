<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!-- start content-outer -->
<div id="content-outer">
	<!-- start content -->
	<div id="content">


		<div id="page-heading">
			<h1>Thêm sản phẩm</h1>
		</div>


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
					<!--  start content-table-inner -->
					<div id="content-table-inner">

						<table border="0" width="100%" cellpadding="0" cellspacing="0">
							<tr valign="top">
								<td>
									<!--  start step-holder -->
									<div id="step-holder">
										<div class="step-no-off">1</div>
										<div class="step-light-left">
											<a href="">Thêm sản phẩm</a>
										</div>
										<div class="step-light-right">&nbsp;</div>
										<div class="step-no">2</div>
										<div class="step-dark-left">Thông tin chi tiết</div>
										<div class="step-dark-right">&nbsp;</div>
										<div class="step-no-off">3</div>
										<div class="step-light-left">Hoàn tất</div>
										<div class="step-light-round">&nbsp;</div>
										<div class="clear"></div>
									</div> <!--  end step-holder --> <!-- start id-form --> <s:form
										action="SanPham_themSanPham_2.action" method="post"
										theme="simple">

										<table border="0" cellpadding="0" cellspacing="0" id="id-form">
											<s:if test="#session['loai'] == 1">

												<s:include
													value="/WEB-INF/tiles/admin/product/include_laptopInput.jsp"></s:include>
											</s:if>
											<s:else>

												<s:include
													value="/WEB-INF/tiles/admin/product/include_dienThoaiInput.jsp"></s:include>
											</s:else>
											<tr>
												<th></th>

												<td><s:submit key="  Đồng ý  " style="margin-top:30px;" />
												</td>
												<td></td>
											</tr>


										</table>
										<!-- end id-form  -->
									</s:form></td>
								<td></td>
							</tr>
							<tr>
								<td><img src="images/shared/blank.gif" width="695"
									height="1" alt="blank" />
								</td>
								<td></td>
							</tr>
						</table>

						<div class="clear"></div>


					</div> <!--  end content-table-inner  --></td>
				<td id="tbl-border-right"></td>
			</tr>
			<tr>
				<th class="sized bottomleft"></th>
				<td id="tbl-border-bottom">&nbsp;</td>
				<th class="sized bottomright"></th>
			</tr>
		</table>

	</div>
	<div class="clear">&nbsp;</div>
	<!--  end content -->
	<div class="clear">&nbsp;</div>
</div>
<!--  end content-outer -->