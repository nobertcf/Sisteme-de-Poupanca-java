
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class JLog implements ActionListener {
    
    
        
    
    private JLabel lname, lSenha;
    private JTextField tname;
    private JPasswordField tpSenha;
    private JButton bEntrar, bSair;
    
    JFrame f = new JFrame();
    Container c=f.getContentPane();
    JLog(){
        //super("TELA LOGIN");
        
           f.setTitle("TELA LOGIN");
        lname =new JLabel("Nome");
        lSenha=new JLabel("SENHA");
        tname = new JTextField(15);
        tpSenha = new JPasswordField(15);
        bEntrar = new JButton("ENTRAR");
        bSair = new JButton("SAIR");
        
         
        c.add(lname);
        c.add(lSenha);
        c.add(tname);
        c.add(tpSenha);
        c.add(bEntrar);
        c.add(bSair);
        
        
        lname.setBounds(15,25,110,50);
        lSenha.setBounds(15,100,110,50);
        tname.setBounds(60,25,250,45);
        tpSenha.setBounds(60,100,250,40);
        bEntrar.setBounds(60,180,90,30);
        bSair.setBounds(240,180,70,30);
        
        bEntrar.addActionListener(this);
        bSair.addActionListener(this);
        
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    /*public void actinPerfomed(ActionEvent e) throws ClassNotFoundException{
        
    }*/
    LoginDAO log = new LoginDAO();
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
       if (e.getSource().equals(bEntrar)){
            String n = tname.getText();
            String p = tpSenha.getText();
            
           try {
               if(log.fazerlogin(n, p)){
                   TelaPrincipal  tp = new TelaPrincipal();
                 
               }
               else{
                   JOptionPane.showMessageDialog(lname, lname);
               }
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(JLog.class.getName()).log(Level.SEVERE, null, ex);
           }
        } 
       
       if(e.getSource().equals(bSair)){
        f.setVisible(false);
        
    }
        
    }
    
}
