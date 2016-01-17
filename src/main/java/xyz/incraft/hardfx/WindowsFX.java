package xyz.incraft.hardfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * Created by Михаил on 17.01.2016.
 *
 */
@Configuration
public class WindowsFX {
    @Autowired
    private FXMLLoader rootLoader;
    @Autowired
    private FXMLLoader firstWindowLoader;
    @Autowired
    private FXMLLoader menuLoader;

    @Bean(name = "rootWindow")
    public BorderPane RootWindow() throws IOException {
        return rootLoader.load();
    }

    @Bean(name = "firstWindow")
    public AnchorPane FirstWindow() throws IOException {
        return firstWindowLoader.load();
    }

    @Bean(name = "menuWindow")
    public MenuBar MenuWindow() throws IOException {
        return menuLoader.load();
    }
}
