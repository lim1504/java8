package interfacetest.test3;

/**
 * 1. Tv의 인스턴스를 가지고있는 클래스 생성
 */
public class Tv {
    protected boolean power;
    protected int channel;
    protected int volume;

    public void power(){
        this.power = !power;
    }

    public void channelUp(){
        this.channel++;
    }

    public void channelDown(){
        this.channel--;
    }

    public void volumeUp(){
        this.volume ++;
    }

    public void volumeDown(){
        this.volume --;
    }
}
