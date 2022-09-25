package org.francodevs.personacompany;

public class Empleado extends Persona{

    private Double remuneracion;
    private Integer empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, Integer empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += remuneracion * porcentaje/100;
    }

    @Override
    public String toString() {
        return super.toString() + " - ID empleado: " + this.empleadoId + " - Remuneración: $" + this.remuneracion;
    }
}
