public class overloadedConstructors {
    public static void main(String[] args){
        /*
        * overloaded constructors: Allows a class to have multiple constructors
        * with different parameters lists. Enable Objects to be initialized in various ways*/

        hostel h = new hostel("Haroon", "Ali", 78);
        System.out.println(h.warden+" "+h.hostel1Name+" "+h.totalRoom);

        hostel h2 = new hostel("Haroon","Husnain", "Ali", "Usman", 78, 900);
        System.out.println(h2.warden+" "+h2.deputyWarden+" "+h2.hostel1Name+" "+h2.hostel2Name+" "+h2.totalStudents+" "+h2.totalRoom);

        hostel h3 = new hostel("Haroon","Husnain", "Ali", "Usman", "Abubakar", 78, 900);
        System.out.println(h2.warden+" "+h2.deputyWarden+" "+h3.hostel3Name+" "+h2.hostel1Name+" "+h2.hostel2Name+" "+h2.totalStudents+" "+h2.totalRoom);
    }
}
