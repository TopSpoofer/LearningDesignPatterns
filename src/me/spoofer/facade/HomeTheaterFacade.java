package me.spoofer.facade;

/**
 * 家庭影院的外观模式应用
 * 每次看电影都要做一堆事情，这些事情放在这里做，外面的接口（用户）只需要调用这里的看'电影接口'即可看电影
 */
public class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Screen screen;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("正在初始化影音系统...");
        screen.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("现在关闭影音系统...");
        dvdPlayer.off();
        screen.off();
        System.out.println("影音系统已关闭。");
    }
}
