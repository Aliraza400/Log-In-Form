import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginForm extends JFrame {


    Container c;

    JLabel l1, l2;

    JTextField user;

    JPasswordField pass;

    JButton btn;

    LoginForm() {

        setTitle("Login Form");
        setBounds(100,100,500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        c = getContentPane();
        c.setLayout(null);

        l1 = new JLabel("UserName");
        l2 = new JLabel("Password");
        l1.setBounds(50,50,120,40);
        l2.setBounds(50,100,120,40);

        c.add(l1);
        c.add(l2);

        user = new JTextField();
        user.setBounds(130, 62,120,20);

        c.add(user);

        pass = new JPasswordField();
        pass.setBounds(130,110,120,20);

        c.add(pass);

        btn = new JButton("Submit");
        btn.setBounds(150,150,80,25);

        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        c.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                System.out.println("UserName: " +user.getText());
                System.out.println("Password: " +pass.getText());


            }
        });


        setVisible(true);



    }
}









public class MyFrame {

    public static void main(String[] args) {

        LoginForm f = new LoginForm();
    }
}
