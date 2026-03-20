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

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", costoConsulta=" + costoConsulta +
                '}';
    }



}
