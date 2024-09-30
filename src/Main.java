//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StandardSchedule templateSchedule = new StandardSchedule("Inception", "13:00 PM");
        StandardSchedule morning = templateSchedule.clone();
        morning.setTime("10:00 AM");
        StandardSchedule evening = templateSchedule.clone();
        evening.setTime("6:00 PM");

        System.out.println("Template Schedule: " + templateSchedule);
        System.out.println("Morning Show: " + morning);
        System.out.println("Evening Show: " + evening);
    }

}