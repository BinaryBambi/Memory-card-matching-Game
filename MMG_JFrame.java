package project2;

import javax.swing.JFrame;

public class MMG_JFrame extends JFrame{

	private String  title = "My Memory Matching Game";
	
	public MMG_JFrame() {
		
		App MMGJP = new App();
		add(MMGJP);
		
		
		setTitle(title);
		setSize(600,600);
		setLocation(660, 240);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

}
