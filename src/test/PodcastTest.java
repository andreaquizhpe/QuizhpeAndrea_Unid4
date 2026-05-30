package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Podcast;

public class PodcastTest {

    @Test
    void testCrearPodcast() {

        Podcast podcast =
                new Podcast(
                        "Tech Talk",
                        30,
                        "Tecnologia",
                        "Innovacion",
                        "Juan Perez",
                        20
                );

        assertEquals(
                "Juan Perez",
                podcast.getAnfitrion()
        );

        assertEquals(
                20,
                podcast.getNumeroEpisodios()
        );
    }

    @Test
    void testTemaPodcast() {

        Podcast podcast =
                new Podcast(
                        "Tech Talk",
                        30,
                        "Tecnologia",
                        "IA",
                        "Juan Perez",
                        20
                );

        assertEquals(
                "IA",
                podcast.getTema()
        );
    }
}