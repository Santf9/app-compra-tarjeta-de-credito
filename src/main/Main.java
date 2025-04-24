package main;

import modelo.Compra;
import modelo.TarjetaDeCredito;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el límite de la tarjeta de crédito: ");
        double limite = scanner.nextDouble();

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int salir = 1;
        while (salir != 0) {
            System.out.println("Escriba la descripción (Producto) de la compra: ");
            String descripcion = scanner.next();

            System.out.println("Escriba el valor de la compra");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(valor, descripcion);
            boolean compraRealizada = tarjeta.LanzarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = scanner.nextInt();
            } else {
                System.out.println("Compra no realizada. Saldo insuficiente.");
                salir = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        // Ordenar la lista de compras por valor
        Collections.sort(tarjeta.getListaDeCompras());

        for (Compra compra : tarjeta.getListaDeCompras()) {
            System.out.println(compra.getDescripcion() + " - " + compra.getValor());
        }
        System.out.println("\n***********************");
        System.out.println("\nSaldo disponible de la tarjeta: " + tarjeta.getSaldo());
        System.out.println("\n***********************");

    }
}
