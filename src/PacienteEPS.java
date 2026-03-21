public class PacienteEPS extends Paciente{

    private String NombreEPS;

    public PacienteEPS() {
    }

    public PacienteEPS(String nombreEPS) {
        NombreEPS = nombreEPS;
    }

    public PacienteEPS(String nombre, int documento, double costoConsulta, String nombreEPS) {
        super(nombre, documento, costoConsulta);
        NombreEPS = nombreEPS;
    }

    public String getNombreEPS() {
        return NombreEPS;
    }

    public void setNombreEPS(String nombreEPS) {
        NombreEPS = nombreEPS;
    }

    @Override
    public double calcularCostoFinal(){
        double porcentaje;
        if(costoConsulta>=300000){
            porcentaje = 0.25;
        }else if(costoConsulta>=80000){
            porcentaje = 0.2;
        }else{
            porcentaje = 0.3;
        }
        double coPago = costoConsulta*porcentaje;
        if(esConsultaCostosa()){
            coPago = coPago - (coPago*0.05);
        }
        return coPago;
    }
}
