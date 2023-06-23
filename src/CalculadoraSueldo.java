import java.util.Scanner;

public class CalculadoraSueldo
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Ingreso de datos
        System.out.print("¿Cual es el nombre del empleado?");
        Empleado empleado = new Empleado(scanner.nextLine());

        System.out.print("¿Cual es el puesto del empleado?");
        empleado.setPuesto(scanner.nextLine());

        System.out.print("¿Cuantas horas regulares a laborado?");
        empleado.setHoras(scanner.nextDouble());

        System.out.print("¿Cuantas horas extra a laborado?");
        empleado.setHorasEx(scanner.nextDouble());


        Sueldo sueldo = new Sueldo();

        //Impresiones

        //System.out.println("El empleado ");


        System.out.print("El sueldo bruto del empleado es ");
        System.out.println(sueldo.SueldoBruto(empleado.getHoras(),empleado.getHorasEx())+ " Bolivares");

        System.out.print("El sueldo neto del empleado es ");
        System.out.println(sueldo.SueldoNeto(empleado.getHoras(),empleado.getHorasEx())+ " Bolivares..jaja");
    }
}