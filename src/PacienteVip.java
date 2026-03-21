public class PacienteVip extends Paciente{

    private double AniosFidelidad;

    public PacienteVip() {
    }

    public PacienteVip(double aniosFidelidad) {
        AniosFidelidad = aniosFidelidad;
    }

    public PacienteVip(String nombre, int documento, double costoConsulta, double aniosFidelidad) {
        super(nombre, documento, costoConsulta);
        AniosFidelidad = aniosFidelidad;
    }

    public double getAniosFidelidad() {
        return AniosFidelidad;
    }

    public void setAniosFidelidad(double aniosFidelidad) {
        AniosFidelidad = aniosFidelidad;
    }

    @Override
    public double calcularCostoFinal(){
        double porcentaje;

        if(AniosFidelidad>=10){
            porcentaje = 0.4;
        }else if(AniosFidelidad>=5){
            porcentaje = 0.3;
        }else{
            porcentaje = 0.2;
        }
        double total = aplicarDescuento(porcentaje);
        if(total> 300000){
            total = 30000;
        }
        return total;
    }
}
