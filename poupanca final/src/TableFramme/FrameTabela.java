/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableFramme;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author CHASSARA
 */
public class FrameTabela extends JFrame{
    JPanel painel;
    JTable tabela;
    JScrollPane barraRolante;
    String a = "nobert";
    String b = "123456";
    Object dados [][]={
        {a,b},
        {"Noberto", "2020"}
        };
    String coluna []={"Nome","Senha"};
    
    public FrameTabela(){
        super ("USURIOS");
    
    }
    public void criarJanela(){
        painel = new JPanel();
        painel.setLayout(new GridLayout(1,1));
        tabela=new JTable(dados, coluna);
        barraRolante= new JScrollPane(tabela);
        painel.add(barraRolante);
        
        getContentPane().add(painel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
        
    }   
    public static void main (String a []){
        FrameTabela ft = new FrameTabela();
        ft.criarJanela();
    }
}
   
