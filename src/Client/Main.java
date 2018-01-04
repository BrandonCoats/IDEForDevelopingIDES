package Client;

import Lib.ApplicationIDE;
import Lib.ComponentFactory;
import Lib.DevEnvironment;
public class Main {

	public static void main(String[] args) {
		ApplicationIDE ui = new ApplicationIDE(new LanguageChooser());
		ui.ShowUI();
		
		
//		DevEnvironment app = new DevEnvironment();
//		MyIDEFactory factory = new MyIDEFactory();
//		ComponentFactory cf = new HTMLComponentFactory();
//		cf.createComponent(200, 200, 20, 20, "Hello World", "label");
//		System.out.print(cf.listComponents().get(0).toString());
//		//cf = factory.getIDEInstance("HTML");
//	
//		
//		
//		try {
//			app.executeCommand("rundll32 url.dll,FileProtocolHandler \"C:\\Users\\jprirm\\Documents\\HTMLOutput.html\"", false);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		
	}
}
