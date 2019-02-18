/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan61.bangunruang;

public class kerucut extends bangunRuang {

    private int jari2;
    private int tinggi;

    public kerucut(int jari2, int tinggi2) {
        this.jari2 = jari2;
        this.tinggi = tinggi2;
    }

    public int getJari2() {
        return jari2;
    }

    public int getTinggi() {
        return tinggi;
    }

    @Override
    public float hitungVolume() {
        return (float) (((3.14 * jari2 * jari2) * tinggi) / 3);
    }

}