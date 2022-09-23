public class Main {
    public static void main(String[] args) {

      //creamos objeto cliente y le damos valores

        Cliente cliente = new Cliente();
        cliente.setNombre("Juanlu");
        cliente.setEdad(49);
        cliente.setTelefono(999999999);
        cliente.setCredito(-1000);
        System.out.println("Cliente:"+" "+cliente.getNombre()+"\t\t"+"Credito:"+" "+cliente.getCredito());
        System.out.println("Edad:"+" "+cliente.getEdad()+"\t\t\t"+"Teléfono:"+" "+cliente.getTelefono());

        //creamos objeto trabajador y le damos valores

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Juanillo");
        trabajador.setEdad(30);
        trabajador.setTelefono(666666666);
        trabajador.setSalario(2560);
        System.out.println("Trabajador:"+" "+trabajador.getNombre()+"\t\t"+"Salario:"+" "+trabajador.getSalario());
        System.out.println("Edad:"+" "+trabajador.getEdad()+"\t\t\t"+"Teléfono:"+" "+trabajador.getTelefono());

    }
}
class Persona{
    public int edad;
    public String nombre;
    public int telefono;
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }
}
class Cliente extends Persona{
    private float credito;
    public float getCredito() {
        return credito;
    }
    public void setCredito(float credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    private double salario;
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}