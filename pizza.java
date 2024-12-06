package bill;
import java.util.*;
public class pizza
{
protected int price;
private Boolean veg;
protected int extraCheesePrice=100;
protected int extraToppingsPrice=150;
protected int backPackPrice=20;

protected int basePizzaPrice;

private boolean isExtraCheeseAdded=false;
private boolean isExtraToppingsAdded=false;
private boolean isOptedFortakeaway=false;

Scanner in=new Scanner(System.in);

public pizza(Boolean veg)
{
this.veg=veg;


if(this.veg)
{
this.price=300;
}
else
{
this.price=400;
}
basePizzaPrice=this.price;
}


public void addExtraCheese()
{
Ststem.out.println("Extra cheese (y/n)? =>");
char ch=in.next().charAt(0);
switch(ch)
{
case ('y'):
isExtraCheeseAdded=true;
this.price +=extraCheesePrice;
break;
case ('n'):
isExtraCheeseAdded=false;
break;
}


public void addExtraToppings()
{
Ststem.out.println("Want Extra Topping (y/n)? =>");
char ch=in.next().charAt(0);
switch(ch)
{
case ('y'):
isExtraTopingsAdded=true;
this.price +=extraToppingsPrice;
break;
case ('n'):
isExtraToppingsAdded=false;
break;
}
}
public void takeAway()
{
Ststem.out.println("Want TakeAway (y/n)? =>");
char ch=Character.toLowerCase(in.next().charAt(0));
switch(ch)
{
case ('y'):
isOptedFortakeaway=true;
this.price +=backPackPrice;
break;
case ('n'):
isOptedFortakeaway=false;
break;
}
}

public void getBill()
{
String bill=" ";
Stystem.out.println("Pizza : "+basePizzaPrice);
if(isExtraCheeseAdded)
{
bill+="Extra Cheese : "+extraCheesePrice+"\n";
}
if(isExtraToppingsAdded)
{
bill+="Extra Toppings :"+extraToppingsPrice+"\n";
}
if(isOptedFortakeaway)
{
bill+="Take Away : "+backPackPrice+"\n";
}
bill+="\nTotal Amount :"+this.price+"\n";
System.out.println(bill);
System.out.println("\n\nThanks you!!!! Visit Again.....");
System.out.println("---------------------------");
}

}