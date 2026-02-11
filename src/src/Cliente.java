import java.util.Scanner;

public class Cliente {

    private String nombre;
    private int id;
    private double saldo;
    private int juegos;

    public Cliente(String nombre, int id, double saldo, int juegos) {
        this.nombre = nombre;
        this.id = id;
        this.saldo = saldo;
        this.juegos = juegos;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setJuegos(int juegos) {
        this.juegos = juegos;
    }

    public int getJuegos() {
        return juegos;
    }

    public void mostrarCliente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Id: " + id );
        System.out.println("Saldo: " + saldo);
        System.out.println("Juegos: " + juegos);
    }

    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor que quiera depositar");
        int depositar = sc.nextInt();
        setSaldo(getSaldo() + depositar);
    }

    public void agregarJuego() {
        juegos++;
    }
}
