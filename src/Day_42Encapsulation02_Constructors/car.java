package Day_42Encapsulation02_Constructors;

public class car {
   private String type;
    private String make;
   private  String model;
   private int speed;

   public void accelerate(int mph){
       speed += mph;
       System.out.println(make + " " + type + "is accelerating.");
   }


    public String getType() {
        return type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setType(String type) {
            this.type = type;




    }
}

