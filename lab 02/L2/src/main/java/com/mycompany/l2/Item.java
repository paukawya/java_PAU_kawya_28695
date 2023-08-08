
package com.mycompany.l2;

public class Item 
{
    private int location;
    private String description;
	
	// qu-02, qu-03
    public Item(int location, String description) {
        this.location = location;
        this.description = description;
    }
	
	// qu-04
    public void setLocation(int location) {
        this.location = location;
    }
    public int getLocation() {
        return location;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}

