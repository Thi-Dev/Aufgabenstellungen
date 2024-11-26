package Augabenblatt4;

public class Plant {
    // 1. deklarationen der Instanzvariablen

    private double height;
    private String type;
    private int waterLevel;
    private int MaxWaterLevel = 10;

    // 1.2 Methode zum Verändern einer Instanzvariablen
    public void grow(int sunlightHours){
        height += 0.5 * sunlightHours;

    // 1.4 Absicherung der Negativen Wert;
        if (sunlightHours < 0) {
            System.out.println("Fehler: Die Sonnenlichtstunden können nicht negativ sein.");
        } else {
            System.out.println("Der plant wäschst : " + height + " cm");
        }
    }

    // 2.1.2 Methode zu Wassermessungen
    public void water(int amount){
        waterLevel += amount;
        System.out.println("Die Wassermenge beträgt jetzt: " +  waterLevel + " ml");
    }

    // Methode needswater()
    boolean needsWater(){
        return waterLevel < 5;
    }

    // Getter and Setter Methode
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        if (height >= 0){
            this.height = height;
        } else{
            System.out.println("Fehler : Die Höhe kann nicht negativ sein.");
        }

    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getWaterLevel(){
        return waterLevel;
    }
    public void setWaterLevel(int waterLevel){
        if (waterLevel >= 0 && waterLevel <= MaxWaterLevel) {
            this.waterLevel = waterLevel;
        } else if(waterLevel < 0){
            System.out.println("Fehler: Der Wasserstand kann nicht negativ sein. ");

        } else {
            System.out.println("Fehler : Der Wasserstand darf : " + waterLevel + " ml" + "nicht überschreiten.");
        }

    }




}
