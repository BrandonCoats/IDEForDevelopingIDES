package Client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Lib.Component;
import Lib.ComponentFactory;

public class HTMLComponentFactory extends ComponentFactory {

	@Override
	public Component createComponent(int height, int width, int x, int y, String content, String type) {
		Component c = null;
		if(type.equals("Label"))
		{
			c = new HTMLLabel(height, width, x, y, content);
		}
		else if(type.equals("Button"))
		{
			c = new HTMLButton(height, width, x, y, content); 
		}
		if(c != null)
		{
			components.add(c);
		}
		return c;
	}

	@Override
	public String[] listComponents() {
		// TODO Auto-generated method stub
		String[] strings = new String[components.size()];
		for(int i = 0; i < components.size(); i++)
		{
			strings[i]=components.get(i).toString();
			
		}
		//for now prints all the references kinda useless change later
		return strings;
	}
	public String[] getOptions()
	{
		String[] options = new String[]{"Label","Button"};
		return options;
	}
	
	@Override
	public void build() {
		System.out.println("build html");
		//build html text file
		String dir = System.getProperty("user.dir");
		dir = dir +"HTMLOutput.html";
		File file = new File(dir);
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("<!DOCTYPE html><html><body>\n");
			for(Component comp: components)
			{
				fw.write(comp.getComponent());
			}
			fw.write("</body></html>");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		run();
	}
	
	@Override
	public void run() {
		System.out.println("Opens the web page");
		String dir = System.getProperty("user.dir");
		dir = dir +"HTMLOutput.html";
		//load html page
		try {
			devEnv.executeCommand("rundll32 url.dll,FileProtocolHandler \""+ dir+"\"", false);
		}
		catch (Exception e) {
			e.printStackTrace();
	}
		
	}

}
