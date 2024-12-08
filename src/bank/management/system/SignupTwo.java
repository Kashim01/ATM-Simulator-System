
package bank.management.system;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
   
    JComboBox religion,category,occupation,education,income;
    String formno;
    
   SignupTwo(String formno){
       this.formno=formno;
       setLayout(null);
       setTitle("NEW APPLICATION FORM - PAGE 2");
        
       
        
        JLabel additionalDetails =new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel Lreligion =new JLabel("Religion:");
        Lreligion.setFont(new Font("Raleway",Font.BOLD,20));
        Lreligion.setBounds(100,140,100,30);
        add(Lreligion);
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        religion=new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE); 
        add(religion);
        
        
        
        JLabel lcategory =new JLabel("Category:");
        lcategory.setFont(new Font("Raleway",Font.BOLD,20));
        lcategory.setBounds(100,190,200,30);
        add(lcategory);
        
        String valCategory[]={"General","OBC","SC","ST","Other"};
        category=new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE); 
        add(category);
        
        JLabel lincome =new JLabel("Income:");
        lincome.setFont(new Font("Raleway",Font.BOLD,20));
        lincome.setBounds(100,240,200,30);
        add(lincome);
        String incomeCategory[]={"null","< 1,50,000","< 2,50,000","< 5,00,000","Up to 10,00,000"};
        income=new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE); 
        add(income);
        
        
        
        JLabel eduL =new JLabel("Educational");
        eduL.setFont(new Font("Raleway",Font.BOLD,20));
        eduL.setBounds(100,290,200,30);
        add(eduL);
        
        JLabel Quali =new JLabel("Qualification:");
        Quali.setFont(new Font("Raleway",Font.BOLD,20));
        Quali.setBounds(100,315,200,30);
        add(Quali);
        
        String educationValues[]={"Non-Graduation","Graduate","Post Graduate","Doctrate","Others"};
        education=new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE); 
        add(education);
        
        
        JLabel ocuL =new JLabel("Occupation:");
        ocuL.setFont(new Font("Raleway",Font.BOLD,20));
        ocuL.setBounds(100,390,200,30);
        add(ocuL);
        
        String occupationValues[]={"Salaried","Self-Employed","Business","Student","Retired","Others"};
        occupation=new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE); 
        add(occupation);
        
         JLabel panL =new JLabel("PAN Number:");
        panL.setFont(new Font("Raleway",Font.BOLD,20));
        panL.setBounds(100,440,200,30);
        add(panL);
        pan= new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel adhar =new JLabel("Aadhar Number:");
        adhar.setFont(new Font("Raleway",Font.BOLD,20));
        adhar.setBounds(100,490,200,30);
        add(adhar);
        
        aadhar= new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel cnear =new JLabel("Senior Sitizen:");
        cnear.setFont(new Font("Raleway",Font.BOLD,20));
        cnear.setBounds(100,540,200,30);
        add(cnear);
        
        syes= new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno= new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno); 
        
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
        
        JLabel eaca =new JLabel("Existing Account:");
        eaca.setFont(new Font("Raleway",Font.BOLD,20));
        eaca.setBounds(100,590,200,30);
        add(eaca);
        
        eyes= new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno= new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno); 
        
        ButtonGroup emaritalgroup=new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
       
       getContentPane().setBackground(Color.WHITE);
       setSize(850,800);
       setLocation(350,10);
       setVisible(true);
       
   }

   
   public void actionPerformed(ActionEvent ae){
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        String ssenior=null;
        if(syes.isSelected()){
            ssenior="Yes";
        }
        else if(sno.isSelected()){
            ssenior="NO";
        }
  
        String eaccount=null;
        if(eyes.isSelected()){
            eaccount="Yes";
        }
        else if(eno.isSelected()){
            eaccount="No";
        }
        
        String span=pan.getText();
        String saadhar=aadhar.getText();
        
        try{
           
            
                Conn c=new Conn();
                String query="insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+ssenior+"', '"+eaccount+"')";
                
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }catch(Exception e){
           System.out.println(e); 
           
        }
            
        } 
    
    public static void main(String args[]) {
      new SignupTwo("");
    }
}
