public class Soy extends CondimentDecorator{
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        if(getSize() == Beverage.TALL) return .10;
        if(getSize() == Beverage.GRANDE) return .15;
        if(getSize() == Beverage.VENTI) return .20;
    }
    public String getDescription(){
        return this.beverage.getDescription() + ", 두유";
    }
}
