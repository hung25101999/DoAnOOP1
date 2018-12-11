/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisach;

/**
 *
 * @author HUNG
 */
import java.util.Scanner;

public class Hoadon {
private String mahoadon; 
private String makhachhang; 
private String manhanvien; 
private String ngaylaphoadon; 
private Float tongtien;
public Hoadon(){}
public Hoadon(String mahoadon,String makhachhang,String manhanvien,String ngaylaphoadon,Float tongtien)
{
    this.mahoadon = mahoadon; 
    this.makhachhang = makhachhang;
    this.manhanvien = manhanvien; 
    this.ngaylaphoadon = ngaylaphoadon;
    this.tongtien = tongtien;
}
public Hoadon(Hoadon hd)
{
    this.mahoadon = hd.mahoadon; 
    this.makhachhang = hd.makhachhang;
    this.manhanvien = hd.manhanvien; 
    this.ngaylaphoadon = hd.ngaylaphoadon;
    this.tongtien = hd.tongtien;
}
public void Nhap()
{
    Scanner sc = new Scanner (System.in);
    System.out.println("Nhap ma hoa don");
    mahoadon = sc.nextLine();
    System.out.println("Nhap ma khach hang:");
    makhachhang = sc.nextLine();
    System.out.println("Nhap ma nhan vien:");
    manhanvien = sc.nextLine();
    System.out.println("Nhap ngay lap hoa don:");
    ngaylaphoadon = sc.nextLine();
}
@Override public String toString()
{
    StringBuilder  s = new  StringBuilder();
    s.append(mahoadon); s.append(makhachhang); s.append(manhanvien); s.append(ngaylaphoadon); s.append(tongtien);
    return s.toString();
}
public String getMahoadon()
{
    return mahoadon;
}
public String getMakhachhang()
{
    return makhachhang;
}
public String getManhanvien()
{
    return manhanvien;
}
public String getNgaylaphoadon()
{
    return ngaylaphoadon;
}
public Float getTongtien()
{
    return tongtien;
}
public void setMahoadon(String mahoadon)
{
    this.mahoadon = mahoadon ;
}
public void setMakhachhang (String makhachhang)
{
    this.makhachhang = makhachhang ;
}
public void setManhanvien(String manhanvien)
{
    this.manhanvien = manhanvien ;
}
public void setNgaysinh(String ngaysinh)
{
    this.ngaylaphoadon =  ngaylaphoadon ;
}
public void setTongtien(Float tongtien)
{
    this.tongtien = tongtien ;
}
}
