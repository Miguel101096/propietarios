package ejecutable;

import modelo.CONDUCTOR;
import modelo.Genera_Cuenta;
import vistas.PRINCIPAL;


public class Ejecutable {
    
    public static void main(String[] args) {

//      ARCHIVOS_PLANOS obj = new ARCHIVOS_PLANOS();       
////      obj.leerArchivo("172526388-1");
//        PRINCIPAL p = new PRINCIPAL();
//        p.setLocationRelativeTo(null);
//        p.setVisible(true);
        
        
//        
        Genera_Cuenta gc = new Genera_Cuenta();
        CONDUCTOR con=gc.generaDatosConductor("123213123-1");
//        PASAJERO pasajero = gc.generaDatosPasajero("175168097-4");
        System.out.println(con.getNombre());
      
    }
    
}
