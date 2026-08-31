public class Box<T> {
    T item; //T is some kind of data type it is used when we don't know
            //what will be the data type of instance or variable which we are using and T
            //acts as a universal data type which works as all data types
    T getItem(){
        return this.item;
    }
    void setItem(T item){
        this.item= item;
    }
    //instead of T we can write anything, and it will act as a data type which will work for all dat types
}
