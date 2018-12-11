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
public class Thongtingiamgia {
 private String magiamgia;
 private String masach;
 private String dotgiamgia;
 private String batdau;
 private String ketthuc;
 private String maloaigiamgia;
    public Thongtingiamgia(){}
    public Thongtingiamgia(String magiamgia, String masach, String dotgiamgia, String batdau, String ketthuc, String maloaigiamgia)
    {
        this.magiamgia=magiamgia;
        this.masach=masach;
        this.dotgiamgia=dotgiamgia;
        this.batdau=batdau;
        this.ketthuc=ketthuc;
        this.maloaigiamgia=maloaigiamgia;
    }
    public Thongtingiamgia(Thongtingiamgia ttgg)
    {
        magiamgia=ttgg.magiamgia;
        masach=ttgg.masach;
        dotgiamgia=ttgg.dotgiamgia;
        batdau=ttgg.batdau;
        ketthuc=ttgg.ketthuc;
        maloaigiamgia=ttgg.maloaigiamgia;
    }
     public void Nhap()
    {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap vao ma giam gia: ");
            magiamgia=nhap.nextLine();
        System.out.println("Nhap vao ma sach: ");
            masach=nhap.nextLine();
        System.out.println("Nhap vao dot giam gia: ");
            dotgiamgia=nhap.nextLine();
        System.out.println("Nhap vao ngay bat dau: ");
            batdau=nhap.nextLine();
        System.out.println("Nhap vao ngay ket thuc: ");
            ketthuc=nhap.nextLine();
        System.out.println("Nhap vao ma loai giam gia: ");
            maloaigiamgia=nhap.nextLine();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Ma giam gia: ");
        s.append(this.magiamgia);
        s.append("\nMa sach: ");
        s.append(this.masach);
        s.append("\nDot giam gia: ");
        s.append(this.dotgiamgia);
        s.append("\nBat dau: ");
        s.append(this.batdau);
        s.append("\nKet thuc: ");
        s.append(this.ketthuc);
        s.append("\nMa loai giam gia: ");
        s.append(this.maloaigiamgia);
        return s.toString();
    }
    public String getMagiamgia()
    {
        return magiamgia;
    }
    public String getMasach()
    {
        return masach;
    }
    public String getDotgiamgia()
    {
        return dotgiamgia;
    }
    public String getBatdau()
    {
        return batdau;
    }
    public String getKetthuc()
    {
        return ketthuc;
    }
    public String getMaloaigiamgia()
    {
        return maloaigiamgia;
    }
    public void setMagiamgia(String magiamgia)
    {
        this.magiamgia=magiamgia;
    }
    public void setMasach(String masach)
    {
        this.masach=masach;
    }
    public void setDotgiamgia(String dotgiamgia)
    {
        this.dotgiamgia=dotgiamgia;
    }
    public void setBatdau(String batdau)
    {
        this.batdau=batdau;
    }
    public void setKetthuc(String ketthuc)
    {
        this.ketthuc=ketthuc;
    }
    public void setMaloaigiamgia(String maloaigiamgia)
    {
        this.maloaigiamgia=maloaigiamgia;
    }
}

