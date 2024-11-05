package ru.maxima.radio_di;

public class RetroFM implements Radio{
    @Override
    public String getArtist() {
        return "ABBA";
    }

    @Override
    public String getSong() {
        return "Money";
    }
}
