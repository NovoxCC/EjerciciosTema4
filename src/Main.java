import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //primera parte del ejercicio
        int numeroIf = 5;
        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
        //segunda parte del ejercicio
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        //tercera parte del ejercicio
        numeroWhile = 0;
        do {
            System.out.println(numeroWhile);
            numeroWhile += 3;
        } while (numeroWhile < 3);
        //cuarta parte del ejercicio
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        //quinta parte del ejercicio
        var estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Es toy en default");
        }
    }

}