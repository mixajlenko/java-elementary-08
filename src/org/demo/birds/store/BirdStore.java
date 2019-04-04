
package org.demo.birds.store;

import org.demo.birds.entities.Bird;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Отнаследоваться от AbstractBirdStore.
 *
 * Реализовать паттерн Singleton.
 */


    public class BirdStore  {

    private BirdStore() {
    }

    private static class BirdStoreSingleton extends AbstractBirdStore {
        private final static BirdStore store = new BirdStore();

        Map<String, Bird> birdStore1 = new HashMap<String, Bird>();

        Map<String, List<Bird>> birdStore2 = new HashMap<String, List<Bird>>();



        @Override
        public void addBird(Bird b) {


        }

        @Override
        public Bird searchByName(String nameToSearch) {
            return null;
        }

        @Override
        public List searchByLivingArea(String livingAreaToFind) {
            return null;
        }
    }

    public static BirdStore getStore() {
        return BirdStoreSingleton.store;
    }





}


