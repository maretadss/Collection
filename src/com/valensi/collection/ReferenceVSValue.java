package com.valensi.collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ReferenceVSValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 9;
        int y = x; //copy value
        y++; // nilai x tidak berubah
        
        System.out.println("Nilai Y sekarang : " + y);
        System.out.println("Nilai X sekarang : " + x);
    }
    
}
