
import java.awt.Container;
import javax.swing.*;


public class LevantamentoPoupanca extends JFrame{

    private JLabel lNome,lLevantamento;
    private JTextField tNome,tLevantamento;
    private JButton bPesquisar,bLevantar;
    
    public LevantamentoPoupanca() {
                Container c = getContentPane();
        
        lNome = new JLabel("Nome");
        lLevantamento = new JLabel("levantamento");
        tNome =new JTextField(15);
        tLevantamento = new JTextField(15);
        bPesquisar= new JButton("PESQUISAR");
        bLevantar =new JButton("LEVANTAR");
        
        
        c.add(bLevantar);
        c.add(lNome);
        c.add(lLevantamento);
        c.add(tNome);
        c.add(tLevantamento);
        c.add(bPesquisar);
        
  
         
        
        lNome.setBounds(15,70,70,30);
        lLevantamento.setBounds(200,100,100,30);
        //lLevantamento.setBounds(20,5,100,40);
        tNome.setBounds(15,100,100,30);
        tLevantamento.setBounds(200,100,100,30);
        bPesquisar.setBounds(10,200,120,50);
        bLevantar.setBounds(10,300,120,50);
        
      
        
        setVisible(true);
        setTitle("LEVANTAMENTO");
        setSize(400,600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
