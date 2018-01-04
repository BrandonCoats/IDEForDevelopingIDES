
package Lib;

import java.util.ArrayList;

public abstract class ComponentFactory{
	protected DevEnvironment devEnv = new DevEnvironment();
	protected ArrayList<Component> components = new ArrayList<Component>();
	public abstract Component createComponent(int height, int width, int x, int y,String content, String type);
	public abstract String[] listComponents();
	public abstract void build();
	public abstract void run();
	public abstract String[] getOptions();
	
}
