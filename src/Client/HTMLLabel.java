package Client;

import Lib.Component;

public class HTMLLabel extends Component{

	public HTMLLabel(int height, int width, int x, int y, String content) {
		super(height, width, x, y, content);
		// TODO Auto-generated constructor stub
	}

	public String getComponent()
	{
		String label = "<p style=\"position:absolute; top:" + getY()  + "px; left:" + getX() + "px; width:" + getWidth() + "px; height:" + getHeight()  + "px; \">" + getContent() +"</p>\n";
		return label;
	}
}
