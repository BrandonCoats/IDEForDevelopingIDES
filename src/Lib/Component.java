package Lib;

public abstract class Component {
int height; 
int width;
int x;
int y;
String content;
public Component(int height, int width, int x, int y, String content) {
	this.height = height;
	this.width = width;
	this.x = x;
	this.y = y;
	this.content = content;
}

public abstract String getComponent();

public int getHeight()
{
	return height;
}

public int getWidth() {
	return width;
}

public int getX() {
	return x;
}

public int getY() {
	return y;
}

public String getContent() {
	return content;
}

}
