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
import java.util.Arrays;
import java.util.Scanner;

public class Danhsachnhanvien {
    private Nhanvien [] dsnv = new Nhanvien[1];
    private int n; 
    private int i;
    public Danhsachnhanvien(){
    }
    public Danhsachnhanvien(int n, Nhanvien [] a)
    {
       this.n = n;
       this.dsnv = Arrays.copyOf(a,n);
    }
    public Danhsachnhanvien (Danhsachnhanvien ds)
    {
        this.n = ds.n; 
        this.dsnv = Arrays.copyOf(ds.dsnv,n);
    }
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien:");
        this.n = sc.nextInt();
        for(int i=0; i<n; i++)
            dsnv = Arrays.copyOf(dsnv, n);
        {
            dsnv[i] = new Nhanvien();
            dsnv[i].Nhap();
        }
    }
    public void xuat()
    {

    }
    
    public void xoavt(int vitrixoa)
    {
        for(int i = vitrixoa; i<n-1; i++)
        {
            dsnv[i] = dsnv[i+1]; 
        }
        dsnv = Arrays.copyOf(dsnv, n-1);
        n--;
    }
    public void Xoatheoma(String ma)
    {
        for(int i =0; i<n; i++)
        {
            if(dsnv[i].getManhanvien().equals(ma))
            {
                xoavt(i);
            }
        }
    }
    public void Them()
    {
      dsnv = Arrays.copyOf(dsnv, n+1);
      dsnv[n] =new Nhanvien();
      dsnv[n].Nhap();
      n++;
    }
    public void Themk(int k)
    {
        for(int i=0; i<k; i++)
        {
            Them();
        }
    }
     public void Sapxeptheoma(){
        for(int i = 0 ; i < n-1 ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                if(dsnv[i].getManhanvien().compareToIgnoreCase(dsnv[j].getManhanvien())> 0)
                {
                    Nhanvien a = new Nhanvien(dsnv[i]);
                    dsnv[i] = dsnv[j];
                    dsnv[j] = a;
                  
                }
            }
        }
    }
     
   public void Timkiemtheoma(String ma)
   {
       for(int i = 0 ; i < n ; i++)
       {
           if(dsnv[i].getManhanvien().equals(ma))
           {
               System.out.println(dsnv[i].toString());
           }
       }
   }
}
    