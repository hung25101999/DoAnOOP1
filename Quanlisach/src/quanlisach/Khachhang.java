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
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*; 
public class Khachhang {
private String makhachhang;
private String hokhachhang;
private  String tenkhachhang;
private String diachi; 
private String dienthoai; 
public Khachhang(){}
public Khachhang(String makhachhang, String hokhachhang, String tenkhachhang, String diachi, String dienthoai)
{
    this.makhachhang = makhachhang;
    this.hokhachhang = hokhachhang; 
    this.tenkhachhang = tenkhachhang; 
    this.diachi = diachi; 
    this.dienthoai = dienthoai; 
} 
public Khachhang (Khachhang kh)
{
    this.makhachhang = kh.makhachhang; 
    this.hokhachhang = kh.hokhachhang; 
    this.tenkhachhang = kh.tenkhachhang; 
    this.diachi = kh.diachi; 
    this.dienthoai = kh.dienthoai;   
}  
public void Nhap()
{
    Scanner sc = new Scanner (System.in);
    System.out.println ("Nhap ma khach hang:"); 
    makhachhang = sc.nextLine(); 
    System.out.println ("Nhap ho khach hang:"); 
    hokhachhang = sc.nextLine();
    System.out.println ("Nhap ten khach hang:"); 
    tenkhachhang = sc.nextLine(); 
    System.out.println ("Nhap dia chi:");
    diachi = sc.nextLine(); 
    System.out.println ("Nhap dien thoai:"); 
    dienthoai = sc.nextLine(); 
}
@Override public String toString()
{
    StringBuilder  s = new  StringBuilder();
    
    s.append(makhachhang); 
    s.append(" ");
    s.append(hokhachhang);
    s.append(" ");
    s.append(tenkhachhang); 
    s.append(" ");
    s.append(diachi);
    s.append(" ");
    s.append(dienthoai);
    return s.toString();
}
public void ghifile() throws FileNotFoundException, IOException
        {
            DataOutputStream outstream=new DataOutputStream(new FileOutputStream("khachhang.txt",Boolean.TRUE));
            outstream.writeUTF(makhachhang);
            outstream.writeUTF(hokhachhang);
            outstream.writeUTF(tenkhachhang);
            outstream.writeUTF(diachi);
            outstream.writeUTF(dienthoai);
            outstream.close();
        }
public String getMakhachhang()
{
    return makhachhang;
} 
public String getHokhachhang()
{
    return hokhachhang; 
}
public String getTenkhachhang()
{
    return tenkhachhang; 
}
public String getDiachi()
{
    return diachi; 
}
public String getDienthoai()
{
    return dienthoai;
}
public void setMakhachhang(String makhachhang)
{
    this.makhachhang = makhachhang;
}
public void setHokhachhang(String hokhachhang)
{
    this.hokhachhang = hokhachhang;
}
public void setTenkhachhang(String tenkhachhang)
{
    this.tenkhachhang = tenkhachhang; 
}
public void setDiachi (String diachi)
{
    this.diachi = diachi;
}
public void setDienthoai (String dienthoai)
{
    this.dienthoai = dienthoai;
}
}

