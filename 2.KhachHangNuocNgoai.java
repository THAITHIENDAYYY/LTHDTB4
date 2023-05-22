
package javaapplication16;


class KhachHangNuocNgoai extends HoaDon {
    private String quocTich;
    private double soLuong;
    private double donGia;
    private double thanhTien;

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String ngayRaHoaDon, String quocTich, double soLuong, double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.quocTich = quocTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
      @Override
    public void tinhThanhTien() {
        thanhTien = soLuong * donGia;
    }

    @Override
    public void inThongTin() {
        System.out.println("Ma khach hang: " + maKhachHang);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay ra hoa đon: " + ngayRaHoaDon);
        System.out.println("Quoc tich: " + quocTich);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println("Thanh tien: " + thanhTien);
    }
}
