
package javaapplication15;



    class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    @Override
    public void tinhThanhTien() {
        if (loaiNha.equalsIgnoreCase("cao cap")) {
            thanhTien = dienTich * donGia;
        } else {
            thanhTien = dienTich * donGia * 0.9;
        }
    }
}

