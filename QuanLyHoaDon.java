
package javaapplication16;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHoaDon {
    private static List<HoaDon> danhSachHoaDon = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== Quan ly hoa don tien dien =====");
            System.out.println("1. Them hoa đon khach hang Viet Nam");
            System.out.println("2. Them hoa đon khach hang nuoc ngoai");
            System.out.println("3. Hien thi danh sach hoa don");
            System.out.println("4. Tinh tong so luong hoa don cho moi loai khach hang");
            System.out.println("5. Tinh trung binh thanh tien cua khach hang nuoc ngoai");
            System.out.println("6. Xuat hoa don trong thang 09 nam 2013");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số nguyên

            switch (choice) {
                case 1:
                    themHoaDonKhachHangVietNam(scanner);
                    break;
                case 2:
                    themHoaDonKhachHangNuocNgoai(scanner);
                    break;
                case 3:
                    hienThiDanhSachHoaDon();
                    break;
                case 4:
                    tinhTongSoLuongHoaDon();
                    break;
                case 5:
                    tinhTrungBinhThanhTienKhachHangNuocNgoai();
                    break;
                case 6:
                    xuatHoaDonThang92013();
                    break;
                case 0:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
                    break;
            }

        } while (choice != 0);
    }

    private static void themHoaDonKhachHangVietNam(Scanner scanner) {
        System.out.println("--- Thêm hoa don khach hang Viet Nam ---");
        System.out.print("Nhap ma khach hang: ");
        String maKhachHang = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap ngay ra hoa đon (ngay/thang/nam): ");
         String ngayRaHoaDon = scanner.nextLine();
        System.out.print("Nhap đoi tuong khach hang (sinh hoat/kinh doanh/san xuat): ");
        String doiTuongKhachHang = scanner.nextLine();
        System.out.print("Nhap so luong (so KW tieu thu): ");
        double soLuong = scanner.nextDouble();
        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();
        System.out.print("Nhap dinh muc: ");
        double dinhMuc = scanner.nextDouble();

        KhachHangVietNam khachHangVietNam = new KhachHangVietNam(maKhachHang, hoTen, ngayRaHoaDon, doiTuongKhachHang, soLuong, donGia, dinhMuc);
        khachHangVietNam.tinhThanhTien();
        danhSachHoaDon.add(khachHangVietNam);
        System.out.println("Da them hoa don khach hang Viet Nam thanh cong!");
    }

    private static void themHoaDonKhachHangNuocNgoai(Scanner scanner) {
        System.out.println("--- Them hoa don khach hang nuoc ngoai ---");
        System.out.print("Nhap ma khach hang: ");
        String maKhachHang = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap ngay ra hoa don (ngay/thang/nam): ");
        String ngayRaHoaDon = scanner.nextLine();
        System.out.print("Nhap quoc tich: ");
        String quocTich = scanner.nextLine();
        System.out.print("Nhap so luong: ");
        double soLuong = scanner.nextDouble();
        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();

        KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai(maKhachHang, hoTen, ngayRaHoaDon, quocTich, soLuong, donGia);
        khachHangNuocNgoai.tinhThanhTien();
        danhSachHoaDon.add(khachHangNuocNgoai);
        System.out.println("Da them hoa don khach hang nuoc ngoai thanh cong!");
    }

    private static void hienThiDanhSachHoaDon() {
        System.out.println("--- Danh sach hoa don ---");
        for (HoaDon hoaDon : danhSachHoaDon) {
            hoaDon.inThongTin();
            System.out.println("------------------------");
        }
    }

    private static void tinhTongSoLuongHoaDon() {
        int countVietNam = 0;
        int countNuocNgoai = 0;

        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangVietNam) {
                countVietNam++;
            } else if (hoaDon instanceof KhachHangNuocNgoai) {
                countNuocNgoai++;
            }
        }
          System.out.println("Tong so luong hoa don khach hang Viet Nam: " + countVietNam);
        System.out.println("Tong so luong hoa don khach hang nuoc ngoai: " + countNuocNgoai);
    }

    private static void tinhTrungBinhThanhTienKhachHangNuocNgoai() {
        double tongThanhTien = 0;
        int countKhachHangNuocNgoai = 0;

        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangNuocNgoai) {
                tongThanhTien += hoaDon.thanhTien;
                countKhachHangNuocNgoai++;
            }
        }

        if (countKhachHangNuocNgoai > 0) {
            double trungBinhThanhTien = tongThanhTien / countKhachHangNuocNgoai;
            System.out.println("Trung binh thanh tien cua khach hang nuoc ngoai: " + trungBinhThanhTien);
        } else {
            System.out.println("Khong co hoa don khach hang nuoc ngoai.");
        }
    }

    private static void xuatHoaDonThang92013() {
        System.out.println("--- Hoa don trong thang 09 nam 2013 ---");
        for (HoaDon hoaDon : danhSachHoaDon) {
            String ngayRaHoaDon = hoaDon.ngayRaHoaDon;
            if (ngayRaHoaDon.matches(".*09/2013.*")) {
                hoaDon.inThongTin();
                System.out.println("------------------------");
            }
        }
    }
}
