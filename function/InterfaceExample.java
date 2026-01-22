package OOP;

class Phone {
    void call(){
        System.out.println("Phone calling");

    }
    void sms(){
        System.out.println("Phone sending SMS");
    }
}

interface Camera{
    void clicking();
    void recording();
}

interface MusicPlayer{
    void play();
    void stop();
}


class SmartPhone extends Phone implements Camera,MusicPlayer{
    @Override
    public void clicking(){
        System.out.println("SmartPhone taking picture");

    }
    public void recording(){
        System.out.println("Smartphone recoring video.");
    }
    public void play(){
        System.out.println("SmartPhone playing music.");
    }
    public void stop(){
        System.out.println("Stop the Music.");
    }
}
public class InterfaceExample {
   public static void main(String[] args) {
    SmartPhone s = new SmartPhone();
    Phone p =s;
    Camera c= s;
    MusicPlayer m= s;

    m.play();
    p.call();
    c.clicking();
   }
    
}
