package Vistaws;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	private JPanel MainConteiner;
	
	private HomePn panelHome1;
	private Divisas PanelDivisas;
	private Temperatura PanelTemperatura;
	private About panelAbout;
	private JButton BtnDivisas;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel Logo;
	private JButton BtnInicio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
				
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		
		panelHome1 = new HomePn();
		PanelDivisas = new Divisas();
		PanelTemperatura = new Temperatura();
		panelAbout = new About();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 543);
		//setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(40, 34, 44));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 231, 504);
		contentPane.add(panel);
		panel.setLayout(null);
		
		BtnInicio = new JButton("Inicio");
		BtnInicio.setFont(new Font("Tahoma", Font.BOLD, 14));
		BtnInicio.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\home.png"));
		BtnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuClicked(panelHome1);
			}
		});
		BtnInicio.setBounds(23, 132, 187, 58);
		panel.add(BtnInicio);
		
		JButton BtnTemperatura = new JButton("Temperatura");
		BtnTemperatura.setFont(new Font("Tahoma", Font.BOLD, 14));
		BtnTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuClicked(PanelTemperatura);
			}
		});
		BtnTemperatura.setIcon(new ImageIcon(Home.class.getResource("/Img/temperatura.png")));
		BtnTemperatura.setBounds(23, 273, 187, 58);
		panel.add(BtnTemperatura);
		
		BtnDivisas = new JButton("Divisas");
		BtnDivisas.setFont(new Font("Tahoma", Font.BOLD, 14));
		BtnDivisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuClicked(PanelDivisas);
			}
		});
		BtnDivisas.setIcon(new ImageIcon(Home.class.getResource("/Img/divisas.png")));
		BtnDivisas.setBounds(23, 204, 187, 58);
		panel.add(BtnDivisas);
		
		btnNewButton = new JButton("Sobre MI");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuClicked(panelAbout);
			}
		});
		btnNewButton.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\perfil.png"));
		btnNewButton.setBounds(23, 342, 187, 58);
		panel.add(btnNewButton);
		
		Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(Home.class.getResource("/Img/lgo.png")));
		Logo.setBounds(52, 11, 120, 88);
		panel.add(Logo);
		
		JButton BtnSalir = new JButton("Salir");
		BtnSalir.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\salida.png"));
		BtnSalir.setFont(new Font("Tahoma", Font.BOLD, 14));
		BtnSalir.setBounds(23, 429, 187, 53);
		panel.add(BtnSalir);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\fondo.jpeg"));
		lblNewLabel.setBounds(0, 0, 231, 516);
		panel.add(lblNewLabel);
		
		MainConteiner = new JPanel();
		MainConteiner.setBounds(241, 11, 719, 484);
		contentPane.add(MainConteiner);
		MainConteiner.setLayout(null);
		
		
		MainConteiner.add(panelHome1);
		MainConteiner.add(PanelTemperatura);
		MainConteiner.add(panelAbout);
		MainConteiner.add(PanelDivisas);
	}
	
	public void menuClicked(JPanel panel) {
		panelHome1.setVisible(false);
		panelAbout.setVisible(false);
		PanelDivisas.setVisible(false);
		PanelTemperatura.setVisible(false);
		
		panel.setVisible(true);
		
	}
}
