import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Marksheet extends Applet implements ActionListener
{
	Label lblTitle,lblExam,lblName,lblJava,lblSEN,lblCSE,lblOSY;
	TextField txtExam,txtName,txtJava,txtSEN,txtCSE,txtOSY;      
	Button cmdReport;
	int total;      
	float avg;
	Font f1;
	public void init()
	{
		f1 = new Font("Times New Roman",Font.BOLD,16);    
		setLayout(null);
		lblTitle=new Label("Enter Students Details");
		lblExam=new Label("Examination:");
		lblName=new Label("Name :");
		lblJava=new Label("JPR :");
		lblSEN=new Label("SEN :");
		lblCSE=new Label("CSE :");
		lblOSY=new Label("OSY:");
		
		txtExam=new TextField(20);
		txtName=new TextField(25);
		txtJava=new TextField(3);
		txtSEN=new TextField(3);
		txtCSE=new TextField(3);
		txtOSY=new TextField(3);
		
		cmdReport=new Button("View Student Result");
		lblTitle.setBounds(100,0,200,20);
		lblExam.setBounds(0,50,100,20);
		txtExam.setBounds(120,50,100,20);
		lblName.setBounds(0,75,100,20);
		txtName.setBounds(120,75,250,20);
		lblJava.setBounds(0,100,100,20);
		txtJava.setBounds(120,100,40,20);
		lblSEN.setBounds(0,125,100,20);
		txtSEN.setBounds(120,125,40,20);
		lblCSE.setBounds(0,150,100,20);
		txtCSE.setBounds(120,150,40,20);
		lblOSY.setBounds(0,175,100,20);
		txtOSY.setBounds(120,175,40,20);
		
		cmdReport.setBounds(100,225,150,30);
		add(lblTitle);
		add(lblExam);add(txtExam);
		add(lblName);add(txtName);
		add(lblJava);add(txtJava);
		add(lblSEN);add(txtSEN);
		add(lblCSE);add(txtCSE);
		add(lblOSY);add(txtOSY);
		
		add(cmdReport);
		cmdReport.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			int java=Integer.parseInt(txtJava.getText());
			int SEN=Integer.parseInt(txtSEN.getText());
			int CSE=Integer.parseInt(txtCSE.getText());
			int OSY=Integer.parseInt(txtOSY.getText());
			
			total=(java+SEN+CSE+OSY);
			avg=total/4;
		}
		catch(NumberFormatException e)
		{
		}
		repaint();
	}
	public void paint(Graphics g)
	{	
		g.setFont(f1);
		setBackground(Color.gray);
		g.setColor(Color.red);
		g.fillRect(20,279,350,8);
		g.setColor(Color.blue);
		g.drawString("STUDENT MARKSHEET",100,275);
		g.drawString("Examination.: "+txtExam.getText(),0,300);
		g.drawString("Name of the Student : "+txtName.getText(),0,325);
		g.drawString("Java Programming:  "+txtJava.getText(),0,350);
		g.drawString("Software Engineering : "+txtSEN.getText(),0,375);
		g.drawString("Computer Security : "+txtCSE.getText(),0,400);
		g.drawString("Operating System : "+txtOSY.getText(),0,425);
		
		g.setColor(Color.red);
		g.fillRect(20,440,350,8);
		g.setColor(Color.blue);		
		
		g.drawString("Total: "+total,0,475);
		g.drawString("Average: "+avg,0,500);

		g.setColor(Color.red);
		g.fillRect(20,520,350,8);
		
		}
}

//HTML Code
/*
<html>

<Body><Applet code="Marksheet.class" height=550 width=400></applet>
</body>
</html>
*/
