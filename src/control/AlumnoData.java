
package control;


import entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AlumnoData {
    
    private final Connection con ;

    public AlumnoData() {
        con = Conexion.getConexion();
    }
    
    public void agregarAlumno (Alumno alumno){
        
        String query = "INSERT INTO alumno (nombre,apellido,dni,fecha_nacimiento,estado) VALUES (?,?,?,?,1);";
          
        try{
            PreparedStatement st = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            st.setString(1, alumno.getNombre());
            st.setString(2, alumno.getApellido());
            st.setInt(3, alumno.getDni());
            st.setDate(4,Date.valueOf(alumno.getFecha_nac()));

        
            st.executeUpdate();
            
            ResultSet resultado = st.getGeneratedKeys();
            
            if(resultado.next()){
                alumno.setID(resultado.getInt(1));
            }
     
            st.close();
            
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null,"Error al guardar alumno ");
                e.getMessage();
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e.getMessage() );
            }
            
            }
    
    public Alumno buscarAlumno(int id_alumno){
        
        Alumno alumno=null ;
        String query = "SELECT * FROM alumno WHERE id_alumno = ? ;";
          
        try{
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,id_alumno);
 
            ResultSet resultado = st.executeQuery();
            
            if(resultado.next()){
                Alumno al = new Alumno();
                al.setID(resultado.getInt("id_alumno"));
                al.setNombre(resultado.getString("nombre"));
                al.setApellido(resultado.getString("apellido"));
                al.setDni(resultado.getInt("dni"));
                al.setFecha_nac (resultado.getDate("fecha_nacimiento").toLocalDate());
                al.setEstado(resultado.getBoolean("estado"));
                alumno=al;
            }
               st.close(); 

            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null,"Error al Buscar alumno ");
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e.getMessage() );
            }
             return alumno;
            }
    
    public void actualizarAlumno(Alumno al){
 
        
        try { 
            String queryUpdate = "UPDATE alumno SET nombre=?,apellido=?,dni=?,fecha_nacimiento=? WHERE id_alumno = ? ";
            PreparedStatement stUpdate = con.prepareStatement(queryUpdate);
           
            stUpdate.setString(1, al.getNombre());
            stUpdate.setString(2, al.getApellido());
            stUpdate.setInt(3,al.getDni());
            stUpdate.setDate(4, Date.valueOf(al.getFecha_nac()));
            stUpdate.setInt(5, al.getID());
             
            int exito = stUpdate.executeUpdate();
            
            if(exito==1){
                
                JOptionPane.showMessageDialog(null, "Alumno modificado");
                
            }else{
                 JOptionPane.showMessageDialog(null, "Alumno no encontrado");
            }
            stUpdate.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a tabla alumnos");
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }       
        
        
    }
        
    public void borrarAlumno(int id_alumno){
        
        String query = "SELECT id_alumno FROM alumno WHERE id_alumno = ?";
        
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, id_alumno);
            ResultSet resultado = st.executeQuery();
 
            if(resultado.next()){
                
            String bajaLogica = "UPDATE alumno SET estado = false WHERE id_alumno = ? ";
            PreparedStatement st_delete = con.prepareStatement(bajaLogica);
            st_delete.setInt(1, id_alumno);
            st_delete.executeUpdate();
              JOptionPane.showMessageDialog(null, "registro eliminado");
            }else{
              JOptionPane.showMessageDialog(null, "ID del alumno no encontrado");
            }
            
          st.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }   
    
    public void habilitarAlumno(Alumno alumno){

        if(alumno.isEstado()==false){
         try { 
            String queryUpdate = "UPDATE alumno SET estado=true WHERE id_alumno = ? ";
            PreparedStatement stUpdate = con.prepareStatement(queryUpdate);
            stUpdate.setInt(1, alumno.getID());
            int exito = stUpdate.executeUpdate();
            if(exito==1){
                
                JOptionPane.showMessageDialog(null, "Alumno dado de alta");
//                alumno.isEstado();
                
            }else{
                 JOptionPane.showMessageDialog(null, "Alumno no encontrado");
            }
            stUpdate.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a tabla alumnos");
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        }else{
            JOptionPane.showMessageDialog(null, "El alumno ya esta habilitado");
        } 
    }

    public  ArrayList<Alumno> alumnosActivo(){
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();

                alumno.setID(rs.getInt("id_Alumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha_nac(rs.getDate("fecha_Nacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            JOptionPane.showMessageDialog(null, alumnos.toString());
            ps.close();
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        return alumnos;
    }

    }    
        

    
    
    
    
    

