public class Book {
    private String maSach;
    private String tenSach;
    private String tacGia;

    public Book(String maSach, String tenSach, String tacGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
    }

    // Các hàm lấy giá trị (Getters)
    public String getMaSach() { return maSach; }
    public String getTenSach() { return tenSach; }
    public String getTacGia() { return tacGia; }

    public String toString() {
        return "Ma sach: " + maSach + " | Ten sach: " + tenSach + " | Tac gia: " + tacGia;
    }
}


