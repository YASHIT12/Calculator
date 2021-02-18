package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator implements ActionListener {
		
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JTextArea textarea=new JTextArea(2,10);
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	
	
	JButton buttonadd = new JButton();
	JButton buttonsub = new JButton();
	JButton buttonmul = new JButton();
	JButton buttondiv = new JButton();
	JButton buttonclear = new JButton();
	JButton buttondot = new JButton();
	JButton buttonequal = new JButton();
	
	double num1,num2,result;
	int add=0,mul=0,div=0,sub=0;
	
	
	public Calculator()
	{
		frame.setSize(340, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("CALCULATOR");
		
		frame.setResizable(false);
		
		
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		//Border border=BorderFactory.createLineBorder(Color.red,4);
		//panel.setBorder(border);
		
		panel.add(textarea);
		
		textarea.setBackground(Color.black);
		Border tborder=BorderFactory.createLineBorder(Color.yellow,3);
		textarea.setBorder(tborder);
		Font font=new Font("arial",Font.BOLD,33);
		textarea.setFont(font);
		textarea.setForeground(Color.white);
		
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true);
		
		button1.setPreferredSize(new Dimension(100,40));
		button1.setText("1");
		button1.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		button2.setPreferredSize(new Dimension(100,40));
		button2.setText("2");
		button2.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		button3.setPreferredSize(new Dimension(100,40));
		button3.setText("3");
		button3.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		button4.setPreferredSize(new Dimension(100,40));
		button4.setText("4");
		button4.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		button5.setPreferredSize(new Dimension(100,40));
		button5.setText("5");
		button5.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		button6.setPreferredSize(new Dimension(100,40));
		button6.setText("6");
		button6.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		button7.setPreferredSize(new Dimension(100,40));
		button7.setText("7");
		button7.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		button8.setPreferredSize(new Dimension(100,40));
		button8.setText("8");
		button8.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		button9.setPreferredSize(new Dimension(100,40));
		button9.setText("9");
		button9.setFont(new java.awt.Font("Tahoma", 1, 25));
	
		button0.setPreferredSize(new Dimension(100,40));
		button0.setText("0");
		button0.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		
		buttonadd.setPreferredSize(new Dimension(100,40));
		buttonadd.setText("+");
		buttonadd.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		buttonsub.setPreferredSize(new Dimension(100,40));
		buttonsub.setText("-");
		buttonsub.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		buttonmul.setPreferredSize(new Dimension(100,40));
		buttonmul.setText("*");
		buttonmul.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		buttondiv.setPreferredSize(new Dimension(100,40));
		buttondiv.setText("/");
		buttondiv.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		buttondot.setPreferredSize(new Dimension(100,40));
		buttondot.setText(".");
		buttondot.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		buttonequal.setPreferredSize(new Dimension(200,40));
		buttonequal.setText("=");
		buttonequal.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		buttonclear.setPreferredSize(new Dimension(100,40));
		buttonclear.setText("C"); 
		buttonclear.setFont(new java.awt.Font("Tahoma", 1, 25));
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		
		
		panel.add(buttonadd);
		panel.add(buttonsub);
		panel.add(buttonmul);
		panel.add(buttondiv);
		panel.add(buttondot);
		panel.add(buttonequal);
		panel.add(buttonclear); 
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		
		
		buttonadd.addActionListener(this);
		buttonsub.addActionListener(this);
		buttonmul.addActionListener(this);
		buttondiv.addActionListener(this);
		buttondot.addActionListener(this);
		buttonequal.addActionListener(this);
		buttonclear.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source=e.getSource();
		if(source == buttonclear)
		{
			num1=0.0;
			num2=0.0;
			textarea.setText("");
		}
		if(source == button1)
		{
			textarea.append("1");
		}
		if(source == button2)
		{
			textarea.append("2");
		}
		if(source == button3)
		{
			textarea.append("3");
		}
		if(source == button4)
		{
			textarea.append("4");
		}
		if(source == button5)
		{
			textarea.append("5");
		}
		if(source == button6)
		{
			textarea.append("6");
		}
		if(source == button7)
		{
			textarea.append("7");
		}
		if(source == button8)
		{
			textarea.append("8");
		}
		if(source == button9)
		{
			textarea.append("9");
		}
		if(source == button0)
		{
			textarea.append("0");
		}
		if(source == buttondot)
		{
			textarea.append(".");
		}
		if(source == buttonadd)
		{
			num1=number_reader();
			textarea.setText("");
			add=1;
			div=0;
			mul=0;
			sub=0;
		}
		if(source == buttonsub)
		{
			num1=number_reader();
			textarea.setText("");
			add=0;
			div=0;
			mul=0;
			sub=1;
		}
		if(source == buttonmul)
		{
			num1=number_reader();
			textarea.setText("");
			add=0;
			div=0;
			mul=1;
			sub=0;
		}
		if(source == buttondiv)
		{
			num1=number_reader();
			textarea.setText("");
			add=0;
			div=1;
			mul=0;
			sub=0;
		}
		if(source == buttonequal)
		{
			num2=number_reader();
			
			if(add >0)
			{
				result = num1 + num2;
				textarea.setText(Double.toString(result));
			}
			if(sub >0)
			{
				result = num1 - num2;
				textarea.setText(Double.toString(result));
			}
			if(mul >0)
			{
				result = num1 * num2;
				textarea.setText(Double.toString(result));
			}
			if(div >0)
			{
				result = num1 / num2;
				textarea.setText(Double.toString(result));
			}
		}
		
	}
	public double number_reader()
	{
		double number1;
		String s;
		s=textarea.getText();
		number1=Double.valueOf(s);
		return number1;
	}
}
