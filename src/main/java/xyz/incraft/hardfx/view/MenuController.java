package xyz.incraft.hardfx.view;

import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.util.Callback;
import org.springframework.stereotype.Component;

/**
 * Created by Михаил on 17.01.2016.
 */
@Component
public class MenuController implements Callback<Class<?>, Object> {

    @FXML
    public void OnClose(){
        System.exit(0);
    }

    @Override
    public Object call(Class<?> param) {
        return this;
    }
}
