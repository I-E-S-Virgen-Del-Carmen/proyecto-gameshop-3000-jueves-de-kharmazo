public class Juego {

      private String titulo;
      private double precio;
      private String genero;

      public Juego(String titulo, double precio, String genero) {
            this.titulo = titulo;
            this.precio = precio;
            this.genero = genero;
      }

      public String getTitulo() {
            return titulo;
            public double getPrecio() {
                  return precio; }

            public String getGenero() {
                  return genero;
            }

            public void setTitulo(String titulo) {
                  this.titulo = titulo;
            }

            public void setPrecio(double precio) {
                  if (precio >= 0) {
                        this.precio = precio;
                  } else {
                        System.out.println("El precio no puede ser negativo.");
                  }
            }

            public void setGenero(String genero) {
                  this.genero = genero;
            }

            public void mostrarInfo() {
                  System.out.println("----- Información del Juego -----");
                  System.out.println("Título: " + titulo);
                  System.out.println("Precio: $" + precio);
                  System.out.println("Género: " + genero);
            }

            public void aplicarDescuento(double porcentaje) {
                  if (porcentaje > 0 && porcentaje <= 100) {
                        double descuento = precio * (porcentaje / 100);
                        precio -= descuento;
                        System.out.println("Descuento aplicado. Nuevo precio: $" + precio);
                  } else {
                        System.out.println("Porcentaje inválido.");
                  }
            }
      }
