package com.example;

/**
 * Hello world!
 */
public final class DiemDauVaoLop6 {
    /**
     * Diem thap nhat.
     */
    public static final float DIEM_MIN = 0; // HANG SO DIEM MIN.
    /**
     * Diem cao nhat.
     */
    public static final float DIEM_MAX = 10; // HANG SO DIEM MAX.
    /**
     * Diem gioi.
     */
    public static final float DIEM_GIOI = 8; // HANG SO DIEM GIOI.
    /**
     * Diem kha.
     */
    public static final float DIEM_KHA = 6.5f; // HANG SO DIEM KHA.
    /**
     * Diem trung binh.
     */
    public static final float DIEM_TRUNG_BINH = 5; // HANG SO DIEM TRUNG BINH.
    private float toan; // DIEM TOAN
    private float van; // DIEM VAN

    /**
     * Constructor mac dinh.
     */
    public DiemDauVaoLop6() {
        this.toan = 0;
        this.van = 0;
    }

    /**
     * Constructor.
     *
     * @param toan diem toan
     * @param van  diem van
     */
    public DiemDauVaoLop6(float toan, float van) {
        this.toan = toan;
        this.van = van;
    }

    /**
     * Get diem toan.
     *
     * @return diem toan
     */
    public float getToan() {
        return this.toan;
    }

    /**
     * Get diem van.
     *
     * @return diem van
     */
    public float getVan() {
        return this.van;
    }

    /**
     * Set diem toan.
     *
     * @param toan diem toan
     */
    public void setToan(float toan) {
        this.toan = toan;
    }

    /**
     * Set diem van.
     *
     * @param van diem van
     */
    public void setVan(float van) {
        this.van = van;
    }

    /**
     * Xep loai hoc luc cua hoc sinh.
     * Gioi: Toan >= 8 va Van >= 8.
     * Kha: Toan >= 6.5 va Van >= 6.5.
     * Trung Binh: Toan >= 5 va Van >= 5.
     * Yeu: con lai.
     *
     * @return xep loai hoc luc
     */
    public String xepLoai() {
        if (toan < DIEM_MIN || toan > DIEM_MAX || van < DIEM_MIN || van > DIEM_MAX) {
            return "Diem khong hop le";
        } else if (toan >= DIEM_GIOI && van >= DIEM_GIOI) {
            return "Gioi";
        } else if (toan >= DIEM_KHA && van >= DIEM_KHA) {
            return "Kha";
        } else if (toan >= DIEM_TRUNG_BINH && van >= DIEM_TRUNG_BINH) {
            return "Trung Binh";
        } else {
            return "Yeu";
        }
    }

}
