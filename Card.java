package project2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Card extends JButton {

	private ImageIcon imgIcon;
	private String imgPath; 

	public Card() {
		imgIcon = null;
		imgPath = "";

	}

	public Card(String imgPath){
		super(); // calls the default constructor
		this.imgIcon = new ImageIcon(imgPath); // passes in the image path as the imageIcon parameter 
//		imgIcon.setDescription(imgPath);
		Image tempImage = imgIcon.getImage();
		imgIcon = new ImageIcon(tempImage.getScaledInstance(80, 80, Image.SCALE_FAST));
		this.setIcon(imgIcon);

	}

	public ImageIcon getImgIcon() {
		return imgIcon;

	}

	public void setImgIcon(String imgPath) {
		this.imgIcon = new ImageIcon(imgPath); // passes in the image path as the imageIcon parameter 
		imgIcon.setDescription(imgPath);
		Image tempImage = imgIcon.getImage();
		imgIcon = new ImageIcon(tempImage.getScaledInstance(80, 80, Image.SCALE_FAST));
		this.setIcon(imgIcon);
	}

	public String getImgPath() {
		return imgPath;

	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;

	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Card){           
			Card otherCard = (Card)o;
			return (this.imgIcon == otherCard.imgIcon) &&
					(this.imgPath == otherCard.imgPath);
		}
		return false;
	}

}
