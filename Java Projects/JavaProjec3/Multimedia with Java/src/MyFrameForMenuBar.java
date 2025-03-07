import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.FlowLayout;


public class MyFrameForMenuBar extends JFrame implements ActionListener{

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;   
    JMenuItem loadItem;
    JMenuItem SaveItem;
    JMenuItem exitItem;
    ImageIcon saveIcon,loadIcon,exitIcon;

    MyFrameForMenuBar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(new FlowLayout());

        saveIcon = new ImageIcon("save Icon.png");
        loadIcon = new ImageIcon("load_Icon.png");
        exitIcon = new ImageIcon("exit_Icon.png");

        menuBar = new JMenuBar(); 

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        
        loadItem = new JMenuItem("Load");
        SaveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        SaveItem.setIcon(saveIcon);
        loadItem.setIcon(loadIcon);
        exitItem.setIcon(exitIcon);

        loadItem.addActionListener(this);
        SaveItem.addActionListener(this);
        exitItem.addActionListener(this);

        

        loadItem.setMnemonic(KeyEvent.VK_L);// l for load
        SaveItem.setMnemonic(KeyEvent.VK_S);// s for load
        exitItem.setMnemonic(KeyEvent.VK_E);// e for load

        fileMenu.setMnemonic(KeyEvent.VK_F);// Alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E);// Alt + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H);// Alt + h for help

        fileMenu.add(loadItem);
        fileMenu.add(SaveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==loadItem){
            System.out.println("Loaded File");
        }
        if(e.getSource()==SaveItem){
            System.out.println("Saved File");
        }
        if(e.getSource()==exitItem){
            System.exit(0);
        }

    }
    
}
