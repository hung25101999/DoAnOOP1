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
public class Nhaxuatban {
    private String manhaxuatban;
    private String tennhaxuatban;
    private String diachi;
    private String dienthoai;

    public Nhaxuatban() {
    }

    public Nhaxuatban(String manhaxuatban, String tennhaxuatban, String diachi, String dienthoai) {
        this.manhaxuatban = manhaxuatban;
        this.tennhaxuatban = tennhaxuatban;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
    }
    public void Nhaxuatban(Nhaxuatban nxb)
    {
        manhaxuatban=nxb.manhaxuatban;
        tennhaxuatban=nxb.tennhaxuatban;
        diachi=nxb.diachi;
        dienthoai=nxb.dienthoai;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap ma nha xuat ban: ");
        manhaxuatban=sc.nextLine();
        System.out.println("Moi ban nhap ten nha xuat ban: ");
        tennhaxuatban=sc.nextLine();
        System.out.println("Moi ban nhap dia chi: ");
        diachi=sc.nextLine();
        System.out.println("Moi ban nhap so dien thoai: ");
        dienthoai=sc.nextLine();
    }
    @Override public String toString()
    {
        StringBuilder s=new StringBuilder();
        s.append("Ma nha xuat ban la: ");
        s.append(this.manhaxuatban);
        s.append("Ten nha xuat ban la: ");
        s.append(this.tennhaxuatban);
        s.append("Dia chi: ");
        s.append(this.diachi);
        s.append("Dien thoai: ");
        s.append(this.dienthoai);
        return s.toString();
    }

    public String getManhaxuatban() {
        return manhaxuatban;
    }

    public String getTennhaxuatban() {
        return tennhaxuatban;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setManhaxuatban(String manhaxuatban) {
        this.manhaxuatban = manhaxuatban;
    }

    public void setTennhaxuatban(String tennhaxuatban) {
        this.tennhaxuatban = tennhaxuatban;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }
    
}
