public class LightThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public textField createTextField() {
        return new LightThemeTextField();
    }
}
