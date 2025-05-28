public class Estudiante {
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

     public void setNota(int i, double nota) {
        if (i >= 0 && i < notas.length) {
            notas[i] = nota;
        }
    }

    public double getNota(int i) {
        if (i >= 0 && i < notas.length) {
            return notas[i];
        }
        return 0;
    }

    public double calcularPromedio(){
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public boolean aprobar() {
        return calcularPromedio() >= 70;
    }


}