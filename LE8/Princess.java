public class Princess {
    public static void main(String[] args) {
  
        Bird swan = new Swan();
        Bird adaptedCrow = new CrowAdapter(new Crow());

        System.out.println("Princess meets Swan:");
        swan.sing();
        swan.fly();

        System.out.println("\nPrincess meets Crow (via Adapter):");
        adaptedCrow.sing(); 
        adaptedCrow.fly(); 
    }
}