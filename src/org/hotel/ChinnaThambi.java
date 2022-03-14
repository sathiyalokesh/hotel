package org.hotel;

public class ChinnaThambi extends MuniyandiVillas{
	
    @Override
    public void parota() {
	System.out.println("parota:10");
	super.parota();
    }
    @Override
    public void chicken() {
    System.out.println("chicken fry:100");
    	super.chicken();
    } 
     @Override
    public void mutton() {
    	System.out.println("mutton fry:150");
    	super.mutton();
    }
	
     private void chickengravy() {
     System.out.println("chickengravy:100");
     System.out.println("Mutton curry:200");
	}
     
     public static void main(String[] args) {
		ChinnaThambi   f   =  new ChinnaThambi();
		
		f.parota();
		f.chicken();
		f.mutton();
		f.chickengravy();
	}
    }
