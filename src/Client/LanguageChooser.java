package Client;

import Lib.ComponentFactory;
import Lib.FactoryChooser;

public class LanguageChooser extends FactoryChooser {

	@Override
	public ComponentFactory getLanguageChoice(String language) {
		ComponentFactory factory = null;
		if(language.equals("Java"))
		{
			factory = new JavaFactory();
		}else if(language.equals("HTML"))
		{
			factory = new HTMLComponentFactory();
		}
		return factory;
	}

	@Override
	public String[] getLanguageList() {
		// TODO Auto-generated method stub
		return new String[]{"HTML","Java"};
	}

}
