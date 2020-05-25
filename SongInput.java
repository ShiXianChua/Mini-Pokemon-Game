
package pokemongame;

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SongInput {

    public static synchronized Clip playSound(final String fileName) {
        // I very lag
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                    Main.class.getResourceAsStream(fileName));
            clip.open(inputStream);
            clip.start();
            return clip;
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.err.println(e.getMessage());
        }
//        Thread x = new Thread(new Runnable() {
//            public void run() {
//                try {
//                    Clip clip = AudioSystem.getClip();
//                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(
//                            Main.class.getResourceAsStream(fileName));
//                    clip.open(inputStream);
//                    clip.start();
//                } catch (Exception e) {
//                    System.err.println(e.getMessage());
//                }
//            }
//        });
//        x.start();
//        return clip;
            return null;
    }


}
