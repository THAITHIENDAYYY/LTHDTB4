
package javaapplication15;

 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GiaoDich {
    protected String maGiaoDich;
    protected String ngayGiaoDich;
    protected double donGia;
    protected double dienTich;
    protected double thanhTien;

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.thanhTien = 0;
    }

    public void tinhThanhTien() {
        // Được ghi đè bởi lớp con
    }

    public void inThongTin() {
        System.out.println("Ma giao dich: " + maGiaoDich);
        System.out.println("Ngay giao dich: " + ngayGiaoDich);
        System.out.println("Đon gia: " + donGia);
        System.out.println("Dien tich: " + dienTich);
        System.out.println("Thanh tien: " + thanhTien);
    }
}
   

