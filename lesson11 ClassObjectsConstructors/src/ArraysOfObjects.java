public class ArraysOfObjects {
    public static void main(String[] args){
        Students student1= new Students("Haroon", "25011519-033", 3.88, 19);
        Students student2= new Students("Siraj", "25011519-033", 3.88, 19);
        Students student3= new Students("Aqsam", "25011519-033", 3.88, 19);
        //arrays of object:
        Students[] students= new Students[3];
        students[0]= student1;
        students[1]= student2;
        students[2]= student3;
        //also we can do this:
        //Students[] students= {student1, student2, student3};

        //and also:
        //Students[] students= {new Students("Haroon", "25011519-033", 3.88, 19),
        //                      new Students("Haroon", "25011519-033", 3.88, 19),
        //                      new Students("Haroon", "25011519-033", 3.88, 19)};
        //arrays of object contain multiple objects stored in single array and we can access it using index
        for (Students x: students){
            System.out.println(x.name);
        }

    }
}
