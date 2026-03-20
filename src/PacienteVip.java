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


    public double calcularCostoFinal(){
        if(AniosFidelidad==10){
            System.out.println("El valor es de:" + costoConsulta);
            return costoConsulta + (costoConsulta*0.4);
        }else if(AniosFidelidad==5){
            System.out.println("El valor es de:" + costoConsulta);
            return costoConsulta + (costoConsulta*0.3);
        }else if(costoConsulta>300000){
            System.out.println("Valor supero el maximo");
            return costoConsulta;
        }else{
            return costoConsulta + (costoConsulta*0.2);
        }
    }

}
