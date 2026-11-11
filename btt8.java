
// File: Sach.java
public class Sach {
    // Yêu cầu 1: Khai báo các thuộc tính của lớp Sach
    String maSach;
    String tieuDe;
    String tacGia;
    int namXuatBan;
    int soLuong;

    // Constructor không tham số
    public Sach() {
    }

    // Constructor đầy đủ tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    // Yêu cầu 2: Phương thức in thông tin chi tiết cuốn sách
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach 
            + " | Tiêu đề: " + tieuDe 
            + " | Tác giả: " + tacGia 
            + " | Năm XB: " + namXuatBan 
            + " | Số lượng: " + soLuong);
    }
}

// File: Test.java
import java.util.ArrayList; // Import thư viện ArrayList từ gói java.util

public class Test {
    public static void main(String[] args) {
        // Yêu cầu 3: Tạo đối tượng đơn lẻ từ lớp Sach và gọi phương thức hiển thị
        System.out.println("=== THÔNG TIN SÁCH ĐƠN LẺ (YÊU CẦU 3) ===");
        Sach sach1 = new Sach("S001", "Lập trình Hướng đối tượng Java", "Phạm Thị Trà My", 2026, 15);
        sach1.hienThiThongTin();

        // Yêu cầu 4: Tạo và quản lý danh sách Sach bằng ArrayList
        System.out.println("\n=== DANH SÁCH SÁCH TRONG THƯ VIỆN (YÊU CẦU 4) ===");
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        // Thêm các đối tượng Sach vào ArrayList
        danhSachSach.add(sach1);
        danhSachSach.add(new Sach("S002", "Cấu trúc dữ liệu và Giải thuật", "Nguyễn Tấn Thuận", 2025, 20));
        danhSachSach.add(new Sach("S003", "Cơ sở dữ liệu", "Võ Tấn Dũng", 2024, 10));

        // Duyệt danh sách và in thông tin từng cuốn sách
        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.print("Sách thứ " + (i + 1) + ": ");
            danhSachSach.get(i).hienThiThongTin();
        }
    }
}
