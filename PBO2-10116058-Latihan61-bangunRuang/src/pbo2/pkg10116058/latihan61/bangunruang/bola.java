/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan61.bangunruang;

public class bola extends bangunRuang {

    private int jari2;

    public bola(int jari2) {
        this.jari2 = jari2;

    }

    public int getJari2() {
        return jari2;
    }

    @Override
    public float hitungVolume() {
        return  (float) (((3.14 * jari2 * jari2 * jari2) * 4) / 3);
    }

}