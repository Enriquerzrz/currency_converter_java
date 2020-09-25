/*
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
*/

import java.util.*;
import java.text.DecimalFormat;

public class currency_converter{
    public static void main(String[] args){
        double cantidad, dollar, pound, code, euro, yen, ringgit, rupia;

        DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola, bienvenido al conversor de moneda !!\n");
        System.out.println("¿ Que tipo de moneda es la que quieres cambiar ?");

        System.out.println("1.Rupia \n2.Dollar \n3.Pound \n4.Euro \n5.Yen \n6.Ringgit \n\nInserta numero:");
        code = sc.nextInt();

        System.out.println("¿ Cuanta cantidad quieres convertir ?");
        cantidad = sc.nextFloat();

        System.out.println("\n\n");

        // Cambio de la rupia
        if (code == 1){
            dollar = cantidad / 70;
            System.out.println("Tus " + cantidad + " rupias son: " + f.format(dollar) + " dolares.");

            pound = cantidad / 88;
            System.out.println("Tus " + cantidad + " rupias son: " + f.format(pound) + " punds.");

            euro = cantidad / 80;
            System.out.println("Tus " + cantidad + " rupias son: " + f.format(euro) + " euros.");

            yen = cantidad / 0.63;
            System.out.println("Tus " + cantidad + " rupias son: " + f.format(yen) + " yenes.");

            ringgit = cantidad / 16;
            System.out.println("Tus " + cantidad + " rupias son: " + f.format(ringgit) + " ringgits.");
        
        }
        // Cambio de Dolar
        else if (code == 2){
            rupia = cantidad * 70;
            System.out.println("Tus " + cantidad + " dolares son: " + f.format(rupia) + " rupias.");
            
            pound = cantidad * 0.78;
            System.out.println("Tus " + cantidad + " dolares son: " + f.format(pound) + " pounds.");

            euro = cantidad * 0.87;
            System.out.println("Tus " + cantidad + " dolares son: " + f.format(euro) + " euros.");

            yen = cantidad * 111.087;
            System.out.println("Tus " + cantidad + " dolares son: " + f.format(yen) + " yenes.");

            ringgit = cantidad * 4.17;
            System.out.println("Tus " + cantidad + " dolares son: " + f.format(ringgit) + " riggits.");

        }
        // Cambio de Pounds        
        else if (code == 3){
            rupia = cantidad * 88;
            System.out.println("Tus " + cantidad + "  Pounds son: " + f.format(rupia) + "  rupias.");

            dollar = cantidad * 1.26;
            System.out.println("Tus " + cantidad + "  Pounds son: " + f.format(dollar) + "  dolares.");

            euro = cantidad * 1.10;
            System.out.println("Tus " + cantidad + "  Pounds son: " + f.format(euro) + "  euros.");

            yen = cantidad * 140.93;
            System.out.println("Tus " + cantidad + "  Pounds son: " + f.format(yen) + "  yenes.");

            ringgit = cantidad * 5.29;
            System.out.println("Tus " + cantidad + "  Pounds son: " + f.format(ringgit) + "  ringgits.");

        }
        // Cambio de Euro
        else if (code == 4){
            rupia = cantidad * 80;
            System.out.println("Tus " + cantidad + " Euros son: " + f.format(rupia) + " rupias.");

            dollar = cantidad * 1.14;
            System.out.println("Tus " + cantidad + " Euros son: " + f.format(dollar) + " dolares.");

            pound = cantidad * 0.90;
            System.out.println("Tus " + cantidad + " Euros son: " + f.format(pound) + " pounds.");

            yen = cantidad * 127.32;
            System.out.println("Tus " + cantidad + " Euros son: " + f.format(yen) + " yenes.");

            ringgit = cantidad * 4.78;
            System.out.println("Tus " + cantidad + " Euros son: " + f.format(ringgit) + " ringgits.");

        }
        // Cambio de Yen
        else if (code == 5){
            rupia = cantidad * 0.63;
            System.out.println("Tus " + cantidad + " Yenes son: " + f.format(rupia) + " rupias.");

            dollar = cantidad * 0.008;
            System.out.println("Tus " + cantidad + " Yenes son: " + f.format(dollar) + " dolares.");

            pound = cantidad * 0.007;
            System.out.println("Tus " + cantidad + " Yenes son: " + f.format(pound) + " pounds.");

            euro = cantidad * 0.007;
            System.out.println("Tus " + cantidad + " Yenes son: " + f.format(euro) + " euros.");

            ringgit = cantidad * 0.037;
            System.out.println("Tus " + cantidad + " Yenes son: " + f.format(ringgit) + " ringgits.");

        }
        // Cambio de Ringgit
        else if (code == 6){
            rupia = cantidad * 16.8;
            System.out.println("Tus " + cantidad + " Ringgits son: " + f.format(rupia) + " rupias.");

            dollar = cantidad * 0.239;
            System.out.println("Tus " + cantidad + " Ringgits son: " + f.format(dollar) + " dolares.");

            pound = cantidad * 0.118;
            System.out.println("Tus " + cantidad + " Ringgits son: " + f.format(pound) + " pounds.");

            euro = cantidad * 0.209;
            System.out.println("Tus " + cantidad + " Ringgits son: " + f.format(euro) + " euros.");

            yen = cantidad * 26.63;
            System.out.println("Tus " + cantidad + " Ringgits son: " + f.format(yen) + " yenes.");
        }
        
        else{
            System.out.println("Input inválido...");
        }
        sc.close();
    }
}
