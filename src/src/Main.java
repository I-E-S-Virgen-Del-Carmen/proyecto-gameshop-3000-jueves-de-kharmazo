import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        Cliente cliente1 = new Cliente("Sanchet",0,0,0 );
        Juego juego1 = new Juego("El arca de Sanchet",25.99,"Comedia");
        Juego juego2 = new Juego("Me salgo de DAM",29.99,"Terror");
        Juego juego3 = new Juego("La historia del falso 9",50,"Aventura");

        do {
            System.out.println("Opción 1: Registrar Cliente");
            System.out.println("Opción 2: Ver datos del Cliente");
            System.out.println("Opción 3: Ingresar dinero");
            System.out.println("Opción 4: Mostrar los Juegos");
            System.out.println("Opción 5: Aplicar descuento a un juego");
            System.out.println("Opción 6: Comprar juego");
            System.out.println("Opción 7: Salir");
            System.out.print("Elige una opción: ");

            n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    System.out.println();
                    System.out.print("Ingresa el nombre del Cliente: ");
                    cliente1.setNombre(sc.nextLine());

                    System.out.print("Ingresa el id del Cliente: ");
                    cliente1.setId(sc.nextInt());

                    System.out.print("Ingresa el saldo del Cliente: ");
                    cliente1.setSaldo(sc.nextDouble());
                    sc.nextLine();

                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    cliente1.mostrarCliente();
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    cliente1.deposit();
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("--- Juego 1 ---");
                    juego1.mostrarInfo();
                    System.out.println();

                    System.out.println("--- Juego 2 ---");
                    juego2.mostrarInfo();
                    System.out.println();

                    System.out.println("--- Juego 3 ---");
                    juego3.mostrarInfo();
                    System.out.println();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("A que juego quieres aplicar un descuento?");
                    System.out.println("1-El arca de Sanchet");
                    System.out.println("2-Me salgo de DAM");
                    System.out.println("3-La historia del falso 9");

                    n = sc.nextInt();

                    switch (n) {
                        case 1:
                            System.out.print("Aplica el descuento(10,20,...): ");
                            juego1.aplicarDescuento(sc.nextDouble());
                            System.out.println();
                            break;

                        case 2:
                            System.out.print("Aplica el descuento(10,20,...):");
                            juego2.aplicarDescuento(sc.nextDouble());
                            System.out.println();
                            break;

                        case 3:
                            System.out.print("Aplica el descuento(10,20,...):");
                            juego3.aplicarDescuento(sc.nextDouble());
                            System.out.println();
                            break;

                    }

                    System.out.println();
                    break;

                case 6:
                        System.out.println();
                        System.out.println("Que juego desea comprar?");
                        System.out.println("1-El arca de Sanchet");
                        System.out.println("2-Me salgo de DAM");
                        System.out.println("3-La historia del falso 9");

                        System.out.println();

                       n = sc.nextInt();
                        switch(n) {
                            case 1:
                                System.out.println("Desea comprar este juego?");
                                System.out.println("1-Si");
                                System.out.println("2-No");

                                n = sc.nextInt();
                                if(n == 1) {

                                    if(cliente1.getSaldo() >= juego1.getPrecio()){

                                        cliente1.setSaldo(cliente1.getSaldo() - juego1.getPrecio());
                                        cliente1.agregarJuego();
                                    }else{
                                        System.out.println("Saldo insuficiente");
                                    }
                                }else{
                                    System.out.println("Saliendo");
                                }
                                System.out.println();
                                break;

                            case 2:
                                System.out.println("Desea comprar este juego?");
                                System.out.println("1-Si");
                                System.out.println("2-No");

                                n = sc.nextInt();
                                if(n == 1) {

                                    if(cliente1.getSaldo() >= juego2.getPrecio()){

                                        cliente1.setSaldo(cliente1.getSaldo() - juego2.getPrecio());
                                        cliente1.agregarJuego();
                                    }else{
                                        System.out.println("Saldo insuficiente");
                                    }
                                }else{
                                    System.out.println("Saliendo");
                                }
                                System.out.println();
                                break;

                            case 3:
                                System.out.println("Desea comprar este juego?");
                                System.out.println("1-Si");
                                System.out.println("2-No");

                                n = sc.nextInt();
                                if(n == 1) {

                                    if(cliente1.getSaldo() >= juego3.getPrecio()){

                                        cliente1.setSaldo(cliente1.getSaldo() - juego3.getPrecio());
                                        cliente1.agregarJuego();
                                    }else{
                                        System.out.println("Saldo insuficiente");
                                    }
                                }else{
                                    System.out.println("Saliendo");
                                }
                                System.out.println();
                                break;
                        }
                    break;

                case 7:
                    break;
            }
        } while (n != 7);

        sc.close();
    }
}

