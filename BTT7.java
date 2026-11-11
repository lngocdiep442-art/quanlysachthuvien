
public class Sach {
    String maSach;
    String tieuDe;
    String tacGia;
    int namXuatBan;
    int soLuong;

    public Sach() {
    }

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

public class Test {
    public static void main(String[] args)
        System.out.printl;("Thông tin sách"):
        Sach sach1 = new Sach("S001", "Lập trình Hướng đối tượng Java", "Phạm Thị Trà My", 2026, 15);
        sach1.hienThiThongTin();

        System.out.println("\n=== DANH SÁCH SÁCH TRONG THƯ VIỆN (YÊU CẦU 4) ===");
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        danhSachSach.add(sach1);
        danhSachSach.add(new Sach("S002", "Cấu trúc dữ liệu và Giải thuật", "Nguyễn Tấn Thuận", 2025, 20));
        danhSachSach.add(new Sach("S003", "Cơ sở dữ liệu", "Võ Tấn Dũng", 2024, 10));

        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.print("Sách thứ " + (i + 1) + ": ");
            danhSachSach.get(i).hienThiThongTin();
        }
    }
}

}