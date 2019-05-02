package JavaDay43_Static_constructors02;

public class TV {
    private int channel;
    private int volumeLevel;
    private boolean on;
    private String brand;

    public TV(){
        System.out.println("Creating TV object using no Args - constructor");
        channel = 1;
        volumeLevel = 1;
        brand = "undefined";
    }
public TV(String brand){
    System.out.println("Creating TV object using 1 args - constructor");
    this.brand = brand;
}
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(on && channel >0 && channel<121) {
            this.channel = channel;
        }else{
            System.out.println("Error: TV is either OF or invalid");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(on == true && volumeLevel >=1 && volumeLevel <=7) {
            this.volumeLevel = volumeLevel;
        }else{
            System.out.println("Error: TV is either OF or invalid");
        }
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
       if(isOn()){
           System.out.println("TV is already ON");
       }else{
           on = true;
           //this.on = true;
       }
    }
    public void turnOFF(){
        if(isOn()){
           on = false;
        }else{
            System.out.println("TV is already OFF");
        }
    }
public void channelUP(){
        if(isOn()&& getChannel() < 120){
            channel ++;

        }
}
public void channelDown(){
        if(isOn() && channel > 1){
            channel--;


                }
            }
            public void volumeUp(){
                if(isOn() && volumeLevel < 7){
                    volumeLevel++;
        }
}
public void volumeDown(){
        if(isOn() && volumeLevel >1){
            volumeLevel --;
        }
}
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
