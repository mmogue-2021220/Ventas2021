
package modelo;

public class Empleado {
    private int codigoEmpleado;
    private String nombresEmpleado;
    private String telefonEmpleado;

    public Empleado() {
    }

    public Empleado(int codigoEmpleado, String nombresEmpleado, String telefonEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombresEmpleado = nombresEmpleado;
        this.telefonEmpleado = telefonEmpleado;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombresEmpleado() {
        return nombresEmpleado;
    }

    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = nombresEmpleado;
    }

    public String getTelefonEmpleado() {
        return telefonEmpleado;
    }

    public void setTelefonEmpleado(String telefonEmpleado) {
        this.telefonEmpleado = telefonEmpleado;
    }
    
}
