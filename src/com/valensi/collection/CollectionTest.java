/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author user
 */
public class CollectionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> names =  new ArrayList<>();
        Set<String> namaNama = new HashSet<>();
        
        names.add("Sting");
        names.add("Sting");
        
        namaNama.add("Sting");
        namaNama.add("Sting");
        
        System.out.println("Isi List : " + names.size()); //hasil 2
        System.out.println("Isi Set : " + namaNama.size());// set tidak memperbolehkan data yang sama // hasil 1
    }
    
}
