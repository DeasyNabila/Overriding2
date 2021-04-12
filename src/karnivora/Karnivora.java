/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karnivora;

/**
 *
 * @author MOKLET-1
 */
public class Karnivora extends Hewan {

    String hewan = "Anjing";
    int umur = 2;
            
            
    public static void main(String[] args) {
        
       Karnivora data = new Karnivora();
        System.out.println("Nama Hewan: "+data.getHewan());
        System.out.println("Umur Hewan: "+data.getUmur());
    }
    
}
