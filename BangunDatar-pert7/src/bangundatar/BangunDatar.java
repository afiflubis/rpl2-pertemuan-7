/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author afif
 */

package bangundatar;

public class BangunDatar {
    float luas(){
        System.out.println("Menghitung luas bangun datar");
        return 0;    
    }
    float keliling (){
        System.out.println("Menghitung keliling bangun datar");
        return 0;    
    }
}


class Persegi extends BangunDatar{
    int sisi;
    
    public Persegi(int sisi){
        this.sisi = sisi;
    }    
    
    @Override
    public float luas (){
        return this.sisi * this.sisi;
    }
   
    @Override
    public float keliling (){
        return this.sisi * 4;
    }     
}

class Segitiga extends BanguDatar{
    int alas;
    int tinggi;

     public Segitiga (int alas,int tinggi){
           this.alas = alas;
           this.tinggi = tinggi;
     }
     
     public float luas (){
         return this.alas * this.tinggi / 2 ;
     }
}     


class Lingkaran extends BangunDatar {
    int r;
    
    public Lingkaran (int r) {
        this.r = r;
    }
    
    @Override
    public float luas (){
        return (float) (Math.PI * r * r);
    }
    
    @Override
    public float keliling (){
        return (float) (2*Math.PI*r);
    }
}

class Main {
    public static void main (String[] args) {
        BangunDatar bangunDatar = new BangunDatar ();
        Persegi persegi = new Persegi (3);
        Segitiga segitiga = new Segitiga (8,3);
        Lingkaran lingkaran = new Lingkaran (21);
        
        //memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        System.out.println("Luas persegi ="+ persegi.luas());
        System.out.println("Keliling persegi ="+ persegi.keliling());
        System.out.println("Luas segitiga ="+ segitiga.luas());
        System.out.println("Luas lingkaran ="+ lingkaran.luas());
        System.out.println("Keliling lingkaran ="+ lingkaran.keliling());
    }
}