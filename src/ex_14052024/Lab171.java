package ex_14052024;

public class Lab171 {
    public static void main(String[] args) {
        ATBPerson amitRef = new ATBPerson(); // DC
        ATBPerson pramodRef = new ATBPerson("pramod",987654321l,"pramd@gmail.com",true,"ATB"); // PC1
        ATBPerson ratulRef = new ATBPerson("ratul",187654321l); // PC2
        // ATBPerson devakarRef = new ATBPerson(123,"devakar"); // PC2

        System.out.println(pramodRef.name);
        System.out.println(pramodRef.isMarried);
        System.out.println(pramodRef.phone);
        System.out.println(pramodRef.email);
        System.out.println(pramodRef.courseName);

    }
}
