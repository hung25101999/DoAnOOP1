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
public class Tacgia {
    private String matacgia;
    private String tentacgia;
    private String ngaysinh;

    public Tacgia() {
    }

    public Tacgia(String matacgia, String tentacgia, String ngaysinh) {
        this.matacgia = matacgia;
        this.tentacgia = tentacgia;
        this.ngaysinh = ngaysinh;
    }
    public Tacgia(Tacgia tg)
    {
        matacgia=tg.matacgia;
        tentacgia=tg.tentacgia;
        ngaysinh=tg.ngaysinh;
    }
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap ma tac gia: ");
        matacgia=sc.nextLine();
        System.out.println("Moi ban nhap ten tac gia: ");
        tentacgia=sc.nextLine();
        System.out.println("Moi ban nhap ngay sinh: ");
        ngaysinh=sc.nextLine();
    }
    @Override public String toString()
    {
        StringBuilder s=new StringBuilder();
        s.append("Ma tac gia: ");
        s.append(this.matacgia);
        s.append("Ten tac gia: ");
        s.append(this.tentacgia);
        s.append("Ngay sinh la: ");
        s.append(this.ngaysinh);
        return s.toString();
    }

    public String getMatacgia() {
        return matacgia;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setMatacgia(String matacgia) {
        this.matacgia = matacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
}
