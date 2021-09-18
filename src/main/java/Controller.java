import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class Controller {

    private Display display;

    public Controller(Display display) {
        this.display=display;
    }

    public int readFirstIntInput(){
        display.askFirstInteger();
        return readLine();
    }

    public int readSecondIntInput(){
        display.askSecondInteger();
        return readLine();
    }



    private int readLine(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while(true){
            try {
                input = reader.readLine();
                return Integer.parseInt(input);
            } catch (IOException e) {
                display.showDefaultError();
            } catch (NumberFormatException e){
                display.showError(input);
            }
        }

    }
}
