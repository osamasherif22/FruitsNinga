package factoryPattern;

import java.awt.image.BufferedImage;
import java.io.File;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import logic.GameObject;

public class Orange implements Product,GameObject  {


    double limit;
        ImageView imageView;
	BufferedImage[] images ;

	public Orange() {
		  this.setImage();
                  this.imageView=new ImageView();
		 
}

	@Override
	public int getXlocation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getYlocation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getInitialVelocity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFallingVelocity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Boolean isSliced() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean hasMovedOffScreen() {
		// TODO Auto-generated method stub
		return null;
	}
        

	@Override
	public void slice() {
		this.imageView.setImage(SwingFXUtils.toFXImage(this.images[1], null));
		
	}

	@Override
	public void move(double time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BufferedImage[] getBufferedImages() {
		return images;
	}
	
@Override
	    public void setLimit(double limit) {
	        this.limit = limit;
	    }
@Override
	    public void setIntialImageView() {
	       this.imageView.setImage(SwingFXUtils.toFXImage(this.images[0], null));
	    }
@Override
	    public double getLimit() {
	        return limit;
	    }
            @Override
	    public ImageView getImageView() {
	        return imageView;
	    }
	  @Override  
	    public void setImage() {
	    	Image image1;
	    	Image image2;
	    
	       	 File file1 = new File("./src/icons/fullOrange.png");
	          image1 = new Image(file1.toURI().toString());
	         File file2 = new File("./src/icons/twohalforange.png");
	         image2 = new Image(file2.toURI().toString());
	          
	        this.images = new BufferedImage[2];
	      	this.images[0]=SwingFXUtils.fromFXImage(image1,null);	
	     	this.images[1]=SwingFXUtils.fromFXImage(image2,null);
	      	
	    }

}
