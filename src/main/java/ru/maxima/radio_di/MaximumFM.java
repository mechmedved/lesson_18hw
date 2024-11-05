package ru.maxima.radio_di;

public class MaximumFM implements Radio{
    @Override
    public String getArtist() {
        return "AC&DC";
    }

    @Override
    public String getSong() {
        return "back in black";
    }
}
