package me.spoofer.facade;

public class FacadePatternTest {
    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        Screen screen = new Screen();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, screen);
        homeTheaterFacade.watchMovie("钢铁侠");
        homeTheaterFacade.endMovie();
    }
}
