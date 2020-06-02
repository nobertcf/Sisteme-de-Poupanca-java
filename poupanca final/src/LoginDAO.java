/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sun.javafx.scene.NodeHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 10
 */
public class LoginDAO {
    public Connection conexao= null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    public boolean fazerlogin (String user, String password) throws ClassNotFoundException{
        ConectionFactory con = new ConectionFactory();
        conexao = con.getConnection();
        String sql = "select* from login where user= ? and password=?";
        try{
            pst= conexao.prepareStatement(sql);
            pst.setString(1,user);
            pst.setString(2,password);
            rs = pst.executeQuery();
            if (rs.next()){
                return true;
            }}
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,"erro:"+ ex);
        }
        return false;
        }/*
    public void Save (Contribuintes contribuintes){
        
      PreparedStatement pst = null;
      
      try {
          pst = conexao.prepareStatement("insert into membros (Id,nome,idade, cell) values (?,?,?,? )");
          
          //pst.setInt(1,contribuintes.getId());
          pst.setString(2,contribuintes.getNome());
          pst.setString(3,contribuintes.getMorada());
          pst.setInt(4,contribuintes.getCell());
          pst.executeUpdate();
      }
      catch(SQLException ex){
          System.err.println("ERRO"+ex);
          JOptionPane.showMessageDialog(null,"ERRO AO SALVAR"+ ex);
      }
        
       }
    
     public int read (Contribuintes contribuintes)throws ClassNotFoundException{
        ConectionFactory con = new ConectionFactory();
        Contribuintes contribuinte=new Contribuintes();
        conexao = con.getConnection();
        String sql= "select * from membros where id=?";
        try {
            
            pst= conexao.prepareStatement(sql);
            pst.setInt(1,contribuintes.getId());
            pst.setInt(2,contribuintes.getId());
            rs= pst.executeQuery();
            if(rs.next()){
                Contribuintes cont=new Contribuintes();
               cont.setNome(rs.getString("nome"));
               cont.setString(rs.getString("idade"));
            }
            
            else{
                JOptionPane.showMessageDialog(null,"id nao encontrado");
            }
            
            
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
        }
       return read(contribuintes);
    
       }
     */
     
     
    }

