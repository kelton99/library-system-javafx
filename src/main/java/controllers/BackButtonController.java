package controllers;

import com.murilo.Main;
import javafx.event.ActionEvent;

import java.io.IOException;

public class BackButtonController {

    public void back(ActionEvent actionEvent) throws IOException {
        Main.setRoot("Primary");
    }
}
