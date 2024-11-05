package ru.maxima.radio_di;

import java.util.List;
import java.util.Random;

public class RadioPlayer {

    public void onStart(){
        System.out.println("bean init");
    }

    private final List<Radio> stations;
    private final String name;
    private final Integer volume;

    public RadioPlayer(String name, int volume, List<Radio> stations) {
        this.name = name;
        this.volume = volume;
        this.stations = stations;
    }

    public void play(){
        Radio radio = randomPlay(stations);
        System.out.println("Тип проигрывателя : " + this.name);
        System.out.println("Громкость : " + this.volume);
        System.out.println("Проигрывается : " + radio.getArtist() + " - " + radio.getSong());
    }

    private Radio randomPlay(List<Radio> stations){
        Random random = new Random();
        int randomIndex = random.nextInt(stations.size());
        return stations.get(randomIndex);
    }

    public void onEnd(){
        System.out.println("bean destroy");
    }
}
