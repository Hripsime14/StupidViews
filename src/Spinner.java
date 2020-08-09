public class Spinner extends View{
    private boolean state = false; // estex int pahei te boolean?
    private String openState = "opened";
    private String closeState = "closed";
    private String item1 = "item1";
    private String item2 = "item2";
    private String item3 = "item3";

    @Override
    void performClick() {
        if (listener != null) {
            listener.onClick(this);
        }
    }

    public String getItem1() {
        return item1;
    }

    public String getItem2() {
        return item2;
    }

    public String getItem3() {
        return item3;
    }


    boolean isOpened() {
        return state;
    }

    String state() {
        if (state) return openState;
        else return closeState;
    }

    void changeState() {
        state = !state;
    }

    @Override
    public String toString() {
        return "Spinner";
    }
}
