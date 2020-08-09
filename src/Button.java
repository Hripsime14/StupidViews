public class Button extends View /*omplements View.OnClickListener */{
    private String name = "Button";

    void setName(String name) {
        this.name = name;
    }

    @Override
    void performClick() {
        if(listener != null) {
            listener.onClick(this);
        }
    }

    @Override
    public String toString() {
        return name;
    }

//    @Override
//    public void onClick(View v) {
//        System.out.println("Button Clicked: " + this);
//    }
}
