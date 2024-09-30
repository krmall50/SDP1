//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MainApp app;
        UIFactory factory;
        factory = new LightThemeFactory();
        app = new MainApp(factory);
        app.start();



    }

}