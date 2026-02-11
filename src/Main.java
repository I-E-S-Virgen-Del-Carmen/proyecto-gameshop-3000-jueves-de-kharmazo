import java.util.*;
public static void main(String[] args){
    Scanner sc = new Scanner(SystemIn);

    int n = sc.nextInt();

    Cliente cliente1 = new Cliente();
    Juego juego1 = new Juego();

    do {
        System.out.println("Opción 1: Registrar Cliente" );

        System.out.println("Opción 2: Ver datos del Cliente" )

        System.out.println("Opción 3: Ingresar datos del Juego" );

        System.out.println("Opción 4: Mostrar datos del Juego" );

        System.out.println("Opción 5: Aplicar descuento" );

        switch(n){
            case 1:
                System.out.print("Ingresa el nombre del Cliente : ")
                cliente1.setNombre(sc.nextLine());

                System.out.println();

                System.out.print("Ingresa el id del Cliente : ")
                cliente1.setId(sc.nextInt());

                System.out.println();

                System.out.print("Ingresa el saldo del Cliente : ")
                cliente1.setSaldo(sc.nextDouble());
                break;

            case 2:
                System.out.println(cliente1.toString());
                break;

            case 3:
                System.out.println("Ingresa el titulo: ")
                juego1.setTitulo(sc.nextLine());

                System.out.println("Ingresa el precio del Juego : ")
                juego1.setPrecio(sc.nextDouble());

                System.out.println("Ingresa el género del Juego : ")
                juego1.setGenero(sc.nextLine());
                break;

             case 4:
                 juego1.mostrarInfo();
                 break;

             case 5:
                 System.out.println("Añade un porcentaje(10,20,...)");
                 juego1.aplicarDescuento(sc.nextDouble());
                 break;
        }
    }while(n != 5);
}
