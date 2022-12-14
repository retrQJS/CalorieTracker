import java.awt.*;
import java.sql.*; //Connect to Database for user logIn
import javax.swing.*;
import java.awt.Color;
//import java.awt.event.*;
//import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.border.*;
//import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionEvent; //Needed for buttons
import java.awt.event.ActionListener; //Needed for buttons
//import java.io.FileFilter;
public class Profile extends JFrame{
    final private Font programFont = new Font("Tunga", Font.BOLD, 16);
    final private Font programFont2 = new Font("Tunga", Font.BOLD, 28);
    Color myColor3 = new Color(243, 214, 106); //yellow
    Color myColor1 = new Color(57, 119, 93); //green
    public void initialize(){
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(0, 2, 10, 10));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(new LineBorder(Color.BLACK, 2));
        //leftPanel.setLayout(new GridLayout(5,1,10,10));
        leftPanel.setBackground(myColor1);

        JPanel rightPanel = new JPanel();
        //rightPanel.setBorder(new LineBorder(Color.BLACK, 2));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10,40,120,40));
        rightPanel.setLayout(new GridLayout(5, 1, 5, 5));
        rightPanel.setBackground(myColor1);

        infoPanel.add(leftPanel);
        infoPanel.add(rightPanel);

        JFileChooser jf1 = new JFileChooser();
        //JLabel lb1 = new JLabel();

        //JLabel img1 = new JLabel();
        ImageIcon imgThisImg = new ImageIcon("C:/Users/rcagu/Desktop/Java Projects/LogInForm/src/Images/Add Profile Pic Here1.png");
        JLabel img1 = new JLabel(imgThisImg, JLabel.CENTER);
        //img1.setBorder(new LineBorder(Color.BLACK, 2));
        //img1.setIcon(imgThisImg);
        img1.setPreferredSize(new Dimension(480,400));

        JButton but1 = new JButton(" Add Profile Picture ");
        but1.setPreferredSize(new Dimension(200, 50));
        but1.setBorder(new LineBorder(Color.BLACK, 2));
        but1.setFont(programFont);
        but1.setBackground(Color.WHITE);
        but1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but1.setBackground(myColor3);
                but1.setForeground(Color.BLACK);
            }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but1.setBackground(Color.white);
                but1.setForeground(Color.black);
            }
        });
        but1.setForeground(Color.BLACK);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG File", "jpg", "jpeg");
                jf1.setFileFilter(filter);
                int response = jf1.showOpenDialog(null);
                try{
                    if (response == JFileChooser.APPROVE_OPTION){
                        String name = jf1.getSelectedFile().getPath();
                        String message = name + " will be used as the profile picture.";
                        JOptionPane.showMessageDialog(null, message);
                        ImageIcon new1 = new ImageIcon(new ImageIcon(name).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
                        img1.setIcon(new1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Feel free to look for a profile picture later! :)");
                    }
                } catch(Exception e2){
                    e2.printStackTrace();
                }
                
            }
        });

        JButton but2 = new JButton(" Return Home ");
        but2.setBorder(new LineBorder(Color.BLACK,2));
        but2.setFont(programFont2);
        but2.setBackground(Color.WHITE);
        but2.setForeground(Color.BLACK);
        but2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but2.setBackground(myColor3);
                but2.setForeground(Color.BLACK);
            }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but2.setBackground(Color.white);
                but2.setForeground(Color.black);
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame m1 = new MainFrame();
                User user = new User();
                m1.initialize(user);
                dispose();
            }
        });

        JButton but3 = new JButton(" Change Font ");
        but3.setBorder(new LineBorder(Color.BLACK, 2));
        but3.setBackground(Color.WHITE);
        but3.setForeground(Color.BLACK);
        but3.setFont(programFont2);
        but3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but3.setBackground(myColor3);
                but3.setForeground(Color.BLACK);
            }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but3.setBackground(Color.white);
                but3.setForeground(Color.black);
            }
        });
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame m1 = new MainFrame();
                m1.programFont2 = new Font("Helvetica", Font.BOLD, 32);
                User user = new User();
                m1.initialize(user);
                dispose();
            }
        });

        JButton changeColor = new JButton(" Change Theme ");
        changeColor.setBorder(new LineBorder(Color.BLACK, 2));
        changeColor.setFont(programFont2);
        changeColor.setBackground(Color.WHITE);
        changeColor.setForeground(Color.BLACK);
        changeColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changeColor.setBackground(myColor3);
                changeColor.setForeground(Color.BLACK);
            }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changeColor.setBackground(Color.white);
                changeColor.setForeground(Color.black);
            }
        });
        changeColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame m1 = new MainFrame();
                Workout w1 = new Workout();
                Profile p1 = new Profile();
                FoodLog f1 = new FoodLog();
                m1.myColor1 = new Color(234, 129, 161); //pink
                w1.myColor1 = new Color(234, 129, 161); //pink
                p1.myColor1 = new Color(234, 129, 161); //pink
                f1.myColor1 = new Color(234, 129, 161); //pink
                User user = new User();
                m1.initialize(user);
                dispose();
            }
        });

        JButton but4 = new JButton(" Sign Out ");
        but4.setBorder(new LineBorder(Color.BLACK, 2));
        but4.setFont(programFont2);
        but4.setBackground(Color.WHITE);
        but4.setForeground(Color.BLACK);
        but4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                but4.setBackground(myColor3);
                but4.setForeground(Color.BLACK);
            }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                but4.setBackground(Color.white);
                but4.setForeground(Color.black);
            }
        });
        but4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI gu1 = new GUI();
                gu1.initialize();
                dispose();
            }
        });

        JLabel title1 = new JLabel(" SETTINGS ", SwingConstants.CENTER);
        title1.setFont(programFont2);
        title1.setForeground(Color.WHITE);

        rightPanel.add(title1);
        rightPanel.add(changeColor);
        rightPanel.add(but3);
        rightPanel.add(but2);
        rightPanel.add(but4);
        

        JLabel nameLB = new JLabel(getUserName(), SwingConstants.CENTER);
        nameLB.setFont(programFont2);

        JLabel accLevel = new JLabel("Rookie | ", SwingConstants.CENTER);
        accLevel.setFont(programFont2);

        //leftPanel.add(lb1);
        leftPanel.add(img1, SwingConstants.CENTER);
        leftPanel.add(but1);
        leftPanel.add(nameLB, SwingConstants.CENTER);
        leftPanel.add(accLevel, SwingConstants.CENTER);

        add(infoPanel);
        setTitle("Calorie++: Profile Information");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    private String getUserName(){
        User user = null;
        //Connect to Database
        final String DB_URL = "jdbc:mysql://localhost/calorieTracker?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD); //Creates connection between program and database
            // Connected to database successfully...

            String sql = "SELECT name FROM users";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) { //Here the values for the Module User.JAVA are being taken from the Database
                user = new User();
                user.name = resultSet.getString("name");
                //System.out.println(user.name);
            }
            preparedStatement.close();
            conn.close();
        }catch(Exception e){
            System.out.println("Database connexion failed!");
        }

        return user.name;
    }
}
