package me.minidigger.voxelgameslib.skeleton;

import javax.annotation.Nonnull;

import com.voxelgameslib.voxelgameslib.feature.AbstractFeature;

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
