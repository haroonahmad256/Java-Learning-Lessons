public class Friends {
    String name;
    static int numOfFriends;
    Friends(String name){
        this.name= name;
        numOfFriends++; // we want to increment number of friends whenever we create a friend object
                        // so that we could calculate total number of friends/objects
                        // But it will not calculate until we don't make numOfFriends a static variable
        //Reason of using static here:
                        /*
                         * because each object we create has its own copy of numOfFriends variable so every time
                         we will create new objects number of friends variable would be also new for each new object
                         and as result as new copy of numOfFriends is generated for new object so it will always give 1 because new copy of numOfFriends has value of 0
                         when we create object 1, this numOfFriends which is attribute of object 1 it will be incremented by 1 and
                         when we will create object 2, it has it own attribute numOfFriends which is separate from numOfFriends attribute of object 1.
                         */
                        //
        //using static:
                        /*
                        * Rather than all objects we create having their own copy of numOfFriends we will create
                        * such a variable which is considered one for all objects means all object are going to share one
                        * now it is recommended to access static variable or method by using name of Class which is currently
                        * Friends rather than using name of Object.
                        * Static method or variable is like all objects are sharing same variable but rather than any object
                        * having ownership of this variable, Friends class itself owns this static variable or method and all
                        * objects have access to it*/
    }

    static void showFriends(){
        System.out.println("You have "+ /*this.*/numOfFriends+" total friends");
    }
}
