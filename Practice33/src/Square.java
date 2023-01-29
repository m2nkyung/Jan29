public class Square {
	int width, height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int area() {
		return width * height;
	}
	
	public boolean isSmallerThan(Square s) {
		if(area() < s.area()) {
			return true;
		} else {
			return false;
		}
	}
}