import java.util.Scanner;

class Sach {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tenTacGia, int namXuatBan, double donGia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.namXuatBan = namXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public double tinhThanhTien() {
        return donGia * soLuong;
    }

    public double tinhPhiVanChuyen() {
        return tinhThanhTien() * 0.05;
    }

    public double tinhTongTienNhap() {
        return tinhThanhTien() + tinhPhiVanChuyen();
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tenTacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia + " VND");
        System.out.println("So luong: " + soLuong);
        System.out.println("------------------------------------------");
        System.out.println("Thanh tien: " + tinhThanhTien() + " VND");
        System.out.println("Phi van chuyen (5%): " + tinhPhiVanChuyen() + " VND");
        System.out.println("Tong tien nhap kho12: " + tinhTongTienNhap() + " VND");
    }
}

// Lớp chứa hàm main phải TRÙNG KHỚP 100% với tên file 'quanlysachthuvien.java'
public class quanlysachthuvien {
    public static void main(String[] args) { // PHẢI ĐÚNG CHUẨN CÚ PHÁP NÀY
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== NHAP THONG TIN SACH ===");
        System.out.print("Nhap ma sach: ");
        String maSach = scanner.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhap ten tac gia: ");
        String tenTacGia = scanner.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = scanner.nextInt();

        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = scanner.nextInt();

        Sach sach = new Sach(maSach, tenSach, tenTacGia, namXuatBan, donGia, soLuong);

        System.out.println("\n=== KET QUA TINHc===");
        sach.hienThiThongTin();

        scanner.close();
    }
}
