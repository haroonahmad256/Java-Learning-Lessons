public class hostel {
    String warden= "Haroon";
    String deputyWarden= "Shakeel";
    String hostel1Name= "Abubakar";
    String hostel2Name= "Ali";
    String hostel3Name= "Usman";
    int totalRoom= 200;
    int totalStudents= 1600;

    hostel(String warden, String hostel1Name, int totalRoom){
        this.warden= warden;
        this.hostel1Name= hostel1Name;
        this.totalRoom= totalRoom;
    }
    //following is overloaded structure just like overloaded methods it works exactly like overloaded methods
    hostel(String warden, String deputyWarden, String hostel1Name, String hostel2Name, int totalRoom, int totalStudents){
        this.warden= warden;
        this.deputyWarden= deputyWarden;
        this.hostel1Name= hostel1Name;
        this.hostel2Name= hostel2Name;
        this.totalRoom= totalRoom;
        this.totalStudents= totalStudents;
    }

    hostel(String w, String depW, String H1N, String hostel2Name,
           String hostel3Name, int totalRoom, int totalStudents){
        this.warden= warden;
        this.deputyWarden= deputyWarden;
        this.hostel1Name= hostel1Name;
        this.hostel2Name= hostel2Name;
        this.hostel3Name= hostel3Name;
        this.totalRoom= totalRoom;
        this.totalStudents= totalStudents;
    }

    void messAvailable(){
        System.out.println("Mess is available for students");
    }

    void cleaningCondition(){
        System.out.println("Condition of cleaning is average");
    }
}
