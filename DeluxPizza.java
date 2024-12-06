package bill;
public class DeluxPizza extends pizza
{
public DeluxPizza(Boolean veg)
{
super(veg);
}
@Override
public void addExtraCheese()
{
this.price+=extraCheeseprice;
}
@Override
public void addExtraToppings()
{
this.price+=extraToppingsPrice;
}


}