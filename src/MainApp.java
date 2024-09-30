public class MainApp {
    private Button button;
    private textField textField;
    public MainApp(UIFactory factory){
        button = factory.createButton();
        textField = factory.createTextField();
    }
    public void start(){
        button.paint();
        textField.field();
    }
}
