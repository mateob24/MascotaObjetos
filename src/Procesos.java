import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	HashMap<Integer, Mascota> mapMascotas = new HashMap<>();
	
	public void iniciar() {
		 String menu="MENU\n";
	        menu+="1. Ingresar mascota\n";
	        menu+="2. Consultar mascota individualmente\n";
	        menu+="3. Consultar lista de mascotas\n";
	        menu+="4. Salir\n";
	        menu+="Ingrese una opción:";
	        
	        int op=0;
	        
	        do {
	        	op=Integer.parseInt(JOptionPane.showInputDialog(menu));
	        	validarMenu(op);
				
			} while (op!=4);	
	}
	
	public void validarMenu(int op) {
		
        switch (op) {
        
        case 1:
        	 int rep,cod = 1;

             do {
                 Mascota mascota = new Mascota();
                 mascota.ingresar();
                 mapMascotas.put(cod, mascota);
                 cod++;

                 rep = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra mascota?", "Confirmación", JOptionPane.YES_NO_OPTION);
             } while (rep == JOptionPane.YES_OPTION);
             break;
        
        case 2:
            int codigoMascota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la mascota a consultar"));
            Mascota mascota = mapMascotas.get(codigoMascota);
            if (mascota != null) {
                System.out.println("Información de la mascota:");
                mascota.mostrarInformacion();
                System.out.println("-------------------");
            } else {
                System.out.println("No se encontró ninguna mascota con el código especificado.");
            }
            break;
        case 3:
            System.out.println("Lista de mascotas:");
            for (Mascota m : mapMascotas.values()) {
                m.mostrarInformacion();
                System.out.println("-------------------");
            }
            break;
        case 4:
            System.out.println("Saliendo del programa...");
            break;
        default:
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
    }
		
	}
}
