/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interface_funcional_predicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Luis
 */
public class Interface_Funcional_Predicate {

    public static void main(String[] args) {
       //provando la interfaz funcional predicate        
        List<Puertos> lista = new ArrayList();
        lista.add(new Puertos(8080,false,"IIS"));
        lista.add(new Puertos(1566, false, "Oracle DB"));
        lista.add(new Puertos(443, false, "IIS Secure Port"));
        lista.add(new Puertos(8081, false, "JBoss"));
        lista.add(new Puertos(9090,true, "Sin asignar"));
        
        
        //boolean dis = pe.isDisponible();
        Predicate<Puertos> pre = p -> p.isDisponible();
        
        //System.out.println(dis);
 
        for(Puertos p : lista){
            if(pre.test(p)){
            //if(p.isDisponible()){
                System.out.println(p.toString());
            }
        }
    }
}
