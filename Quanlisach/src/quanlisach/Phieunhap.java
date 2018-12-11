/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisach;

import java.util.Scanner;

/**
 *
 * @author HUNG
 */
public class Phieunhap {
    private String maphieunhap;
    private String masach;
    private String ngaynhap;
    private int soluong;
    private float dongia;
    private float tongtien;
    private String manhacungcap;
    private String manhanvien;
    
    public Phieunhap(){
    }
    

    public Phieunhap(String maphieunhap, String masach, String ngaynhap, int soluong, float dongia, float tongtien, String manhacungcap, String manhanvien) {
        this.maphieunhap = maphieunhap;
        this.masach = masach;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
        this.dongia = dongia;
        this.tongtien = tongtien;
        this.manhacungcap = manhacungcap;
        this.manhanvien = manhanvien;
    }
    
    public Phieunhap(Phieunhap phieu)
    {
        this.maphieunhap = phieu.maphieunhap;
        this.masach = phieu.masach;
        this.ngaynhap = phieu.ngaynhap;
        this.soluong = phieu.soluong;
        this.dongia = phieu.dongia;
        this.tongtien = phieu.tongtien;
        this.manhacungcap = phieu.manhacungcap;
        this.manhanvien = phieu.manhanvien;
        
    }

    public String getMaphieunhap() {
        return maphieunhap;
    }

    public void setMaphieunhap(String maphieunhap) {
        this.maphieunhap = maphieunhap;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public String getManhacungcap() {
        return manhacungcap;
    }

    public void setManhacungcap(String manhacungcap) {
        this.manhacungcap = manhacungcap;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }
    public void Nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao ma phieu nhap");
        this.maphieunhap = in.nextLine();
        System.out.println("Nhap vao ma sach");
        this.masach = in.nextLine();
        System.out.println("Nhap vao ngay nhap hang");
        this.ngaynhap = in.nextLine();
        System.out.println("Nhap vao so luong nhap");
        this.soluong = in.nextInt();
        System.out.println("Nhap vao don gia ");
        this.dongia = in.nextFloat();
        System.out.println("Nhap vao ma nha cung cap");
        this.manhacungcap = in.nextLine();
        System.out.println("Nhap vao ma nhan vien ");
        this.manhanvien = in.nextLine();
    }
    @Override public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("ma phieu nhap ");
        s.append(this.maphieunhap);
        s.append("\nma sach ");
        s.append(this.masach);
        s.append("\nngay nhap hang ");
        s.append(this.ngaynhap);
        s.append("\nso luong nhap ");
        s.append(this.soluong);
        s.append("\ndon gia ");
        s.append(this.dongia);
        s.append("\nma nha cung cap ");
        s.append(this.manhacungcap);
        s.append("\nma nhan vien ");
        s.append(this.manhanvien);
        
        return s.toString();
        
    }
}
