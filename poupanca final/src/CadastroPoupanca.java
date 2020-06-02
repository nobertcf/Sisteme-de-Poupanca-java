
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextField;


public class CadastroPoupanca extends JFrame implements ActionListener{
    public JLabel lId,lNome,lMorada,lCell;
    public JTextField tId,tNome, tMorada, tCell;
    public JButton bCadastrar,bActualizar, bApagar,bVoltar,bSair;
    public CadastroPoupanca(){
        
       // setSize(700,700);
       // setTitle("PAGINA PRINCIPAL");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
       // setVisible(true);
        
       // JFrame f =new JFrame();
        Container c = getContentPane();
        lId=new JLabel("ID");
        lNome = new JLabel("NOME");
        lMorada= new JLabel("MORADA");
        lCell = new JLabel("CELL");
        tId=new JTextField(15);
        tNome = new JTextField(15);
        tMorada =new JTextField(15);
        tCell = new JTextField(15);
        bCadastrar=new JButton("CADASTRAR");
        bActualizar = new JButton("ATUALIZAR");
        bApagar= new JButton("APAGAR");
        bVoltar= new JButton("VOLTAR");
        bSair=new JButton("SAIR");
        
        c.add(lId);
        c.add(lNome);
        c.add(lMorada);
        c.add(lCell);
        c.add(tId);
        c.add(tNome);
        c.add(tMorada);
        c.add(tCell);
        c.add(bCadastrar);
        c.add(bActualizar);
        c.add(bApagar);
        c.add(bVoltar);
        c.add(bVoltar);
        c.add(bSair);
        
        lId.setBounds(15,10,60,35);
        lNome.setBounds(15,60,110,35);
        lMorada.setBounds(15,110,110,35);
        lCell.setBounds(15,160,110,35);
        tId.setBounds(70,10,250,35);
        tNome.setBounds(70,60,250,35);
        tMorada.setBounds(70,110,250,35);
        tCell.setBounds(70,160,250,35);
        bCadastrar.setBounds(35,250,100,50);
        bApagar.setBounds(155,250,100,50);
        bActualizar.setBounds(285,250,100,50);
        bVoltar.setBounds(290,315,85,30);
        bSair.setBounds(0,300,60,50);
        
        bCadastrar.addActionListener(this);
        bActualizar.addActionListener(this);
        bApagar.addActionListener(this);
        bVoltar.addActionListener(this);
        
        setVisible(true);
        setSize(400,400);
        setTitle("POUPANCA");
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
       
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Contribuintes b= new Contribuintes();
        PoupancaDao d = new PoupancaDao();
        
        if(e.getSource()==bCadastrar){
            
         b.setNome(tNome.getText());
         b.setMorada(tMorada.getText());
         b.setCell(Integer.parseInt(tCell.getText()));
            try {
                d.Create(b);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Contribuintes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else{
            if(e.getSource()==bActualizar){
            //tNome.setText(""+p.create(tNome.getText()));
            
         b.setNome(tNome.getText());
         b.setMorada(tMorada.getText());
         b.setCell(Integer.parseInt(tCell.getText()));
            try {
                d.actualizar(b);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Contribuintes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        }
       if(e.getSource()==bVoltar){
                
                new TelaPrincipal().setVisible(true);
                setVisible(false);
    }
        
    }
}
