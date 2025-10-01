package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class DiemDauVaoLop6BienvsDTTest {
    /**
     * Diem dau vao lop 6 Test.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop6() {
        final float diemToan = 8f;
        final float diemVan = 8f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Gioi", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao lop 6 Test 2.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop62() {
        final float diemToan = 8f;
        final float diemVan = 0f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Yeu", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao lop 6 Test 3.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop63() {
        final float diemToan = 8f;
        final float diemVan = 1f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Yeu", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 4.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop64() {
        final float diemToan = 8f;
        final float diemVan = 9f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Gioi", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 5.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop65() {
        final float diemToan = 8f;
        final float diemVan = 10f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Gioi", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 6.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop66() {
        final float diemToan = 0f;
        final float diemVan = 8f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Yeu", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 7.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop67() {
        final float diemToan = 1f;
        final float diemVan = 8f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Yeu", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 8.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop68() {
        final float diemToan = 9f;
        final float diemVan = 8f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Gioi", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 9.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop69() {
        final float diemToan = 10f;
        final float diemVan = 8f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Gioi", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 10.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop610() {
        final float diemToan = 11f;
        final float diemVan = 11f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 11.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop611() {
        final float diemToan = 11f;
        final float diemVan = -1f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 12.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop612() {
        final float diemToan = 11f;
        final float diemVan = 10f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 13.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop613() {
        final float diemToan = 11f;
        final float diemVan = 7f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 14.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop614() {
        final float diemToan = 11f;
        final float diemVan = 5f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 15.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop615() {
        final float diemToan = 11f;
        final float diemVan = 4f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 16.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop616() {
        final float diemToan = -1f;
        final float diemVan = 11f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 17.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop617() {
        final float diemToan = -1f;
        final float diemVan = -1f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 18.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop618() {
        final float diemToan = -1f;
        final float diemVan = 10f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     *
     * Diem dau vao Lop 6 Test 19.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop619() {
        final float diemToan = -1f;
        final float diemVan = 7f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 20.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop620() {
        final float diemToan = -1f;
        final float diemVan = 5f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 21.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop621() {
        final float diemToan = -1f;
        final float diemVan = 4f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 22.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop622() {
        final float diemToan = 10f;
        final float diemVan = 11f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 23.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop623() {
        final float diemToan = 10f;
        final float diemVan = -1f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 24.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop624() {
        final float diemToan = 10f;
        final float diemVan = 10f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Gioi", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 25.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop625() {
        final float diemToan = 10f;
        final float diemVan = 7f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Kha", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 26.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop626() {
        final float diemToan = 10f;
        final float diemVan = 5f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Trung Binh", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 27.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop627() {
        final float diemToan = 10f;
        final float diemVan = 4f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Yeu", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 28.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop628() {
        final float diemToan = 7f;
        final float diemVan = 11f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 29.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop629() {
        final float diemToan = 7f;
        final float diemVan = -1f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 30.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop630() {
        final float diemToan = 7f;
        final float diemVan = 10f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Kha", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 31.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop631() {
        final float diemToan = 7f;
        final float diemVan = 7f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Kha", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 32.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop632() {
        final float diemToan = 7f;
        final float diemVan = 5f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Trung Binh", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 33.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop633() {
        final float diemToan = 7f;
        final float diemVan = 4f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Yeu", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 34.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop634() {
        final float diemToan = 5f;
        final float diemVan = 11f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 35.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop635() {
        final float diemToan = 5f;
        final float diemVan = -1f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 36.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop636() {
        final float diemToan = 5f;
        final float diemVan = 10f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Trung Binh", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 37.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop637() {
        final float diemToan = 5f;
        final float diemVan = 7f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Trung Binh", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 38.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop638() {
        final float diemToan = 5f;
        final float diemVan = 5f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Trung Binh", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 39.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop639() {
        final float diemToan = 5f;
        final float diemVan = 4f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Yeu", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 40.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop640() {
        final float diemToan = 4f;
        final float diemVan = 11f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 41.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop641() {
        final float diemToan = 4f;
        final float diemVan = -1f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Diem khong hop le", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 42.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop642() {
        final float diemToan = 4f;
        final float diemVan = 10f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Yeu", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 43.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop643() {
        final float diemToan = 4f;
        final float diemVan = 7f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Yeu", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 44.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop644() {
        final float diemToan = 4f;
        final float diemVan = 5f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Yeu", hocSinh.xepLoai());
    }

    /**
     * Diem dau vao Lop 6 Test 45.
     *
     * @return void
     */
    @Test
    void testDiemDauVaoLop645() {
        final float diemToan = 4f;
        final float diemVan = 4f;
        DiemDauVaoLop6 hocSinh = new DiemDauVaoLop6(diemToan, diemVan);
        assertEquals("Yeu", hocSinh.xepLoai());
    }
}
