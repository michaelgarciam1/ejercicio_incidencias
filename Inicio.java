import java.util.ArrayList;

public class Inicio{
    public static void main(String[] args) {

        // creamos los objetos de la clase incidencia 
        Incidencia inc1 = new Incidencia(105 , "No tiene acceso a internet");
        Incidencia inc2 = new Incidencia(14 , "No arranca");
        Incidencia inc3 = new Incidencia(5 , "La pantalla se ve rosa");
        Incidencia inc4 = new Incidencia(237 , "Hace un ruido extraño");
        Incidencia inc5 = new Incidencia(111 , "Se queda colgado al abrir 3 ventanas");

        //resolvemos la incidencia 2 y 3
        inc2.resolverIncidencia("El equipo no estaba enchufado");
        inc3.resolverIncidencia("Cambio del cable VGA");

        //creamos una lista y le añadimos las incidencias
        ArrayList<Incidencia> incidencias = new ArrayList<Incidencia>();
        incidencias.add(inc1);
        incidencias.add(inc2);
        incidencias.add(inc3);
        incidencias.add(inc4);
        incidencias.add(inc5);

        //recorremos las incidencias para ver las que quedan e imprimimos todo por pantalla
        System.out.println("las incidiencias:");
        int count=0;
        for(Incidencia inc:incidencias){
            System.out.println(inc);
            if(inc.getEstado()=="Pendiente"){
                count++;
            }
        }
        System.out.println("Incidencias Pendiente: "+count);

        }
    }
