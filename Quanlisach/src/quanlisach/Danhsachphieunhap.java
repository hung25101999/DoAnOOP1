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
public class Danhsachphieunhap {
    private int n ;
    private Phieunhap[] dspn = new Phieunhap[1];
    public Danhsachphieunhap(){
    }
    public Danhsachphieunhap(Phieunhap[] a,int n){
        this.n = n;
        this.dspn = Arrays.copyOf(a, n);
    }
    public Danhsachphieunhap(Danhsachphieunhap ds){
        this.n = ds.n;
        this.dspn = Arrays.copyOf(ds.dspn,n);
    }
    public void Nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao so luong phieu nhap hang :");
        this.n = in.nextInt();
        dspn = Arrays.copyOf(dspn,n);
        for(int i = 0 ; i < n ; i++)
        {
            dspn[i] = new Phieunhap();
            dspn[i].Nhap();
        }
        
    }
    public void Xuatdanhsachphieunhap(){
    }
    public void xoavt(int vitrixoa){
        for(int i = vitrixoa ; i < n -1 ; i++)
        {
            dspn[i] = dspn[i+1];
        }
        dspn = Arrays.copyOf(dspn,n-1);
        n--;
    }
    public void Xoatheoma(String ma){
        for(int i = 0 ; i < n ; i++)
        {
            if(dspn[i].getMaphieunhap().equals(ma))
            {
                xoavt(i);
            }
        }
    }
    public void Them(){
        dspn = Arrays.copyOf(dspn,n+1);
        dspn[n] = new Phieunhap();
        dspn[n].Nhap();
        n++;
    }
    
    public void ThemK(Phieunhap phieu)
    {
        Them();
    }
    public void Sapxeptheoma(){
        for(int i = 0 ; i < n-1 ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                if(dspn[i].getMaphieunhap().compareToIgnoreCase(dspn[j].getMaphieunhap())> 0)
                {
                    Phieunhap a = new Phieunhap(dspn[i]);
                    dspn[i] = dspn[j];
                    dspn[j] = a;
                  
                }
            }
        }
    }
   public void Timkiemphieunhap(String ma)
   {
       for(int i = 0 ; i < n ; i++)
       {
           if(dspn[i].getMaphieunhap().equals(ma))
           {
               System.out.println(dspn[i].toString());
           }
       }
   }
    
}
