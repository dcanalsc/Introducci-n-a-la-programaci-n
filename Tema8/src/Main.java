public class Main {
    public static void main(String[] args) {

     Persona persona = new Persona();
     persona.setEdad(44);
     persona.setNombre("Daniel");
     persona.setTelefono(666666666);
     System.out.println("Nombre:"+" "+persona.getNombre());
     System.out.println("Edad:"+" "+persona.getEdad());
     System.out.println("Telefono:"+" "+persona.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

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