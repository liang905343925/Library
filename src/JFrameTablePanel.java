import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameTablePanel implements ActionListener {

    private JFrame frame;
    private JTabbedPane tabbedPane;
    private  JTextField txt_serachBook;
    private JButton btn_searchConfirm;
    private JTable tb_ShowBookInfo;
    private JScrollPane scrollPane;





    public void initTable(){
        initFrame();
        initTabbedPane();

        initFrameAttrs();

    }


    public void initFrame(){
        frame = new JFrame("功能选择");

    }


    public void initFrameAttrs(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screamsize = toolkit.getScreenSize();
        int framewide=1200;
        int frameheight = 800;
        frame.setSize(framewide,frameheight);
        frame.setContentPane(tabbedPane);
        frame.setLocation((screamsize.width-framewide)/2,(screamsize.height-frameheight)/2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    public void initTabbedPane(){
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("图书搜索",TabbedPaneShowPublicBook());
        tabbedPane.addTab("个人借书",TabbedPaneShowPersionBook());
        tabbedPane.addTab("个人信息",TabbedPanePersionInfo());
        tabbedPane.setFont(new Font(null,Font.PLAIN,18));
        tabbedPane.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));


    }

    public  JComponent TabbedPaneShowPublicBook(){
        JPanel showPublicBook = new JPanel();
        showPublicBook.setLayout(new BorderLayout());
        JPanel searchPanel = new JPanel(new FlowLayout());

        JLabel lb_searchBook = new JLabel("搜索图书：");
        lb_searchBook.setFont(new Font(null,Font.PLAIN,18));
        lb_searchBook.setPreferredSize(new Dimension(110,20));
        txt_serachBook = new JTextField();
        txt_serachBook.setPreferredSize(new Dimension(300,30));
        btn_searchConfirm =new JButton("搜索");
        btn_searchConfirm.setFont(new Font(null,Font.PLAIN,18));
        btn_searchConfirm.addActionListener(this);
        searchPanel.add(lb_searchBook);
        searchPanel.add(txt_serachBook);
        searchPanel.add(btn_searchConfirm);

        showPublicBook.add(searchPanel,BorderLayout.NORTH);


        return showPublicBook;
    }


    public JComponent TabbedPaneShowPersionBook(){
        JPanel showPersionBook = new JPanel();

        return showPersionBook;
    }

    public  JComponent TabbedPanePersionInfo(){
        JPanel showPersionInfo = new JPanel();



        return showPersionInfo;

    }

    public void initPublicBookTable(){
        tb_ShowBookInfo = new JTable();


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
