package adapter;

/**
 * Created by joost on 27-6-2016.
 */
public class GrapeImageAdapter implements AppleImage{

    private Grape grape;

    public GrapeImageAdapter(Grape grape) {
        this.grape = grape;
    }

    @Override
    public String appleImage() {
        return grape.grapeImage();
    }
}
