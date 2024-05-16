package ex_14052024;

public class AutomationClass {

    String name;

    AutomationClass(){
        dataBaseConnection();
        excelOpen();
    }

     AutomationClass(String name) {
        this();
        this.name = name;
    }

    void dataBaseConnection(){
        System.out.println("Mysql Connection is created!");
    }

    void excelOpen(){
        System.out.println("Excel opened");
    }

    void testCase1(){
        System.out.println("testCase1 -->" + this.name);

    }
    void testCase2(){
        System.out.println("testCase2 -->" + this.name);
    }

    public static void main(String[] args) {
        AutomationClass tc1 = new AutomationClass("Test case 1");
  //      AutomationClass tc2 = new AutomationClass();
        System.out.println(tc1.name);
        tc1.testCase1();
        tc1.testCase2();

//        System.out.println(tc2.name);
//        tc2.testCase1();
//        tc2.testCase2();

    }
}
