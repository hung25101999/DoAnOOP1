/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisach;

import java.io.IOException;

/**
 *
 * @author HUNG
 */
public class test {
    public static void main(String[] args) throws IOException {
        Danhsachkhachhang dskh=new Danhsachkhachhang();
        dskh.Nhap();
        dskh.ghi_file();
        dskh.doc_file();
    }
    
}
