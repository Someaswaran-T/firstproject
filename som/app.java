import java.awt.*;
import java.awt.event.*;

class Myapp extends Frame{

Label lblTitle,lblName,lblFather,lblAge,lblGender,lblCourse,lblHobbies,lblAddress;
TextField txtName,txtFather,txtAge;
TextArea txtAddress;
Checkbox CheckMale,CheckFemale,Hobbies1,Hobbies2,Hobbies3,Hobbies4;
CheckboxGroup Cbg;
Choice Course;
Button btnSave,btnClear;


public Myapp(){
super("som's universe");
setSize(1000,600);
setLayout(null);
setVisible(true);
Color formColor =new Color(53,59,72);
setBackground(formColor);

Font titleFont =new Font("arial",Font.BOLD,25);
Font labelFont =new Font("arial",Font.PLAIN,18);
Font textFont =new Font("arial",Font.PLAIN,15);

lblTitle =new Label("resteration form");
lblTitle.setBounds(250,40,300,50);
lblTitle.setFont(titleFont);
lblTitle.setForeground(Color.YELLOW);
add(lblTitle);

lblName =new Label("Name");
lblName.setBounds(250,100,150,30);
lblName.setFont(labelFont);
lblName.setForeground(Color.WHITE);
add(lblName);


txtName =new TextField();
txtName.setBounds(400,100,400,30);
txtName.setFont(textFont);
add(txtName);

lblFather =new Label("Father Name");
lblFather.setBounds(250,150,150,30);
lblFather.setFont(labelFont);
lblFather.setForeground(Color.WHITE);
add(lblFather);


txtFather =new TextField();
txtFather.setBounds(400,150,400,30);
txtFather.setFont(textFont);
add(txtFather);


lblAge=new Label("Age");
lblAge.setBounds(250,200,150,30);
lblAge.setFont(labelFont);
lblAge.setForeground(Color.WHITE);
add(lblAge);


txtAge =new TextField();
txtAge.setBounds(400,100,450,30);
txtAge.setFont(textFont);
add(txtAge);

lblGender=new Label("Gender");
lblGender.setBounds(250,250,400,30);
lblGender.setFont(labelFont);
lblGender.setForeground(Color.WHITE);
add(lblGender);

Cbg=new CheckboxGroup();
CheckMale=new Checkbox("male",Cbg,true);
CheckMale.setBounds(400,250,100,30);
CheckMale.setFont(labelFont);
CheckMale.setForeground(Color.WHITE);
add(CheckMale);

CheckFemale=new Checkbox("Female",Cbg,true);
CheckFemale.setBounds(500,250,100,30);
CheckFemale.setFont(labelFont);
CheckFemale.setForeground(Color.WHITE);
add(CheckFemale);

lblCourse=new Label("course");
lblCourse.setBounds(250,300,150,30);
lblCourse.setFont(labelFont);
lblCourse.setForeground(Color.WHITE);
add(lblCourse);

Course=new Choice();
Course.setFont(labelFont);
Course.setBounds(400,300,400,50);
Course.add("c");
Course.add("c++");
Course.add("JAVA");
Course.add("PYTHON");
Course.add("EMBEDED C");
add(Course);
 
lblHobbies=new Label("Hobbies");
lblHobbies.setBounds(250,350,150,30);
lblHobbies.setFont(labelFont);
lblHobbies.setForeground(Color.WHITE);
add(lblHobbies);


Hobbies1 =new Checkbox("CODING");
Hobbies1.setBounds(400,350,100,50);
Hobbies1.setFont(labelFont);
Hobbies1.setForeground(Color.WHITE);
add(Hobbies1);


Hobbies2 =new Checkbox("LISTENING");
Hobbies2.setBounds(500,350,100,50);
Hobbies2.setFont(labelFont);
Hobbies2.setForeground(Color.WHITE);
add(Hobbies2);

Hobbies3=new Checkbox("READING");
Hobbies3.setBounds(600,350,100,50);
Hobbies3.setFont(labelFont);
Hobbies3.setForeground(Color.WHITE);
add(Hobbies3);

Hobbies4=new Checkbox("OTHERS");
Hobbies4.setBounds(700,350,100,50);
Hobbies4.setFont(labelFont);
Hobbies4.setForeground(Color.WHITE);
add(Hobbies4);


lblAddress=new Label("Address");
lblAddress.setBounds(250,400,150,300);
lblAddress.setFont(labelFont);
lblAddress.setForeground(Color.WHITE);
add(lblAddress);

txtAddress=new TextArea(10,30);
txtAddress.setBounds(300,400,400,50);
txtAddress.setFont(labelFont);
add(txtAddress);


btnSave=new Button("save the details");
btnSave.setBounds(400,530,150,30);
btnSave.setFont(labelFont);
btnSave.setForeground(Color.WHITE);
btnSave.setBackground(Color.RED);
add(btnSave);

btnClear=new Button("delete the details");
btnClear.setBounds(560,530,150,30);
btnClear.setFont(labelFont);
btnClear.setForeground(Color.WHITE);
btnClear.setBackground(Color.RED);
add(btnClear);




this.addWindowListener (new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);
}
});
}
}


public class app{
public static void main(String[] args){
Myapp frm=new Myapp();
}
}