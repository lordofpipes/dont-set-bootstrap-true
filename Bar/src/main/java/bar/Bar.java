package bar;

import org.bukkit.plugin.java.JavaPlugin;

import foo.Foo;

public class Bar extends JavaPlugin {

    @Override
    public void onEnable() {
        Foo.testFunction();
    }

    @Override
    public void onDisable() {

    }
}
