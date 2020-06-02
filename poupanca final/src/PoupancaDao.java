
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHASSARA
 */
public class PoupancaDao {
    
    public Connection conexao= null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    
    
    public void Create(Contribuintes b) throws ClassNotFoundException{
        Connection con = ConectionFactory.getConnection() ;
        PreparedStatement stmt = null;
        try {
            stmt=con.prepareStatement("Insert Into popanca (nome,morada,cell) values(?,?,?)");
            stmt.setString(1, b.getNome());
            stmt.setString(2, b.getMorada());
            stmt.setInt(3,b.getCell());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Salvo com Sucessso");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar" + ex);
        }finally{
            ConectionFactory.closeConnection(con, stmt);
        }
    }
    
     public void read (){
        
         
         
        
       String sql= "select * from membros where id=?";
        try {
            CadastroPoupanca pp=new CadastroPoupanca();
            Contribuintes contr =new Contribuintes();
            ConectionFactory con = new ConectionFactory();
            Contribuintes contribuinte=new Contribuintes();
            conexao = con.getConnection();
            pst= conexao.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(pp.tId.getText()));
            //pst.setInt(2,contribuintes.getId());
            rs= pst.executeQuery();
            if(rs.next()){
               
               rs.getString("nome");
              // pp.setIdade(rs.getInt("idade));
            }
            
            else{
                JOptionPane.showMessageDialog(null,"id nao encontrado");
            }
            
            
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
        }
      
     }
     
     public List<Contribuintes> Read() throws ClassNotFoundException{
       
        Connection con =ConectionFactory.getConnection();
        PreparedStatement stmt=null;
        ResultSet rs=null;
        
        List<Contribuintes> contribuinte =  new ArrayList<>();
         
     try {
         stmt=con.prepareStatement("SELECT * FROM contribuintes ");
          rs = stmt.executeQuery();
          while(rs.next()){
              Contribuintes contribuintes=new Contribuintes();
              
              contribuintes.setId(rs.getInt("ID"));
              contribuintes.setNome(rs.getString("Nome"));
              contribuintes.setMorada(rs.getString("deposito"));
              contribuintes.setCell(rs.getInt("saldo"));
              
              contribuinte.add(contribuintes);
          }
          
                 } catch (SQLException ex) {
         Logger.getLogger(PoupancaDao.class.getName()).log(Level.SEVERE, null, ex);
     }
     finally{
         ConectionFactory.closeConnection(con, stmt, rs);
         
     }
       return contribuinte; 
    }
         public void actualizar(Contribuintes contribuinte) throws ClassNotFoundException{
        Connection con =ConectionFactory.getConnection();
        //String sql="INSERT INTO contribuintes(Nome,deposito,saldo ) VALUES(?,?,?)";
        PreparedStatement stmt=null;
     try {
         stmt=con.prepareStatement("UPDATE  popanca set nome=?,morada=?,cell=? where id=?");
         //stmt=con.prepareStatement(null);
         JOptionPane.showMessageDialog(null," " + contribuinte.getNome() + contribuinte.getCell()  );
         stmt.setInt(4,contribuinte.getId());
         stmt.setString(1, contribuinte.getNome());
         stmt.setString(2,contribuinte.getMorada());
         stmt.setInt(3, contribuinte.getCell());
        
         
         stmt.executeUpdate();
         
          JOptionPane.showMessageDialog(null, "Actualizado com sucesso com Sucesso");
                 
     } catch (SQLException ex) {
         System.err.println(" ERRO"+ex);
         JOptionPane.showMessageDialog(null, "Erro ao Actualizar "+ ex);
         
     }
        finally{
         ConectionFactory.closeConnection(con, stmt);
     }
        
    }
        /*  public int fazerPesquisa (String Nome)throws ClassNotFoundException{
        ConectionFactory con = new ConectionFactory();
        conexao = con.getConnection();
        String sql= "select Valor from aula where Nome=?";
        try {
            
            pst= conexao.prepareStatement(sql);
            pst.setString(1,Nome);
            rs= pst.executeQuery();
            if(rs.next()){
               valor= rs.getInt("Valor");
            }
            
            else{
                JOptionPane.showMessageDialog(null,"Nome nao encontrado");
            }
            
            
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
        }
       return valor; 
    }*/
    }

