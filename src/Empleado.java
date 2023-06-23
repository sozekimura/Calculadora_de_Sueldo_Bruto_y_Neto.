public class Empleado
{
    public String nombre;
    public String puesto;
    public double horas;
    public double horasEx;

    //Datos empleado
    public Empleado(String nombre)
    {
        this.nombre = nombre;
    }


    public void setPuesto(String puesto)
    {
        this.puesto = puesto;
    }

    //Horas regulares
    public double getHoras()
    {
        return horas;
    }

    public void setHoras(double horas)
    {
        this.horas = horas;
    }

    //Horas extra
    public double getHorasEx()
    {
        return horasEx;
    }

    public void setHorasEx(double horasEx) {
        this.horasEx = horasEx;
    }
}
