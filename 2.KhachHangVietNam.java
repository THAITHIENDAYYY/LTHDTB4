
package javaapplication16;

class KhachHangVietNam extends HoaDon {
    private String doiTuongKhachHang;
    private double soLuong;
    private double donGia;
    private double dinhMuc;
    private double thanhTien;

    public KhachHangVietNam(String maKhachHang, String hoTen, String ngayRaHoaDon, String doiTuongKhachHang, double soLuong, double donGia, double dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    @Override
    public void tinhThanhTien() {
        if (soLuong <= dinhMuc) {
            thanhTien = soLuong * donGia;
        } else {
            thanhTien = soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5;
        }
    }

    @Override
    public void inThongTin() {
        System.out.println("Ma khach hang: " + maKhachHang);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay ra hoa don: " + ngayRaHoaDon);
        System.out.println("Đoi tuong khach hang: " + doiTuongKhachHang);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println("Dinh muc: " + dinhMuc);
        System.out.println("Thanh tien: " + thanhTien);
    }
}
