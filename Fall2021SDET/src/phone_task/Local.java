package phone_task;

class Local extends TypeOfCall {

    public double charge = 0.25;

    public Local(int minutes) {
        super(minutes);
    }

    public double amountUsed() {
        return minutesSpent * charge;
    }

}


class STD extends TypeOfCall {

    public double charge = 1.0;

    public STD(int minutes) {
        super(minutes);
    }

    public double amountUsed() {
        return minutesSpent * charge;
    }
}


class ISD extends TypeOfCall {
    public double charge = 10.0;

    public ISD(int minutes) {
        super(minutes);
    }

    public double amountUsed() {
        return minutesSpent * charge;
    }
}
