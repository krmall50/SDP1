public class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    public textField createTextField() {
        return new DarkThemeTextField();
    }
}
