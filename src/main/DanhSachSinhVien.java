package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}

	public void inDanhSachSv() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}

	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}

	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}

	public void lamRongDanhSinhVien() {
		this.danhSach.removeAll(danhSach);
	}

	public void kiemTraTonTai(String maSv) {
		SinhVien mssv=new SinhVien(maSv,"",0,0);
		if(danhSach.contains(mssv)) {
			System.out.println("Sinh vien ton tai");
			for(SinhVien sinhVien:danhSach) {
				if(sinhVien.equals(mssv)) {
					System.out.println(sinhVien);
				}
			}
			
		}
	}

	public boolean xoaSinhVien(String maSv) {
		SinhVien mssv = new SinhVien(maSv, "", 0, 0);
		danhSach.remove(mssv);
		return true;
	}

	// 8. Tim sinh vien dua tren ten duoc nhap tu ban phim
	public void timTnSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(ten) > 0) {
				System.out.println(sinhVien);
			}
		}
	}

	// 9. xuat ra danh sach sinh vien co diem tu cao den thap
	public void diemSinhVienTuCaoDenThap() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if(sv1.getDiemTb()>sv2.getDiemTb()) {
					return 1;
				}
				else if(sv1.getDiemTb()<sv2.getDiemTb()){
					return -1;
				}
				else {
					return 0;
				}
			}
			
		});
		
		
	}
}
