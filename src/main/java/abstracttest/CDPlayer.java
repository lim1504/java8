package abstracttest;

public class CDPlayer extends Player{
    int currentTrack;

    void nextTrack(){
        currentTrack++;
    }

    void prevTrack(){
        if(currentTrack > 1){
            currentTrack--;
        }
    }

    @Override
    void play(int pos) {

    }

    @Override
    void stop() {

    }
}
