
package javaapplication15;


    class GiaoDichDat extends GiaoDich {
    String loaiDat;

    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    @Override
    public void tinhThanhTien() {
        if (loaiDat.equalsIgnoreCase("A")) {
            thanhTien = dienTich * donGia * 1.5;
        } else {
            thanhTien = dienTich * donGia;
        }
    }
}
