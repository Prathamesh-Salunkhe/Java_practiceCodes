package inheripoly.single;

public class Shapes {

	String colore;
	boolean filled = true;
	 
	   public void Shape(String colore, boolean filled)
	   {
	      this.colore = colore;
	      this.filled = filled;
	   }

	   //Get color
	   public String getColore() 
	   {
	       return colore;
	   }
	     
	   //Get filled
	   public boolean isFilled() 
	   {
	       return filled;
	   }    
	}            
	

	
	public class Rectangle extends Shape
	{
		void Rectangle(double width ,double length) {
	    //Calculate and return area of rectangle
			this.colore = colore;
		      this.filled = filled;
		      this.width =width;
		      this.length=length;
		}
	    public double getWidth()
	    {
	        return width;
	    }
	    public double getLength()
	    {
	        return length;
	    }
	    public double Area()
	    {
	        return (width*height);
	    }
	}
	

	
	public class Circle extends Shape
	{ 
	    void circle(double radius) {
	    	this.colore = colore;
		      this.filled = filled;
	    	
	    }
	    public double getRadius() 
	    {
	        return radius;
	    }
	    public double getPerimeter() {
	    	return (2*radius);
	    }
	}       
	
	public class Square extends Rectangle()
	{
		void Square(double side) {
			this.colore;
			this.boolean;
		}
		 public double getSide() 
		    {
		        return side;
		    }
		
	}


	
	public class PolymorphismDemo
	{
	    public static void main(String[] args)
	    {
	        Shape shape;
	        
	        // assign subclass reference to subclass variable
	        Rectangle rect = new Rectangle();

	        shape = rect;

	
	        shape.setValues(78, 5);
	        
	    
	        System.out.println("Area of rectangle : " + rect.getArea());
	        
	        // assign subclass reference to subclass variable
	        Triangle tri = new Triangle();
	        
	            
	        shape = tri;
	        
	         
	        shape.setValues(34,3);
	        
	                
	        System.out.println("Area of triangle : " + tri.getArea());
	    }
	}