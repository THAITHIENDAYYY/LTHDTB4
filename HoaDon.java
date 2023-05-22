
package javaapplication16;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class HoaDon {
    
    protected String maKhachHang;
    protected String hoTen;
    protected String ngayRaHoaDon;

    public HoaDon(String maKhachHang, String hoTen, String ngayRaHoaDon) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public abstract void tinhThanhTien();

    public abstract void inThongTin();
}
    
   
