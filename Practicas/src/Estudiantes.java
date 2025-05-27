public class Estudiantes {
    private String nombre;
    private String matricula;
    private double[] notas = new double[5];

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double[] getNotas() {
        return notas;
        
    }
}