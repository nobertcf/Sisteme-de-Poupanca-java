
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class TelaPrincipal extends JFrame implements ActionListener {
    
    private JLabel lData,lSaldo;
    private JTextField tData,tSaldo;
    private JButton bDeposito,bLevantamento,bCadastro, bDividendo;
   
    TelaPrincipal(){
        setSize(700,700);
        setTitle("PAGINA PRINCIPAL");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
       // JFrame f =new JFrame();
        Container c = getContentPane();
        lData=new JLabel("DATA");
        lSaldo =  new JLabel("SALDO");
        tData=new JTextField(15);
        tSaldo = new JTextField(15);
        bDeposito=new JButton("DEPOSITO");
        bLevantamento=new JButton("LEVANTAMENTO");
        bCadastro = new JButton("CADASTRO");
        bDividendo= new JButton("DIVIDENDO");
        
        c.add(lData);
        c.add(lSaldo);
        c.add(tData);
        c.add(tSaldo);
        c.add(bDeposito);
        c.add(bLevantamento);
        c.add(bCadastro);
        c.add(bDividendo);
        
        lData.setBounds(15,10,110,40);
        lSaldo.setBounds(15,60,110,40);       
        tData.setBounds(70,10,250,40);
        tSaldo.setBounds(70,60,250,40);
        bDeposito.setBounds(30,120,100,50);
        bLevantamento.setBounds(30,200,100,50);
        bCadastro.setBounds(220,120,100,50);
        bDividendo.setBounds(220,200,100,50);
        
        bDeposito.addActionListener(this);
        bLevantamento.addActionListener(this);
        bCadastro.addActionListener(this);
        bDividendo.addActionListener(this);
        
        //setVisible(true);
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
       
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==bDeposito){
               DepositoPoupanca dp=new DepositoPoupanca();
               this.setVisible(false);
           }
        if(e.getSource()==bDividendo){
               DividendoPoupanca dp=new DividendoPoupanca();
               this.setVisible(false);
           }
        if(e.getSource()==bCadastro){
             CadastroPoupanca cd =new CadastroPoupanca();
             this.setVisible(false);
        }
        
        if(e.getSource()==bLevantamento){
               LevantamentoPoupanca dp=new LevantamentoPoupanca();
               this.setVisible(false);
           }
        
    }       
    }



