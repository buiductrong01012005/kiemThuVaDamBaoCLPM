package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for Bai Tap Kiem Thu.
 */
public class DiemDauVaoLop6DongDuLieuAllUse {

    /*
     * Unit test for Bai tap Kiem Thu.
     */
    private DiemDauVaoLop6 diemDauVaoLop6 = new DiemDauVaoLop6();

    @Test
    public void testDiemDauVaoLop6() {
        final float toan = 11f;
        final float van = 11f;
        StringBuilder kq = new StringBuilder();
        assertEquals("Diem khong hop le", diemDauVaoLop6.kiemThuDongDuLieu(toan, van, kq));
        assertEquals("1-2T-3", kq.toString());
    }

    @Test
    public void testDiemDauVaoLop6_1() {
        final float toan = 10f;
        final float van = 10f;
        StringBuilder kq = new StringBuilder();
        assertEquals("Gioi", diemDauVaoLop6.kiemThuDongDuLieu(toan, van, kq));
        assertEquals("1-2F-4T-5", kq.toString());
    }

    @Test
    public void testDiemDauVaoLop6_2() {
        final float toan = 7f;
        final float van = 7f;
        StringBuilder kq = new StringBuilder();
        assertEquals("Kha", diemDauVaoLop6.kiemThuDongDuLieu(toan, van, kq));
        assertEquals("1-2F-4F-6T-7", kq.toString());
    }

    @Test
    public void testDiemDauVaoLop6_3() {
        final float toan = 5f;
        final float van = 5f;
        StringBuilder kq = new StringBuilder();
        assertEquals("Trung Binh", diemDauVaoLop6.kiemThuDongDuLieu(toan, van, kq));
        assertEquals("1-2F-4F-6F-8T-9", kq.toString());
    }

    @Test
    public void testDiemDauVaoLop6_4() {
        final float toan = 0f;
        final float van = 0f;
        StringBuilder kq = new StringBuilder();
        assertEquals("Yeu", diemDauVaoLop6.kiemThuDongDuLieu(toan, van, kq));
        assertEquals("1-2F-4F-6F-8F-10", kq.toString());
    }
}
