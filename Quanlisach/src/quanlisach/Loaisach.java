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
public class Loaisach {

    private String maloai;
    private String tenloai;
    public Loaisach() {
    }

    public Loaisach(String maloai, String tenloai) {
        this.maloai = maloai;
        this.tenloai = tenloai;
    }
    public Loaisach(Loaisach ls)
    {
        maloai=ls.maloai;
        tenloai=ls.tenloai;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap ma loai: ");
        maloai=sc.nextLine();
        System.out.println("Moi ban nhap ten loai: ");
        tenloai=sc.nextLine();
    }
   @Override public String toString()
   {
       StringBuilder s=new StringBuilder();
       s.append("Ma loai la: ");
       s.append(this.maloai);
       s.append("Ten loai: ");
       s.append(this.tenloai);
       return s.toString();
   }

    public String getMaloai() {
        return maloai;
    }

    public String getTenloai() {
        return tenloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }
    
    
}
