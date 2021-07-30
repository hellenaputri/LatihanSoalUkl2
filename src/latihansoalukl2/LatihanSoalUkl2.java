/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoalukl2;

/**
 *
 * @author maylany hellena
 */
public class LatihanSoalUkl2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n, a, b; 
        //Menginisialisasikan variabel dengan tipe data integer
        n = 4 ; 
        //variabel n yang bernilai 4 sebagai tinggi dari segitiga 
        
        for (a=0; a<=n; a++) {
            //Perulangan untuk menentukan tinggi/baris segitiga, dimulai pada a=0 maka a nya adalah 0
            //Hingga a<=n, dimana akan melakukan perulangan jika nilai a lebih kecil atau sama dengan n
            //dan akan berhenti ketika nilai i sudah sama dengan n
            //a++, maka jika nilai a<=n akan dilakukan penambahan nilai a yaitu a + 1
            for (b=0; b<a; b++) {
                //Perulangan untuk membuat kolom ke kanan dengan mencetak "*"
                //sehingga dapat membentuk pola segitiga, mulai dari j=0, jadi perulangan akan dimulai
                //jika nilai j adalah b<a yaitu dimana program akan melakukan perulangan jika nilai b kurang dari a dan 
                //akan berhenti jika nilai b tidak kurang dari a
                //b++, maka jika b<a akan terjadi penambahan nilai b yaitu b + 1
                //Sehingga akan terjadi pertambahan "*" disetiap barisnya, mislalkan baris 1 = bintang 1, baris 2= bintang 2, dan seterusnya
                 System.out.print("*");
                //mencetak (*)
            }
             System.out.println();
             //Untuk berganti baris pada perulangan
        }
        
    }
    }
    




