import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{
        private JFrame frame;

        private JPanel accountpanel;
        private JPanel passwordpanel;
        private JPanel btn_panel;

        private JLabel lb_account;
        private JLabel lb_password;

        private JTextField txt_account;
        private JPasswordField txt_password;

        private JButton btn_comfirm;
        private JButton btn_exit;
        public Login(){

            initLoginFrame();
            initLoginPanel();
            initLb_Account();
            initTxt_Account();
            initLb_PassWord();
            initTxt_Password();
            initBtn_ComfirmAndExit();


            initLoginFrameAttrs();

        }


        public void initLoginFrame(){
            frame = new JFrame("登陆");
            frame.setLayout(new GridLayout(3,1,5,0));



        }

        public  void initLoginFrameAttrs(){

            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension screamSize = toolkit.getScreenSize();
            int login_frame_wide=500;
            int login_frame_height=309;

            frame.add(accountpanel);
            frame.add(passwordpanel);
            frame.add(btn_panel);
            frame.setSize(login_frame_wide,login_frame_height);
            frame.setLocation((screamSize.width-login_frame_wide)/2,(screamSize.height-login_frame_height)/2);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        }

        public void initLoginPanel(){
            accountpanel = new JPanel(new FlowLayout());
            passwordpanel = new JPanel(new FlowLayout());
            btn_panel = new JPanel(new FlowLayout(0,10,0));
            accountpanel.setBorder(BorderFactory.createEmptyBorder(30,10,5,5));
            passwordpanel.setBorder(BorderFactory.createEmptyBorder(0,10,5,5));
            btn_panel.setBorder(BorderFactory.createEmptyBorder(0,185,10,10));
        }

        public void initLb_Account(){
            lb_account = new JLabel("账号：");
            lb_account.setFont(new Font(null,Font.PLAIN,20));
            lb_account.setPreferredSize(new Dimension(70,30));
            accountpanel.add(lb_account);
        }

        public void initTxt_Account(){
            txt_account =new JTextField();
            txt_account.setFont(new Font(null,Font.PLAIN,20));
            txt_account.setPreferredSize(new Dimension(200,30));
            accountpanel.add(txt_account);
        }

        public void initLb_PassWord(){
            lb_password = new JLabel("密码：");
            lb_password.setFont(new Font(null,Font.PLAIN,20));
            lb_password.setPreferredSize(new Dimension(70,30));
            passwordpanel.add(lb_password);
        }

        public void initTxt_Password(){
            txt_password = new JPasswordField();
            txt_password.setFont(new Font(null,Font.PLAIN,20));
            txt_password.setPreferredSize(new Dimension(200,30));
            passwordpanel.add(txt_password);
        }


        public void  initBtn_ComfirmAndExit(){
            btn_comfirm = new JButton("确定");
            btn_exit = new JButton("退出");
            btn_comfirm.setFont(new Font(null,Font.PLAIN,20));
            btn_comfirm.setPreferredSize(new Dimension(80,30));
            btn_exit.setFont(new Font(null,Font.PLAIN,20));
            btn_exit.setPreferredSize(new Dimension(80,30));
            btn_panel.add(btn_comfirm);
            btn_panel.add(btn_exit);
            btn_comfirm.addActionListener(this);
            btn_exit.addActionListener(this);

        }


        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == btn_comfirm){

                frame.dispose();
            }

            if (e.getSource() == btn_exit){
                frame.dispose();
            }


        }
    }



