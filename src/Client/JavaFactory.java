package Client;

import java.util.ArrayList;

import Lib.Component;
import Lib.ComponentFactory;

public class JavaFactory extends ComponentFactory{

	@Override
	public Component createComponent(int height, int width, int x, int y, String content, String type) {
		Component c = null;
		if(type.equals("Label"))
		{
			c = new SwingLabel(height, width, x, y, content);
		}
		else if(type.equals("Button"))
		{
			c = new SwingButton(height, width, x, y, content); 
		}
		else if(type.equals("Dropbox"))
		{
			c = new SwingDropbox(height, width, x, y, content);
		}
		else if(type.equals("TextField"))
		{
			c = new SwingTextField(height,width, x, y, content);
		}
		if(c != null)
		{
			components.add(c);
		}
		return c;
	}

	@Override
	public String[] listComponents() {
		String[] strings = new String[components.size()];
		for(int i = 0; i < components.size(); i++)
		{
			strings[i]=components.get(i).toString();

		}
		//for now prints all the references kinda useless change later
		return strings;
	}

	@Override
	public void build() {
		String dir = System.getProperty("user.dir");
		dir = dir+"output";
		System.out.println("Build the class file for the compiler");
		//		try {
		//			devEnv.executeCommand("\"C:\\Program Files\\Java\\jdk1.8.0_66\\bin\\javac.exe\" -d \""+dir+"\" \"C:\\g\\csc360 workspace\\Factory\\src\\edu\\neumont\\csc360\\ide\\SimpleConsoleApp\"", true);
		//		} catch (Exception e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		run();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Invoke java and pass in the class file");
		//		try {
		//			devEnv.executeCommand("\"C:\\Program Files\\Java\\jdk1.8.0_121\\bin\\java\" -classpath \"C:\\g\\csc360 workspace\\Factory\\classes\" edu.neumont.csc360.ide.SimpleConsoleApp", true);
		//		} catch (Exception e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
	}

	@Override
	public String[] getOptions() {
		String[] options = new String[]{"Label","Button","DropBox","Textfield"};
		return options;
	}

}
