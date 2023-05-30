package entidades;

public class Inscripcion {

    private int id_inscripto;
    
    private Alumno alumno;

   private Materia materia;
   
    private int nota;

    public Inscripcion(int id_inscripto, Alumno alumno, Materia materia, int nota) {
        this.id_inscripto = id_inscripto;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia materia, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion() {
    }

    public int getId_inscripto() {
        return id_inscripto;
    }

    public void setId_inscripto(int id_inscripto) {
        this.id_inscripto = id_inscripto;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "id_inscripto=" + id_inscripto + ", alumno=" + alumno + ", materia=" + materia + ", nota=" + nota + '}';
    }
    

}
