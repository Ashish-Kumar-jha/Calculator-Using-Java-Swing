import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class ClaculatorSwing
{
public static void main(String args[])
{
JFrame f= new JFrame("CALCULATOR");
f.setSize(400,445);

final JTextField tf=new JTextField();
tf.setBounds(90,35, 180,30);

final JTextField tf1=new JTextField();
tf1.setBounds(90,70, 180,30);

JButton buttonsum = new JButton("+");
buttonsum.setBounds(150,120,60,40);

JButton buttonsub = new JButton("-");
buttonsub.setBounds(70,170,60,40);


JButton buttondiv = new JButton("/");
buttondiv.setBounds(230,170,60,40);

JButton buttonmul = new JButton("*");
buttonmul.setBounds(150,220,60,40);

final JTextField tfres=new JTextField();
tfres.setBounds(90,270, 180,40);

String country[]={"+","-","*","/"};
JComboBox cb=new JComboBox(country);
cb.setBounds(80, 322,90,30);
JButton submt = new JButton("SUBMIT");
submt.setBounds(191,322,90,30);
f.add(cb);
f.add(submt);

submt.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String x=cb.getSelectedItem().toString();
		if(x.equals("+")) {
			int one=Integer.parseInt(tf.getText());
			int two=Integer.parseInt(tf1.getText());
			
			int sum=one+two;
			tfres.setText(Integer.toString(sum));
		}
		else if(x.equals("-")){
			int one=Integer.parseInt(tf.getText());
			int two=Integer.parseInt(tf1.getText());
			int sub=one-two;
			tfres.setText(Integer.toString(sub));
		}
		else 
			if(x.equals("*")){
				int one=Integer.parseInt(tf.getText());
				int two=Integer.parseInt(tf1.getText());
				int mul=one*two;
				tfres.setText(Integer.toString(mul));
		}
		else if(x.equals("/")){
			float one=Float.parseFloat(tf.getText());
			float two=Float.parseFloat(tf1.getText());
		if(two!=0) {
			float div=one/two;
			tfres.setText(Float.toString(div));
		}
		else {
				tfres.setText("Can't divide by zero");
			}
		}
	}
	
});

buttonsum.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	int one=Integer.parseInt(tf.getText());
	int two=Integer.parseInt(tf1.getText());
	
	int sum=one+two;
	tfres.setText(Integer.toString(sum));
	
	
}
});


buttonsub.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	int one=Integer.parseInt(tf.getText());
	int two=Integer.parseInt(tf1.getText());
	int sub=one-two;
	tfres.setText(Integer.toString(sub));
}
});

buttondiv.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	float one=Float.parseFloat(tf.getText());
	float two=Float.parseFloat(tf1.getText());
if(two!=0) {
	float div=one/two;
	tfres.setText(Float.toString(div));
}
else {
		tfres.setText("Can't divide by zero");
	}
}
});

buttonmul.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	int one=Integer.parseInt(tf.getText());
	int two=Integer.parseInt(tf1.getText());
	int mul=one*two;
	tfres.setText(Integer.toString(mul));
}
});
/*
lbottom=new JLabel("@AshishKumarJha");
lbottom.setBounds(270,185, 120,30);
*/


f.add(tf);
f.add(tf1);
f.add(tfres);
f.add(buttonsum);
f.add(buttonsub);
f.add(buttondiv);
f.add(buttonmul);



f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
