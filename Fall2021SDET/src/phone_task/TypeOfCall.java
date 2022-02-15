package phone_task;

public class TypeOfCall {

    public int minutesSpent;
    public double charge;

    public TypeOfCall(int minutes) {
        this.minutesSpent = minutes;
    }

    public double amountUsed() {
        return minutesSpent * charge;
    }
}

