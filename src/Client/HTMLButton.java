package Client;

import Lib.Component;

public class HTMLButton extends Component {

	public HTMLButton(int height, int width, int x, int y, String content) {
		super(height, width, x, y, content);
		// TODO Auto-generated constructor stub
	}

	public String getComponent()
	{
		String button = "<button type=\"button\" style=\"position: absolute; top:" + getY()  + "px; left:" + getX() 
		+ "px; width: " + getWidth() + "px; height:" + getHeight()  + "px; \">" + getContent() +"</button>\n";
		return button;
	}

}