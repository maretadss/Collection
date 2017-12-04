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
public class ReferencesCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Programmer p1 = new Programmer();
        p1.setLevel("Newbie");
        Programmer p2 = p1;
        
        System.out.println("P2 : " + p2.getLevel());
        p2.setLevel("Senior");
        System.out.println("P1 : " + p1.getLevel());
        
        List<Programmer> programmers =  new ArrayList<>();
        programmers.add(p1);
        programmers.add(p2);
        
        System.out.println("Isi List : " + programmers.size());
        
        Set<Programmer> progSets = new HashSet<>();
        progSets.add(p1);
        progSets.add(p2);
        
        System.out.println("Isi set : " + progSets.size());
        
        
        
        
    }
    
}
