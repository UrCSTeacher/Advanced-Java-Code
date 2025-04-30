import javax.swing.*;
import java.awt.*;
class MenuDemo extends JFrame{
	JMenuBar mb;
	JMenu fm,em,vm,zm,rm,tm;
	JMenuItem miopen,misave,micut,mirun,mimd;
	JCheckBoxMenuItem misb;
	JMenuItem z25, z50,z75,z100;
	
	MenuDemo(){
	setSize(500,300);
	setTitle("MenuDemo");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	mb=new JMenuBar();
	fm=new JMenu ("FILE");
	em=new JMenu("EDIT");
	vm=new JMenu("VIEW");
	zm=new JMenu("ZOOM");
	rm=new JMenu("RUN");
	tm=new JMenu("TOOLS");
	fm.setMnemonic('F');
	em.setMnemonic('E');

	mb.add(fm);
	mb.add(em);
	mb.add(vm);
	mb.add(zm);
	mb.add(rm);
	mb.add(tm);
	
	
	miopen=new JMenuItem("Open",'O');
	misave=new JMenuItem("Save",'S');
	micut=new JMenuItem("Cut",'X');
	mirun=new JMenuItem("Run");
	mimd=new JMenuItem("MD5");
	
	misb=new JCheckBoxMenuItem("Status Bar",false);
	
	fm.add(miopen);
	fm.add(misave);
	em.add(micut);
	vm.add(misb);
	vm.add(zm);
	rm.add(mirun);
	tm.add(mimd);
	
	z25=new JMenuItem("25%");
	z50=new JMenuItem("50%");
	z75=new JMenuItem("75%");
	z100=new JMenuItem("100%");
	
	zm.add(z25);
	zm.add(z50);
	zm.add(z75);
	zm.add(z100);
	
	setJMenuBar(mb);
	setVisible(true);
	}
	public static void main(String[]args){
	
	MenuDemo m=new MenuDemo();
	}
}

	
	
	
	
