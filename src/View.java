public class View {
    OnClickListener listener;

    interface OnClickListener {
        void onClick(View v);
    }

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void performClick() {
    }
}
