/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deklarasivariable;

/**
 *
 * @author 
 * NAMA     : Rima Rizqi Nurfajri
 * KELAS    : IF01
 * NIM      :10118801
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * Isi variabel yang sudah dideklarasi
 */
public class DeklarasiVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //Deklarasi Variable
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai \t= " + nilaiInt);
        System.out.println("Isi variabel PHI \t= " + PHI);
        System.out.println("Isi variabel logika \t= " + nilaiLogika);
        System.out.println("Isi variabel karakter \t= " + nilaiKarakter);
    }
    
}
