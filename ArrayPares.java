package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPares {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 0;
        int pares[] = new int[5];

        for (int i = 0; cont < 5; i++) {
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            if (num % 2 == 0) {
                cont++;
                pares[i] = num;
            }
        }
        System.out.println("");
        System.out.println("Resultado del Array:");

        for (int i = 0; i < pares.length; i++) {
            System.out.println(" En la posicion " + i + " se encuentra el numero par : " + pares[i]);

        }

    }

}

//        Scanner leer = new Scanner(System.in);
//
//        int num = 0;
//        int cont = 0;
//        List<Integer> pares = new ArrayList();
//
//        while (cont < 5) {
//            System.out.println("ingrese un numero");
//            num = leer.nextInt();
//              if (num % 2 == 0) {
//                cont++;
//                pares.add(num);
//
//            
//            
//    
//}
//          
//            }
//    JOptionPane.showMessageDialog(null, "Los numeros pares ingresados son : " + pares);
//        }
//
//       
//
//    }
//
