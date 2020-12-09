import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 

class Main implements ActionListener{

  private static JFrame thingy = new JFrame();
  private static JPanel panel = new JPanel();
  private static JLabel userlabel = new JLabel("Username");
  private static JTextField username = new JTextField(20);
  private static JLabel passlabel = new JLabel("Password");
  private static JTextField password = new JTextField(20);
  private static JButton button = new JButton("Login");
  private static JLabel message = new JLabel("");


  public static void main(String[] args) {
    System.out.println("Hello world!");
    

    
    thingy.setSize(600, 1000);
    thingy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    thingy.add(panel);
    panel.setLayout(null);

    
    userlabel.setBounds(10, 20 , 80 ,25);
    panel.add(userlabel);

    
    username.setBounds(100, 20, 165, 25);
    panel.add(username);

    
    passlabel.setBounds(10, 50 , 80 ,25);
    panel.add(passlabel);

    
    password.setBounds(100, 50, 165, 25);
    panel.add(password);

    
    button.setBounds(10, 80, 80, 25);
    button.addActionListener(new Main());
    panel.add(button);

    
    message.setBounds(10,110,300,25);
    panel.add(message);


    thingy.setVisible(true);
  }
  public void actionPerformed(ActionEvent e) {
    String user = username.getText();
    String pass = password.getText();
    if(user.equals("username") && pass.equals("password")){
      message.setText("Yay you logged in");
    }else{
      message.setText("Incorrect credentials, please try again");
    }
  }
}