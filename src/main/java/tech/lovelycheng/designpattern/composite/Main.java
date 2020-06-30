package tech.lovelycheng.designpattern.composite;

/**
 * @author chengtong
 * @date 2020/6/30 19:30
 */
public class Main {

    public static void main(String[] args) {

        WinForm winForm = new WinForm("Window窗口");

        winForm.addSub(new Picture("LOGO"));
        Frame frame = new Frame("FRAME1");

        winForm.addSub(new Button("登录"));
        winForm.addSub(new Button("注册"));

        winForm.addSub(frame);

        frame.addSub(new Label("用户名"));
        frame.addSub(new TextBox("文本框"));

        frame.addSub(new Label("密码"));
        frame.addSub(new PasswordBox("密码框"));
        frame.addSub(new CheckBox("复选框"));

        frame.addSub(new TextBox("记住用户名"));
        frame.addSub(new LinkLabel("忘记密码"));

        System.out.println(winForm.print());


    }


}
