package me.depeloper.openapi;

import org.bukkit.plugin.java.JavaPlugin;

public class OpenAPI extends JavaPlugin {

    private static OpenAPI instance;

    public void onEnable()
    {
        System.out.println("\n" +
                " #######  ########  ######## ##    ##    ###    ########  #### \n" +
                "##     ## ##     ## ##       ###   ##   ## ##   ##     ##  ##  \n" +
                "##     ## ##     ## ##       ####  ##  ##   ##  ##     ##  ##  \n" +
                "##     ## ########  ######   ## ## ## ##     ## ########   ##  \n" +
                "##     ## ##        ##       ##  #### ######### ##         ##  \n" +
                "##     ## ##        ##       ##   ### ##     ## ##         ##  \n" +
                " #######  ##        ######## ##    ## ##     ## ##        #### \n");

        this.init();
    }

    public void onDisable()
    {
        System.out.println("\n" +
                " #######  ########  ######## ##    ##    ###    ########  #### \n" +
                "##     ## ##     ## ##       ###   ##   ## ##   ##     ##  ##  \n" +
                "##     ## ##     ## ##       ####  ##  ##   ##  ##     ##  ##  \n" +
                "##     ## ########  ######   ## ## ## ##     ## ########   ##  \n" +
                "##     ## ##        ##       ##  #### ######### ##         ##  \n" +
                "##     ## ##        ##       ##   ### ##     ## ##         ##  \n" +
                " #######  ##        ######## ##    ## ##     ## ##        #### \n");
    }

    private void init()
    {
        instance = this;
    }

    public static OpenAPI getInstance()
    {
        return instance;
    }
}
