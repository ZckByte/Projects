package modelo;

public class Empleado {
    private String nombre;
    private String id;
    private int añosTrabajo;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String id, int añosTrabajo, String puesto, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.añosTrabajo = añosTrabajo;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAñosTrabajo() {
        return añosTrabajo;
    }

    public void setAñosTrabajo(int añosTrabajo) {
        this.añosTrabajo = añosTrabajo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int calcularVacaciones() {
        if (añosTrabajo <= 0) return 0;
        return Math.min(5 + (añosTrabajo - 1) * 2, 20);
    }
}
