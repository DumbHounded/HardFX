package xyz.incraft.hardfx.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.util.Callback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Михаил on 17.01.2016.
 */
@Component
public class FirstWindowController implements Callback<Class<?>, Object> {

    @Override
    public Object call(Class<?> param) {
        return this;
    }
}
