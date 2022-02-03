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
		initComponents();
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) dimension.getWidth();
		int y = (int) dimension.getHeight();
		setBounds(x / 3, y / 4, 500, 450);
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

		jTextArea1.setLineWrap(true);
		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		btnConectar.setText("Conectar FTP");
		btnConectar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnConectarActionPerformed(evt);
			}
		});

		btnCargar.setText("Cargar CCcam");
		btnCargar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCargarActionPerformed(evt);
			}
		});

		labelIP.setText("IP");
		labelPORT.setText("Puerto");
		labelUSER.setText("Usuario");
		labelPASSWORD.setText("Contraseña");
		btnSalir.setText("SALIR");

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
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addGap(17, 17, 17)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(labelIP).addComponent(labelPORT))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(campoIP, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnConectar).addComponent(campoPORT,
												javax.swing.GroupLayout.PREFERRED_SIZE, 61,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55,
										Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup().addComponent(labelPASSWORD)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(campoPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addComponent(labelUSER)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(campoUSER, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(btnCargar, javax.swing.GroupLayout.Alignment.LEADING))
								.addGap(66, 66, 66))))
				.addGroup(layout.createSequentialGroup().addGap(178, 178, 178).addComponent(btnSalir).addGap(0, 0,
						Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(23, 23, 23)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(campoIP, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(campoUSER, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(labelIP).addComponent(labelUSER))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(campoPORT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(campoPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(labelPORT).addComponent(labelPASSWORD))
						.addGap(35, 35, 35)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnConectar).addComponent(btnCargar))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
						.addComponent(btnSalir).addGap(29, 29, 29)));

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
					btnConectar.setBackground(Color.GREEN);
					nueva.crearCarpeta();
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
		File archivo = new File("./ftp/CCcam.cfg");
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