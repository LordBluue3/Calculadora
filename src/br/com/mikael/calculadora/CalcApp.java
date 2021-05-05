package br.com.mikael.calculadora;
import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalcApp {

	private JFrame fcalc;
	private JTextField textField;
	
	double primeironumero;
	double segundonumero;
	double resultado;
	String operações;
	String responda;

	/**
	 * ATENÇÃO CALCULADORA FEITA POG (Programação Orientada a Gambiarra) DESCULPE 
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp window = new CalcApp();
					window.fcalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcApp() {
		initialize();
	}

	/**
	 * INTERFACE DA CALCULADORA BY MIKAEL OLIVEIRA.
	 */
	private void initialize() {
		fcalc = new JFrame();
		fcalc.setTitle("Calculadora Do Mikael");
		fcalc.setResizable(false);
		fcalc.setBounds(100, 100, 318, 379);
		fcalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fcalc.getContentPane().setLayout(null);

		
		
//		textField = new JTextField();
		textField = new JtextFieldSomenteNumeros();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Lucida Sans", Font.PLAIN, 40));
		textField.setBounds(9, 11, 285, 65);
		textField.setColumns(10);
		fcalc.getContentPane().add(textField);
//		textField.setEnabled(false);
		textField.setDisabledTextColor(Color.black);
		textField.setCaretColor(textField.getBackground());
		
		


		
		
		//BOTÕES DA CALCULADORA  
		// BOTÃO AC APAGAR TUDO
		JButton bntAC = new JButton("C");
		
		bntAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				
			}
		});
		bntAC.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bntAC.setBounds(9, 87, 64, 40);
		fcalc.getContentPane().add(bntAC);
		
		
		//BOTÃO PARA PORCENTAGEM 
		
		JButton bntPor = new JButton("%");
		bntPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primeironumero= Double.parseDouble(textField.getText());
				textField.setText("");
				operações = "%";
			}
		});
		bntPor.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bntPor.setBounds(83, 87, 65, 41);
		fcalc.getContentPane().add(bntPor);
		
		//BOTÃO PARA DIVISÃO
		
		JButton bntDiv = new JButton("/");
		bntDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primeironumero= Double.parseDouble(textField.getText());
				textField.setText("");
				operações = "/";
			}
		});
		bntDiv.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bntDiv.setBounds(157, 87, 65, 41);
		fcalc.getContentPane().add(bntDiv);
		
		// BOTÃO DE VEZES
		
		JButton bntVez = new JButton("X");
		bntVez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				primeironumero= Double.parseDouble(textField.getText());
				textField.setText("");
				operações = "x";
			}
		});
		bntVez.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bntVez.setBounds(231, 87, 65, 41);
		fcalc.getContentPane().add(bntVez);
		
		// BOTÃO NUMERO 7
		
		JButton bnt7 = new JButton("7");
		bnt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcalc = textField.getText() + bnt7.getText();
				textField.setText(fcalc);
			}
		});
		bnt7.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bnt7.setBounds(9, 139, 65, 41);
		fcalc.getContentPane().add(bnt7);
		
		//BOTÃO NUMERO 8
		
		JButton bnt8 = new JButton("8");
		bnt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcalc = textField.getText() + bnt8.getText();
				textField.setText(fcalc);
			}
		});
		bnt8.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bnt8.setBounds(83, 139, 65, 41);
		fcalc.getContentPane().add(bnt8);
		
		//BOTÃO NUMERO 9
		
		JButton bnt9 = new JButton("9");
		bnt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcalc = textField.getText() + bnt9.getText();
				textField.setText(fcalc);
			}
		});
		bnt9.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bnt9.setBounds(157, 139, 65, 41);
		fcalc.getContentPane().add(bnt9);
		
		//BOTÃO DE SUBTRAÇÃO
		
		JButton bntMenos = new JButton("-");
		bntMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primeironumero= Double.parseDouble(textField.getText());
				textField.setText("");
				operações = "-";
			}
		});
		bntMenos.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bntMenos.setBounds(231, 139, 65, 41);
		fcalc.getContentPane().add(bntMenos);
		
		//BOTÃO NUMERO 4
		
		JButton bnt4 = new JButton("4");
		bnt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcalc = textField.getText() + bnt4.getText();
				textField.setText(fcalc);
			}
		});
		bnt4.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bnt4.setBounds(9, 191, 65, 41);
		fcalc.getContentPane().add(bnt4);
		
		//BOTÃO NUMERO 5
		
		JButton bnt5 = new JButton("5");
		bnt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcalc = textField.getText() + bnt5.getText();
				textField.setText(fcalc);
			}
		});
		bnt5.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bnt5.setBounds(83, 191, 65, 41);
		fcalc.getContentPane().add(bnt5);
		
		//BOTÃO NUMERO 6
		
		JButton bnt6 = new JButton("6");
		bnt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcalc = textField.getText() + bnt6.getText();
				textField.setText(fcalc);
			}
		});
		bnt6.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bnt6.setBounds(157, 191, 65, 41);
		fcalc.getContentPane().add(bnt6);
		
		//BOTÃO NUMERO 1
		
		JButton bnt1 = new JButton("1");
		bnt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcalc = textField.getText() + bnt1.getText();
				textField.setText(fcalc);
			}
		});
		bnt1.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bnt1.setBounds(10, 243, 65, 41);
		fcalc.getContentPane().add(bnt1);
		
		//BOTÃO NUMERO 2
		
		JButton bnt2 = new JButton("2");
		bnt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcalc = textField.getText() + bnt2.getText();
				textField.setText(fcalc);
			}
		});
		bnt2.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bnt2.setBounds(83, 243, 65, 41);
		fcalc.getContentPane().add(bnt2);
		
		//BOTÃO NUMERO 3
		
		JButton bnt3 = new JButton("3");
		bnt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcalc = textField.getText() + bnt3.getText();
				textField.setText(fcalc);
			}
		});
		bnt3.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bnt3.setBounds(157, 243, 65, 41);
		fcalc.getContentPane().add(bnt3);
		
		//BOTÃO DE ADIÇÃO
		
		JButton bntMais = new JButton("+");
		bntMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primeironumero= Double.parseDouble(textField.getText());
				textField.setText("");
				operações = "+";
				
				
				
			}
		});
		bntMais.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bntMais.setBounds(231, 191, 65, 41);
		fcalc.getContentPane().add(bntMais);
		
		//BOTÃO DE IGUAL
		
		JButton bntIgual = new JButton("=");
		bntIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (!textField.getText().isEmpty()) segundonumero = Double.parseDouble(textField.getText());
					
				else return;
				

				
				 if (operações == "+")
				{
				  resultado = primeironumero + segundonumero;
				  int resultadoi = (int) resultado;
				  String responda = ""+resultadoi;
				  textField.setText(responda);
				 
				}
				 
				 else if (operações == "/")
				 {
				    resultado = primeironumero / segundonumero;
				    int resultadoi = (int) resultado;
					  String responda = ""+resultadoi;
				    textField.setText(responda);
				 }
				 else if (operações == "-")
				 {
				    resultado = primeironumero - segundonumero;
				    int resultadoi = (int) resultado;
					  String responda = ""+resultadoi;
				    textField.setText(responda);
				 }
				 else if (operações == "%")
				 {
				    resultado = primeironumero % segundonumero;
				    int resultadoi = (int) resultado;
					  String responda = ""+resultadoi;
				    textField.setText(responda);
				 }
				 else if (operações == "x")
				 {
				    resultado = primeironumero * segundonumero;
				    int resultadoi = (int) resultado;
					  String responda = ""+resultadoi;
				    textField.setText(responda);
				 }
				 
				 primeironumero = 0;
				 segundonumero = 0;
				 
				}

		});
		bntIgual.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bntIgual.setBounds(231, 243, 64, 94);
		fcalc.getContentPane().add(bntIgual);
		
		//BOTÃO 0
		
		JButton bnt0 = new JButton("0");
		bnt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fcalc = textField.getText() + bnt0.getText();
				textField.setText(fcalc);
			}
		});
		bnt0.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bnt0.setBounds(10, 296, 138, 41);
		fcalc.getContentPane().add(bnt0);
		
		//BOTÃO PONTO
		
		JButton bntPonto = new JButton(".");
		bntPonto.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		bntPonto.setBounds(157, 295, 65, 41);
		fcalc.getContentPane().add(bntPonto);
		

		
		
	}
}
