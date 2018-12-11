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

import java.io.FileInputStream;
import java.util.Scanner;
import org.omg.CORBA.DataInputStream;

public class Truyen extends Sach{
 private int luatuoi;
 private String chude;
 	public Truyen() {}
 	public Truyen(String masach, String tensach, String matacgia, String manhasanxuat, String maloai, int dongia, int soluong, int luatuoi, String chude)
 	{
 		super(masach,tensach,matacgia,manhasanxuat,maloai,dongia,soluong);
 		this.luatuoi=luatuoi;
 		this.chude=chude;
 	}
 	public Truyen(Truyen tr)
 	{
 		super((Sach)tr);
 		luatuoi=tr.luatuoi;
 		chude=tr.chude;
 	}
 @Override	public void Nhap()
 	{
	 	super.Nhap();
	 	Scanner nhap=new Scanner(System.in);
	 	System.out.println("Nhap vao lua tuoi: ");
	 	 	luatuoi=nhap.nextInt();
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Nhap vao nhan vat chinh: ");
	 	 	chude=sc.nextLine();
	 	
 	}
 @Override
 	public String toString() 
 	{
	 	StringBuilder s=new StringBuilder();
	 	s.append("\nLua tuoi: ");
	 	s.append(this.luatuoi);
	 	s.append("\nNhan vat chinh: ");
	 	s.append(this.chude);
	 	return super.toString()+ s.toString();
	}
 	public int getLuatuoi() 
 	{
 		return luatuoi;
 	}
 	public String getNhanvatchinh()
 	{
 		return chude;
 	}
 	public void setLuatuoi(int luatuoi)
 	{
 		this.luatuoi=luatuoi;
 	}
 	public void setNhanvatchinh(String chude)
 	{
 		this.chude=chude;
 	}
          public void Docfile(String filename)
        {
            try{
            DataInputStream instream = new DataInputStream(new FileInputStream(filename));
                try{
                }
                    while(true)
                    {
                        
                    }
                }
            
            }
        }
        public void Ghifile(String filename)
        {
            try{
                DataOutputStream outstream=new DataOutputStream(new FileOutputStream(filename));
                    outstream.writeUTF̣̣̣̣̣̣̣(this.masach);
                    outstream.writeUTF(this.tensach);
                    
        }
}



