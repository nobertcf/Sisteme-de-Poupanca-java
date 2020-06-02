
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;





public class DepositoPoupanca {


    
JFrame frame = new JFrame();
JTable table = new JTable();


         
 Object[] columns ={"id","Nome","Morada","Cell"};
 DefaultTableModel model = new DefaultTableModel();

    public DepositoPoupanca() {
    
 model.setColumnIdentifiers(columns);
 table.setModel(model);
 
        final JLabel lId = new JLabel("ID");
        final JLabel lNome = new JLabel("NOME");
        final JLabel lMorada =new JLabel("MORADA");
        final JLabel lCell = new JLabel("CELL");
        
        final JTextField tId= new JTextField(15);
        final JTextField tNome= new JTextField(15);
        final JTextField tMorada= new JTextField(15);
        final JTextField tCell= new JTextField(15);
        
        
        JButton bAdd= new JButton("Adicionar");
        JButton bDelete = new JButton("Apagar");
        JButton bUpdate =new JButton("Actualizar");
        
        lId.setBounds(20,220,50,25);
        lNome.setBounds(20,250,50,25);
        lMorada.setBounds(20,280,60,25);
        lCell.setBounds(20,310,50,25);
        
        tId.setBounds(85,220,100,25);
        tNome.setBounds(85,250,100,25); 
        tMorada.setBounds(85,280,100,25);
        tCell.setBounds(85,310,100,25);
        
        bUpdate.setBounds(250,265,100,25);
        bDelete.setBounds(250,310,100,25);
        bAdd.setBounds(250,220,100,25);
        
        JScrollPane pane= new JScrollPane(table);
        pane.setBounds(0,0,880,200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        frame.add(lId);
        frame.add(lNome);
        frame.add(lMorada);
        frame.add(lCell);
        
        frame.add(tId);
        frame.add(tNome);
        frame.add(tMorada);
        frame.add(tCell);
        
        frame.add(bAdd);
        frame.add(bDelete);
        frame.add(bUpdate);
        final Object[] row = new Object[4];
        
        bAdd.addActionListener(new ActionListener() {
            
     @Override
     public void actionPerformed(ActionEvent ae) {
         Contribuintes b= new Contribuintes();
         PoupancaDao d = new PoupancaDao();
        
         
         b.setNome(tNome.getText());
         b.setMorada(tMorada.getText());
         b.setCell(Integer.parseInt(tCell.getText()));
            try {
                d.Create(b);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Contribuintes.class.getName()).log(Level.SEVERE, null, ex);
            }
         
         
        row [0]= tId.getText();
        row [1] =  tNome.getText();
        row [2]= tMorada.getText();
        row [3] = tCell.getText();
        model.addRow(row);
     }
 });
         bDelete.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        int i=table.getSelectedRow();
        if(i>0){
            model.removeRow(i);
        }
        else{
            JOptionPane.showMessageDialog(null,"Nenhum item selecional");
        }
    }
});
         bUpdate.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int i = table.getSelectedRow();
        Contribuintes b= new Contribuintes();
         PoupancaDao d = new PoupancaDao();
         b.setNome(tNome.getText());
         b.setMorada(tMorada.getText());
         b.setCell(Integer.parseInt(tCell.getText()));
            
        try {
            d.actualizar(b);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepositoPoupanca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(i>=0){
            model.setValueAt(tId.getText(), i, 0);
            model.setValueAt(tNome.getText(), i, 1);
            model.setValueAt(tMorada.getText(), i, 2);
            model.setValueAt(tCell.getText(), i, 3);
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro na Actualizacao");
        }
    } 
});

         table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                int i = table.getSelectedRow();
                tId.setText(model.getValueAt(i, 0).toString());
                tNome.setText(model.getValueAt(i, 1).toString());
                tMorada.setText(model.getValueAt(i, 2).toString());
                tCell.setText(model.getValueAt(i, 3).toString());
                
            } 
});
        
        
        frame.setSize(900,400);
        frame.setVisible(true);
        frame.setTitle("DEPOSITOS");
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    

    
    }

    
        
            
    
    
   


    