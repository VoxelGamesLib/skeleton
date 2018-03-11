package me.minidigger.voxelgameslib.skeleton;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

import com.voxelgameslib.voxelgameslib.feature.AbstractFeature;
import com.voxelgameslib.voxelgameslib.feature.Feature;
import com.voxelgameslib.voxelgameslib.feature.FeatureInfo;

@FeatureInfo(name = "SkeletonFeature", author = "MiniDigger", description = "SkeletonFeature description", version = "1.0.0")
public class SkeletonFeature extends AbstractFeature {

    @Override
    public void enable() {
    }

    @Override
    @Nonnull
    public List<Class<? extends Feature>> getDependencies() {
        return Collections.emptyList();
    }
}
