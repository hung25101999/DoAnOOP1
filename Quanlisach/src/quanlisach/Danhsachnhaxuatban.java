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
public class Danhsachnhaxuatban {
    private int n;
    private Nhaxuatban[] dsnxb=new Nhaxuatban[1];
    public Danhsachnhaxuatban()
    {
        
    }
    public Danhsachnhaxuatban(int n,Nhaxuatban[] nxb)
    {
        this.n=n;
        this.dsnxb=Arrays.copyOf(nxb, n);
    }
    public Danhsachnhaxuatban(Danhsachnhaxuatban ds)
    {
        this.n=ds.n;
        this.dsnxb=Arrays.copyOf(ds.dsnxb, n);
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nMoi ban Nhap so nha xuat ban: ");
        n=sc.nextInt();
        dsnxb=Arrays.copyOf(dsnxb,n);
        for(int i=0;i<n;i++)
        {
            dsnxb[i]=new Nhaxuatban();
            dsnxb[i].Nhap();;
        }
    }
    public void xuat()
    {
        for(int i=0;i<n;i++)
            System.out.println(dsnxb[i].toString());
    }
    public void Them()
    {
        dsnxb=Arrays.copyOf(dsnxb,n+1);
        dsnxb[n]=new Nhaxuatban();
        dsnxb[n].Nhap();
        n++;
    }
    public void ThemK(int k)
    {
        for(int i=0;i<k;i++)
        {
            Them();
        }
    }
    public void xoavt(int vitrixoa)
    {
        for(int i=vitrixoa;i<n;i++)
        {
            dsnxb[i]=dsnxb[i+1];
        }
        n--;
    }
    public void Xoatheoma(String ma)
    {
        for(int i=0;i<n;i++)
        {
            if(dsnxb[i].getManhaxuatban().equals(ma))
            {
                xoavt(i);
            }
        }
    }
    public void Timkiemtheoma(String ma)
    {
        for(int i=0;i<n;i++)
        {
            if(dsnxb[i].getManhaxuatban().equals(ma))
            {
                System.out.println(dsnxb[i].toString());
            }
        }
    }
    public int thongketheoten(String ten)
    {
        int dem=0;
        for(int i=0;i<n;i++)
        {
            if(dsnxb[i].getTennhaxuatban().equalsIgnoreCase(ten))
            {
                dem++;
            }
        }
        return dem;
            
    }
    public void sepxeptheoten()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(dsnxb[i].getTennhaxuatban().compareTo(dsnxb[j].getTennhaxuatban())>0)
                {
                    Nhaxuatban n=new Nhaxuatban();
                    n=dsnxb[i];
                    dsnxb[i]=dsnxb[j];
                    dsnxb[j]=n;
                    
                }
            }
        }
    }
    public void suathema(String ma)
    {
        Scanner sc=new Scanner(System.in);
        String manhaxuatbanmoi;
        String tennhaxuatbanmoi;
        String diachimoi;
        String sodienthoaimoi;
        for(int i=0;i<n;i++)
        {
            int luachon;
            while(true)
            {
                System.out.println("\n1.Sua ma.");
                System.out.println("\n2.Sua ten.");
                System.out.println("\n3.Sua dia chi.");
                System.out.println("\n4.Sua so dien thoai.");
                System.out.println("\n5.Thoat.");
                System.out.println("\nMoi ban Nhap lua chon: ");
                luachon=sc.nextInt();
                if(luachon==1)
                {
                    System.out.println("\nMoi ban Nhap ma moi:");
                    manhaxuatbanmoi=sc.nextLine();
                    dsnxb[i].setManhaxuatban(manhaxuatbanmoi);
                }
                if(luachon==2)
                {
                    System.out.println("\nMoi ban Nhap ten moi:");
                    tennhaxuatbanmoi=sc.nextLine();
                    dsnxb[i].setTennhaxuatban(tennhaxuatbanmoi);
                }
                if(luachon==3)
                {
                    System.out.println("\nMoi ban Nhap dia chi moi:");
                    diachimoi=sc.nextLine();
                    dsnxb[i].setDiachi(diachimoi);
                }
                if(luachon==4)
                {
                    System.out.println("\nMoi ban Nhap so dien thoai moi:");
                    sodienthoaimoi=sc.nextLine();
                    dsnxb[i].setDienthoai(sodienthoaimoi);
                }
                if(luachon==5)
                {
                    break;
                }
            }
        }
    }
}
