package main;

import modelo.Compra;
import modelo.TarjetaDeCredito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el límite de la tarjeta de crédito: ");
        double limite = scanner.nextDouble();

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int salir = 1;
        while (salir != 0) {
            System.out.print("Ingrese descripción de la compra: ");
            String descripcion = scanner.next();

            System.out.println("Escriba el valor de la compra");
            double valor = Double.valueOf(scanner.nextDouble());

            Compra compra = new Compra(valor, descripcion);
            boolean compraRealizada = tarjeta.LanzarCompra(compra);

        }
    }
}
