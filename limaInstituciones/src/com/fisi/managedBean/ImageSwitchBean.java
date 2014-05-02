package com.fisi.managedBean;

import java.util.ArrayList;
import java.util.List;

public class ImageSwitchBean {
	private List<String> images;  
	  
    public ImageSwitchBean() {  
        images = new ArrayList<String>();  
        images.add("resources/img/instituciones.jpg");  
        images.add("resources/img/colegio_guadalupe.jpg");  
    }  
  
    public List<String> getImages() {  
        return images;  
    }  
}
