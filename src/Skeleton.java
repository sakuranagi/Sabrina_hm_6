public class Skeleton extends Boss{
    private int arrowAmount;

    public int getArrowAmount() {
        return arrowAmount;
    }

    public void setArrowAmount(int arrowAmount) {
        this.arrowAmount = arrowAmount;
    }
    public String info() {
        return super.info() + " Arrow Amount:" + this.arrowAmount;
    }
}
