public class Count {
    private int value;

    public Count(int value) {
        this.value = value;
    }

    public int getSum(int increment) {
        int sum = 0;
        int i = 0;
        while (i <= value) {
            sum += i;
            i += increment;
        }
        return sum;
    }
}
