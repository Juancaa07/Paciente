import java.util.Calendar;
public class PacienteParticular extends Paciente{

    private double ConsultarPrecio;

    public PacienteParticular() {
    }

    public PacienteParticular(double consultarPrecio) {
        ConsultarPrecio = consultarPrecio;
    }

    public PacienteParticular(String nombre, int documento, double costoConsulta, double consultarPrecio) {
        super(nombre, documento, costoConsulta);
        ConsultarPrecio = consultarPrecio;
    }

    public double getConsultarPrecio() {
        return ConsultarPrecio;
    }

    public void setConsultarPrecio(double consultarPrecio) {
        ConsultarPrecio = consultarPrecio;
    }

    @Override
    public double calcularCostoFinal(){
        if(costoConsulta>=400000){
            return aplicarDescuento(0.15);
        }else if(costoConsulta>=200000){
            return aplicarDescuento(0.10);
        }else if(costoConsulta<=50000){
            return aplicarRecarga(0.5);
        }else{
            return costoConsulta;
        }
    }

}
