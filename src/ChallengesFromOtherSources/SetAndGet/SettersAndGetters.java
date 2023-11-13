package ChallengesFromOtherSources.SetAndGet;

public class SettersAndGetters{

  private String name;
  private int age;
  private int height;
  private String fingerPrint;


    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }


    public void setFingerprint(String fingerPrint){
        this.fingerPrint = fingerPrint;
    }
    public String getFingerPrint() {
        return fingerPrint;
    }
}