import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Paciente> lstPacientes = new ArrayList<>();

        int op;

        do{

            System.out.println("1. Crear paciente particular");
            System.out.println("2. Crear paciente por EPS");
            System.out.println("3. Crear paciente Que es vip");
            System.out.println("4. mostrar");
            System.out.println("5. buscar");
            System.out.println("6. Mostrar solo pacientes particulares");
            System.out.println("7. Mostrar solo pacientes de eps");
            System.out.println("8. Mostrar solo pacientes que sean vip");
            System.out.println("0, salir");

            op = teclado.nextInt();
            switch (op) {

                case 1:
                    System.out.println("1.Crear paciente particular");

                    System.out.println("Ingrese el Nombre");
                    String nombre1 = teclado.next();

                    System.out.println("Ingrese el documento");
                    int documento1 = teclado.nextInt();

                    System.out.println("Ingrese el costo de la consdulta ");
                    double costoConsulta1 = teclado.nextDouble();


                    PacienteParticular ed1 = new PacienteParticular(nombre1, documento1, costoConsulta1, 0);
                    lstPacientes.add(ed1);
                    break;

                case 2:

                    System.out.println("2.Crear paciente por EPS");

                    System.out.println("Ingrese el Nombre");
                    String nombre2 = teclado.next();

                    System.out.println("Ingrese la documento");
                    int documento2 = teclado.nextInt();

                    System.out.println("Ingrese el costo de la consulta ");
                    double costoConsulta2 = teclado.nextDouble();

                    System.out.println("Ingrese nombre de la EPS");
                    String NombreEPS = teclado.next();

                    PacienteEPS eh1 = new PacienteEPS(nombre2, documento2, costoConsulta2, NombreEPS);


                    lstPacientes.add(eh1);
                    break;

                case 3:

                    System.out.println("3.Crear paciewnte vip");

                    System.out.println("Ingrese el Nombre");
                    String nombre3 = teclado.next();

                    System.out.println("Ingrese el documento");
                    int documento3 = teclado.nextInt();

                    System.out.println("Ingrese costo de la consulta ");
                    double costoConsulta3 = teclado.nextDouble();

                    System.out.println("Ingrese los años de fidelidad");
                    double añosFidelidad = teclado.nextDouble();

                    PacienteVip el1 = new PacienteVip(nombre3, documento3, costoConsulta3, añosFidelidad);


                    lstPacientes.add(el1);
                    break;

                case 4:

                    System.out.println("---- LISTA DE EMPLEADOS ----");

                    for (Paciente e : lstPacientes) {
                        System.out.println("Nombre: " + e.getNombre());
                        System.out.println("Edad: " + e.getDocumento());
                        System.out.println("Salario calculado: " + e.costoConsulta);
                        System.out.println("-------------------------");
                    }

                    break;

                case 5:
                    System.out.println("Ingrese el nombre a buscar :");
                    String buscar = teclado.next();

                    for (Paciente e : lstPacientes) {
                        if (e.getNombre().equalsIgnoreCase(buscar)) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 6:

                    System.out.println("--- paciente particular ----");

                    for (Paciente e : lstPacientes) {
                        if (e instanceof PacienteParticular) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 7:

                    System.out.println("---- paciente epsS ----");

                    for (Paciente e : lstPacientes) {
                        if (e instanceof PacienteEPS) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 8:

                    System.out.println("---- Paciente vip ----");

                    for (Paciente e : lstPacientes) {
                        if (e instanceof PacienteVip) {
                            System.out.println(e);
                        }
                    }

                    break;

                case 0 :
                    System.out.println("saliendo del sistema");
                    break;

                default:
                    System.out.println("Opcion no valida");

            }

        } while (op!=0);
    }
}