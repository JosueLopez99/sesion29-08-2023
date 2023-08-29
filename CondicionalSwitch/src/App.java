import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double A,B,C;
        double cociente = 0.0;

        //condicional multiple switch
System.out.println("Menu de Opciones");
System.out.println("1) Sumar");
System.out.println("2) Restar");
System.out.println("3) Multiplicar");
System.out.println("4) Dividir");
System.out.println("5) Salir");
byte opcion = lector.nextByte();
        
            switch(opcion) {
             case 1:

             System.out.println("1) Sumar ");
             System.out.println("A:");
             A = lector.nextInt();
             System.out.println("B:");
             B = lector.nextInt();

             C = A+B;

             System.out.println("El resultado de la suma es : " + C);
             
             break;

             case 2:

             System.out.println("2) Restar ");
             System.out.println("A:");
             A = lector.nextInt();
             System.out.println("B:");
             B = lector.nextInt();

             C = A-B;
             System.out.println("EL resultado de la resta es : " + C);

           case 3:
           System.out.println("3) Multiplicar ");
             System.out.println("A:");
             A = lector.nextInt();

             System.out.println("B:");
             B = lector.nextInt();

             C = A*B;

             System.out.println("El resultado de la multiplicacion es : " + C);

             break;
             case 4:
             System.out.println("4) Dividir ");
             System.out.println("A:");
             A = lector.nextInt();
             System.out.println("B:");
             B = lector.nextInt();
             if(A == 0 || B == 0){
                System.out.println("El divisor no puede ser 0");
                }else{
                    cociente = A/B;
             }

             C = A/B;

             System.out.println("El resultado de la division es : " + C + cociente);

             break;
         
             case 5:
             System.out.println("Adios nub");
             break;

            default:

            System.out.println("Muy nub para usar el programa");
              break;

        }
    }
}
