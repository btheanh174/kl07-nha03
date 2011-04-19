# --------------------------------------------------------
# Host:                         127.0.0.1
# Server version:               5.5.9
# Server OS:                    Win32
# HeidiSQL version:             6.0.0.3603
# Date/time:                    2011-04-19 22:51:48
# --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

# Dumping database structure for ustore
DROP DATABASE IF EXISTS `ustore`;
CREATE DATABASE IF NOT EXISTS `ustore` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `ustore`;


# Dumping structure for table ustore.chi_tiet_hoa_don
DROP TABLE IF EXISTS `chi_tiet_hoa_don`;
CREATE TABLE IF NOT EXISTS `chi_tiet_hoa_don` (
  `MaChiTietHoaDon` int(10) NOT NULL DEFAULT '0',
  `MaHoaDon` int(10) DEFAULT NULL,
  `MaSanPham` int(10) DEFAULT NULL,
  `SoLuong` int(10) DEFAULT NULL,
  `DonGia` int(10) DEFAULT NULL,
  `MaGianHang` int(10) DEFAULT NULL,
  PRIMARY KEY (`MaChiTietHoaDon`),
  KEY `FK_CHITIETHOADON_HOADON` (`MaHoaDon`),
  CONSTRAINT `FK_CHITIETHOADON_HOADON` FOREIGN KEY (`MaHoaDon`) REFERENCES `hoa_don` (`MaHoaDon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.chi_tiet_hoa_don: ~0 rows (approximately)
DELETE FROM `chi_tiet_hoa_don`;
/*!40000 ALTER TABLE `chi_tiet_hoa_don` DISABLE KEYS */;
/*!40000 ALTER TABLE `chi_tiet_hoa_don` ENABLE KEYS */;


# Dumping structure for table ustore.danh_muc
DROP TABLE IF EXISTS `danh_muc`;
CREATE TABLE IF NOT EXISTS `danh_muc` (
  `MaDanhMuc` int(10) NOT NULL AUTO_INCREMENT,
  `TenDanhMuc` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `DanhMucCha` int(10) NOT NULL,
  PRIMARY KEY (`MaDanhMuc`),
  KEY `FK_DANHMUCSANPHAM_DANHMUCSANPHAM` (`DanhMucCha`),
  CONSTRAINT `FK_DANHMUC_DANHMUC` FOREIGN KEY (`DanhMucCha`) REFERENCES `danh_muc` (`MaDanhMuc`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.danh_muc: ~14 rows (approximately)
DELETE FROM `danh_muc`;
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


# Dumping structure for table ustore.dienthoai
DROP TABLE IF EXISTS `dienthoai`;
CREATE TABLE IF NOT EXISTS `dienthoai` (
  `MaDienThoai` int(10) NOT NULL DEFAULT '0',
  `MaSanPham` int(10) DEFAULT NULL,
  `KieuDang` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ManHinh` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `BoNhoTrong` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Ram` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Mang` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TrongLuong` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `KichThuoc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `KieuChuong` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LoaiTheTichHop` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Camera` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Pin` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaDienThoai`),
  KEY `FK_DIENTHOAI_SANPHAM` (`MaSanPham`),
  CONSTRAINT `FK_DIENTHOAI_SANPHAM` FOREIGN KEY (`MaSanPham`) REFERENCES `san_pham` (`MaSanPham`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.dienthoai: ~0 rows (approximately)
DELETE FROM `dienthoai`;
/*!40000 ALTER TABLE `dienthoai` DISABLE KEYS */;
/*!40000 ALTER TABLE `dienthoai` ENABLE KEYS */;


# Dumping structure for table ustore.gianhang_danhmuc
DROP TABLE IF EXISTS `gianhang_danhmuc`;
CREATE TABLE IF NOT EXISTS `gianhang_danhmuc` (
  `MaGH_DM` int(10) NOT NULL DEFAULT '0',
  `MaGianHang` int(10) DEFAULT NULL,
  `MaDanhMuc` int(10) DEFAULT NULL,
  PRIMARY KEY (`MaGH_DM`),
  KEY `FK_GHDM_GIANHANG` (`MaGianHang`),
  KEY `FK_GHDM_DANHMUC` (`MaDanhMuc`),
  CONSTRAINT `FK_GHDM_GIANHANG` FOREIGN KEY (`MaGianHang`) REFERENCES `gian_hang` (`MaGianHang`),
  CONSTRAINT `FK_GHDM_DANHMUC` FOREIGN KEY (`MaDanhMuc`) REFERENCES `danh_muc` (`MaDanhMuc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.gianhang_danhmuc: ~0 rows (approximately)
DELETE FROM `gianhang_danhmuc`;
/*!40000 ALTER TABLE `gianhang_danhmuc` DISABLE KEYS */;
/*!40000 ALTER TABLE `gianhang_danhmuc` ENABLE KEYS */;


# Dumping structure for table ustore.gianhang_sanpham
DROP TABLE IF EXISTS `gianhang_sanpham`;
CREATE TABLE IF NOT EXISTS `gianhang_sanpham` (
  `MaGHSP` int(10) NOT NULL DEFAULT '0',
  `MaGianHang` int(10) DEFAULT NULL,
  `MaSanPham` int(10) DEFAULT NULL,
  `Gia` int(10) DEFAULT NULL,
  `BaoHanh` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ThongTinKhac` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaGHSP`),
  KEY `FK_GHSP_GIANHANG` (`MaGianHang`),
  KEY `FK_GHSP_SANPHAM` (`MaSanPham`),
  CONSTRAINT `FK_GHSP_GIANHANG` FOREIGN KEY (`MaGianHang`) REFERENCES `gian_hang` (`MaGianHang`),
  CONSTRAINT `FK_GHSP_SANPHAM` FOREIGN KEY (`MaSanPham`) REFERENCES `san_pham` (`MaSanPham`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.gianhang_sanpham: ~0 rows (approximately)
DELETE FROM `gianhang_sanpham`;
/*!40000 ALTER TABLE `gianhang_sanpham` DISABLE KEYS */;
/*!40000 ALTER TABLE `gianhang_sanpham` ENABLE KEYS */;


# Dumping structure for table ustore.gian_hang
DROP TABLE IF EXISTS `gian_hang`;
CREATE TABLE IF NOT EXISTS `gian_hang` (
  `MaGianHang` int(10) NOT NULL,
  `TenGianHang` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ThongTinGianHang` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT 'Tập tin xml: SoDT, Fax, Website, Diachi.',
  `CauHinhGianHang` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'Tập tin XML, cau truc web gan nhu gian hang VATGIA',
  `TinTuc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaThanhVien` int(10) NOT NULL,
  `MaTinhThanhPho` int(10) DEFAULT NULL,
  PRIMARY KEY (`MaGianHang`),
  KEY `FK_GIANHANG_THANHVIEN` (`MaThanhVien`),
  KEY `FK_GIANHANG_TINHTHANHPHO` (`MaTinhThanhPho`),
  CONSTRAINT `FK_GIANHANG_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`),
  CONSTRAINT `FK_GIANHANG_TINHTHANHPHO` FOREIGN KEY (`MaTinhThanhPho`) REFERENCES `tinh_thanhpho` (`MaTinhThanhPho`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.gian_hang: ~0 rows (approximately)
DELETE FROM `gian_hang`;
/*!40000 ALTER TABLE `gian_hang` DISABLE KEYS */;
/*!40000 ALTER TABLE `gian_hang` ENABLE KEYS */;


# Dumping structure for table ustore.hinh_thuc_van_chuyen
DROP TABLE IF EXISTS `hinh_thuc_van_chuyen`;
CREATE TABLE IF NOT EXISTS `hinh_thuc_van_chuyen` (
  `MaHinhThucVanChuyen` int(10) NOT NULL AUTO_INCREMENT,
  `TenHinhThucVanChuyen` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaHinhThucVanChuyen`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.hinh_thuc_van_chuyen: ~2 rows (approximately)
DELETE FROM `hinh_thuc_van_chuyen`;
/*!40000 ALTER TABLE `hinh_thuc_van_chuyen` DISABLE KEYS */;
INSERT INTO `hinh_thuc_van_chuyen` (`MaHinhThucVanChuyen`, `TenHinhThucVanChuyen`) VALUES
	(1, 'Hình thức 1'),
	(2, 'Hình thức 2');
/*!40000 ALTER TABLE `hinh_thuc_van_chuyen` ENABLE KEYS */;


# Dumping structure for table ustore.hoa_don
DROP TABLE IF EXISTS `hoa_don`;
CREATE TABLE IF NOT EXISTS `hoa_don` (
  `MaHoaDon` int(10) NOT NULL AUTO_INCREMENT,
  `MaThanhVien` int(10) NOT NULL,
  `NgayLapHoaDon` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `MaNguoiNhan` int(10) NOT NULL,
  `MaPhuongThucThanhToan` int(10) NOT NULL,
  `MaHinhThucVanChuyen` int(10) NOT NULL,
  `MaTinhTrang` int(10) NOT NULL,
  PRIMARY KEY (`MaHoaDon`),
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

# Dumping data for table ustore.hoa_don: ~0 rows (approximately)
DELETE FROM `hoa_don`;
/*!40000 ALTER TABLE `hoa_don` DISABLE KEYS */;
/*!40000 ALTER TABLE `hoa_don` ENABLE KEYS */;


# Dumping structure for table ustore.laptop
DROP TABLE IF EXISTS `laptop`;
CREATE TABLE IF NOT EXISTS `laptop` (
  `MaLaptop` int(10) NOT NULL DEFAULT '0',
  `MaSanPham` int(10) DEFAULT NULL,
  `CPU` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Memory` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `HDD` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `VGA` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Optical` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CardReader` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LAN` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Battery` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Weight` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaLaptop`),
  KEY `FK_LAPTOP_SANPHAM` (`MaSanPham`),
  CONSTRAINT `FK_LAPTOP_SANPHAM` FOREIGN KEY (`MaSanPham`) REFERENCES `san_pham` (`MaSanPham`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.laptop: ~0 rows (approximately)
DELETE FROM `laptop`;
/*!40000 ALTER TABLE `laptop` DISABLE KEYS */;
/*!40000 ALTER TABLE `laptop` ENABLE KEYS */;


# Dumping structure for table ustore.nguoi_nhan
DROP TABLE IF EXISTS `nguoi_nhan`;
CREATE TABLE IF NOT EXISTS `nguoi_nhan` (
  `MaNguoiNhan` int(10) NOT NULL AUTO_INCREMENT,
  `TenNguoiNhan` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `DiaChi` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DienThoai` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GhiChu` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaThanhVien` int(10) NOT NULL,
  PRIMARY KEY (`MaNguoiNhan`),
  KEY `FK_NGUOINHAN_THANHVIEN` (`MaThanhVien`),
  CONSTRAINT `FK_NGUOINHAN_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.nguoi_nhan: ~0 rows (approximately)
DELETE FROM `nguoi_nhan`;
/*!40000 ALTER TABLE `nguoi_nhan` DISABLE KEYS */;
/*!40000 ALTER TABLE `nguoi_nhan` ENABLE KEYS */;


# Dumping structure for table ustore.nhom_nguoi_dung
DROP TABLE IF EXISTS `nhom_nguoi_dung`;
CREATE TABLE IF NOT EXISTS `nhom_nguoi_dung` (
  `MaNhom` int(10) NOT NULL,
  `TenNhom` char(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaNhom`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.nhom_nguoi_dung: ~4 rows (approximately)
DELETE FROM `nhom_nguoi_dung`;
/*!40000 ALTER TABLE `nhom_nguoi_dung` DISABLE KEYS */;
INSERT INTO `nhom_nguoi_dung` (`MaNhom`, `TenNhom`) VALUES
	(1, 'Member Thường'),
	(2, 'Member Gian hàng'),
	(3, 'Mod'),
	(4, 'Admin');
/*!40000 ALTER TABLE `nhom_nguoi_dung` ENABLE KEYS */;


# Dumping structure for table ustore.phuong_thuc_thanh_toan
DROP TABLE IF EXISTS `phuong_thuc_thanh_toan`;
CREATE TABLE IF NOT EXISTS `phuong_thuc_thanh_toan` (
  `MaPhuongThucThanhToan` int(10) NOT NULL AUTO_INCREMENT,
  `TenPhuongThucThanhToan` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaPhuongThucThanhToan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.phuong_thuc_thanh_toan: ~0 rows (approximately)
DELETE FROM `phuong_thuc_thanh_toan`;
/*!40000 ALTER TABLE `phuong_thuc_thanh_toan` DISABLE KEYS */;
/*!40000 ALTER TABLE `phuong_thuc_thanh_toan` ENABLE KEYS */;


# Dumping structure for table ustore.san_pham
DROP TABLE IF EXISTS `san_pham`;
CREATE TABLE IF NOT EXISTS `san_pham` (
  `MaSanPham` int(10) NOT NULL AUTO_INCREMENT,
  `TenSanPham` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Gia` float DEFAULT NULL,
  `MoTaNgan` text COLLATE utf8_unicode_ci,
  `MoTaDai` text COLLATE utf8_unicode_ci,
  `HinhNho` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `HinhLon` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NhaSanXuat` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaDanhMuc` int(10) NOT NULL,
  PRIMARY KEY (`MaSanPham`),
  KEY `FK_SANPHAM_DANHMUCSANPHAM` (`MaDanhMuc`),
  CONSTRAINT `FK_SANPHAM_DANHMUCSANPHAM` FOREIGN KEY (`MaDanhMuc`) REFERENCES `danh_muc` (`MaDanhMuc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.san_pham: ~0 rows (approximately)
DELETE FROM `san_pham`;
/*!40000 ALTER TABLE `san_pham` DISABLE KEYS */;
/*!40000 ALTER TABLE `san_pham` ENABLE KEYS */;


# Dumping structure for table ustore.tai_khoan
DROP TABLE IF EXISTS `tai_khoan`;
CREATE TABLE IF NOT EXISTS `tai_khoan` (
  `MaTaiKhoan` int(10) NOT NULL AUTO_INCREMENT,
  `TenTruyCap` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `MatKhau` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `NgayKichHoat` date DEFAULT NULL,
  `MaNhomNguoiDung` int(10) NOT NULL,
  PRIMARY KEY (`MaTaiKhoan`),
  KEY `FK_TAIKHOAN_NHOMTAIKHOAN` (`MaNhomNguoiDung`),
  CONSTRAINT `FK_TAIKHOAN_NHOMTAIKHOAN` FOREIGN KEY (`MaNhomNguoiDung`) REFERENCES `nhom_nguoi_dung` (`MaNhom`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.tai_khoan: ~0 rows (approximately)
DELETE FROM `tai_khoan`;
/*!40000 ALTER TABLE `tai_khoan` DISABLE KEYS */;
/*!40000 ALTER TABLE `tai_khoan` ENABLE KEYS */;


# Dumping structure for table ustore.template
DROP TABLE IF EXISTS `template`;
CREATE TABLE IF NOT EXISTS `template` (
  `MaTemplate` int(10) NOT NULL AUTO_INCREMENT,
  `TenTemplate` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaTemplate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='một số template mẫu để chọn';

# Dumping data for table ustore.template: ~0 rows (approximately)
DELETE FROM `template`;
/*!40000 ALTER TABLE `template` DISABLE KEYS */;
/*!40000 ALTER TABLE `template` ENABLE KEYS */;


# Dumping structure for table ustore.tham_so
DROP TABLE IF EXISTS `tham_so`;
CREATE TABLE IF NOT EXISTS `tham_so` (
  `MaThamSo` int(10) NOT NULL AUTO_INCREMENT,
  `TenThamSo` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Kieu` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GiaTri` tinytext COLLATE utf8_unicode_ci,
  `TinhTrang` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`MaThamSo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.tham_so: ~2 rows (approximately)
DELETE FROM `tham_so`;
/*!40000 ALTER TABLE `tham_so` DISABLE KEYS */;
INSERT INTO `tham_so` (`MaThamSo`, `TenThamSo`, `Kieu`, `GiaTri`, `TinhTrang`) VALUES
	(1, 'SoCapDanhMuc', 'int', '2', 0),
	(2, 'SoSanPhamTrenTrang', 'int', '10', 0);
/*!40000 ALTER TABLE `tham_so` ENABLE KEYS */;


# Dumping structure for table ustore.thanh_vien
DROP TABLE IF EXISTS `thanh_vien`;
CREATE TABLE IF NOT EXISTS `thanh_vien` (
  `MaThanhVien` int(10) NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `DiaChi` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `NgaySinh` date DEFAULT NULL,
  `GioiTinh` set('Nam','Nữ') COLLATE utf8_unicode_ci DEFAULT NULL,
  `DienThoai` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TinhThanhPho` int(11) DEFAULT NULL,
  `MaTaiKhoan` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaThanhVien`),
  KEY `FK_THANHVIEN_TAIKHOAN` (`MaTaiKhoan`),
  KEY `FK_THANHVIEN_TINHTHANHPHO` (`TinhThanhPho`),
  CONSTRAINT `FK_THANHVIEN_TAIKHOAN` FOREIGN KEY (`MaTaiKhoan`) REFERENCES `tai_khoan` (`MaTaiKhoan`),
  CONSTRAINT `FK_THANHVIEN_TINHTHANHPHO` FOREIGN KEY (`TinhThanhPho`) REFERENCES `tinh_thanhpho` (`MaTinhThanhPho`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.thanh_vien: ~0 rows (approximately)
DELETE FROM `thanh_vien`;
/*!40000 ALTER TABLE `thanh_vien` DISABLE KEYS */;
/*!40000 ALTER TABLE `thanh_vien` ENABLE KEYS */;


# Dumping structure for table ustore.tien_te
DROP TABLE IF EXISTS `tien_te`;
CREATE TABLE IF NOT EXISTS `tien_te` (
  `MaTienTe` int(10) NOT NULL AUTO_INCREMENT,
  `TenTienTe` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaTienTe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.tien_te: ~0 rows (approximately)
DELETE FROM `tien_te`;
/*!40000 ALTER TABLE `tien_te` DISABLE KEYS */;
/*!40000 ALTER TABLE `tien_te` ENABLE KEYS */;


# Dumping structure for table ustore.tinh_thanhpho
DROP TABLE IF EXISTS `tinh_thanhpho`;
CREATE TABLE IF NOT EXISTS `tinh_thanhpho` (
  `MaTinhThanhPho` int(10) NOT NULL AUTO_INCREMENT,
  `TenTinhThanhPho` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaTinhThanhPho`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.tinh_thanhpho: ~2 rows (approximately)
DELETE FROM `tinh_thanhpho`;
/*!40000 ALTER TABLE `tinh_thanhpho` DISABLE KEYS */;
INSERT INTO `tinh_thanhpho` (`MaTinhThanhPho`, `TenTinhThanhPho`) VALUES
	(1, 'TP HCM'),
	(2, 'Hà Nội');
/*!40000 ALTER TABLE `tinh_thanhpho` ENABLE KEYS */;


# Dumping structure for table ustore.tinh_trang_hoa_don
DROP TABLE IF EXISTS `tinh_trang_hoa_don`;
CREATE TABLE IF NOT EXISTS `tinh_trang_hoa_don` (
  `MaTinhTrang` int(10) NOT NULL AUTO_INCREMENT,
  `TenTinhTrang` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`MaTinhTrang`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

# Dumping data for table ustore.tinh_trang_hoa_don: ~5 rows (approximately)
DELETE FROM `tinh_trang_hoa_don`;
/*!40000 ALTER TABLE `tinh_trang_hoa_don` DISABLE KEYS */;
INSERT INTO `tinh_trang_hoa_don` (`MaTinhTrang`, `TenTinhTrang`) VALUES
	(1, 'Mới đặt hàng'),
	(2, 'Hủy bởi quản trị'),
	(3, 'Chấp nhận bởi quản trị'),
	(4, 'Khách hàng đã thanh toán'),
	(5, 'Hàng đã được chuyển');
/*!40000 ALTER TABLE `tinh_trang_hoa_don` ENABLE KEYS */;


# Dumping structure for table ustore.tin_nhan
DROP TABLE IF EXISTS `tin_nhan`;
CREATE TABLE IF NOT EXISTS `tin_nhan` (
  `MaTinNhan` int(10) NOT NULL AUTO_INCREMENT,
  `NoiDung` text COLLATE utf8_unicode_ci,
  `NgayGui` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `MaThanhVien` int(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`MaTinNhan`),
  KEY `FK_TINNHAN_THANHVIEN` (`MaThanhVien`),
  CONSTRAINT `FK_TINNHAN_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.tin_nhan: ~0 rows (approximately)
DELETE FROM `tin_nhan`;
/*!40000 ALTER TABLE `tin_nhan` DISABLE KEYS */;
/*!40000 ALTER TABLE `tin_nhan` ENABLE KEYS */;


# Dumping structure for table ustore.tin_rao_vat
DROP TABLE IF EXISTS `tin_rao_vat`;
CREATE TABLE IF NOT EXISTS `tin_rao_vat` (
  `MaTinRaoVat` int(10) NOT NULL AUTO_INCREMENT,
  `TenTinRaoVat` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NoiDung` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NgayDang` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `NgayHetHan` datetime DEFAULT NULL,
  `MaThanhVien` int(10) NOT NULL,
  `MaDanhMuc` int(10) NOT NULL,
  PRIMARY KEY (`MaTinRaoVat`),
  KEY `FK_TINRAOVAT_THANHVIEN` (`MaThanhVien`),
  KEY `FK_TINRAOVAT_DANHMUCSANPHAM` (`MaDanhMuc`),
  CONSTRAINT `FK_TINRAOVAT_DANHMUCSANPHAM` FOREIGN KEY (`MaDanhMuc`) REFERENCES `danh_muc` (`MaDanhMuc`),
  CONSTRAINT `FK_TINRAOVAT_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Dumping data for table ustore.tin_rao_vat: ~0 rows (approximately)
DELETE FROM `tin_rao_vat`;
/*!40000 ALTER TABLE `tin_rao_vat` DISABLE KEYS */;
/*!40000 ALTER TABLE `tin_rao_vat` ENABLE KEYS */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
