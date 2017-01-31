/*//Problema 1 de Fabricio Arturo Balboa Cavazos A01411541
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.t01.p1;
import java.util.Scanner;
/**
 *
 * @author FabricioArturo
 */
public class SPPT01P1 { 
    /**
     * @param args the command line arguments
     */Scanner KB = new Scanner (System.in);
    public static void main(String[] args) { 
        Scanner Kb = new Scanner (System.in);
        int Mat;
        Double Cal1;
        Double Cal2;
        Double Cal3;
        Double Cal4;
        Double Cal5;
        Double Pro;
        String Res;
        
        
        
        System.out.println("BIENVENIDO A LA BASE DE DATOS DE ALUMNOS DE SEGUNDO SEMESTRE");
        System.out.println("¿Cual es tu matricuala?");
            Mat = Kb.nextInt();
        System.out.println("Calificacion en  Bellas artes ");
           Cal1 = Kb.nextDouble();
        System.out.println("Calificacion en Quimica ");
           Cal2 = Kb.nextDouble();
        System.out.println("Calificacion en Fisica II");
           Cal3 = Kb.nextDouble();
        System.out.println("Calificacion en Lengua Extranjera");
           Cal4 = Kb.nextDouble();
        System.out.println("Calificacion en Matematicas II");
           Cal5 = Kb.nextDouble();
       
           //RES (PROMEDIO)
           Pro = (Cal1 + Cal2 + Cal3 +Cal4 + Cal5)/5;
           
           
           //PROM (APROBADO / REPROBADO)
            
                    if (Pro >= 7){
               Res = ("APROBATORIA");
                       }
                       else {
  
               Res = ("REPROBATORIA");
                               } 
           
           
           
           System.out.println("El alumno con matricula " + Mat + " tiene un promedio de " + Pro + " por lo que tiene una calificacion " + Res + " en este semestre.");
                   
           
            
        
        
        
    }
}
        
        // TODO code application logic here
    
    

