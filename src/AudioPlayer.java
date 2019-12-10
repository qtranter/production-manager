public class AudioPlayer extends Product implements MultimediaControl {
    String audioSpecification;
    String mediaType;

    public AudioPlayer(String name, String manufacturer, String audioSpecification) {
        super(name, manufacturer, ItemType.AUDIO.toString());
    }

    @Override
    public void play() {
        System.out.println("Playing!");
    }

    @Override
    public void stop() {
        System.out.println("Stopped!");
    }

    @Override
    public void previous() {
        System.out.println("Previous!");
    }

    @Override
    public void next() {
        System.out.println("Next!");
    }

    @Override
    public String toString() {
        return super.toString() +
                "audioSpecification='" + audioSpecification + '\'' +
                ", mediaType='" + mediaType + '\'' +
                '}';
    }
}
