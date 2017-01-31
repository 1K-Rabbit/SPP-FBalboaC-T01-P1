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
    public static void main(String[] args) {int mat,cal1,cal2,cal3,cal4,res,pro;
      mat=solicitarDatos("Matricula");
      cal1=solicitarDatos("calificacion 1: ");
      cal2=solicitarDatos("Calificacion 2: ");
      cal3=solicitarDatos("Calificacion 3: ");
      cal4=solicitarDatos("Calificacion 4: ");
      pro=promedio(cal1, cal2,cal3,cal4);
      res=resultado(pro);
      mensaje(pro,mat);
    }
    public static int solicitarDatos(String d){
        int n;
        Scanner KB= new Scanner(System.in);
        System.out.println("Intoduce: " + d);
        n= KB.nextInt();
        return n;
       
    }
    public static int promedio (int cal1, int cal2, int cal3, int cal4){
        int p;
        p= (cal1 + cal2 +cal3 + cal4)/4;
        return p;
    }
    public static int resultado(int pro){
        if (pro>=70){
            System.out.println("APROBADO");
           
    } else { 
            System.out.println("REPROBADO");
        }
        return pro;
    }
    public static void mensaje(int pro, int mat){
        System.out.println("Tu matricula es:" + mat);
        System.out.println("Tu promedio es: " + pro);
        System.out.println("Gracias por su atencion");
        
        
    }
}
        
        // TODO code application logic here
    
    

