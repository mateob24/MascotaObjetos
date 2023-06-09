import javax.swing.JOptionPane;

public class Mascota {
	// Atributos
		private int codigo;
	    private String nombre;
	    private String especie;
	    private int edad;
	    
	    //Constructor sin parametros
	    public Mascota() {
	    	  nombre = "Default";
	          especie = "Default";
	          edad = 0;
	    }
	    
	    // Constructor con parametros
//	    public Mascota(String nombre, String especie, int edad, String accion, String cualidad) {
//	        this.nombre = nombre;
//	        this.especie = especie;
//	        this.edad = edad;
//	    }
	    
	    public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getEspecie() {
			return especie;
		}

		public void setEspecie(String especie) {
			this.especie = especie;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
  
	    
//-------------------------------------------------------------------------------------------------------------------
	    
	    
		public void ingresar() {
	    	nombre = JOptionPane.showInputDialog("Ingrese nombre de la mascota");
	        especie = JOptionPane.showInputDialog("Ingrese la especie de "+nombre);
	        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de "+nombre));
	    }


		// Método para mostrar información de la mascota
	    public void mostrarInformacion() {
	    	System.out.println("INFORMACIÓN MASCOTA: "+nombre);
	        System.out.println("-Especie: " + especie);
	        System.out.println("-Edad: " + edad + " años");
	    }

	    // Método para hacer que la mascota realice un sonido
	    public void hacerSonido(String especie) {
	        if (especie.equalsIgnoreCase("perro")) {
	            System.out.println("¡Guau guau!");
	        } else if (especie.equalsIgnoreCase("gato")) {
	            System.out.println("¡Miau miau!");
	        } else if (especie.equalsIgnoreCase("vaca")) {
	            System.out.println("¡Muu muu!");
	        } else {
	            System.out.println("La mascota ingresada no tiene sonidos registrados.");
	        }
	    }
	    
	 // MÉTODO QUE NOS DEVOLVERÁ LA ACCIÓN DE LA MASCOTA
	    public void obtenerAccionMascota(String especie) {
	        if (especie.equalsIgnoreCase("perro")) {
	            System.out.println("Excava y corre");
	        } else if (especie.equalsIgnoreCase("gato")) {
	            System.out.println("Corre y trepa");
	        } else if (especie.equalsIgnoreCase("vaca")) {
	            System.out.println("Camino, corre poco");	 
	        } else {
	            System.out.println("No se registró esa acción");
	        }
	    }

	    //MÉTODO PARA LA CUALIDAD DE LA MASCOTA
	    public void obtenerCualidadMascota() {
	        if (especie.equalsIgnoreCase("perro")) {
	            System.out.println("Gran olfato");
	        } else if (especie.equalsIgnoreCase("gato")) {
	            System.out.println("Cazar");
	        } else if (especie.equalsIgnoreCase("vaca")) {
	            System.out.println("Da leche");
	        } else {
	            System.out.println("No se registró esa cualidad");
	        }
	    }
	    
}
