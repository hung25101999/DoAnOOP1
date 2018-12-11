
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
public class Chitiethoadon {
    private String mahoadon;
    private String masach;
    private int soluong;
    private float dongia;
    private float thanhtien;
    
    public Chitiethoadon(){
    }
    
    public Chitiethoadon(String mahoadon, String masach, int soluong, float dongia, float thanhtien) {
        this.mahoadon = mahoadon;
        this.masach = masach;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
    }
    public Chitiethoadon(Chitiethoadon cthd){
        this.mahoadon = cthd.mahoadon;
        this.masach = cthd.masach;
        this.soluong = cthd.soluong;
        this.dongia = cthd.dongia;
        this.thanhtien = cthd.thanhtien;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
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

    public float getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }
    
    public void Nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao ma hoa don ");
        this.mahoadon = in.nextLine();
        System.out.println("Nhap vao ma sach ");
        this.masach = in.nextLine();
        System.out.println("Nhap vao so luong");
        this.soluong = in.nextInt();
        System.out.println("Nhap vao don gia ");
        this.dongia = in.nextInt();
        
    }
   @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("\nma hoa don ");
        s.append(this.mahoadon);
        s.append("\nma sach ");
        s.append(this.masach);
        s.append("\nso luong ");
        s.append(this.soluong);
        s.append("\ndon gia ");
        s.append(this.dongia);
        return s.toString();
    }
    
    
}
