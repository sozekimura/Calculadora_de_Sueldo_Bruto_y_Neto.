public class Sueldo
{
    public double salario;
    public double extra;

    public Sueldo()
    {
        this.salario = 71.87;
        this.extra = 25.96;
    }

    public double SueldoBruto (double horaRegular, double horaExtra)
    {
        return (horaRegular * salario) + (horaExtra * extra);
    }

    public double SueldoNeto (double horaRegular, double horaExtra)
    {
        double burto = SueldoBruto (horaRegular, horaExtra);

        if (burto < 2000)
        {
            return burto * 0.16;
        }
        else
        {
            return burto * 0.18;
        }
    }
}
