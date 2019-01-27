import java.util.*;
 class Box
 {
    float width,height,depth;
    Box()
    {
  
      this.width=0;
      this.height=0;
      this.depth=0;

    }
    
    Box(float width, float height, float depth)
    {
      this.width=width;
      this.height=height;
      this.depth=depth;

    } 
    Box(Box b1)
    {

      this.width=b1.width;
      this.height=b1.height;
      this.depth=b1.depth;


    } 

    float getWidth()
    {
     return width; 
     
    }
    float getHeight()
    {
    	return height;
    }
    float getDepth()
    {
    	return depth;
    }
    void setWidth(float width)
    {
    	this.width=width;
    }
    void setHeight(float height)
    {
    	this.height=height;
    }
    void setDepth(float depth)
    {
    	this.depth=depth;
    }



    void displayVolume(Box b1)
    {

       float vol= b1.getWidth()*b1.getHeight()*b1.getDepth();
       System.out.println("volume is: "+vol);



    }


 }


class BoxWeight extends Box
{
     float weight;
     BoxWeight()
     {
     	super();
     	this.weight=0;
     }
     BoxWeight(float width,float height, float depth, float weight)
     {
       super(width,height,depth);
       this.weight=weight;


     }
     BoxWeight(BoxWeight b2)
     {
        super(b2.width, b2.height ,b2.depth);
        this.weight=b2.weight;

     }
     float getWeight()

     {
       return weight;

     }
     void setWeight(float weight)
     {
        this.weight=weight;
     }
     void displayWeight(BoxWeight b2)
     {
      System.out.println("weigth : " +b2.getWeight());
       
     }




}
 
 class BoxWeightDemo
 {
 
     public static void main(String[] args)
      {
     	Scanner input= new Scanner(System.in);
     	float width,height,depth,weight;
     	System.out.println("enter width");
     	width=input.nextFloat();
     	System.out.println("enter heigth");
     	height=input.nextFloat();
        System.out.println("enter depth");
     	depth=input.nextFloat();
        System.out.println("enter weight");
     	weight=input.nextFloat();
        BoxWeight b1 = new BoxWeight(width,height,depth,weight);
        b1.displayVolume(b1);
        b1.displayWeight(b1);



     } 


 }