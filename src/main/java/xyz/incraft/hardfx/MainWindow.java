package xyz.incraft.hardfx;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Михаил on 17.01.2016.
 */
@Component
public class MainWindow {

    @Autowired
    private BorderPane rootWindow;
    @Autowired
    private AnchorPane firstWindow;
    @Autowired
    private MenuBar menuWindow;

    @PostConstruct
    public void show(){
        rootWindow.setCenter(firstWindow);
        rootWindow.setTop(menuWindow);
    }

    @Bean(name = "mainWindowScene")
    public Scene MainWindowScene(){
        return new Scene(rootWindow);
    }
}
