


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author 10
 */
public class ConectionFactory { private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/poupanca";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection() throws ClassNotFoundException{
        
        try {
            
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (SQLException  ex) {
             throw new RuntimeException("Erro na conexao?", ex);
        }
        
    }
    
    public static void closeConnection(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                 System.err.println("Erro: "+ex);
            }
        }
        closeConnection(con);
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                 System.err.println("Erro: "+ex);
            }
        }
        closeConnection(con, stmt);
    }
    
    
}
