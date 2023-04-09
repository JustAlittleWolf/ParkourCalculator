package de.legoshi.parkourcalculator.parkour.environment.blocks;

import de.legoshi.parkourcalculator.util.ImageHelper;
import de.legoshi.parkourcalculator.util.Vec3;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Bed extends FacingBlock {
    public Bed(Vec3 vec3) {
        super(vec3);
    }

    @Override
    protected void calcBase() {

    }

    @Override
    protected void calcBaseFlip() {

    }

    @Override
    void updateImage() {
        this.image = new ImageHelper().getImageFromURL("/images/bed.webp");
    }

    @Override
    protected void calcNorth() {

    }

    @Override
    protected void calcEast() {

    }

    @Override
    protected void calcSouth() {

    }

    @Override
    protected void calcWest() {

    }
}