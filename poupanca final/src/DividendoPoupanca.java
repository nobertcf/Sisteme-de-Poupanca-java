
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.*;


public class DividendoPoupanca extends JFrame{
        private JLabel lNome,lDeposito;
    private JTextField tNome,tDeposito;
    private JButton bPesquisar,bconsulta;
    private JTable tblDeposito;
    private JScrollPane JSDeposito;
    
    public DividendoPoupanca() {
        
        
        
        Container cont = getContentPane();
        
        lNome=new JLabel("Nome");
        lDeposito= new JLabel("Deposito");
        tNome= new JTextField(15);
        tDeposito= new JTextField(15);
        bPesquisar= new JButton("PESQUISAR");
        bconsulta= new JButton("CONSULTA");
        tblDeposito = new JTable();
        JSDeposito = new JScrollPane();
        
        cont.add(lNome);
        cont.add(lDeposito);
        cont.add(tNome);
        cont.add(tDeposito);
        cont.add(bPesquisar);
        cont.add(bconsulta);
        cont.add(tblDeposito);
        cont.add(JSDeposito);
        
        lNome.setBounds(15,50,100,30);
        lDeposito.setBounds(200,50,100,30); 
        tNome.setBounds(15,100,100,30);
        tDeposito.setBounds(200,100,100,30);
        bPesquisar.setBounds(15,250,150,50);
        bconsulta.setBounds(200,250,150,50);
        tblDeposito.setBounds(15,350,150,200);
        JSDeposito.setBounds(350,350,50,50);
         
        
        setVisible(true);
        setTitle("DEPOSITOS");
        setSize(400,600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
    }
    
}
