abstract class Beverage{
    private void pour(int qty){
        System.out.println("Pour "+ qty + " ml. of beverage");
    }
    protected abstract void addCondinent();
    
    protected void stir(){ }
    private void serve(){
        System.out.println("Serve through waiter!");
    }
    public final void templateMethod(int qty){
        pour(qty);
        addCondinent();
        stir();
        serve();
    }
};
