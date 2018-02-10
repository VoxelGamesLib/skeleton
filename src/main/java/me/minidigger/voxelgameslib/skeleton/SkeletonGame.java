package me.minidigger.voxelgameslib.skeleton;

import javax.annotation.Nonnull;

import com.voxelgameslib.voxelgameslib.game.AbstractGame;
import com.voxelgameslib.voxelgameslib.game.GameDefinition;
import com.voxelgameslib.voxelgameslib.game.GameInfo;
import com.voxelgameslib.voxelgameslib.phase.phases.GracePhase;
import com.voxelgameslib.voxelgameslib.phase.phases.LobbyWithVotePhase;

@GameInfo(name = "Skeleton", author = "MiniDigger", version = "v1.0", description = "Skeleton Description")
public class SkeletonGame extends AbstractGame {

    public SkeletonGame() {
        super(SkeletonPlugin.GAMEMODE);
    }

    @Override
    public void initGameFromModule() {
        setMinPlayers(2);
        setMaxPlayers(2);

        LobbyWithVotePhase lobbyWithVotePhase = createPhase(LobbyWithVotePhase.class);
        GracePhase gracePhase = createPhase(GracePhase.class);
        gracePhase.setTicks(10 * 20);
        SkeletonPhase phase = createPhase(SkeletonPhase.class);

        lobbyWithVotePhase.setNextPhase(gracePhase);
        gracePhase.setNextPhase(phase);

        activePhase = lobbyWithVotePhase;

        loadMap();
    }

    @Override
    public void initGameFromDefinition(@Nonnull GameDefinition gameDefinition) {
        super.initGameFromDefinition(gameDefinition);

        loadMap();
    }
}
