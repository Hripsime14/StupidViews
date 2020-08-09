import java.util.Scanner;

public class TestStupidViews {
    private int counter = 0;
    private boolean canExitProgram = false;
    Button button1, button2;
    Checkbox checkbox1, checkbox2;
    Spinner spinner;
    ViewGroup viewGroup = new ViewGroup();

    void askUser() {
        System.out.println("Please type an index of a view, or type 0 to draw a ViewGroup");
        Scanner scanner = new Scanner(System.in);
        while (counter < 10 || !canExitProgram) {
            if (scanner.hasNextLine()) {
                switch (scanner.nextInt()) {
                    case 0 -> viewGroup.draw();
                    case 1 -> {
                        button1.setOnClickListener(new View.OnClickListener() { //estex new View..., te new Button...?
                            @Override
                            public void onClick(View v) {
                                System.out.println("Button Clicked: " + v.toString());
                            }
                        });
                        button1.performClick();
                    }
                    case 2 -> {
                        button2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                System.out.println("Button Clicked: " + v.toString());
                            }
                        });
                        button2.performClick();
                        System.out.println("Count number is " + ++counter);
                    }
                    case 3 -> {
                        checkbox1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                checkbox1.changeState();
                                System.out.println(/*v.toString() + */ "Checkbox clicked: isChecked = " + checkbox1.getState());
                            }
                        });
                        checkbox1.performClick();
                    }
                    case 4 -> {
                        checkbox2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                checkbox2.changeState();
                                System.out.println(/*v.toString() + */ "Checkbox clicked: isChecked = " + checkbox2.getState());
                            }
                        });
                        checkbox2.setOnCheckChangedListener(new Checkbox.OnCheckChangedListener() {
                            @Override
                            public void onCheckChanged(View v, boolean isChecked) {
                                canExitProgram = !canExitProgram;
                                System.out.println("canExitProgram is " + canExitProgram);
                            }
                        });
                        checkbox2.performClick();
                    }
                    case 5 -> {
                        spinner.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                spinner.changeState();
                                if (spinner.isOpened()) {
                                    System.out.println(v.toString() + " is " + spinner.state() + " with elements - " +
                                            spinner.getItem1() + ", " + spinner.getItem2() + ", " + spinner.getItem3());
                                } else System.out.println(v.toString() + " is " + spinner.state());
                            }
                        });
                        spinner.performClick();
                    }
                }
            }
        }
        scanner.close();
    }
    void init() {

        button1 = new Button();
        button1.setName("Button1");
        viewGroup.addViews(button1);

        button2 = new Button();
        button2.setName("Button2");
        viewGroup.addViews(button2);

        checkbox1 = new Checkbox();
        checkbox1.setName("Checkbox1");
        viewGroup.addViews(checkbox1);

        checkbox2 = new Checkbox();
        checkbox2.setName("Checkbox2");
        viewGroup.addViews(checkbox2);

        spinner = new Spinner();
        viewGroup.addViews(spinner);
    }
}
