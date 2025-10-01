package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class DienDauVaoLop6NhanhC2Test {

    private DiemDauVaoLop6 diemDauVaoLop6 = new DiemDauVaoLop6();

    @Test
    public void testDiemDauVaoLop6() {
        final float toan = -1f;
        final float van = 0f;
        StringBuilder kq = new StringBuilder();
        assertEquals("Diem khong hop le", diemDauVaoLop6.kiemThuHopTrangC2(toan, van, kq));
        assertEquals("123", kq.toString());
    }

    @Test
    public void testDiemDauVaoLop6_1() {
        final float toan = 10f;
        final float van = 9f;
        StringBuilder kq = new StringBuilder();
        assertEquals("Gioi", diemDauVaoLop6.kiemThuHopTrangC2(toan, van, kq));
        assertEquals("1245", kq.toString());
    }

    @Test
    public void testDiemDauVaoLop6_2() {
        final float toan = 7f;
        final float van = 7f;
        StringBuilder kq = new StringBuilder();
        assertEquals("Kha", diemDauVaoLop6.kiemThuHopTrangC2(toan, van, kq));
        assertEquals("12467", kq.toString());
    }

    @Test
    public void testDiemDauVaoLop6_3() {
        final float toan = 5f;
        final float van = 5f;
        StringBuilder kq = new StringBuilder();
        assertEquals("Trung Binh", diemDauVaoLop6.kiemThuHopTrangC2(toan, van, kq));
        assertEquals("124689", kq.toString());
    }

    @Test
    public void testDiemDauVaoLop6_4() {
        final float toan = 0f;
        final float van = 0f;
        StringBuilder kq = new StringBuilder();
        assertEquals("Yeu", diemDauVaoLop6.kiemThuHopTrangC2(toan, van, kq));
        assertEquals("1246810", kq.toString());
    }

}
