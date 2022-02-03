package ftp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatLightLaf;

public class Display extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display principal = new Display();

	}

	private javax.swing.JButton btnCargar;
	private javax.swing.JButton btnConectar;
	private javax.swing.JButton btnSalir;
	private javax.swing.JTextField campoIP;
	private javax.swing.JTextField campoPASSWORD;
	private javax.swing.JTextField campoPORT;
	private javax.swing.JTextField campoUSER;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JLabel labelIP;
	private javax.swing.JLabel labelPASSWORD;
	private javax.swing.JLabel labelPORT;
	private javax.swing.JLabel labelUSER;
	private Conexion_ftp nueva;

	public Display() {

		try {
		    UIManager.setLookAndFeel( new FlatLightLaf() );
		} catch( Exception ex ) {
		    System.err.println( "Failed to initialize LaF" );
		}
		initComponents();
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) dimension.getWidth();
		int y = (int) dimension.getHeight();
		setBounds(x / 3, y / 4, 500, 400);
		setResizable(false);
		setTitle("Carga de líneas CCcam a decodificador");		
		setVisible(true);
	}

	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		btnConectar = new javax.swing.JButton();
		btnCargar = new javax.swing.JButton();
		campoIP = new javax.swing.JTextField();
		campoPASSWORD = new javax.swing.JTextField();
		campoPORT = new javax.swing.JTextField();
		campoUSER = new javax.swing.JTextField();
		labelIP = new javax.swing.JLabel();
		labelPORT = new javax.swing.JLabel();
		labelUSER = new javax.swing.JLabel();
		labelPASSWORD = new javax.swing.JLabel();
		btnSalir = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		btnConectar.setText("Conectar FTP");
		btnConectar.setMaximumSize(new java.awt.Dimension(153, 20));
		btnConectar.setMinimumSize(new java.awt.Dimension(153, 20));
		btnConectar.setPreferredSize(new java.awt.Dimension(153, 20));
		btnConectar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnConectarActionPerformed(evt);
			}
		});

		btnCargar.setText("Cargar CCcam");
		btnCargar.setMaximumSize(new java.awt.Dimension(153, 20));
		btnCargar.setMinimumSize(new java.awt.Dimension(153, 20));
		btnCargar.setPreferredSize(new java.awt.Dimension(153, 20));
		btnCargar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCargarActionPerformed(evt);
			}
		});

		campoIP.setMaximumSize(new java.awt.Dimension(100, 20));
		campoIP.setMinimumSize(new java.awt.Dimension(100, 20));
		campoIP.setPreferredSize(new java.awt.Dimension(100, 20));

		campoPASSWORD.setMaximumSize(new java.awt.Dimension(100, 20));
		campoPASSWORD.setMinimumSize(new java.awt.Dimension(100, 20));
		campoPASSWORD.setPreferredSize(new java.awt.Dimension(100, 20));

		campoPORT.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
		campoPORT.setMaximumSize(new java.awt.Dimension(100, 20));
		campoPORT.setMinimumSize(new java.awt.Dimension(100, 20));
		campoPORT.setPreferredSize(new java.awt.Dimension(100, 20));

		campoUSER.setMaximumSize(new java.awt.Dimension(100, 20));
		campoUSER.setMinimumSize(new java.awt.Dimension(100, 20));
		campoUSER.setPreferredSize(new java.awt.Dimension(100, 20));

		labelIP.setText("IP");

		labelPORT.setText("Puerto");

		labelUSER.setText("Usuario");

		labelPASSWORD.setText("Contraseña");

		btnSalir.setText("SALIR");
		btnSalir.setMaximumSize(new java.awt.Dimension(153, 20));
		btnSalir.setMinimumSize(new java.awt.Dimension(153, 20));
		btnSalir.setPreferredSize(new java.awt.Dimension(153, 20));
		btnSalir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSalirActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(jScrollPane1).addContainerGap())
						.addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(labelPASSWORD).addComponent(labelPORT).addComponent(labelUSER)
										.addComponent(labelIP))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(campoPASSWORD, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(campoPORT, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(campoUSER, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(campoIP, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(60, 60, 60)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 180,
												Short.MAX_VALUE)
										.addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnConectar, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap(41, Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(23, 23, 23).addComponent(jScrollPane1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout
								.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(labelIP).addComponent(campoIP,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(labelPORT).addComponent(campoPORT,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(25, 25, 25))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(campoUSER, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(labelUSER)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(campoPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(labelPASSWORD))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(32, 32, 32)
								.addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(46, Short.MAX_VALUE)))));

		pack();
	}

	private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {
		nueva = new Conexion_ftp();

		if (campoPORT.getText().isEmpty() || campoPORT.getText().isBlank() || campoIP.getText().isEmpty()
				|| campoIP.getText().isBlank()) {
			jTextArea1.setText("INTRODUCE LOS DATOS PARA LA CONEXIÓN");
			btnConectar.setBackground(Color.RED);
		} else {
			nueva.setServer(campoIP.getText());
			nueva.setPort(Integer.parseInt(campoPORT.getText()));
			nueva.setUser(campoUSER.getText());
			nueva.setPassword(campoPASSWORD.getText());

			try {
				nueva.conexionFtp();
				if (!nueva.isConectado()) {
					jTextArea1.setText("ERROR EN EL LOGIN, INTRODUCE LOS DATOS CORRECTOS");
					btnConectar.setBackground(Color.ORANGE);
				} else {
					jTextArea1.setText("");
					nueva.crearCarpeta();
					if (!nueva.existeFichero()) {
						jTextArea1.setText(
								"NO EXISTE EL ARCHIVO CCCAM.CFG \nINTRODUZCA LAS LINEAS Y PULSE EL BOTON CARGAR PARA CREARLO");
					} else {
						try {
							jTextArea1 = nueva.leerArchivo(nueva.descargaArchivo(), jTextArea1);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							jTextArea1.setText("ERROR AL DESCARGAR EL ARCHIVO \n" + e.getMessage());
							e.printStackTrace();
						}

						btnConectar.setText("Conectado");
						btnConectar.setEnabled(false);
					}
				}
			} catch (SocketException e1) {
				// TODO Auto-generated catch block
				jTextArea1.setText("NO SE HA PODIDO CONECTAR CON EL SERVIDOR FTP \n" + e1.getMessage());
				btnConectar.setBackground(Color.RED);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				jTextArea1.setText("NO SE HA PODIDO CONECTAR CON EL SERVIDOR FTP \n" + e1.getMessage());
				btnConectar.setBackground(Color.RED);
			}
		}

	}

	private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {
		File archivo = new File(nueva.getDirectorioLocal());
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, false)); // true for append
			jTextArea1.write(writer);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			if (nueva != null) {
				nueva.subirFichero();
				jTextArea1.append("\n FICHERO SUBIDO CORRECTAMENTE");
			} else {
				jTextArea1.setText("PRIMERO DEBE CONECTARSE AL DECODIFICADOR");
			}
		} catch (Exception e) {
			jTextArea1.setText(e.getMessage());
		}

	}

	private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
		if (nueva != null) {
			if (nueva.isConectado()) {
				try {
					nueva.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.exit(0);
	}

}