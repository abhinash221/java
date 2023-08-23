import javax.swing.*;
public class swing {
    public static void main(String[] args){
        // JFrame jF=new JFrame("Example of Scroll bar");
        // JScrollBar sB0 = new JScrollBar(0,30,20,0,60);
        // JScrollBar sB1 = new JScrollBar(1,30,20,20,50);
        // sB0.setBounds(50,20,50,40);
        // sB1.setBounds(100,100,20,250);'
        JFrame jF=new JFrame("Notepad");

        JMenuBar mb=new JMenuBar();
        JMenu menu=new JMenu("File");
        JMenu subMenu=new JMenu("Sub Menu");
        JMenuItem item1=new JMenuItem("New");
        JMenuItem item2=new JMenuItem("Open");
        JMenuItem item3=new JMenuItem("Save");
        JMenuItem item4=new JMenuItem("Print");
        JMenuItem item5=new JMenuItem("Exit");
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menu.add(item5);
        // menu.add(subMenu);
        mb.add(menu);
        jF.setJMenuBar(mb);



        
        JMenu Menu=new JMenu("Edit");
        // JMenu subMEnu=new JMenu("Sub Menu");
        JMenuItem item11=new JMenuItem("Copy");
        JMenuItem item12=new JMenuItem("Paste");
        JMenuItem item13=new JMenuItem("Delete");
        JMenuItem item14=new JMenuItem("Font");
        Menu.add(item11);
        Menu.add(item12);
        Menu.add(item13);
        Menu.add(item14);
        // Menu.add(subMEnu);
        mb.add(Menu);
        

        

        JMenu MENu=new JMenu("View");
        JMenuItem item15=new JMenuItem("Zoom");
        JMenuItem item16=new JMenuItem("Status Bar");
        JMenuItem item17=new JMenuItem("Word Wrap");
        MENu.add(item15);
        MENu.add(item16);
        MENu.add(item17);
        mb.add(MENu);



        jF.setSize(400,400);
        jF.setLayout(null);
        jF.setVisible(true);

        // jF.add(sB0);
        // jF.add(sB1);
        // jF.setSize(400,400);
        // jF.setLayout(null);
        // jF.setVisible(true);



    
    //     JLabel jLO=new JLabel("Name");
    //     JTextField field=new JTextField("C32A");
    //     JFrame Frame=new JFrame("Aayushmann");
    //     JButton btn=new JButton("Click Me!");
        
    //     jLO.setBounds(10,20,60,20);
    //     field.setBounds(50,20,60,20);
    //     btn.setBounds(40,70,120,20);

    //     Frame.add(jLO);
    //     Frame.add(btn);

    //     // JButton btnn=new JButton("okkk!");
    //     // btnn.setBounds(40,60,120,30);
    //     // Frame.add(btnn);

    //     // JButton btnnn=new JButton("yes!");
    //     // btnnn.setBounds(40,100,120,30);
    //     // Frame.add(btnnn);

    //     // JButton btnnnn=new JButton("no!");
    //     // btnnnn.setBounds(40,140,120,30);
    //     // Frame.add(btnnnn);

    //     // JButton btnnnnn=new JButton("ok!");
    //     // btnnnnn.setBounds(40,180,120,30);
    //     // Frame.add(btnnnnn);

    //     Frame.add(field);
    //     Frame.setSize(200,250);
    //     Frame.setLayout(null);
    //     Frame.setVisible(true);
       }
    
}
