public class Lavaropas extends Electrodomestico {
    private double precio;
    private boolean aguaCaliente;

    public Lavaropas(String marca, double potencia) {
        super("Lavaropas", marca, potencia);
        this.precio = 0;
        this.aguaCaliente = false;
    }

    /**
     * Este el constructor 2 de la clase lavarropas
     * espera recibir:
     *
     * @param marca    la marca del electro
     * @param precio   el precio
     * @param potencia en Wk/h
     * @param modo     true (agua caliente) false( agua fria)
     */
    public Lavaropas(String marca, double potencia, double precio, boolean modo) {
        super("", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = modo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavaropas{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

    @Override
    public double getConsumo(int horas) {
        if (!aguaCaliente)
            return potencia * horas;

        return (potencia + potencia * 0.20) * horas;
    }


    public double getTotalConsumo(int horas, double precioHora) {
        return getConsumo(horas) * precioHora;
    }

}
