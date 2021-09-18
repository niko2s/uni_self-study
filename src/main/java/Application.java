public class Application {

    public static void main(String[] args) {
        init();
    }

    private static void init(){
        Display display = new Display();
        Controller controller = new Controller(display);
        Calculator calculator = new Calculator();

        int a = controller.readFirstIntInput();
        int b = controller.readSecondIntInput();
        display.showResult(a,b,calculator.add(a,b));
    }

}
