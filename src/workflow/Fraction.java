package workflow;

public class Fraction {
 

//accesseurs
public double getnum()
     {
          return num;
     }
public double getdenom()
     {
       return denom;
     }



    private final int ZERO = 0;
    private final int UN = 1

	private int num,deno;
	public Fraction(int num,int deno){
		this.num=num;
		this.deno=deno;}
	
	public Fraction(int num){
		this.num=num;
		this.deno=1;}
	
	public Fraction(){
		this.num=0;
		this.deno=1;}
		

}
