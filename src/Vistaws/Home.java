package Vistaws;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(40, 34, 44));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(40, 38, 44));
		panel.setBounds(0, 0, 238, 543);
		contentPane.add(panel);
		panel.setLayout(null);
		
		BtnInicio = new JButton("Inicio");
		BtnInicio.setBackground(new Color(236,253,253));
		BtnInicio.setFont(new Font("Tahoma", Font.BOLD, 14));
		BtnInicio.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\home.png"));
		BtnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuClicked(panelHome1);
			}
		});
		BtnInicio.addMouseListener(new MouseAdapter() {
	            public void mouseEntered(MouseEvent e) {
	            	BtnInicio.setBackground(new Color(214,197,255));
	            }

	            public void mouseExited(MouseEvent e) {
	            	BtnInicio.setBackground(new Color(236,253,253)); // Restaurar el color predeterminado
	            }
	        });
		BtnInicio.setBounds(23, 132, 187, 58);
		panel.add(BtnInicio);
		
		final JButton BtnTemperatura = new JButton("Temperatura");
		BtnTemperatura.setBackground(new Color(236,253,253));
		BtnTemperatura.setFont(new Font("Tahoma", Font.BOLD, 14));
		BtnTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuClicked(PanelTemperatura);
			}
		});
		BtnTemperatura.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
            	BtnTemperatura.setBackground(new Color(214,197,255));
            }

            public void mouseExited(MouseEvent e) {
            	BtnTemperatura.setBackground(new Color(236,253,253)); // Restaurar el color predeterminado
            }
        });
		BtnTemperatura.setIcon(new ImageIcon(Home.class.getResource("/Img/temperatura.png")));
		BtnTemperatura.setBounds(23, 273, 187, 58);
		panel.add(BtnTemperatura);
		
		BtnDivisas = new JButton("Divisas");
		BtnDivisas.setBackground(new Color(236,253,253));
		BtnDivisas.setFont(new Font("Tahoma", Font.BOLD, 14));
		BtnDivisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuClicked(PanelDivisas);
			}
		});
		BtnDivisas.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
            	BtnDivisas.setBackground(new Color(214,197,255));
            }

            public void mouseExited(MouseEvent e) {
            	BtnDivisas.setBackground(new Color(236,253,253)); // Restaurar el color predeterminado
            }
        });
		BtnDivisas.setIcon(new ImageIcon(Home.class.getResource("/Img/divisas.png")));
		BtnDivisas.setBounds(23, 204, 187, 58);
		panel.add(BtnDivisas);
		
		btnNewButton = new JButton("Sobre MI");
		btnNewButton.setBackground(new Color(236,253,253));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuClicked(panelAbout);
			}
			
		});
		
		btnNewButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
            	btnNewButton.setBackground(new Color(214,197,255));
            }

            public void mouseExited(MouseEvent e) {
            	btnNewButton.setBackground(new Color(236,253,253)); // Restaurar el color predeterminado
            }
        });
	
		btnNewButton.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\perfil.png"));
		btnNewButton.setBounds(23, 342, 187, 58);
		panel.add(btnNewButton);
		
		Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(Home.class.getResource("/Img/lgo.png")));
		Logo.setBounds(52, 11, 120, 88);
		panel.add(Logo);
		
		final JButton BtnSalir = new JButton("Salir");
		BtnSalir.setBackground(new Color(236,253,253));
		BtnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				if(JOptionPane.showConfirmDialog(frame, "Deseas cerrar", "Cerrar", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					if(JOptionPane.showConfirmDialog(frame, "Si se cierra, perderas todo los datos", "Confirmar", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
						System.exit(0);
					}else {
						JOptionPane.showConfirmDialog(frame, "Gracias por no cerrarnos", "Gracias!!!", JOptionPane.WARNING_MESSAGE);
						
					}
				}else {
					JOptionPane.showConfirmDialog(frame, "Gracias por no cerrarnos", "Gracias!!!", JOptionPane.WARNING_MESSAGE);
	
				}
			}
		});
		BtnSalir.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
            	BtnSalir.setBackground(new Color(214,197,255));
            }

            public void mouseExited(MouseEvent e) {
            	BtnSalir.setBackground(new Color(236,253,253)); // Restaurar el color predeterminado
            }
        });
	
		BtnSalir.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\salida.png"));
		BtnSalir.setFont(new Font("Tahoma", Font.BOLD, 14));
		BtnSalir.setBounds(23, 429, 187, 53);
		panel.add(BtnSalir);
		
		MainConteiner = new JPanel();
		MainConteiner.setBounds(261, 11, 715, 508);
		contentPane.add(MainConteiner);
		MainConteiner.setLayout(null);

		MainConteiner.add(panelHome1);
		panelAbout.setVisible(false);
		PanelDivisas.setVisible(false);
		PanelTemperatura.setVisible(false);
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
