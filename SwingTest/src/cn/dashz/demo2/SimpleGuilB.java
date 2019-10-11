package cn.dashz.demo2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuilB implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGuilB gui = new SimpleGuilB();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        //在windows关闭时把程序结束掉
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //把button加到frame的pane上
        frame.getContentPane().add(button);

        //设定frame的大小
        frame.setSize(300,300);

        //最后把frame显示出来
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        button.setText("I've been clicked");
    }
}
