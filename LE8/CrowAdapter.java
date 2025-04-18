class CrowAdapter implements Bird {
    private Crow crow;

    public CrowAdapter(Crow crow) {
        this.crow = crow;
    }

    @Override
    public void sing() {
        crow.caw(); 
    }

    @Override
    public void fly() {
        crow.flyFast(); 
    }
}