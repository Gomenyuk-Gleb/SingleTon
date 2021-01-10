public class Example {
    private static Example example;
    private static String test = "test";

    public static synchronized Example getExample() {
        if (example == null) {
            example = new Example();
        }
        return example;
    }

    private Example() {

    }

    public void addInfo(String logIn) {
        test += logIn + "\n";
    }

    public void showFile() {
        System.out.println(test);
    }
}
