public class Mine {

    private boolean detonated = false;

    public boolean hasBeenDetonated(){
        return this.detonated;
    }

    public void detonate() {
        this.detonated = true;
    }
}
