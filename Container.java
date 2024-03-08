
public class Container {
    private int liquidAmount;

    public Container() {
        this.liquidAmount = 0;
    }

    public int contains() {
        return this.liquidAmount;
    }

    public void addAmount(int amount) {
        if (amount > 0) {
            this.liquidAmount += amount;
            if (this.liquidAmount > 100) {
                this.liquidAmount = 100; // Limit to 100 units
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.liquidAmount -= amount;
            if (this.liquidAmount < 0) {
                this.liquidAmount = 0; // Liquid cannot be less than 0
            }
        }
    }

    public void move(int amount, Container container) {
        if (amount > 0 && container != null) {
            int actualMoveAmount = Math.min(amount, this.liquidAmount);
            container.addAmount(actualMoveAmount);
            this.remove(actualMoveAmount);
        }
    }

    public String toString() {
        return this.liquidAmount + "/100";
    }
}
