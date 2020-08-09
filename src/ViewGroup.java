import java.util.ArrayList;
import java.util.List;

public class ViewGroup {
    private final List<View> list = new ArrayList<>();

    void addViews(View view) {
        if (view != null) {
            list.add(view);
        }
    }
    void draw() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Press " + i + " for " + list.get(i).toString());
        }
    }
}
