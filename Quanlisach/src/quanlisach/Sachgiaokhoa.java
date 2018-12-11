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
import java.util.Scanner;

public class Sachgiaokhoa extends Sach {
 private String mon;
 private String lop;
 	public Sachgiaokhoa() {}
 	public Sachgiaokhoa(String masach, String tensach, String matacgia, String manhasanxuat, String maloai, int dongia, int soluong, String mon, String lop)
 	{
 		super(masach,tensach,matacgia,manhasanxuat,maloai,dongia,soluong);
 		this.mon=mon;
 		this.lop=lop;
 	}
 	public Sachgiaokhoa(Sachgiaokhoa sgk)
 	{
 		super((Sach)sgk);
 		mon=sgk.mon;
 		lop=sgk.lop;
 	}
 @Override	public void Nhap()
 	{
 		super.Nhap();
 		Scanner nhap=new Scanner(System.in);
 		System.out.println("Nhap vao mon hoc: ");
 			mon=nhap.nextLine();
 		System.out.println("Nhap vao lop hoc: ");
 			lop=nhap.nextLine();
 	}
 @Override
 public String toString() 
 	{		
	 	StringBuilder s=new StringBuilder();
	 	s.append("\nMon hoc: ");
	 	s.append(this.mon);
	 	s.append("\nLop hoc: ");
	 	s.append(this.lop);
	 	return super.toString()+s.toString();
 	}
        public String getMon()
        {
		return mon;
	}
	public String getLop()
	{
		return lop;
	}
	public void setMon(String mon)
	{
		this.mon=mon;
	}
	public void setLop(String lop)
	{
		this.lop=lop;
	}
        public void sua()
        {
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                int luachon;
                System.out.println("\n1.Sua ma sach");
                System.out.println("\n2.Sua ten sach");
                System.out.println("\n");
            }
        }
}