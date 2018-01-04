package Lib;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import Client.HTMLComponentFactory;

public class ApplicationIDE {
	/*
	 * make this class the window IDE or the user window
	 * will have the options for the IDE such as 
	 * buttons and selection for the build and the app
	 * 
	 */
	ComponentFactory factory;
	Component component = null;
	String value = "";
	FactoryChooser languageChooser;
	ArrayList<Component> components = new ArrayList<Component>();
	public ApplicationIDE(FactoryChooser languageChooser) {
		super();
		this.languageChooser = languageChooser;
	}

	public void ShowUI()
	{
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(null);

		JComboBox languageList = new JComboBox(languageChooser.getLanguageList());
		languageList.setBounds(200, 250, 400, 50);
		value = languageList.getSelectedItem().toString();
		factory = languageChooser.getLanguageChoice(value);
		languageList.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value = languageList.getSelectedItem().toString();
				factory = languageChooser.getLanguageChoice(value);
			}
		});
		p.add(languageList);

		JButton addbutton = new JButton("AddComponent");
		addbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//String value = 
						openComponentUI();
			}
		});
		addbutton.setBounds(200, 300, 200, 50);
		p.add(addbutton);
		JButton build= new JButton("Build");
		build.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				factory.build();
			}
		});
		build.setBounds(400, 300, 200, 50);
		p.add(build);
		//add drop down for the list of componenets 
		JLabel label = new JLabel("IDE Creation UI");
		label.setOpaque(true);
		label.setBounds(350, 10, 400, 400);
		p.add(label);

		f.add(p);
		f.setSize(800, 500);
		f.setVisible(true);
	}
	private void openComponentUI() {
		String value ="HTML";
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(null);
		JLabel xl = new JLabel("X");
		xl.setBounds(10, 55, 10, 10);
		p.add(xl);
		JTextField x = new JTextField();
		x.setBounds(30, 50, 100, 20);
		p.add(x);
		JLabel yl = new JLabel("Y");
		yl.setBounds(10, 75, 10, 10);
		p.add(yl);
		JTextField y = new JTextField();
		y.setBounds(30, 70, 100, 20);
		p.add(y);
		JLabel heightl = new JLabel("Height");
		heightl.setBounds(10, 95, 100, 10);
		p.add(heightl);
		JTextField height = new JTextField();
		height.setBounds(50, 90, 100, 20);
		p.add(height);
		JLabel widthl = new JLabel("Width");
		widthl.setBounds(10, 115, 100, 10);
		p.add(widthl);
		JTextField width = new JTextField();
		width.setBounds(50, 110, 100, 20);
		p.add(width);
		JLabel stringl = new JLabel("String");
		stringl.setBounds(10, 35, 100, 10);
		p.add(stringl);
		JTextField string = new JTextField();
		string.setBounds(50, 30, 100, 20);
		p.add(string);
		JButton button = new JButton("Submit");
		button.setBounds(160, 50, 100, 50);
		p.add(button);
		String[] compStrings =  factory.getOptions();
		JComboBox componentList = new JComboBox(compStrings);
		componentList.setBounds(85, 130, 100, 25);
		p.add(componentList);
		f.add(p);
		f.setSize(300, 200);
		f.setVisible(true);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String compType = componentList.getSelectedItem().toString(); 
				int numx = Integer.parseInt(x.getText());
				int numy = Integer.parseInt(y.getText());
				int numheight = Integer.parseInt(height.getText());
				int numwidth = Integer.parseInt(width.getText());
			    component = factory.createComponent(numx, numy, numheight, numwidth, string.getText(), compType);
				components.add(component);
				//f.EXIT_ON_CLOSE;
			}
		});
	}
}
