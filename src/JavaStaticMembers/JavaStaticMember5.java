// ------------------- 5. Static Block for Initialization -------------------
//
// Write a Java program to create a class called "Configuration" with a static block
// that initializes a static variable 'configValue' from a configuration file
// (simulated with a default value). Print the value of 'configValue' in the main method.
//
// ------------------- SAMPLE OUTPUT -------------------
// Config Value: 42


package JavaStaticMembers;

class configuration {
    public String configValue;

    static {
        configuration obj = new configuration();
        obj.configValue = "default config value";
        System.out.println("Static block executed: configValue initialized");
    }
}

public class JavaStaticMember5 {


    public static void main(String[] args) {
        configuration Configuration = new configuration();
        System.out.println("Config Value : " + Configuration.configValue);
    }
}
