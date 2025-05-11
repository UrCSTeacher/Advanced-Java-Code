import javax.swing.*;
import java.awt.*;
class MenuDemo extends JFrame
{
	JMenuBar mb;
	JMenu fm,em,vm,zm;
	JMenuItem miopen,misave;
	JCheckBoxMenuItem misb;
	JMenuItem z50,z75, z100, z150;
	MenuDemo()
	{
		setSize(400,300);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Menu Demo");
		mb=new JMenuBar();
		fm=new JMenu("File");
		vm=new JMenu("View");
		em=new JMenu("Edit");
		zm=new JMenu("Zoom");
		fm.setMnemonic('F');
		
		mb.add(fm);
		mb.add(em);
		mb.add(vm);
		
		miopen=new JMenuItem("Open",'o');
		misave=new JMenuItem("Save",'s');
		misb=new JCheckBoxMenuItem("Status Bar",false);
		
		fm.add(miopen);
		fm.add(misave);
		vm.add(misb);
		vm.add(zm);

		z50=new JMenuItem("50%");
		z75=new JMenuItem("75%");
		z100=new JMenuItem("100%");
		z150=new JMenuItem("150%");
		zm.add(z50);
		zm.add(z75);
		zm.add(z100);
		zm.add(z150);

		setJMenuBar(mb);	
		setVisible(true);
	}	
	public static void main(String args[]) 
	{
		MenuDemo frame=new MenuDemo();		
	}
}
