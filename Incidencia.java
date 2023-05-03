public class Incidencia {
    private int codigo;
    private static int codigoCompartido=1;
    private String estado;
    private String infoProblema;
    private int puesto;
    private String infoResuelto;

    public Incidencia(int puesto,String problema){
        this.codigo=codigoCompartido;
        codigoCompartido++;
        this.estado="Pendiente";
        this.puesto=puesto;
        this.infoResuelto="";
        this.infoProblema= problema;
    }

    public void resolverIncidencia(String info){
        this.estado="Resuelta";
        this.infoResuelto=info;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPuesto() {
        return this.puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public String getInfoResuelto() {
        return this.infoResuelto;
    }

    public void setInfoResuelto(String infoResuelto) {
        this.infoResuelto = infoResuelto;
    }


    @Override
    public String toString() {
        return " Incidencia= " + this.codigo + " - " +
             "  Puesto: " + this.puesto + " - " + this.infoProblema+" - "+
              this.estado + " - " +this.infoResuelto;
    }

}
