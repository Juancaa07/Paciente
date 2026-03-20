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

    private double calcularCostoFinal;

    public double calcularCostoFinal(){
        if(costoConsulta<50000){
            System.out.println("El valor es de:" + costoConsulta);
            return costoConsulta + (costoConsulta*0.05);

        }else if(costoConsulta>200000){
            System.out.println("El valor es de:" + costoConsulta);
            return costoConsulta - (costoConsulta*0.10);
        }else if(costoConsulta>400000){
            System.out.println("El valor es de:" + costoConsulta);
            return costoConsulta - (costoConsulta*0.15);
        }else{
            return calcularCostoFinal;
        }
    }



}
