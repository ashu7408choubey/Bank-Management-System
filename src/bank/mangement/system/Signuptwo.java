package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signuptwo extends JFrame implements ActionListener {
    JComboBox combobox,combobox2,combobox3,combobox4,combobox5;
    JTextField textPan,textAddhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;
    Signuptwo(String formno){
        super("APPLICATION_FORM");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,18));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,16));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion [] = {"Hindu","Muslim","Sikh","Christin","Other"};
        combobox = new JComboBox<>(religion);
        combobox.setBackground(new Color(252,208,76));
        combobox.setFont(new Font("Raleway",Font.BOLD,14));
        combobox.setBounds(350,120,320,30);
        add(combobox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,16));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category [] = {"General","OBC","SC","ST","Other"};
        combobox2 = new JComboBox<>(Category);
        combobox2.setBackground(new Color(252,208,76));
        combobox2.setFont(new Font("Raleway",Font.BOLD,14));
        combobox2.setBounds(350,170,320,30);
        add(combobox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,16));
        l5.setBounds(100,220,100,30);
        add(l5);

        String Income [] = {"Null","<1,50,000","<2,50,000","<5,00,000","<10,00,000","Above 10,00,000"};
        combobox3 = new JComboBox<>(Income);
        combobox3.setBackground(new Color(252,208,76));
        combobox3.setFont(new Font("Raleway",Font.BOLD,14));
        combobox3.setBounds(350,220,320,30);
        add(combobox3);

        JLabel l6 = new JLabel("Qualification :");
        l6.setFont(new Font("Raleway",Font.BOLD,16));
        l6.setBounds(100,270,150,30);
        add(l6);

        String qualification [] = {"Non-Graduate","Under-Graduate","Post-Graduate","Doctrate","Other"};
        combobox4 = new JComboBox<>(qualification);
        combobox4.setBackground(new Color(252,208,76));
        combobox4.setFont(new Font("Raleway",Font.BOLD,14));
        combobox4.setBounds(350,270,320,30);
        add(combobox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,16));
        l7.setBounds(100,340,150,30);
        add(l7);

        String Occupation [] = {"Salaried","Self-Employed","Bussiness","student","Other"};
        combobox5 = new JComboBox<>(Occupation);
        combobox5.setBackground(new Color(252,208,76));
        combobox5.setFont(new Font("Raleway",Font.BOLD,14));
        combobox5.setBounds(350,340,320,30);
        add(combobox5);

        JLabel l8 = new JLabel("PAN NUMBER : ");
        l8.setFont(new Font("Raleway",Font.BOLD,16));
        l8.setBounds(100,390,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,16));
        textPan.setBounds(350,390,320,30);
        add(textPan);


        JLabel l9 = new JLabel("Aadhar NUMBER : ");
        l9.setFont(new Font("Raleway",Font.BOLD,16));
        l9.setBounds(100,440,170,30);
        add(l9);

        textAddhar = new JTextField();
        textAddhar.setFont(new Font("Raleway",Font.BOLD,16));
        textAddhar.setBounds(350,440,320,30);
        add(textAddhar);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway",Font.BOLD,16));
        l10.setBounds(100,490,170,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,490,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway",Font.BOLD,16));
        l11.setBounds(100,540,170,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,16));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,540,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,16));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(460,540,100,30);
        add(e2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);



        JLabel l12 = new JLabel("Form No :  ");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);


        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,16));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
       // setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      String rel =(String) combobox.getSelectedItem();
      String cate = (String) combobox2.getSelectedItem();
      String inc = (String) combobox3.getSelectedItem();
      String edu = (String) combobox4.getSelectedItem();
      String occ = (String) combobox5.getSelectedItem();

      String pan = textPan.getText();
      String aadhar = textAddhar.getText();

      String scitizen = " ";
      if(r1.isSelected()){
          scitizen = "Yes";
      }else if(r2.isSelected()){
          scitizen = "No";
      }

        String eAccount = " ";
        if(r1.isSelected()){
            eAccount = "Yes";
        }else if(r2.isSelected()){
            eAccount = "No";
        }

        try{
            if(textPan.getText().equals("") || textAddhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con c1 = new Con();
                String q = "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signupthree(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
         new Signuptwo("");
    }
}
