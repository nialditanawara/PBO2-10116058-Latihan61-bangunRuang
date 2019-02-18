/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan61.bangunruang;

import java.text.DecimalFormat;

public class PBO210116058Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("####.#");
        DecimalFormat df1 = new DecimalFormat();

        bola obj1 = new bola(7);
        System.out.println("Jari-jari dari sebuah bola basket adalah "
                + obj1.getJari2() + "cm");
        System.out.println("Hasil: V = " + df.format(Math.ceil(obj1.hitungVolume()))
        +" cm³");

        System.out.println("");
        System.out.println("=====================================");
        System.out.println("");

        tabung obj2 = new tabung(10, 21);
        System.out.println("Sebuah tabung memiliki jari-jari berukuran "
                + obj2.getJari2() + "cm. Jika tingginya " + obj2.getTinggi() + "cm,");
        System.out.println("Hasil: V = " + df.format(Math.ceil(obj2.hitungVolume()))
        +" cm³");
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("");

        kerucut obj3 = new kerucut(14, 9);
        System.out.println("Diketahui tinggi sebuah kerucut " + obj3.getTinggi()
                + "cm." + " Jika jari-jarinya " + obj3.getJari2() + "cm,");
        System.out.printf("Hasil: V = %s %n" , df1.format(Math.ceil(obj3.hitungVolume()))
        +" cm³");
    }

}