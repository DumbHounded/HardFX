package xyz.incraft.hardfx.view;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Михаил on 17.01.2016.
 */
@Component
public class RootController implements Callback<Class<?>, Object> {

    @FXML
    private BorderPane rootPane;

    @Override
    public Object call(Class<?> param) {
        return this;
    }
}
