package Test;

import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;
		String msv;
		do {
			System.out.println("Menu-------------------");
			System.out.println("Chon chuc nang");
			System.out.println("1. Them Sinh vien vao danh sach \n" +"2. In danh sach sinh vien ra man hinh \n"
					+ "3. Kiem tra danh sach co rong hay khong \n" + "4. Lay ra so luong sinh vien trong danh sach\n"
					+ "5. Lam rong danh sach sinh vien\n" + "6. Kiem tra sinh vien co ton tai hay khong \n"
					+ "7. Xoa mot sinh vien ra khoi danh sach dua vao ma sinh vien\n"
					+ "8. Tim kiem tat ca sinh vien dua tren tu duoc nhap tu bam phim\n"
					+ "9. Xuat ra danh sach sinh vien co diem tu cao den thap\n" + "0. Thoat");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon == 1) {
				System.out.println("Nhap Ma sinh vien");
				String maSv = sc.nextLine();
				System.out.println("Nhap Ho va ten");
				String hoVaTen = sc.nextLine();
				System.out.println("Nhap nam sinh");
				int namSinh = sc.nextInt();
				System.out.println("Nhap diem trung binh");
				double diemTb = sc.nextDouble();
				SinhVien sv = new SinhVien(maSv, hoVaTen, namSinh, diemTb);
				dssv.themSinhVien(sv);
			} else if (luaChon == 2) {
				dssv.inDanhSachSv();
			} else if (luaChon == 3) {
				System.out.println(dssv.kiemTraDanhSachRong());;
			} else if (luaChon == 4) {
				System.out.println("So luong sinh vien: "+dssv.laySoLuongSinhVien());
			} else if (luaChon == 5) {
				dssv.lamRongDanhSinhVien();
			} else if (luaChon == 6) {
				System.out.println("Nhap ma sinh vien muon kiem tra: ");
				msv=sc.nextLine();
				dssv.kiemTraTonTai(msv);
			} else if (luaChon == 7) {
				System.out.println("Nhap ma sinh vien muon xoa: ");
				msv=sc.nextLine();
				dssv.xoaSinhVien(msv);
			} else if (luaChon == 8) {
				System.out.println("Nhap ten sinh vien: ");
				String ten;
				ten=sc.nextLine();
				dssv.timTnSinhVien(ten);
			} else if (luaChon == 9) {
				dssv.diemSinhVienTuCaoDenThap(); 
				dssv.inDanhSachSv();
			}

		} while (luaChon != 0);

	}
}
