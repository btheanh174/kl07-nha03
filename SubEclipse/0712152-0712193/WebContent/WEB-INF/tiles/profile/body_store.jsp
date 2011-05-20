<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjr" uri="/struts-jquery-richtext-tags"%>
<%@ taglib uri="http://code.google.com/p/jcaptcha4struts2/taglib/2.0"
	prefix="jcaptcha"%>

<sj:div>
	<sj:tabbedpanel id="panelStore" animate="true" collapsible="true">
		<sj:tab id="tab1" target="div1" label="Quản lý cửa hàng"></sj:tab>
		<div id="div1">
			<s:form action="Store_capNhat" method="post">

				<div class="setup">
					<div class="photo relative1">
						<p>
							<img width="120" height="120" ectype="store_logo"
								src="${#session['tk'].gianHang.logo}">
						</p>
						<b class="ie6hack"> <span class="file1"><s:file name="logo"></s:file></span>
							<div class="txt">Sửa logo</div> </b> <span class="explain">Kích
							thước logo là 100*100</span>
					</div>
					<div class="photo relative2">
						<p>
							<img width="607" height="120" ectype="store_banner"
								src="${#session['tk'].gianHang.banner }">
						</p>
						<b>
						 <span class="file1">
						 <s:file name="banner"></s:file>
				     	</span>
							<div class="txt">Sửa Banner</div> </b> <span class="explain">Kích
							thước banner là 1000*120</span>
					</div>
					<div class="clear"></div>
				</div>

				<div class="setup info shop">
				
				<s:hidden name="maGianHang" value="%{#session['tk'].gianHang.maGianHang}"></s:hidden>
					<table style="width: 100%">
						<tr>
							<th></th>
							<td>
								<p class="td_block">
									<s:textfield name="tenGianHang" value="%{#session['tk'].gianHang.tenGianHang}" label="Tên cửa hàng (*)"></s:textfield>
								</p><a target="_blank" href="store/354">Xem cửa hàng</a></td>
						</tr>
						<tr>
							<th></th>
							<td><s:bean name="model.bean.TinhThanhPhoBean" id="ttpBean"></s:bean>
								<sj:autocompleter label="Tỉnh/thành phố" name="tinhThanhPho"
									list="#ttpBean.dsTinhThanhPho" listKey="maTinhThanhPho"
									listValue="tenTinhThanhPho"
									value="%{#session['tk'].gianHang.tinhThanhPho.maTinhThanhPho}"></sj:autocompleter>
							</td>
						</tr>
						<tr>
							<th></th>
							<td>
								<p class="td_block">
									<s:textfield name="diaChi" label="Địa chỉ" value="%{#session['tk'].gianHang.diaChi}"></s:textfield>
								</p></td>
						</tr>
						<tr>
							<th></th>
							<td><s:textfield name="fax" label="Fax" value="%{#session['tk'].gianHang.fax}"></s:textfield></td>
						</tr>
						<tr>
							<th></th>
							<td><s:textfield name="dienThoai" label="Điện thoại" value="%{#session['tk'].gianHang.dienThoai}"></s:textfield>
							</td>
						</tr>

						<tr>
							<th></th>
							<td><s:textfield name="yahoo" label="Yahoo" value="%{#session['tk'].gianHang.yahoo}"></s:textfield></td>
						</tr>
						<tr>
							<td><sjr:ckeditor id="richtextEditor" width="500" value="%{#session['tk'].gianHang.thongTin}"
									label="Giới thiệu SHOP" name="thongTin" rows="10" cols="80">
								</sjr:ckeditor>
								<div class="clear"></div></td>
						</tr>
						<tr>
							<s:submit value="Lưu"></s:submit>
						</tr>
						</tbody>
					</table>
				</div>
			</s:form>
		</div>
	</sj:tabbedpanel>
</sj:div>