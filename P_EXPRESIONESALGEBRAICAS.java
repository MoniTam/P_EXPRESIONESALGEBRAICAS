/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_expresiones.algebraicas;

import java.util.Stack;

/**
 *
 * @author ESTEFANIA TAMAY
 */
public class P_EXPRESIONESALGEBRAICAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String CAD = "(Cadena () (()(())))";

        String CAD2 = "(Cadena )(()()))";
        
        String CAD3 = "(Cadena () (()(()))) ";
        
        String CAD4 = "(Cadena )(()())) ";
        
        String CAD5 = "(Cadena )(()())) ";
        
        System.out.println("EXPRESIONES ALGEBRAICAS");

        System.out.println("(123*4)+((12-1)*(1+2))");

        System.out.println(verificaParentesis(CAD));
          
        System.out.println("(123*4)+((12-1)*+1+2))");
            
        System.out.println(verificaParentesis(CAD2));
           
        System.out.println("((pila.size()==0)&&(flag))");
            
        System.out.println(verificaParentesis(CAD3));
        
        System.out.println("((pila.size)==0)&&(flag))");
            
        System.out.println(verificaParentesis(CAD4));
        
        System.out.println("((pila.size()==0)&&(flag)");
            
        System.out.println(verificaParentesis(CAD5));            

    }


    public static boolean verificaParentesis(String CAD)  {
        
        Stack<String> pila = new Stack();       
        int i = 0;

            while (i<CAD.length()) {  

                if(CAD.charAt(i)=='(') {pila.push("(");}                                

                else if  (CAD.charAt(i)==')') {  

                            if (!pila.empty()){ pila.pop(); } 

                            else { pila.push(")"); break; } 
                }

                i++;

            }

            if(pila.empty()){ return true; } else { return false; }
  
    }
    
}
    
    

