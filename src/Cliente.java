public class Cliente {

    private String nombre;
    private int id;
    private double saldo;

    public Cliente(String nombre, int id, double saldo) {
        this.nombre = nombre;
        this.id = id;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
