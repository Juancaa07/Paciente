public class Paciente {

    protected String nombre;
    protected int documento;
    protected double costoConsulta;

    public Paciente() {
    }

    public Paciente(String nombre, int documento, double costoConsulta) {
        this.nombre = nombre;
        this.documento = documento;
        this.costoConsulta = costoConsulta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    public double calcularCostoFinal(){
        return costoConsulta;
    }

    public double aplicarDescuento(double porcentaje){
        return costoConsulta - (costoConsulta + porcentaje);
    }

    public double aplicarRecarga(double porcentaje){
        return costoConsulta - (costoConsulta + porcentaje);
    }

    public boolean esConsultaCostosa(){
        return costoConsulta > 300000;
    }

    public void mostrarInformacion(double costoFinal){
        System.out.println("Nombre"+ nombre);
        System.out.println("Documento"+ documento);
        System.out.println("Costo inicial"+costoConsulta);
        System.out.println("Costo final"+ costoFinal);
    }

}
