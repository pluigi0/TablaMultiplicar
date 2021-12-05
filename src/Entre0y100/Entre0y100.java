package Entre0y100;

import javax.swing.JOptionPane;

/*
Pedir un numero entre 0 - 100 y mostrar la 
tabla de multiplicar de dicho numero
 */
public class Entre0y100 {
    public static void main(String[] args) {
        int numero, multiplicar=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Typea "
                + "un numero entre 0-100 para mostrar su tabla de multiplicacion: "));
        
        while (numero < 100 && numero > 0){
            
            System.out.println("Esta es la tabla de multiplicar del "+numero);

            for (int i=0; i<=10; i++){
                multiplicar = numero *i;
                System.out.println(numero+" * "+i+ " = "+multiplicar);
            }
            
          
            numero = Integer.parseInt(JOptionPane.showInputDialog("Typea "
                + "un numero entre 0-100: "));
        }
        
        
    }
}
