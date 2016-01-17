package xyz.incraft.hardfx;

import javafx.fxml.FXMLLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.incraft.hardfx.view.FirstWindowController;
import xyz.incraft.hardfx.view.MenuController;
import xyz.incraft.hardfx.view.RootController;

/**
 * Created by Михаил on 17.01.2016.
 * загрузка всех xml на экраны
 */
@Configuration
public class LoaderFX {
    @Autowired
    private FirstWindowController firstWindowController;
    @Autowired
    private RootController rootController;
    @Autowired
    private MenuController menuController;

    @Bean(name = "rootLoader")
    public FXMLLoader RootLoader(){
        FXMLLoader loader = new FXMLLoader(MainApp.class.getClassLoader().getResource("root.fxml"));
        loader.setControllerFactory(rootController);
        return loader;
    }

    @Bean(name = "firstWindowLoader")
    public FXMLLoader FirstWindowLoader(){
        FXMLLoader loader = new FXMLLoader(MainApp.class.getClassLoader().getResource("firstWindow.fxml"));
        loader.setControllerFactory(firstWindowController);
        return loader;
    }

    @Bean(name = "menuLoader")
    public FXMLLoader MenuLoader(){
        FXMLLoader loader = new FXMLLoader(MainApp.class.getClassLoader().getResource("menu.fxml"));
        loader.setControllerFactory(menuController);
        return loader;
    }

}
