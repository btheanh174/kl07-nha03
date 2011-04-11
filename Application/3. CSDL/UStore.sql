# --------------------------------------------------------
# Host:                         127.0.0.1
# Server version:               5.5.9
# Server OS:                    Win32
# HeidiSQL version:             6.0.0.3603
# Date/time:                    2011-04-11 22:43:41
# --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

# Dumping database structure for ustore
DROP DATABASE IF EXISTS `ustore`;
CREATE DATABASE IF NOT EXISTS `ustore` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `ustore`;


# Dumping structure for table ustore.bien_toan_cuc
DROP TABLE IF EXISTS `bien_toan_cuc`;
CREATE TABLE IF NOT EXISTS `bien_toan_cuc` (
  `SoDanhMucPhanCap` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.


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

# Data exporting was unselected.


# Dumping structure for table ustore.danh_muc_san_pham
DROP TABLE IF EXISTS `danh_muc_san_pham`;
CREATE TABLE IF NOT EXISTS `danh_muc_san_pham` (
  `MaDanhMuc` int(10) NOT NULL,
  `TenDanhMuc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaDanhMucCha` int(10) DEFAULT NULL,
  PRIMARY KEY (`MaDanhMuc`),
  KEY `FK_DANHMUCSANPHAM_DANHMUCSANPHAM` (`MaDanhMucCha`),
  CONSTRAINT `FK_DANHMUCSANPHAM_DANHMUCSANPHAM` FOREIGN KEY (`MaDanhMucCha`) REFERENCES `danh_muc_san_pham` (`MaDanhMuc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.


# Dumping structure for table ustore.gian_hang
DROP TABLE IF EXISTS `gian_hang`;
CREATE TABLE IF NOT EXISTS `gian_hang` (
  `MaGianHang` int(10) NOT NULL,
  `TenGianHang` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `FileThongTinGianHang` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT 'SoDT, Fax, Website, Diachi.',
  `FileCauHinhGianHang` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'File XML, cau truc web gan nhu gian hang VATGIA',
  `FileDanhMucSanPham` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'File XML, trong do co thong tin san pham la cac file XML',
  `FileTinTuc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaDanhMuc` int(10) NOT NULL,
  `MaThanhVien` int(10) NOT NULL,
  PRIMARY KEY (`MaGianHang`),
  KEY `FK_GIANHANG_DANHMUCSANPHAM` (`MaDanhMuc`),
  KEY `FK_GIANHANG_THANHVIEN` (`MaThanhVien`),
  CONSTRAINT `FK_GIANHANG_DANHMUCSANPHAM` FOREIGN KEY (`MaDanhMuc`) REFERENCES `danh_muc_san_pham` (`MaDanhMuc`),
  CONSTRAINT `FK_GIANHANG_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.


# Dumping structure for table ustore.hinh_thuc_van_chuyen
DROP TABLE IF EXISTS `hinh_thuc_van_chuyen`;
CREATE TABLE IF NOT EXISTS `hinh_thuc_van_chuyen` (
  `MaHinhThucVanChuyen` int(10) NOT NULL,
  `TenHinhThucVanChuyen` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaHinhThucVanChuyen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.


# Dumping structure for table ustore.hoa_don
DROP TABLE IF EXISTS `hoa_don`;
CREATE TABLE IF NOT EXISTS `hoa_don` (
  `MaHoaDon` int(10) NOT NULL DEFAULT '0',
  `MaThanhVienDatHoaDon` int(10) DEFAULT NULL,
  `NgayLapHoaDon` datetime DEFAULT NULL,
  `ThongTinNguoiDat` int(10) DEFAULT NULL,
  `ThongTinNguoiNhan` int(10) DEFAULT NULL,
  `MaPhuongThucThanhToan` int(10) DEFAULT NULL,
  `MaHinhThucVanChuyen` int(10) DEFAULT NULL,
  `TinhTrangHoaDon` int(10) DEFAULT NULL,
  PRIMARY KEY (`MaHoaDon`),
  KEY `FK_HOADON_THANHVIEN` (`MaThanhVienDatHoaDon`),
  KEY `FK_HOADON_PHUONGTHUCTHANHTOAN` (`MaPhuongThucThanhToan`),
  KEY `FK_HOADON_HINHTHUCVANCHUYEN` (`MaHinhThucVanChuyen`),
  KEY `FK_HOADON_TINHTRANGHOADON` (`TinhTrangHoaDon`),
  KEY `FK_HOADON_NGUOINHAN` (`ThongTinNguoiNhan`),
  CONSTRAINT `FK_HOADON_HINHTHUCVANCHUYEN` FOREIGN KEY (`MaHinhThucVanChuyen`) REFERENCES `hinh_thuc_van_chuyen` (`MaHinhThucVanChuyen`),
  CONSTRAINT `FK_HOADON_NGUOINHAN` FOREIGN KEY (`ThongTinNguoiNhan`) REFERENCES `nguoi_nhan` (`MaNguoiNhan`),
  CONSTRAINT `FK_HOADON_PHUONGTHUCTHANHTOAN` FOREIGN KEY (`MaPhuongThucThanhToan`) REFERENCES `phuong_thuc_thanh_toan` (`MaPhuongThucThanhToan`),
  CONSTRAINT `FK_HOADON_THANHVIEN` FOREIGN KEY (`MaThanhVienDatHoaDon`) REFERENCES `thanh_vien` (`MaThanhVien`),
  CONSTRAINT `FK_HOADON_TINHTRANGHOADON` FOREIGN KEY (`TinhTrangHoaDon`) REFERENCES `tinh_trang_hoa_don` (`MaTinhTrang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.


# Dumping structure for table ustore.loai_thanh_vien
DROP TABLE IF EXISTS `loai_thanh_vien`;
CREATE TABLE IF NOT EXISTS `loai_thanh_vien` (
  `MaLoaiNhanVien` int(10) NOT NULL,
  `TenLoai` char(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaLoaiNhanVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.


# Dumping structure for table ustore.nguoi_nhan
DROP TABLE IF EXISTS `nguoi_nhan`;
CREATE TABLE IF NOT EXISTS `nguoi_nhan` (
  `MaNguoiNhan` int(10) NOT NULL,
  `TenNguoiNhan` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GioiTinh` enum('Nam','Nữ') COLLATE utf8_unicode_ci DEFAULT NULL,
  `DiaChi` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SoDienThoai` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DiDong` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Fax` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GhiChu` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaThanhVien` int(10) NOT NULL,
  PRIMARY KEY (`MaNguoiNhan`),
  KEY `FK_NGUOINHAN_THANHVIEN` (`MaThanhVien`),
  CONSTRAINT `FK_NGUOINHAN_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.


# Dumping structure for table ustore.phuong_thuc_thanh_toan
DROP TABLE IF EXISTS `phuong_thuc_thanh_toan`;
CREATE TABLE IF NOT EXISTS `phuong_thuc_thanh_toan` (
  `MaPhuongThucThanhToan` int(10) NOT NULL,
  `TenPhuongThucThanhToan` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaPhuongThucThanhToan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.


# Dumping structure for table ustore.san_pham
DROP TABLE IF EXISTS `san_pham`;
CREATE TABLE IF NOT EXISTS `san_pham` (
  `MaSanPham` int(10) NOT NULL,
  `TenSanPham` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MaDanhMucSanPham` int(11) NOT NULL,
  `FileDanhSachGianHang` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaSanPham`),
  KEY `FK_SANPHAM_DANHMUCSANPHAM` (`MaDanhMucSanPham`),
  CONSTRAINT `FK_SANPHAM_DANHMUCSANPHAM` FOREIGN KEY (`MaDanhMucSanPham`) REFERENCES `danh_muc_san_pham` (`MaDanhMuc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.


# Dumping structure for table ustore.tai_khoan
DROP TABLE IF EXISTS `tai_khoan`;
CREATE TABLE IF NOT EXISTS `tai_khoan` (
  `MaTaiKhoan` int(10) NOT NULL,
  `Username` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Password` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Email` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NgayKichHoat` date DEFAULT NULL,
  `MaThanhVien` int(10) NOT NULL,
  PRIMARY KEY (`MaTaiKhoan`),
  KEY `FK_TAIKHOAN_THANHVIEN` (`MaThanhVien`),
  CONSTRAINT `FK_TAIKHOAN_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.


# Dumping structure for table ustore.thanh_vien
DROP TABLE IF EXISTS `thanh_vien`;
CREATE TABLE IF NOT EXISTS `thanh_vien` (
  `MaThanhVien` int(10) NOT NULL,
  `HoTen` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DienThoai` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DiaChi` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `LoaiThanhVien` int(10) NOT NULL,
  PRIMARY KEY (`MaThanhVien`),
  KEY `FK_THANHVIEN_LOAITHANHVIEN` (`LoaiThanhVien`),
  CONSTRAINT `FK_THANHVIEN_LOAITHANHVIEN` FOREIGN KEY (`LoaiThanhVien`) REFERENCES `loai_thanh_vien` (`MaLoaiNhanVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.


# Dumping structure for table ustore.tinh_trang_hoa_don
DROP TABLE IF EXISTS `tinh_trang_hoa_don`;
CREATE TABLE IF NOT EXISTS `tinh_trang_hoa_don` (
  `MaTinhTrang` int(10) NOT NULL,
  `TenTinhTrang` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`MaTinhTrang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.


# Dumping structure for table ustore.tin_rao_vat
DROP TABLE IF EXISTS `tin_rao_vat`;
CREATE TABLE IF NOT EXISTS `tin_rao_vat` (
  `MaTinRaoVat` int(10) NOT NULL,
  `TenTinRaoVat` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NoiDung` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NgayDang` datetime DEFAULT NULL,
  `NgayHetHan` datetime DEFAULT NULL,
  `MaThanhVien` int(10) NOT NULL,
  `MaDanhMuc` int(10) NOT NULL,
  PRIMARY KEY (`MaTinRaoVat`),
  KEY `FK_TINRAOVAT_THANHVIEN` (`MaThanhVien`),
  KEY `FK_TINRAOVAT_DANHMUCSANPHAM` (`MaDanhMuc`),
  CONSTRAINT `FK_TINRAOVAT_DANHMUCSANPHAM` FOREIGN KEY (`MaDanhMuc`) REFERENCES `danh_muc_san_pham` (`MaDanhMuc`),
  CONSTRAINT `FK_TINRAOVAT_THANHVIEN` FOREIGN KEY (`MaThanhVien`) REFERENCES `thanh_vien` (`MaThanhVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

# Data exporting was unselected.
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
