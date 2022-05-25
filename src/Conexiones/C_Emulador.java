/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexiones;

import java.util.ArrayList;

/**
 *
 * @author jesus
 */
public class C_Emulador {    
    public static ArrayList<Objetos.U0_Empleado> e = new ArrayList();
    
    public void addEmpleado(Objetos.U0_Empleado e){
        C_Emulador.e.add(e);
    }
    public Objetos.U0_Empleado searchEmpleado(String s){
        for(Objetos.U0_Empleado e: C_Emulador.e){
            if(s.equals(e.getCurp()))
                return e;
        }
        return new Objetos.U0_Empleado();
    }
    public void editEmpleado(String s, Objetos.U0_Empleado e1){
        int i=-1;
        for(Objetos.U0_Empleado e: C_Emulador.e){
            i++;
            if(e.getCurp().equals(s))
                break;
        }
        if(i!=-1) C_Emulador.e.set(i, e1);
    }
    public void deletEmpleado(String s){
        int i =-1;
        for(Objetos.U0_Empleado e: C_Emulador.e){
            i++;
            if(s.equals(e.getCurp()))
               break;
        }
        if(i!=-1)
        C_Emulador.e.remove(i);
    }
}
