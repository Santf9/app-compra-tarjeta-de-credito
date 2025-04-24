package modelo;

public class Compra implements Comparable<Compra> {
    private String descripcion;
    private double valor;

    public Compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: valor= " + valor + ", descripcion= " + descripcion;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        // Clase Double (Wrapper) al double primitivo para poder comparar los valores de Compra
        // Casting de double a Double
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
