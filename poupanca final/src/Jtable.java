
import java.awt.Container;
import javax.swing.*;


public class Jtable extends JFrame {
    public JPanel jPanel1,jPanel2;
    public JLabel jLabel1,jLabel2,jLabel3,jLabel4;
    public JTextField txtn,txtd,txts;
    public JButton btnCadastrar,btnAtualizar, btnExcluir;
    public JScrollPane jScrollPane1;
    public JTable jTProdutos;
    
     Jtable () {

         Container cont = getContentPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        txtd = new javax.swing.JTextField();
        txts = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        
        
        cont.add(jLabel1);
        cont.add(jLabel2);
        cont.add(jLabel3);
        cont.add(jLabel4);
        cont.add(txtd);
        cont.add(txtn);
        cont.add(txts);
        cont.add(btnAtualizar);
        cont.add(btnCadastrar);
        cont.add(btnExcluir);
        cont.add(jPanel1);
        cont.add(jPanel2);
        cont.add(jScrollPane1);
        cont.add(jTProdutos);
       

        
        setVisible(true);
        setTitle("Painel");
        setSize(400,600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }

        
    
}
