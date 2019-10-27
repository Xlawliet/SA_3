package Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Frame extends JFrame {

//    public static void main(String[] args) {
//        init();
//    }


    public static void init() {
        // 3.在initUI方法中，实例化JFrame类的对象。
        JFrame frame = new JFrame();
        // 4.设置窗体对象的属性值：标题、大小、显示位置、关闭操作、布局、禁止调整大小、可见、...
        frame.setTitle("Login");// 设置窗体的标题
        frame.setSize(500, 500);// 设置窗体的大小，单位是像素
        frame.setDefaultCloseOperation(3);// 设置窗体的关闭操作；3表示关闭窗体退出程序；2、1、0
//        frame.setLocationRelativeTo(null);// 设置窗体相对于另一个组件的居中位置，参数null表示窗体相对于屏幕的中央位置
//        frame.setResizable(false);// 设置禁止调整窗体大小

//        // 实例化FlowLayout流式布局类的对象，指定对齐方式为居中对齐，组件之间的间隔为5个像素
//        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 10, 10);
//        // 实例化流式布局类的对象
//        frame.setLayout(fl);

        JPanel p=new JPanel();

        addComp(p);
        frame.add(p);

        // 将labName标签添加到窗体上

//        SendMsg.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent arg0) {
//
//
//            }
//        });


        // 实例化JTextField标签对象
        //将要发送的消息


        frame.setContentPane(p);
        frame.setVisible(true);// 设置窗体为可见
    }

    public static boolean ValidCheck(String email)
    {
        if (email == null)
            return false;
        String rule = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
        Pattern pattern;
        Matcher matcher;
        pattern = Pattern.compile(rule);
        matcher = pattern.matcher(email);
        if (matcher.matches())
            return true;
        else
            return false;
    }


    public static void addComp(JPanel panel) {
        panel.setLayout(null);
        JLabel Rece = new JLabel("收件人：");
        Rece.setBounds(30, 50, 100, 30);
        panel.add(Rece);
        JTextField ReceName = new JTextField(30);
        ReceName.setBounds(150, 50, 150, 40);
        panel.add(ReceName);
        JLabel Text = new JLabel("内容：");
        Text.setBounds(30, 120, 150, 30);
        panel.add(Text);
        JTextArea Context = new JTextArea(15, 15);
        Context.setBounds(150, 120, 200, 120);
        panel.add(Context);
        // 实例化JLabel标签对象，该对象显示"发送消息："
        JButton SendMsg = new JButton("发送");
        SendMsg.setBounds(200, 300, 100, 30);
        panel.add(SendMsg);
        SendMsg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String Rcv_name = ReceName.getText();
                String[] NameArray=Rcv_name.split(",");

                String context=Context.getText();
//                while(1!=0) {
//                    if (ValidCheck(Rcv_name) == false)
//                        JOptionPane.showMessageDialog(null, "邮箱错误，请检查后重新发送！", "出错啦！", JOptionPane.ERROR_MESSAGE);
//                    else
//                        break;
//                }
                HelloWorld h=new HelloWorldService().getHelloWorldPort();
                try {
                    for(int i=0;i<NameArray.length;i++) {
                        h.sayHelloWorldFrom(NameArray[i], context);
                    }
                    } catch (GeneralSecurityException_Exception e) {
                    e.printStackTrace();
                } catch (MessagingException_Exception e) {
                    e.printStackTrace();
                }
                System.out.println("发送成功");
            }
        });
    }
}