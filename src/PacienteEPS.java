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

    private int coPago;

    public double calcularCostoFinal(){
        if(costoConsulta==50000){
            System.out.println("El valor es de:" + costoConsulta);
            return costoConsulta + (costoConsulta*0.25);
        }else if(costoConsulta==80000){
            System.out.println("El valor es de:" + costoConsulta);
            return costoConsulta + (costoConsulta*0.2);
        }else if(costoConsulta>1000000){
            System.out.println("El valor es de:" + costoConsulta);
            return costoConsulta + (costoConsulta*0.05);
        }else{
            System.out.println("El valor es de:" + coPago );
            return coPago;
        }
    }



}
