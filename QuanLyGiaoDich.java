
package javaapplication15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyGiaoDich {
   
    private static List<GiaoDich> danhSachGiaoDich = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----- Quan ly giao dich nha dat -----");
            System.out.println("1. Them giao dich dat");
            System.out.println("2. Them giao dich nha");
            System.out.println("3. Hien thi danh sach giao dich");
            System.out.println("4. Tinh tong so luong giao dich cho tung loai");
            System.out.println("5. Tinh trung binh thanh tien cua giao dich dat");
            System.out.println("6. Xuat ra cac giao dich cua thang 9 nam 2013");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chan cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số nguyên

            switch (choice) {
                case 1:
                    themGiaoDichDat(scanner);
                    break;
                case 2:
                    themGiaoDichNha(scanner);
                    break;
                case 3:
                    hienThiDanhSachGiaoDich();
                    break;
                case 4:
                    tinhTongSoLuongGiaoDich();
                    break;
                case 5:
                    tinhTrungBinhThanhTienDat();
                    break;
                case 6:
                    xuatGiaoDichThang92013();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 0);
    }

    private static void themGiaoDichDat(Scanner scanner) {
        System.out.println("--- Them giao dich dat ---");
        System.out.print("Nhap ma giao dich: ");
        String maGiaoDich = scanner.nextLine();
        System.out.print("Nhap ngay giao dich (ngay/thang/nam): ");
        String ngayGiaoDich = scanner.nextLine();
        System.out.print("Nhap đon gia: ");
        double donGia = scanner.nextDouble();
        System.out.print("Nhap dien tich: ");
        double dienTich = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số thực
        System.out.print("Nhap loai dat (A, B, C): ");
        String loaiDat = scanner.nextLine();

        GiaoDichDat giaoDichDat = new GiaoDichDat(maGiaoDich, ngayGiaoDich, donGia, dienTich, loaiDat);
        giaoDichDat.tinhThanhTien();
        danhSachGiaoDich.add(giaoDichDat);
        System.out.println("Da them giao dich nha thanh cong.");
    }
    private static void themGiaoDichNha(Scanner scanner) {
    System.out.println("--- Them giao dich nha ---");
    System.out.print("Nhap ma giao dich: ");
    String maGiaoDich = scanner.nextLine();
    System.out.print("Nhap ngay giao dich (ngay/thang/nam): ");
    String ngayGiaoDich = scanner.nextLine();
    System.out.print("Nhap don gia: ");
    double donGia = scanner.nextDouble();
    System.out.print("Nhap dien tich: ");
    double dienTich = scanner.nextDouble();
    scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số thực
    System.out.print("Nhap loai nha (cao cap, thuong): ");
    String loaiNha = scanner.nextLine();
    System.out.print("Nhap dia chi: ");
    String diaChi = scanner.nextLine();

    GiaoDichNha giaoDichNha = new GiaoDichNha(maGiaoDich, ngayGiaoDich, donGia, dienTich, loaiNha, diaChi);
    giaoDichNha.tinhThanhTien();
    danhSachGiaoDich.add(giaoDichNha);
    System.out.println("Da them giao dich nha thanh cong.");
}

private static void hienThiDanhSachGiaoDich() {
    System.out.println("--- Danh sach giao dich ---");
    for (GiaoDich giaoDich : danhSachGiaoDich) {
        giaoDich.inThongTin();
        System.out.println("--------------------------");
    }
}

private static void tinhTongSoLuongGiaoDich() {
    int countA = 0, countB = 0, countC = 0, countNha = 0;
    for (GiaoDich giaoDich : danhSachGiaoDich) {
        if (giaoDich instanceof GiaoDichDat) {
            String loaiDat = ((GiaoDichDat) giaoDich).loaiDat;
            switch (loaiDat) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
            }
        } else if (giaoDich instanceof GiaoDichNha) {
            countNha++;
        }
    }
    System.out.println("Tong so luong giao dich dat loai A: " + countA);
    System.out.println("Tong so luong giao dich dat loai B: " + countB);
    System.out.println("Tong so luong giao dich dat loai C: " + countC);
    System.out.println("Tong so luong giao dich nha: " + countNha);
}
private static void tinhTrungBinhThanhTienDat() {
    double tongThanhTienDat = 0;
    int countDat = 0;

    for (GiaoDich giaoDich : danhSachGiaoDich) {
        if (giaoDich instanceof GiaoDichDat) {
            tongThanhTienDat += giaoDich.thanhTien;
            countDat++;
        }
    }

    if (countDat > 0) {
        double trungBinhThanhTienDat = tongThanhTienDat / countDat;
        System.out.println("Trung binh thanh tien cua giao dich dat: " + trungBinhThanhTienDat);
    } else {
        System.out.println("Khong co giao dich dat trong danh sach.");
    }
}

private static void xuatGiaoDichThang92013() {
    System.out.println("--- Cac giao dich trong thang 9 nam 2013 ---");
    for (GiaoDich giaoDich : danhSachGiaoDich) {
        String[] ngayGiaoDich = giaoDich.ngayGiaoDich.split("/");
        if (ngayGiaoDich.length == 3 && ngayGiaoDich[19].equals("5") && ngayGiaoDich[22].equals("2013")) {
            giaoDich.inThongTin();
            System.out.println("--------------------------");
        }
    }
}
}
