package Vistaws;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import Logic.conversor;
import Logic.datos;

import java.awt.event.*;

public class Divisas extends JPanel implements ItemListener,ActionListener {
	conversor j = new conversor();
	private JTextField txtCantidad;
	private JComboBox<String> CmbDDidivsa;
	private JComboBox<String> CmbDDidivsaA;
	private JButton btnNewButton;
	private JLabel lblrepuesta;


	public Divisas() {
		
		datos d= new datos();
		
		
		setBounds(0, 0, 737, 517);
		setBackground(new Color(40, 32, 40));
		setLayout(null);
		
		RoundedPanel panel = new RoundedPanel(130);
		 
	
		//JPanel panel = new JPanel();
		panel.setBackground(new Color(40, 32, 40));
		panel.setBounds(22, 64, 687, 410);
		add(panel);
		panel.setLayout(null);

		
		
		//Button
		btnNewButton = new JButton("Calcular");
		btnNewButton.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\presupuesto.png"));
		btnNewButton.setBounds(145, 331, 145, 46);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\basura.png"));
		btnNewButton_1.setBounds(331, 331, 145, 46);
		panel.add(btnNewButton_1);
		
		
		// JHlabel
		JLabel lblNewLabel = new JLabel("Conversor De Divisas");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		lblNewLabel.setIcon(new ImageIcon(Divisas.class.getResource("/Img/divisas.png")));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(425, 11, 294, 55);
		add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Desde La Divisa");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_1.setBounds(33, 44, 624, 34);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("A la Divisa");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_2.setBounds(389, 54, 268, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ingrese Cantidad\r\n");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_3.setBounds(37, 162, 620, 34);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Respuesta De La Conversion");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_4.setBounds(389, 162, 268, 34);
		panel.add(lblNewLabel_4);
		

		lblrepuesta = new JLabel();
		lblrepuesta.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblrepuesta.setBounds(426, 219, 155, 37);
		panel.add(lblrepuesta);
		// Finish JLabel
		
		// Text
		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char validar= evt.getKeyChar();
				
				if(Character.isLetter(validar)) {
					getToolkit().beep();
					evt.consume();
					
					JOptionPane.showConfirmDialog(getRootPane(), "Ingresar Solo numero");
				}
			}
		});
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("SansSerif", Font.PLAIN, 25));
		txtCantidad.setBackground(new Color(220, 220, 220));
		txtCantidad.setBounds(59, 209, 194, 46);
		panel.add(txtCantidad);
		txtCantidad.setColumns(10);
	
		
		//add CMB
		
		CmbDDidivsa = new JComboBox<>(d.getOptionsDivisas());
		CmbDDidivsa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		CmbDDidivsa.setBounds(59, 89, 194, 46);
		CmbDDidivsa.addItemListener(this);
		panel.add(CmbDDidivsa);
		
		
		//add CMB2
		CmbDDidivsaA = new JComboBox<>(d.getOptionsDivisas());
		CmbDDidivsaA.setFont(new Font("Tahoma", Font.PLAIN, 13));
		CmbDDidivsaA.setBounds(426, 89, 200, 46);
		CmbDDidivsaA.addItemListener(this);
		panel.add(CmbDDidivsaA);
	
		
	}

	public void itemStateChanged(ItemEvent e){
		
		if (e.getSource()==CmbDDidivsa) {
            String seleccionado=(String)CmbDDidivsa.getSelectedItem();
    
        }
		if (e.getSource()==CmbDDidivsaA) {
            String seleccionado=(String)CmbDDidivsaA.getSelectedItem();
    
        }
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource()==btnNewButton) {
				double number = Double.parseDouble(txtCantidad.getText());
				String divisaOrigen= (String) CmbDDidivsa.getSelectedItem();
				String divisaDestino= (String) CmbDDidivsaA.getSelectedItem();
				if(divisaOrigen.equals("Elija opcion")|| divisaDestino.equals("Elija opcion")) {
				
					JOptionPane.showConfirmDialog(this, "No puedes mandar datos vacios, elija una option", "Lo siento!!!", JOptionPane.WARNING_MESSAGE);
					
				}else {
					 String respuesta=""+conversor.convertirDivisas(number,divisaOrigen,divisaDestino);
				     lblrepuesta.setText(respuesta+" "+divisaDestino);
				}
		      
		        
	        }
		} catch (Exception e2) {
			JOptionPane.showConfirmDialog(this, "No puedes mandar datos vacios", "Lo siento!!!", JOptionPane.WARNING_MESSAGE);
		}
	}











}
