package Lib;

import java.util.ArrayList;

import javax.swing.ComboBoxModel;

public abstract class FactoryChooser {
	public abstract ComponentFactory getLanguageChoice(String language);
	public abstract String[] getLanguageList();
}
