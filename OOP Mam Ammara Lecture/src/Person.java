public class Person {
    String name;
    int age;
    char gender;
    Person(String name, int age, char gender){
        this.name= name;
        this.age= age;
        this.gender= gender;
    }

    void setData(String name, int age, char gender){
        this.name= name;
        this.age= age;
        this.gender= gender;
    }

    void ShowData(){
        System.out.println("Student name: "+ this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Gender: "+this.gender);
    }

}
