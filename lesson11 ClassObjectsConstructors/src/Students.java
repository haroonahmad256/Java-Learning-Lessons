public class Students {
    String name= "Haroon";
    String rN= "25011519-033";
    double grade= 3.88;
    int age= 19;
    boolean isEnrolled= true;

    Students(String name, String rN, double grade, int age){
        this.grade= grade; //"this" means instances belongs to current and object Refers to
                           //the instance variable of the object currently being created.
        this.name= name;
        this.rN= rN;
        this.age= age;    //this refers to current object.
        boolean isEnrolled= true; //this will be set true for all objects we will create
                                  //even if we don't declare inside it in constructor it will not be affected
    }

    void canWalk(){
        System.out.println(name+" is a waling creature");
    }

    void work(){
        System.out.println(name+ " with "+ rN+ " of age "+age+ " has grade "+ grade);
    }
}
