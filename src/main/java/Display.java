public class Display {

    public Display() {
        System.out.println("This programm adds two numbers.\n");
    }

    public void askFirstInteger(){
        System.out.println("Please enter the first number");
    }

    public void askSecondInteger(){
        System.out.println("Please enter the second number");
    }

    public void showResult(int a, int b, int number){
        System.out.println("The result of " + a + " + " + b + " is " + number);
    }

    public void showError(String wrongInput){
        System.out.println("Your input " + wrongInput + " is not an integer value.");
    }
    public void showDefaultError(){
        System.out.println("An error has occured! Please restart the application");
    }
}
