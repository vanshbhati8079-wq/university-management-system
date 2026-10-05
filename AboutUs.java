package university.management.system;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us -Bennett University");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/aa.jpg"));
            Image i2 = i1.getImage().getScaledInstance(250, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 40, 250, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("University");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Courier new", Font.BOLD, 30));
            l3.setBounds(140, 40, 200, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Courier New", Font.BOLD, 30));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);


            JLabel l6 = new JLabel("<html>Developed By:<br>Manvendra Singh<br>Ansh Jadon<br>Vansh Bhati<br>Arjun Tyagi</html>");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
            l6.setBounds(70, 180, 500, 200);
            contentPane.add(l6);

            

           

           
                
            contentPane.setBackground(Color.WHITE);
	}
        

}


