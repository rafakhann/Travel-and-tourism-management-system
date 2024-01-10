package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    String username;
    JButton addPersonalDetails, viewDetails,updatePersonalDetails,checkPackage,viewPackage
            ,deletePersonalDetails, viewHotel, bookPackage, bookHotel, viewbookedHotel
            ,destination, payments,calculator,about;
    
    Dashboard(String username)
    {
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1400,60);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel icon = new JLabel(i3);
	icon.setBounds(3, 0, 60, 60); 
        p1.add(icon);
        
        
        JLabel heading = new JLabel("Dashboard");
	heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
	heading.setBounds(70, 12,300, 35);
	p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,62,300,630);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0,300, 45);
	addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
        addPersonalDetails.setMargin(new Insets(0,0,0,80));
        addPersonalDetails.addActionListener(this);
	p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 45,300, 45);
	updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
        updatePersonalDetails.addActionListener(this);
        updatePersonalDetails.setMargin(new Insets(0,0,0,60));
	p2.add(updatePersonalDetails);
        
        
        viewDetails = new JButton("View Details");
        viewDetails.setBounds(0, 90,300, 45);
	viewDetails.setBackground(new Color(0,0,102));
        viewDetails.setForeground(Color.WHITE);
        viewDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
        viewDetails.addActionListener(this);
        viewDetails.setMargin(new Insets(0,0,0,150));
	p2.add(viewDetails);
        
        
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 135,300, 45);
	deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
        deletePersonalDetails.setMargin(new Insets(0,0,0,60));
        deletePersonalDetails.addActionListener(this);
	p2.add(deletePersonalDetails);
        
        
        checkPackage = new JButton("Check Package");
        checkPackage.setBounds(0, 180,300, 45);
        checkPackage.setBackground(new Color(0,0,102));
        checkPackage.setForeground(Color.WHITE);
        checkPackage.setFont(new Font("Tahoma", Font.PLAIN, 18));
        checkPackage.setMargin(new Insets(0,0,0,125));
        checkPackage.addActionListener(this);
	p2.add(checkPackage);
        
        
        bookPackage = new JButton("Book Package");
        bookPackage.setBounds(0, 225,300, 45);
        bookPackage.setBackground(new Color(0,0,102));
        bookPackage.setForeground(Color.WHITE);
        bookPackage.setFont(new Font("Tahoma", Font.PLAIN, 18));
        bookPackage.setMargin(new Insets(0,0,0,125));
        bookPackage.addActionListener(this);
	p2.add(bookPackage);
        
        
        viewPackage = new JButton("View Package");
        viewPackage.setBounds(0, 270,300, 45);
        viewPackage.setBackground(new Color(0,0,102));
        viewPackage.setForeground(Color.WHITE);
        viewPackage.setFont(new Font("Tahoma", Font.PLAIN, 18));
        viewPackage.setMargin(new Insets(0,0,0,125));
        viewPackage.addActionListener(this);
	p2.add(viewPackage);
        
        
        viewHotel = new JButton("View Hotel");
        viewHotel.setBounds(0, 315,300, 45);
        viewHotel.setBackground(new Color(0,0,102));
        viewHotel.setForeground(Color.WHITE);
        viewHotel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        viewHotel.setMargin(new Insets(0,0,0,145));
        viewHotel.addActionListener(this);
	p2.add(viewHotel);
        
        bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(0, 360,300, 45);
        bookHotel.setBackground(new Color(0,0,102));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        bookHotel.setMargin(new Insets(0,0,0,145));
        bookHotel.addActionListener(this);
	p2.add(bookHotel);
        
        
        viewbookedHotel = new JButton("View Booked Hotel");
        viewbookedHotel.setBounds(0, 405,300, 45);
        viewbookedHotel.setBackground(new Color(0,0,102));
        viewbookedHotel.setForeground(Color.WHITE);
        viewbookedHotel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        viewbookedHotel.setMargin(new Insets(0,0,0,85));
        viewbookedHotel.addActionListener(this);
	p2.add(viewbookedHotel);
        
        
        destination = new JButton("Destination");
        destination.setBounds(0, 450,300, 45);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma", Font.PLAIN, 18));
        destination.setMargin(new Insets(0,0,0,140));
        destination.addActionListener(this);
	p2.add(destination);
        
        
        payments = new JButton("Payments");
        payments.setBounds(0, 495,300, 45);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 18));
        payments.setMargin(new Insets(0,0,0,145));
        payments.addActionListener(this);
	p2.add(payments);
        
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0, 540,300, 45);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 18));
        calculator.setMargin(new Insets(0,0,0,150));
        calculator.addActionListener(this);
	p2.add(calculator);
        
        
        about = new JButton("About");
        about.setBounds(0, 585,300, 45);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 18));
        about.setMargin(new Insets(0,0,0,180));
        about.addActionListener(this);
	p2.add(about);
        
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
        Image i4 = i.getImage().getScaledInstance(1500, 900,Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(i4); 
	JLabel imag = new JLabel(i5);
	imag.setBounds(0, 0, 1400, 900); 
        add(imag);
        
        
        JLabel l1 = new JLabel("Travel and Tourism Management System");
	l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Raleway", Font.PLAIN, 50));
	l1.setBounds(370, 50,1100, 100);
	imag.add(l1);
        
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource()==addPersonalDetails){
               new AddCustomer(username).setVisible(true); 
            }
            else if(ae.getSource()==viewDetails){
                new ViewCustomers(username).setVisible(true);
            }
            else if(ae.getSource()==updatePersonalDetails){
                new UpdateCustomer(username).setVisible(true);
            }
            else if(ae.getSource()==checkPackage){
                new CheckPackage().setVisible(true);
            }
            else if(ae.getSource()==viewPackage){
                new ViewPackage(username).setVisible(true);
            }
            else if(ae.getSource()==deletePersonalDetails){
                new DeleteCustomer().setVisible(true);
            }
            else if(ae.getSource()==viewHotel){
                new CheckHotels().setVisible(true);
            }
            else if(ae.getSource()==bookPackage){
                new BookPackage(username).setVisible(true);
            }
            else if(ae.getSource()==bookHotel){
                new BookHotel(username).setVisible(true);
            }
            else if(ae.getSource()==viewbookedHotel){
                new ViewBookedHotel(username).setVisible(true);
            }
            else if(ae.getSource()==destination){
                new Destination().setVisible(true);
            }
            else if(ae.getSource()==payments){
                new Payment().setVisible(true);
            }
            else if(ae.getSource()==calculator){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                    
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            else if(ae.getSource()==about){
                new About().setVisible(true);
            }
        
        }
        catch( Exception e)
        {
            e.printStackTrace();
        }
    
        }
    
    public static void main(String[] args)
    {
        new Dashboard("");
    }
    
}
