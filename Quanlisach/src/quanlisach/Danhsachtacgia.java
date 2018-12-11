/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Scanner;
import quanlisach.Tacgia;
/*package quanlisach;*/

/**
 *
 * @author HUNG
 */
public class Danhsachtacgia {
    private Tacgia[] dstg = new Tacgia[1];
    private int n ;

    public Danhsachtacgia() {
    }
    public Danhsachtacgia(Tacgia dstg[] , int n){
        this.n = n; 
        this.dstg = Arrays.copyOf(dstg, n);       
    }
    public Danhsachtacgia(Danhsachtacgia ds){
        this.n = ds.n;
        this.dstg = Arrays.copyOf(ds.dstg, n);
    }
    public void Nhapdanhsachtacgia(){
        System.out.println("Nhap vao so luong tac gia can nhap :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        dstg = Arrays.copyOf(dstg, n);
        for(int i = 0 ; i < n  ; i++)
        {
            dstg[i] = new Tacgia();
            dstg[i].Nhap();
        }
    }
    public void Xuatdanhsachtacgia(){
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(dstg[i].toString());
        }
    }
    public void Them1tacgia()
    {
        dstg = Arrays.copyOf(dstg,n+1);
        dstg[n] = new Tacgia();
        dstg[n].Nhap();
        n++;      
    }
    public void Themnhieutacgia(int k)
    {
        for(int i = 0 ; i < k ; i++)
        {
            Them1tacgia();
        }
    }
    public void xoavt(int vitrixoa){
        for(int i = vitrixoa ; i < n - 1 ; i++)
        {
           dstg[i] = dstg[i+1];
        }
        n--;
    }
    public void Xoatheoma(String ma)
    {
        for(int i = 0 ; i < n ; i++)
        {
            if(dstg[i].getMatacgia().equals(ma))
            {
                xoavt(i);
            }
        }
    }
    public void Suatheoma(String ma)
    {
        for(int i = 0 ; i < n ; i++)
        {
            if(dstg[i].getMatacgia().equals(ma))
            {
                int luachon;
                while(true)
                {
                    System.out.println("1.Sua ma tac gia ");
                    System.out.println("2.Sua ten tac gia ");
                    System.out.println("3.Sua ngay sinh ");
                    System.out.println("4.Thoat");
                    System.out.println("Moi ban nhap lua chon ");
                    Scanner in = new Scanner(System.in);
                    luachon = in.nextInt();
                    if(luachon == 1)
                    {
                        String mamoi;
                        System.out.println("Nhap ma tac gia moi ");
                        mamoi = in.nextLine();
                        dstg[i].setMatacgia(mamoi);
                    }
                    else if(luachon == 2)
                    {
                        String tentacgia;
                        System.out.println("Nhap vao ten tac gia moi ");
                        tentacgia = in.nextLine();
                        dstg[i].setTentacgia(tentacgia);
                    }
                    else if(luachon == 3)
                    {
                        String ngaysinh;
                        System.out.println("Nhap vao ngay sinh moi ");
                        ngaysinh = in.nextLine();
                        dstg[i].setNgaysinh(ngaysinh);
                    }
                    else
                    {
                        break;
                    }
                    
                }
            }
        }
    }
    public void Timkiemtheoma(String ma){
        for(int i = 0 ; i < n ; i++)
        {
            if(dstg[i].getMatacgia().equals(ma))
            {
                System.out.println(dstg[i].toString());
            }
        }
    }
        
    
}
