# --------------------------------------------------------
# Host:                         127.0.0.1
# Server version:               5.0.27-community-nt
# Server OS:                    Win32
# HeidiSQL version:             6.0.0.3603
# Date/time:                    2011-04-15 15:50:42
# --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

# Dumping database structure for USTORE
DROP DATABASE IF EXISTS `USTORE`;
CREATE DATABASE IF NOT EXISTS `ustore` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `USTORE`;


# Dumping structure for table USTORE.chi_tiet_hoa_don
DROP TABLE IF EXISTS `chi_tiet_hoa_don`;
CREATE TABLE IF NOT EXISTS `chi_tiet_hoa_don` (
  `MaChiTietHoaDon` int(10) NOT NULL default '0',
  `MaHoaDon` int(10) default NULL,
  `MaSanPham` int(10) default NULL,
  `SoLuong` int(10) default NULL,
  `DonGia` int(10) default NULL,
  `MaGianHang` int(10) default NULL,
  PRIMARY KEY  (`MaChiTietHoaDon`),
  KEY `FK_CHITIETHOADON_HOADON` (`MaHoaDon`),
  CONSTRAINT `FK_CHITIETHOADON_HOADON` FOREIGN KEY (`MaHoaDon`) REFERENCES `hoa_don` (`MaHoaDon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.chi_tiet_hoa_don: ~0 rows (approximately)
/*!40000 ALTER TABLE `chi_tiet_hoa_don` DISABLE KEYS */;
/*!40000 ALTER TABLE `chi_tiet_hoa_don` ENABLE KEYS */;


# Dumping structure for table USTORE.danh_muc
DROP TABLE IF EXISTS `danh_muc`;
CREATE TABLE IF NOT EXISTS `danh_muc` (
  `MaDanhMuc` int(10) NOT NULL auto_increment,
  `TenDanhMuc` varchar(50) collate utf8_unicode_ci NOT NULL,
  `DanhMucCha` int(10) NOT NULL,
  PRIMARY KEY  (`MaDanhMuc`),
  KEY `FK_DANHMUCSANPHAM_DANHMUCSANPHAM` (`DanhMucCha`),
  CONSTRAINT `FK_DANHMUC_DANHMUC` FOREIGN KEY (`DanhMucCha`) REFERENCES `danh_muc` (`MaDanhMuc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.danh_muc: ~14 rows (approximately)
/*!40000 ALTER TABLE `danh_muc` DISABLE KEYS */;
INSERT INTO `danh_muc` (`MaDanhMuc`, `TenDanhMuc`, `DanhMucCha`) VALUES
	(1, 'Điện thoại, viễn thông', 1),
	(2, 'Máy tính, điện tử', 2),
	(3, 'Đồ dùng gia đình', 3),
	(4, 'Ô tô - Xe máy', 4),
	(5, 'May mặc, thời trang', 5),
	(6, 'Laptop', 2),
	(7, 'Desktop', 2),
	(8, 'Phần mềm', 2),
	(9, 'Điện thoại', 1),
	(10, 'Thiết bị viễn thông', 1),
	(11, 'Dịch vụ viễn thông', 1),
	(12, 'Ô tô', 4),
	(13, 'Xe máy, phụ tùng xe máy', 4),
	(14, 'Phụ tùng, cơ khí ô tô', 4);
/*!40000 ALTER TABLE `danh_muc` ENABLE KEYS */;


# Dumping structure for table USTORE.gian_hang
DROP TABLE IF EXISTS `gian_hang`;
CREATE TABLE IF NOT EXISTS `gian_hang` (
  `MaGianHang` int(10) NOT NULL,
  `TenGianHang` varchar(50) collate utf8_unicode_ci NOT NULL,
  `ThongTinGianHang` varchar(50) collate utf8_unicode_ci NOT NULL COMMENT 'Tập tin xml: SoDT, Fax, Website, Diachi.',
  `CauHinhGianHang` varchar(50) collate utf8_unicode_ci default NULL COMMENT 'Tập tin XML, cau truc web gan nhu gian hang VATGIA',
  `DanhMucSanPham` varchar(50) collate utf8_unicode_ci default NULL COMMENT 'Tập tin XML, trong do co thong tin san pham la cac file XML',
  `TinTuc` varchar(50) collate utf8_unicode_ci default NULL,
  `MaDanhMuc` int(10) NOT NULL,
  `MaThanhVien` int(10) NOT NULL,
  `MaTinhThanhPho` int(10) default NULL,
  PRIMARY KEY  (`MaGianHang`),
  KEY `FK_GIANHANG_DANHMUCSANPHAM` (`MaDanhMuc`),
  KEY `FK_GIANHANG_THANHVIEN` (`MaThanhVien`),
  KEY `FK_GIANHANG_TINHTHANHPHO` (`MaTinhThanhPho`),
  CONSTRAINT `FK_GIANHANG_DANHMUCSANPHAM` FOREIGN KEY (`MaDanhMuc`) REFERENCES `danh_muc` (`MaDanhMuc`),
  CONSTRAINT `FK_GIANHANG_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`),
  CONSTRAINT `FK_GIANHANG_TINHTHANHPHO` FOREIGN KEY (`MaTinhThanhPho`) REFERENCES `tinh_thanhpho` (`MaTinhThanhPho`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.gian_hang: ~0 rows (approximately)
/*!40000 ALTER TABLE `gian_hang` DISABLE KEYS */;
/*!40000 ALTER TABLE `gian_hang` ENABLE KEYS */;


# Dumping structure for table USTORE.hinh_thuc_van_chuyen
DROP TABLE IF EXISTS `hinh_thuc_van_chuyen`;
CREATE TABLE IF NOT EXISTS `hinh_thuc_van_chuyen` (
  `MaHinhThucVanChuyen` int(10) NOT NULL auto_increment,
  `TenHinhThucVanChuyen` varchar(50) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (`MaHinhThucVanChuyen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.hinh_thuc_van_chuyen: ~2 rows (approximately)
/*!40000 ALTER TABLE `hinh_thuc_van_chuyen` DISABLE KEYS */;
INSERT INTO `hinh_thuc_van_chuyen` (`MaHinhThucVanChuyen`, `TenHinhThucVanChuyen`) VALUES
	(1, 'Hình thức 1'),
	(2, 'Hình thức 2');
/*!40000 ALTER TABLE `hinh_thuc_van_chuyen` ENABLE KEYS */;


# Dumping structure for table USTORE.hoa_don
DROP TABLE IF EXISTS `hoa_don`;
CREATE TABLE IF NOT EXISTS `hoa_don` (
  `MaHoaDon` int(10) NOT NULL auto_increment,
  `MaThanhVien` int(10) NOT NULL,
  `NgayLapHoaDon` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `MaNguoiNhan` int(10) NOT NULL,
  `MaPhuongThucThanhToan` int(10) NOT NULL,
  `MaHinhThucVanChuyen` int(10) NOT NULL,
  `MaTinhTrang` int(10) NOT NULL,
  PRIMARY KEY  (`MaHoaDon`),
  KEY `FK_HOADON_THANHVIEN` (`MaThanhVien`),
  KEY `FK_HOADON_PHUONGTHUCTHANHTOAN` (`MaPhuongThucThanhToan`),
  KEY `FK_HOADON_HINHTHUCVANCHUYEN` (`MaHinhThucVanChuyen`),
  KEY `FK_HOADON_TINHTRANGHOADON` (`MaTinhTrang`),
  KEY `FK_HOADON_NGUOINHAN` (`MaNguoiNhan`),
  CONSTRAINT `FK_HOADON_HINHTHUCVANCHUYEN` FOREIGN KEY (`MaHinhThucVanChuyen`) REFERENCES `hinh_thuc_van_chuyen` (`MaHinhThucVanChuyen`),
  CONSTRAINT `FK_HOADON_NGUOINHAN` FOREIGN KEY (`MaNguoiNhan`) REFERENCES `nguoi_nhan` (`MaNguoiNhan`),
  CONSTRAINT `FK_HOADON_PHUONGTHUCTHANHTOAN` FOREIGN KEY (`MaPhuongThucThanhToan`) REFERENCES `phuong_thuc_thanh_toan` (`MaPhuongThucThanhToan`),
  CONSTRAINT `FK_HOADON_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`),
  CONSTRAINT `FK_HOADON_TINHTRANGHOADON` FOREIGN KEY (`MaTinhTrang`) REFERENCES `tinh_trang_hoa_don` (`MaTinhTrang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.hoa_don: ~0 rows (approximately)
/*!40000 ALTER TABLE `hoa_don` DISABLE KEYS */;
/*!40000 ALTER TABLE `hoa_don` ENABLE KEYS */;


# Dumping structure for table USTORE.nguoi_nhan
DROP TABLE IF EXISTS `nguoi_nhan`;
CREATE TABLE IF NOT EXISTS `nguoi_nhan` (
  `MaNguoiNhan` int(10) NOT NULL auto_increment,
  `TenNguoiNhan` varchar(50) collate utf8_unicode_ci NOT NULL,
  `DiaChi` varchar(50) collate utf8_unicode_ci default NULL,
  `Email` varchar(50) collate utf8_unicode_ci default NULL,
  `DienThoai` varchar(50) collate utf8_unicode_ci default NULL,
  `GhiChu` varchar(50) collate utf8_unicode_ci default NULL,
  `MaThanhVien` int(10) NOT NULL,
  PRIMARY KEY  (`MaNguoiNhan`),
  KEY `FK_NGUOINHAN_THANHVIEN` (`MaThanhVien`),
  CONSTRAINT `FK_NGUOINHAN_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.nguoi_nhan: ~0 rows (approximately)
/*!40000 ALTER TABLE `nguoi_nhan` DISABLE KEYS */;
/*!40000 ALTER TABLE `nguoi_nhan` ENABLE KEYS */;


# Dumping structure for table USTORE.nhom_nguoi_dung
DROP TABLE IF EXISTS `nhom_nguoi_dung`;
CREATE TABLE IF NOT EXISTS `nhom_nguoi_dung` (
  `MaNhom` int(10) NOT NULL,
  `TenNhom` char(50) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (`MaNhom`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.nhom_nguoi_dung: ~4 rows (approximately)
/*!40000 ALTER TABLE `nhom_nguoi_dung` DISABLE KEYS */;
INSERT INTO `nhom_nguoi_dung` (`MaNhom`, `TenNhom`) VALUES
	(1, 'Member Thường'),
	(2, 'Member Gian hàng'),
	(3, 'Mod'),
	(4, 'Admin');
/*!40000 ALTER TABLE `nhom_nguoi_dung` ENABLE KEYS */;


# Dumping structure for table USTORE.phuong_thuc_thanh_toan
DROP TABLE IF EXISTS `phuong_thuc_thanh_toan`;
CREATE TABLE IF NOT EXISTS `phuong_thuc_thanh_toan` (
  `MaPhuongThucThanhToan` int(10) NOT NULL auto_increment,
  `TenPhuongThucThanhToan` varchar(50) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (`MaPhuongThucThanhToan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.phuong_thuc_thanh_toan: ~0 rows (approximately)
/*!40000 ALTER TABLE `phuong_thuc_thanh_toan` DISABLE KEYS */;
/*!40000 ALTER TABLE `phuong_thuc_thanh_toan` ENABLE KEYS */;


# Dumping structure for table USTORE.san_pham
DROP TABLE IF EXISTS `san_pham`;
CREATE TABLE IF NOT EXISTS `san_pham` (
  `MaSanPham` int(10) NOT NULL auto_increment,
  `TenSanPham` varchar(50) collate utf8_unicode_ci NOT NULL,
  `Gia` float default NULL,
  `MoTaNgan` text collate utf8_unicode_ci,
  `MoTaDai` text collate utf8_unicode_ci,
  `HinhNho` varchar(255) collate utf8_unicode_ci default NULL,
  `HinhLon` varchar(255) collate utf8_unicode_ci default NULL,
  `NhaSanXuat` varchar(100) collate utf8_unicode_ci default NULL,
  `MaDanhMuc` int(10) NOT NULL,
  `DanhSachGianHang` varchar(255) collate utf8_unicode_ci default NULL COMMENT 'Tập tin xml thể hiện danh sách gian hàng',
  PRIMARY KEY  (`MaSanPham`),
  KEY `FK_SANPHAM_DANHMUCSANPHAM` (`MaDanhMuc`),
  CONSTRAINT `FK_SANPHAM_DANHMUCSANPHAM` FOREIGN KEY (`MaDanhMuc`) REFERENCES `danh_muc` (`MaDanhMuc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.san_pham: ~0 rows (approximately)
/*!40000 ALTER TABLE `san_pham` DISABLE KEYS */;
/*!40000 ALTER TABLE `san_pham` ENABLE KEYS */;


# Dumping structure for table USTORE.tai_khoan
DROP TABLE IF EXISTS `tai_khoan`;
CREATE TABLE IF NOT EXISTS `tai_khoan` (
  `MaTaiKhoan` int(10) NOT NULL auto_increment,
  `TenTruyCap` varchar(20) collate utf8_unicode_ci NOT NULL,
  `MatKhau` varchar(50) collate utf8_unicode_ci NOT NULL,
  `NgayKichHoat` date default NULL,
  `MaNhomNguoiDung` int(10) NOT NULL,
  PRIMARY KEY  (`MaTaiKhoan`),
  KEY `FK_TAIKHOAN_NHOMTAIKHOAN` (`MaNhomNguoiDung`),
  CONSTRAINT `FK_TAIKHOAN_NHOMTAIKHOAN` FOREIGN KEY (`MaNhomNguoiDung`) REFERENCES `nhom_nguoi_dung` (`MaNhom`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.tai_khoan: ~0 rows (approximately)
/*!40000 ALTER TABLE `tai_khoan` DISABLE KEYS */;
/*!40000 ALTER TABLE `tai_khoan` ENABLE KEYS */;


# Dumping structure for table USTORE.template
DROP TABLE IF EXISTS `template`;
CREATE TABLE IF NOT EXISTS `template` (
  `MaTemplate` int(10) NOT NULL auto_increment,
  `TenTemplate` varchar(50) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (`MaTemplate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='một số template mẫu để chọn';

# Dumping data for table USTORE.template: ~0 rows (approximately)
/*!40000 ALTER TABLE `template` DISABLE KEYS */;
/*!40000 ALTER TABLE `template` ENABLE KEYS */;


# Dumping structure for table USTORE.tham_so
DROP TABLE IF EXISTS `tham_so`;
CREATE TABLE IF NOT EXISTS `tham_so` (
  `MaThamSo` int(10) NOT NULL auto_increment,
  `TenThamSo` varchar(50) collate utf8_unicode_ci default NULL,
  `Kieu` varchar(10) collate utf8_unicode_ci default NULL,
  `GiaTri` tinytext collate utf8_unicode_ci,
  `TinhTrang` tinyint(4) default NULL,
  PRIMARY KEY  (`MaThamSo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.tham_so: ~2 rows (approximately)
/*!40000 ALTER TABLE `tham_so` DISABLE KEYS */;
INSERT INTO `tham_so` (`MaThamSo`, `TenThamSo`, `Kieu`, `GiaTri`, `TinhTrang`) VALUES
	(1, 'SoCapDanhMuc', 'int', '2', 0),
	(2, 'SoSanPhamTrenTrang', 'int', '10', 0);
/*!40000 ALTER TABLE `tham_so` ENABLE KEYS */;


# Dumping structure for table USTORE.thanh_vien
DROP TABLE IF EXISTS `thanh_vien`;
CREATE TABLE IF NOT EXISTS `thanh_vien` (
  `MaThanhVien` int(10) NOT NULL auto_increment,
  `HoTen` varchar(50) collate utf8_unicode_ci NOT NULL,
  `DiaChi` varchar(50) collate utf8_unicode_ci NOT NULL,
  `Email` varchar(50) collate utf8_unicode_ci NOT NULL,
  `NgaySinh` date default NULL,
  `GioiTinh` set('Nam','Nữ') collate utf8_unicode_ci default NULL,
  `DienThoai` varchar(30) collate utf8_unicode_ci default NULL,
  `TinhThanhPho` int(11) default NULL,
  `MaTaiKhoan` int(11) default NULL,
  PRIMARY KEY  (`MaThanhVien`),
  KEY `FK_THANHVIEN_TAIKHOAN` (`MaTaiKhoan`),
  KEY `FK_THANHVIEN_TINHTHANHPHO` (`TinhThanhPho`),
  CONSTRAINT `FK_THANHVIEN_TAIKHOAN` FOREIGN KEY (`MaTaiKhoan`) REFERENCES `tai_khoan` (`MaTaiKhoan`),
  CONSTRAINT `FK_THANHVIEN_TINHTHANHPHO` FOREIGN KEY (`TinhThanhPho`) REFERENCES `tinh_thanhpho` (`MaTinhThanhPho`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.thanh_vien: ~0 rows (approximately)
/*!40000 ALTER TABLE `thanh_vien` DISABLE KEYS */;
/*!40000 ALTER TABLE `thanh_vien` ENABLE KEYS */;


# Dumping structure for table USTORE.tien_te
DROP TABLE IF EXISTS `tien_te`;
CREATE TABLE IF NOT EXISTS `tien_te` (
  `MaTienTe` int(10) NOT NULL auto_increment,
  `TenTienTe` varchar(50) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (`MaTienTe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.tien_te: ~0 rows (approximately)
/*!40000 ALTER TABLE `tien_te` DISABLE KEYS */;
/*!40000 ALTER TABLE `tien_te` ENABLE KEYS */;


# Dumping structure for table USTORE.tinh_thanhpho
DROP TABLE IF EXISTS `tinh_thanhpho`;
CREATE TABLE IF NOT EXISTS `tinh_thanhpho` (
  `MaTinhThanhPho` int(10) NOT NULL auto_increment,
  `TenTinhThanhPho` varchar(50) collate utf8_unicode_ci default NULL,
  PRIMARY KEY  (`MaTinhThanhPho`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.tinh_thanhpho: ~2 rows (approximately)
/*!40000 ALTER TABLE `tinh_thanhpho` DISABLE KEYS */;
INSERT INTO `tinh_thanhpho` (`MaTinhThanhPho`, `TenTinhThanhPho`) VALUES
	(1, 'TP HCM'),
	(2, 'Hà Nội');
/*!40000 ALTER TABLE `tinh_thanhpho` ENABLE KEYS */;


# Dumping structure for table USTORE.tinh_trang_hoa_don
DROP TABLE IF EXISTS `tinh_trang_hoa_don`;
CREATE TABLE IF NOT EXISTS `tinh_trang_hoa_don` (
  `MaTinhTrang` int(10) NOT NULL auto_increment,
  `TenTinhTrang` varchar(45) character set utf8 collate utf8_unicode_ci NOT NULL,
  PRIMARY KEY  (`MaTinhTrang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table USTORE.tinh_trang_hoa_don: ~5 rows (approximately)
/*!40000 ALTER TABLE `tinh_trang_hoa_don` DISABLE KEYS */;
INSERT INTO `tinh_trang_hoa_don` (`MaTinhTrang`, `TenTinhTrang`) VALUES
	(1, 'Mới đặt hàng'),
	(2, 'Hủy bởi quản trị'),
	(3, 'Chấp nhận bởi quản trị'),
	(4, 'Khách hàng đã thanh toán'),
	(5, 'Hàng đã được chuyển');
/*!40000 ALTER TABLE `tinh_trang_hoa_don` ENABLE KEYS */;


# Dumping structure for table USTORE.tin_nhan
DROP TABLE IF EXISTS `tin_nhan`;
CREATE TABLE IF NOT EXISTS `tin_nhan` (
  `MaTinNhan` int(10) NOT NULL auto_increment,
  `NoiDung` text collate utf8_unicode_ci,
  `NgayGui` timestamp NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `MaThanhVien` int(10) NOT NULL default '0',
  PRIMARY KEY  (`MaTinNhan`),
  KEY `FK_TINNHAN_THANHVIEN` (`MaThanhVien`),
  CONSTRAINT `FK_TINNHAN_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.tin_nhan: ~0 rows (approximately)
/*!40000 ALTER TABLE `tin_nhan` DISABLE KEYS */;
/*!40000 ALTER TABLE `tin_nhan` ENABLE KEYS */;


# Dumping structure for table USTORE.tin_rao_vat
DROP TABLE IF EXISTS `tin_rao_vat`;
CREATE TABLE IF NOT EXISTS `tin_rao_vat` (
  `MaTinRaoVat` int(10) NOT NULL auto_increment,
  `TenTinRaoVat` varchar(50) collate utf8_unicode_ci default NULL,
  `NoiDung` varchar(50) collate utf8_unicode_ci default NULL,
  `NgayDang` timestamp NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `NgayHetHan` datetime default NULL,
  `MaThanhVien` int(10) NOT NULL,
  `MaDanhMuc` int(10) NOT NULL,
  PRIMARY KEY  (`MaTinRaoVat`),
  KEY `FK_TINRAOVAT_THANHVIEN` (`MaThanhVien`),
  KEY `FK_TINRAOVAT_DANHMUCSANPHAM` (`MaDanhMuc`),
  CONSTRAINT `FK_TINRAOVAT_DANHMUCSANPHAM` FOREIGN KEY (`MaDanhMuc`) REFERENCES `danh_muc` (`MaDanhMuc`),
  CONSTRAINT `FK_TINRAOVAT_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table USTORE.tin_rao_vat: ~0 rows (approximately)
/*!40000 ALTER TABLE `tin_rao_vat` DISABLE KEYS */;
/*!40000 ALTER TABLE `tin_rao_vat` ENABLE KEYS */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
