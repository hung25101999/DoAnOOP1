/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisach;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HUNG
 */
public class Danhsachchitiethoadon implements Danhsach{
    private int n;
    private Chitiethoadon[] dscthd = new Chitiethoadon[1];

    public Danhsachchitiethoadon(Chitiethoadon[] dscthd,int n) {
        this.n = n;
        this.dscthd = Arrays.copyOf(dscthd, n);
        
    }
    public Danhsachchitiethoadon(Danhsachchitiethoadon ds)
    {
        this.n = ds.n;
        this.dscthd = Arrays.copyOf(ds.dscthd, n);
    }
    public void Nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao so luong chi tiet hoa don :");
        this.n = in.nextInt();
        dscthd = Arrays.copyOf(dscthd,n);
        for(int i = 0 ; i < n ; i++)
        {
            dscthd[i] = new Chitiethoadon();
            dscthd[i].Nhap();
        }
        
    }
    public String toString(){
        StringBuilder s=new StringBuilder();
        return s.toString();
    }
    public void Xoavt(int vitrixoa){
        for(int i = vitrixoa ; i < n -1 ; i++)
        {
            dscthd[i] = dscthd[i+1];
        }
        dscthd = Arrays.copyOf(dscthd,n-1);
        n--;
    }
    public void Xoatheoma(String ma){
        for(int i = 0 ; i < n ; i++)
        {
            if(dscthd[i].getMahoadon().equals(ma))
            {
                Xoavt(i);
            }
        }
    }
    public void Them(){
        dscthd = Arrays.copyOf(dscthd,n+1);
        dscthd[n] = new Chitiethoadon();
        dscthd[n].Nhap();
        n++;
    }
    public void Themk(int k)
    {
        for(int i = 0 ; i < n ; i++)
        {
            Them();
        }
    }
    public void Sapxeptheoma(){
        for(int i = 0 ; i < n-1 ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                if(dscthd[i].getMahoadon().compareToIgnoreCase(dscthd[j].getMahoadon())> 0)
                {
                    Chitiethoadon a = new Chitiethoadon(dscthd[i]);
                    dscthd[i] = dscthd[j];
                    dscthd[j] = a;
                  
                }
            }
        }
    }
   public void Timkiemtheoma(String ma)
   {
       for(int i = 0 ; i < n ; i++)
       {
           if(dscthd[i].getMahoadon().equals(ma))
           {
               System.out.println(dscthd[i].toString());
           }
       }
   }
     public void Suatheoma(String ma){
    
}

 
}
  