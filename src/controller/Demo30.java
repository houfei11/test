package controller;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 代码练习
 * 需求：用户分别从两个文本框输入学术的姓名和分数，程序按成绩排序将这些学生的姓名和分数显示在一个文本区中。
 * @author Administrator
 */
public class Demo30 implements Comparable {
    String name;
    int score;

    Demo30(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    /**
     * 按学生成绩进行排序
     *
     * @param a
     * @return
     */
    @Override
    public int compareTo(Object a) {
        Demo30 demo = (Demo30) a;
        int m = this.score - demo.score;

        //保证成绩相等是也能在文本框中显示
        if (m == 0) {
            return 1;
        }
        return m;
    }
}

class MyFrame extends JFrame implements ActionListener {
    //TreeSet泛型集合对象  
    TreeSet<Demo30> t;
    //姓名文本框  
    JTextField text1;
    //成绩 文本框  
    JTextField text2;
    // 确认按钮  
    JButton button;
    //文本区  
    JTextArea area;

    MyFrame() {
        init();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void init() {
        //TreeSet集合对象  
        t = new TreeSet<Demo30>();
        //创建 姓名 标签  
        JLabel label1 = new JLabel("姓名");
        //姓名文本框  
        text1 = new JTextField(10);
        //创建 成绩标签  
        JLabel label2 = new JLabel("成绩");
        //成绩 文本框  
        text2 = new JTextField(10);
        // 确认按钮  
        button = new JButton("确定");
        //文本区  
        area = new JTextArea(20, 30);
        //创建面板，把上面的组件添加到面板  
        JPanel panel = new JPanel();
        panel.add(label1);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        panel.add(button);
        //添加到窗口  
        add(panel, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);
        //给第一个文本框text1 添加监听器  
        text1.addActionListener(this);
        //给第二个文本框text1 添加监听器  
        text2.addActionListener(this);
        //给button按钮添加监视器  
        button.addActionListener(this);
    }

    //重写actionPerformed方法  
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = text1.getText();
        int score = 0;
        try {
            //通过Integer.parseInt，把字符串类型转换为整型的数字  
            score = Integer.parseInt(text2.getText());
            //如果输入的名字合法，添加到集合t中，再调用show方法，将集合t的内容显示在文本区中  
            if (name.length() > 0) {
                Demo30 s = new Demo30(name, score);
                t.add(s);
                show(t);
            }
        } catch (NumberFormatException exp) {//数字格式异常  
            text2.setText("请输入正确的字符");
        }
    }

    public void show(TreeSet<Demo30> tr) {
        //每次调用show方法，先把文本区中的内容清空  
        area.setText(null);
        //获取迭代器it  
        Iterator<Demo30> it = tr.iterator();
        while (it.hasNext()) {
            Demo30 s = it.next();
            //将学生的信息显示在文本区中  
            area.append("姓名：" + s.getName() + "成绩：" + s.getScore() + "\n");
        }
    }
}
class Text{
    public static void main(String[] args) {
        //创建MyFrame对象
        MyFrame win=new MyFrame();
        win.setBounds(100, 100, 400, 400);
    }
}