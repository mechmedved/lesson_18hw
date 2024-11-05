package ru.maxima.radio;

public class RadioPlayer {
    private Radio radio;

    public void playRadio() {
        radio = new RetroFM();
        radio.play();

        radio = new DinamitFM();
        radio.play();
    }
}

interface Radio {
    void play();
}

class RetroFM implements Radio{

    @Override
    public void play() {
        System.out.println("Retro");
    }
}

class DinamitFM implements Radio{

    @Override
    public void play() {
        System.out.println("Dinamit");
    }
}
