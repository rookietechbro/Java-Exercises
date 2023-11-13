package ChallengesFromOtherSources.SetAndGet;

public class WahalurrrForSettersAndGetters {
    public static void main(String[] args) {
        SettersAndGetters input = new SettersAndGetters();

        System.out.println(input.getName());
        System.out.println(input.getAge());
        System.out.println(input.getHeight());
        System.out.println(input.getFingerPrint());

        input.setName("Onyii");
        input.setAge(12);
        input.setHeight(163);
        input.setFingerprint("Whorl");

        System.out.println(input.getName());
        System.out.println(input.getAge());
        System.out.println(input.getHeight());
        System.out.println(input.getFingerPrint());

    }
}
