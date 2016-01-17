package xyz.incraft.hardfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Михаил on 17.01.2016.
 */
public class MainApp extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello world");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Scene mainScene = context.getBean("mainWindowScene",Scene.class);

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
