package me.minidigger.voxelgameslib.skeleton;

import com.google.inject.Singleton;

import javax.inject.Inject;

import com.voxelgameslib.voxelgameslib.api.game.GameHandler;
import com.voxelgameslib.voxelgameslib.api.game.GameMode;
import com.voxelgameslib.voxelgameslib.api.module.Module;
import com.voxelgameslib.voxelgameslib.api.module.ModuleHandler;
import com.voxelgameslib.voxelgameslib.api.module.ModuleInfo;

import org.bukkit.plugin.java.JavaPlugin;

@Singleton
@ModuleInfo(name = "Skeleton", authors = "MiniDigger", version = "1.0.0")
public class SkeletonPlugin extends JavaPlugin implements Module {

    public static final GameMode GAMEMODE = new GameMode("Skeleton", SkeletonGame.class);

    @Inject
    private GameHandler gameHandler;

    @Override
    public void onLoad() {
        ModuleHandler.offerModule(this); // always do this first!
    }

    @Override
    public void enable() {
        gameHandler.registerGameMode(GAMEMODE);
    }

    @Override
    public void disable() {

    }
}
