package entidades;

import java.time.LocalDate;

public class Alumno  {

    private int ID = -1; 
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fecha_nac;
    private boolean estado;

    public Alumno(int ID, String nombre, String apellido, int dni, LocalDate fecha_nac, boolean estado) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nac = fecha_nac;
        this.estado = estado;
    }

    public Alumno(String nombre, String apellido, int dni, LocalDate fecha_nac, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nac = fecha_nac;
        this.estado = estado;
    }

    public Alumno() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "ID=" + ID + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fecha_nac=" + fecha_nac + ", estado=" + estado + '}';
    }
    
    
    
    
    

 
    
   
    
   

    

    
}
