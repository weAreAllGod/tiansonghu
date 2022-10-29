public class Homework08 {
    public static void main(String[] args) {
        //定义Music类，里面有音乐名name，时长times,并有播放功能play
        //返回本身属性信息的功能方法getInfo
        Music music = new Music("歌曲1",200);
        music.play();
        System.out.println(music.getInfo());
    }
}
class Music {
    String name;
    double times;
    public Music(String name,double times) {
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println("正在播放音乐" + name);
    }
    public String getInfo() {
        return "音乐" + name + "播放时长" + times + "秒";
    }
}