
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JLabel;


public class JLogin extends JFrame {
    JLabel Lname;
    JTextField tname;
    JButton bEntrar,bSair;
    
   JLogin(){
       Lname = new JLabel("username");
       tname = new JTextField(15);
       bEntrar = new JButton("entrar");
       bSair = new JButton("Sair");
       add(Lname);
       add(tname);
       add(bEntrar);
       add(bSair);
       
       setLayout(new GridLayout(2,2));
       setSize(400,300);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setTitle("Tela de login");
       setVisible(true);
       
   }
   
}
