/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisach;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HUNG
 */
public class Danhsachkhachhang {
    private Khachhang [] dskh = new Khachhang[1];
    private int n; 
    private int i;
    public Danhsachkhachhang(){
    }
    public Danhsachkhachhang(int n, Khachhang [] a)
    {
       this.n = n;
       this.dskh = Arrays.copyOf(a,n);
    }
    public Danhsachkhachhang (Danhsachkhachhang ds)
    {
        this.n = ds.n; 
        this.dskh = Arrays.copyOf(ds.dskh,n);
    }
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong khach hang:");
        this.n = sc.nextInt();
        dskh = Arrays.copyOf(dskh, n);
        for(int i=0; i<n; i++)
            
        {
            dskh[i] = new Khachhang();
            dskh[i].Nhap();
        }
    }
    public void xuat()
    {

    }
    
    public void ghi_file() throws FileNotFoundException, IOException
        {
                        DataOutputStream outstream=new DataOutputStream(new FileOutputStream("khachhang.txt"));
                        for(int i=0; i<n; i++)
                        {
                            dskh[i].ghifile();
                        }
                        outstream.close();
        }
        public void doc_file() throws IOException
        {
            int k=0, i=0;
            try{
                DataInputStream inStream = new DataInputStream(new FileInputStream("khachhang.txt"));
                try{
                    while(true)
                    {
                        dskh = Arrays.copyOf(dskh,k+1);
                        dskh[i]= new Khachhang();
                        dskh[i].setMakhachhang(inStream.readUTF());
                        dskh[i].setHokhachhang(inStream.readUTF());
                        dskh[i].setTenkhachhang(inStream.readUTF());
                        dskh[i].setDiachi(inStream.readUTF());
                        dskh[i].setDienthoai(inStream.readUTF());
                        System.out.println(dskh[i].toString());
                        i++;
                        k++;
                    }
                }
                catch(EOFException e){}
                finally{
                    n=i;
                    inStream.close();
                }
                
                
            }
            catch(IOException e){}
        }
    public void Xoavt(int vitrixoa)
    {
        for(int i = vitrixoa; i<n-1; i++)
        {
            dskh[i] = dskh[i+1]; 
        }
        dskh = Arrays.copyOf(dskh, n-1);
        n--;
    }
    public void Xoatheoma(String ma)
    {
        for(int i =0; i<n; i++)
        {
            if(dskh[i].getMakhachhang().equals(ma))
            {
                Xoavt(i);
            }
        }
    }
    public void Them()
    {
      dskh = Arrays.copyOf(dskh, n+1);
      dskh[n] =new Khachhang();
      dskh[n].Nhap();
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
                if(dskh[i].getMakhachhang().compareToIgnoreCase(dskh[j].getMakhachhang())> 0)
                {
                    Khachhang a = new Khachhang(dskh[i]);
                    dskh[i] = dskh[j];
                    dskh[j] = a;
                  
                }
            }
        }
    }
     
   public void Timkiemtheoma(String ma)
   {
       for(int i = 0 ; i < n ; i++)
       {
           if(dskh[i].getMakhachhang().equals(ma))
           {
               System.out.println(dskh[i].toString());
           }
       }
   }
}
