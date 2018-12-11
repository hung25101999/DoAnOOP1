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
import java.util.*;

public class Nhanvien {
private String manhanvien;
private String tennhanvien;
private String ngaysinh; 
private String luong;
public Nhanvien(){}
public Nhanvien(String manhanvien, String tennhanvien, String ngaysinh, String luong)
{
    this.manhanvien = manhanvien;
    this.tennhanvien = tennhanvien; 
    this.ngaysinh = ngaysinh; 
    this.luong = luong;
}
public Nhanvien(Nhanvien nv)
{
    this.manhanvien = nv.manhanvien; 
    this.tennhanvien = nv.tennhanvien;
    this.ngaysinh = nv.ngaysinh; 
    this.luong = nv.luong; 
}
public void Nhap()
{
    Scanner sc = new Scanner (System.in);
    System.out.println ("Nhap ma nhan vien:");
    manhanvien = sc.nextLine();
    System.out.println ("Nhap ten nhan vien:"); 
    tennhanvien = sc.nextLine();
    System.out.println ("Nhap ngay sinh:"); 
    ngaysinh = sc.nextLine();
    System.out.println ("Nhap luong:");
    luong = sc.nextLine();  
}
@Override public String toString()
{
    StringBuilder  s = new  StringBuilder();
    s.append(manhanvien); s.append(tennhanvien); s.append(ngaysinh);s.append(luong);
    return s.toString();
}
public String getManhanvien()
{
    return manhanvien;
}
public String getTennhanvien()
{
    return tennhanvien;
}
public String getNgaysinh()
{
    return ngaysinh;
}
public String getLuong()
{
    return luong;
}
public void setManhanvien (String manhanvien)
{
    this.manhanvien = manhanvien;
}
public void setTennhanvien (String tennhanvien)
{
    this.tennhanvien = tennhanvien;
}
public void setNgaysinh (String ngaysinh)
{
    this.ngaysinh = ngaysinh;
}
public void setLuong(String luong)
{
    this.luong = luong;
}
}
