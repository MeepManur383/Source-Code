package ashwin.manur.APCSA.hw.Chapter10;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle() {
		width = 1;
		height = 1;
	}

	public Rectangle(int width, int height) {
		if (width > 0 && height > 0) {
			this.width = width;
			this.height = height;
		}
		else {
			throw new IllegalArgumentException("Width or Height cannot be negative!");
		}

	}

	public Rectangle(int width) {
		if (width > 0) {
			this.width = width;
			this.height = width;
		}
		else {
			throw new IllegalArgumentException("Width cannot be negative!");
		}
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
		

	public boolean isSquare() {
		if (width == height) {
			return true;
		}
		return false;
	}

	public void quadratize() {
		int diff = width - height;
		if(diff != 1 && diff != -1) {
			diff /= 2;
			width -= diff;
			height += diff;			
		}
		else {
			width = Math.min(width, height);
			height = Math.min(width, height);
		}
	}

}
