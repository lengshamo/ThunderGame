package Game;

import java.awt.image.BufferedImage;

public class Enemybullet extends Location{

	public Enemybullet(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
	}

	@Override
	public void move(long time) {
		if (time % 30 == 0) {
				y += 10;
		}
	}
}
