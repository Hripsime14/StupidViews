public class Checkbox extends View{
    private OnCheckChangedListener onCheckChangedListener;
    private boolean isChecked = false;
    private String name;

    void setName(String name) {
        this.name = name;
    }

    @Override
    public void performClick() {
        if (listener != null) listener.onClick(this);
        if (onCheckChangedListener != null) onCheckChangedListener.onCheckChanged(this, true); //imasty chhaskaca boolean parameter-i
    }

    void changeState() {
        isChecked = !isChecked;
    }

    boolean getState() {
        return isChecked;
    }

    interface OnCheckChangedListener {
        void onCheckChanged(View v, boolean isChecked);
    }

    public void setOnCheckChangedListener(OnCheckChangedListener listener) {
        this.onCheckChangedListener = listener;
    }

    @Override
    public String toString() {
        return name;
    }
}
