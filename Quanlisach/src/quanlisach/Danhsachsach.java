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
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Danhsachsach {
 private int n;
 private Sach[] dss = new Sach[1];
 public Danhsachsach()
 {}
 public Danhsachsach(int n, Sach[] dss)
 {
	 this.n=n;
	 this.dss = Arrays.copyOf(dss, n);
 }
 public Danhsachsach(Danhsachsach dss)
 {
	 this.n= dss.n;
	 this.dss = Arrays.copyOf(dss.dss, n);
 }
 public void Nhap() throws IOException
 {
	 Scanner Nhap= new Scanner(System.in);
	 System.out.println("Nhap vao so luong sach: ");
	  	n=Nhap.nextInt();
	  	dss= Arrays.copyOf(dss, n);
	  	int luachon;
	  	for(int i=0;i<n;i++)
	  	{
	  		System.out.println("1 Nhap vao sach giao khoa");
	  		System.out.println("2 Nhap vao truyen");
	  		System.out.println("3 Nhap de thoat");
	  		System.out.println("Nhap vao lua chon: ");
	  		luachon=Nhap.nextInt();
	  		if(luachon==1)
	  		{
	  			dss[i] = new Sachgiaokhoa();
	  			dss[i].Nhap();
	  		}
	  		else if(luachon==2)
	  		{
	  			dss[i] = new Truyen();
	  			dss[i].Nhap();
	  		}
	  		else if(luachon==3) break;
	  		else
	  		{
	  			System.out.println("Ban da Nhap sai. Xin Nhap lai lua chon");
	  			i=i-1;
	  		}
	  	}
 }
 //????????????????????????????????????????????????????????
 @Override
	public String toString() 
 	{
		System.out.println("Tong so sach la: "+n);
		for(int i=0;i<n;i++)
		{
			return dss[i].toString();
		}
		return null;
		
	}
        
        public void ghi_file() throws FileNotFoundException, IOException
        {
                        DataOutputStream outstream=new DataOutputStream(new FileOutputStream("sach.txt"));
                        for(int i=0; i<n; i++)
                            dss[i].ghifile();
                        outstream.close();
        }
        public void doc_file() throws IOException
        {
            int i=0;
            try{
                DataInputStream inStream = new DataInputStream(new FileIntputStream("sach.txt");
                try{
                    while(true)
                        dss[i]= new Sach();
                        dss[i].setMasach(inStream.readUTF());
                        dss[i].setTensach(inStream.readUTF());
                        dss[i].setMatacgia(inStream.readUTF());
                        dss[i].setDongia(inStream.readInt());
                        dss[i].setSoluong(inStream.readInt());
                        dss[i].setManhasanxuat(inStream.readUTF());
                        dss[i].setMaloai(inStream.readUTF());
                        System.out.println(dss[i].toString());
                        i++;
                }
                catch(EOFException e){}
                finally{
                    n=i;
                    inStream.close();
                })
                
                
            }
            catch(EOFException e){}
        }
 public void Them() throws IOException
 {
	 Scanner sc=new Scanner(System.in);
	 int luachon;
	 while (true)
	 {
		 System.out.println("1 Nhap vao sach giao khoa");
		 System.out.println("2 Nhap vao truyen");
		 System.out.println("3 Nhap de thoat");
		 System.out.println("Nhap vao lua chon");
		 luachon = sc.nextInt();
		 if(luachon== 1)
		 {
			 dss = Arrays.copyOf(dss, n+1);
			 dss[n] = new Sachgiaokhoa();
			 dss[n].Nhap();
			 n++;
			 break;
		 }
		 else if(luachon == 2)
		 {
			 dss= Arrays.copyOf(dss, n+1);
			 dss[n] = new Truyen();
			 dss[n].Nhap();
			 n++;
			 break;
		 }
		 else { break;}
	 }
 }
 public void Themk(int k) throws IOException
 {
	 dss=Arrays.copyOf(dss, n+k);
	 for(int i=n;i< n+k;i++)
	 {
		 Them();
	 }
 }
 public void xoavt(int vitrixoa)
 {
	 for(int i=vitrixoa ; i<n-1 ;i++)
	 {
		 dss[i] = dss[i+1];
	 }
	 dss = Arrays.copyOf(dss, n-1);
	 n--;
 }
 public void Xoatheoma(String Masach)
 {
	 for(int i=0 ;i<n; i++)
	 {
		 if(dss[i].getMasach().equals(Masach))
		 {
			 xoavt(i);
			 break;
		 }
	 }
 }
 public int Timkiemtheoma(String Masach)
 {
	 int a = 0;
	 for(int i=0 ;i<n; i++)
	 {
		 if(dss[i].getMasach().equals(Masach))
		 {
			 a=i;
			 break;
		 }
	 }
	 return a;
 }
 //??????????????????????????????
 public void tim_kiem_theo_masach(String Masach)
 {
	 for(int i=0;i<n;i++)
	 {
		 if(dss[i].getMasach().equals(Masach))
		 {
			 dss[i].toString();
		 }
	 }
 }
 public void tim_kiem_theo_tensach(String Tensach)
 {
	 for(int i=0;i<n;i++)
	 {
		 if(dss[i].getTensach().equalsIgnoreCase(Tensach))
		 {
			 dss[i].toString();
		 }
	 }
 }
 //???????????????????????????/^^^^^^^^^^^^^^.^^^
 public void swap1(Sach a,Sach b)
 {
     Sachgiaokhoa tam = new Sachgiaokhoa((Sachgiaokhoa)a);
     a = (Sachgiaokhoa)b;
     b = tam;
     
 }
 public void swap2(Sach a,Sach b)
 {
     Truyen tam = new Truyen((Truyen)a);
     a = (Truyen)b;
     b = tam;
 }
 public void swap3(Sach a,Sach b)
 {
    Sachgiaokhoa tam1 = new Sachgiaokhoa((Sachgiaokhoa)a);
     Truyen tam2 = new Truyen((Truyen)b);
     a = tam2;
     b = tam1;
    
    
 }

 public void sort_tensach()
 {
	 for(int i=0;i<n-1;i++)
	 {
		 for(int j=i+1;j<n;j++)
		 {
			 if(dss[i].getTensach().compareTo(dss[j].getTensach())>0)
			 {
				if(dss[i]instanceof Sachgiaokhoa && dss[j] instanceof Sachgiaokhoa)
                                {
                                    swap1(dss[i],dss[j]);
                                }
                                else if(dss[i]instanceof Truyen && dss[j] instanceof Truyen)
                                {
                                    swap2(dss[i],dss[j]);
                                }
                                else if(dss[i]instanceof Sachgiaokhoa && dss[j] instanceof Truyen)
                                {
                                    swap3(dss[i],dss[j]);
                                }
                                else
                                {
                                    swap3(dss[j],dss[i]);
                                }
			 }
		 }
	 }
 }
 public int thong_ke_theo_tensach(String Tensach)
 {
	 int dem=0;
	 for(int i=0;i<n;i++)
	 {
		 if(dss[i].getTensach().equalsIgnoreCase(Tensach))
		 {
			 dem++;
		 }
	 }
	 return dem;
 }
 
}
