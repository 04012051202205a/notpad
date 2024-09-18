/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notbat;

import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

/**
 *
 * @author ADMIN
 */
public class NotPat extends JFrame{
    private JMenuBar menubar;
    private JMenu mFile,mEdit,mFromat,mView,mHelp,mZoom;
    private JMenuItem itemNew,itemOpen,itemSave,itemSaveAs,itemPageSetup,itemPrint,itemZoom,itemExit,itemZoomin,itemZoomout,itemStaburbar;
    private JMenuItem itemUndo,itemCut,itemCopy,itemPasre,itemDelete,itemSeachWithBing,itemFind,itemFindNet,itemFindPrevious,itemRePalce,itemGoto,itemSelectAll,itemTimeDate;
    
    private JMenuItem itemFond,itemWordWap,itemviewhelp,itemsend,itemabounotpad;
    private JTextArea txteditor;
     private JCheckBoxMenuItem itemWordWrap;
    
    public NotPat(String title){
     super(title);
     createMenu();
     
        createGui();
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

}

    private void createMenu() {
        menubar=new JMenuBar();
        menubar.add(mFile=new JMenu("File"));
        menubar.add(mEdit=new JMenu("Edit"));
        menubar.add(mFromat=new JMenu("Fomat"));
        menubar.add(mView=new JMenu("View"));
        menubar.add(mHelp=new JMenu("Help"));
        mFile.add(itemNew=new JMenuItem("New"));
        mFile.add(itemOpen=new JMenuItem("Open......"));
        mFile.add(itemSave=new JMenuItem("Save...."));
        mFile.add(itemSaveAs=new JMenuItem("SaveAs....."));
        mFile.add(new JSeparator());
        mFile.add(itemPageSetup=new JMenuItem("PageSetup"));
        mFile.add(itemPrint=new JMenuItem("Print....."));
        mFile.add(new JSeparator());
        mFile.add(itemExit=new JMenuItem("Exit....."));
        //taoj phims
        itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
        itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));
        itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
        itemSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK +KeyEvent.SHIFT_DOWN_MASK));
       itemPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK));
        setJMenuBar(menubar);
        //tao phim khac
        mEdit.add(itemUndo=new JMenuItem("UnDo"));
        mEdit.add(itemCut=new JMenuItem("Cut......"));
        mEdit.add(itemCopy=new JMenuItem("Copy...."));
       mEdit.add(itemPasre=new JMenuItem("Parse....."));
        mEdit.add(new JSeparator());
        mEdit.add(itemDelete=new JMenuItem("Delete"));
       mEdit.add(itemSeachWithBing=new JMenuItem("Seach With Bing....."));
        mEdit.add(new JSeparator());
        mEdit.add(itemFind=new JMenuItem("Find....."));
        mEdit.add(itemFindNet=new JMenuItem("Find Next"));
        mEdit.add(itemFindPrevious=new JMenuItem("Find Previous"));
        mEdit.add(itemRePalce=new JMenuItem("Place....."));
        mEdit.add(itemGoto=new JMenuItem("Go to....."));
        mEdit.add(itemSelectAll=new JMenuItem("Select All..."));
        mEdit.add(itemTimeDate=new JMenuItem("Time Date"));
        itemUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,KeyEvent.CTRL_DOWN_MASK));
        itemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_DOWN_MASK));
        itemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK));
        itemPasre.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK ));
       itemDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK));
       itemSeachWithBing.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,KeyEvent.CTRL_DOWN_MASK));
        itemFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,KeyEvent.CTRL_DOWN_MASK));
        itemFindNet.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
        itemFindPrevious.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK ));
       itemRePalce.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,KeyEvent.CTRL_DOWN_MASK));
        itemGoto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,KeyEvent.CTRL_DOWN_MASK));
        itemSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_DOWN_MASK));
        itemTimeDate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
        setJMenuBar(menubar);
        mFromat.add(itemWordWap=new JMenuItem("Word Wrap"));
       
        mFromat.add(itemFond=new JMenuItem("Font..."));
        
       
        //tao nut view
        mHelp.add(itemviewhelp=new JMenuItem("view help"));
        mHelp.add(itemsend=new JMenuItem("Send"));
         mHelp.add(itemabounotpad=new JMenuItem("Aboud notepab"));
//          mZoom.add(itemZoomin = new JMenuItem("Zoom In"));
//        mZoom.add(itemZoomout = new JMenuItem("Zoom Out"));
         setJMenuBar(menubar);
         
            itemExit.addActionListener(e -> {
                int confirm = JOptionPane.showConfirmDialog(this,
                        "Are you sure you want to exit?",
                        "Confirm Exit",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
       
       

    }

    private void createGui() {
    }

   
    
    
}


