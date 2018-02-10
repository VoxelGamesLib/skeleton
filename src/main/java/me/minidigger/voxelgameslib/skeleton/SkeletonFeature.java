package me.minidigger.voxelgameslib.skeleton;

import javax.annotation.Nonnull;

import com.voxelgameslib.voxelgameslib.feature.AbstractFeature;
import com.voxelgameslib.voxelgameslib.feature.FeatureInfo;

@FeatureInfo(name = "SkeletonFeature", author = "MiniDigger", description = "SkeletonFeature description", version = "1.0.0")
public class SkeletonFeature extends AbstractFeature {

    @Override
    public void start() {
    }

    @Override
    @Nonnull
    public Class[] getDependencies() {
        return new Class[0];
    }
}
