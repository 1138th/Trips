package Trip;

public abstract class Trip {

    private String type;
    private String transport;
    private String food;
    private String purpose;
    private int number;
    private int duration;

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public String getTransport() {
        return transport;
    }

    protected void setTransport(String transport) {
        this.transport = transport;
    }

    public String getFood() {
        return food;
    }

    protected void setFood(String food) {
        this.food = food;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDuration() {
        return duration;
    }

    protected void setDuration(int duration) {
        this.duration = duration;
    }
}
