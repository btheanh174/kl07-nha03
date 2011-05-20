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
			<s:form>

				<div class="setup">
					<div class="photo relative1">

						<p>
							<img width="120" height="120" ectype="store_logo"
								src="data/files/store_354/other/store_logo.png">
						</p>
						<b class="ie6hack"> <span class="file1"><input
								type="file" ectype="change_store_logo" hidefocus="true"
								maxlength="0" size="1">
						</span>
							<div class="txt">Sửa logo</div> </b> <span class="explain">Kích
							thước logo là 100*100</span>
					</div>
					<div class="photo relative2">
						<p>
							<img width="607" height="120" ectype="store_banner"
								src="all/images/no-banner.gif">
						</p>
						<b> <span class="file1"><input type="file"
								ectype="change_store_banner" hidefocus="true" maxlength="0"
								size="1">
						</span>

							<div class="txt">Sửa Banner</div> </b> <span class="explain">Kích
							thước banner là 1000*120</span>
					</div>
					<div class="clear"></div>
				</div>

				<div class="setup info shop">

                        <table style="width: 100%">
                                                        <tbody><tr>
                                <th class="width2">Tên cửa hàng (*):</th>
                                <td>
                                    <p class="td_block"><input type="text" value="LLH" name="store_name" class="text width_normal" id="store_name"></p>
                                    <a class="btn1" target="_blank" href="store/354">Xem cửa hàng</a>
                                </td>
                            </tr>
                            <tr>
                                <th>Vùng:</th>
                                <td><div id="region">
                                    <input type="hidden" class="mls_id" value="713" name="region_id">
                                    <input type="hidden" class="mls_names" value="Tây Ninh" name="region_name">
                                                                        <span>Tây Ninh</span>
                                    <input type="button" class="edit_region" value="Sửa">
                                    <select style="display:none">
                                      <option>Vui lòng chọn . . .</option>
                                      <option value="723">Hà Nội</option><option value="691">TP. Hồ Chí Minh</option><option value="664">﻿An Giang</option><option value="665">Bà Rịa-Vũng Tàu</option><option value="666">Bạc Liêu</option><option value="667">Bắc Cạn</option><option value="668">Bắc Giang</option><option value="669">Bắc Ninh</option><option value="670">Bến Tre</option><option value="671">Bình Dương</option><option value="672">Bình Định</option><option value="673">Bình Phước</option><option value="674">Bình Thuận</option><option value="675">Cà Mau</option><option value="676">Cao Bằng</option><option value="677">Cần Thơ</option><option value="678">Đà Nẵng</option><option value="679">Đắk Lắk</option><option value="680">Đắk Nông</option><option value="681">Đồng Nai</option><option value="682">Đồng Tháp</option><option value="683">Gia Lai</option><option value="684">Hà Giang</option><option value="685">Hà Nam</option><option value="686">Hà Tây</option><option value="687">Hà Tĩnh</option><option value="688">Hải Dương</option><option value="689">Hậu Giang</option><option value="690">Hoà Bình</option><option value="692">Hưng Yên</option><option value="693">Khánh Hoà</option><option value="694">Kiên Giang</option><option value="695">Kon Tum</option><option value="696">Lai Châu</option><option value="697">Lào Cai</option><option value="698">Lâm Đồng</option><option value="699">Long An</option><option value="700">Nam Định</option><option value="701">Nghệ An</option><option value="702">Ninh Bình</option><option value="703">Ninh Thuận</option><option value="704">Phú Thọ</option><option value="705">Phú Yên</option><option value="706">Quảng Bình</option><option value="707">Quảng Nam</option><option value="708">Quảng Ngãi</option><option value="709">Quảng Ninh</option><option value="710">Quảng Trị</option><option value="711">Sóc Trăng</option><option value="712">Sơn La</option><option value="713">Tây Ninh</option><option value="714">Thái Bình</option><option value="715">Thái Nguyên</option><option value="716">Thừa Thiên-Huế</option><option value="717">Tiền Giang</option><option value="718">Trà Vinh</option><option value="719">Tuyên Quang</option><option value="720">Vĩnh Long</option><option value="721">Vĩnh Phúc</option><option value="722">Yên Bái</option>                                    </select>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <th>Địa chỉ:</th>
                                <td>
                                    <p class="td_block"><input type="text" value="Tây Ninh" id="address" class="text width_normal" name="address"><span class="field_notice">Không nhập lại địa chỉ đã chọn ở trên</span></p>
                                </td>
                            </tr>
                            <tr>
                                <th>Fax:</th>
                                <td>
                                    <p class="td_block"><input type="text" value="Tây Ninh" id="address" class="text width_normal" name="address"></p>
                                </td>
                            </tr>
                            <tr>
                                <th>Điện thoại:</th>
                                <td><input type="text" value="01674560436" id="tel" class="text width_normal" name="tel"></td>
                            </tr>
                           
                            <tr>
                                  <th>Yahoo:</th>
                                  <td><input type="text" value="" id="im_ww" class="text width_normal" name="im_ww"></td>
                            </tr>
                           
                             <tr>
                                <td>
                                  <sjr:ckeditor id="richtextEditor"
										label="Giới thiệu SHOP" name="gioiThieu" rows="10" cols="80"
										value="">
									</sjr:ckeditor>
									<div class="clear"></div>
                                    
                                 </td>
                             </tr>
                             <tr>
                             <s:submit value="Lưu"></s:submit>
                             </tr>
                         </tbody></table>
          		</div>
			</s:form>
		</div>

	</sj:tabbedpanel>
</sj:div>