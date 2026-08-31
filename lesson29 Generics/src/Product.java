public class Product<T, U> { //we can use as many data types as we want
    T item;
    U price;
    Product(T item, U price){
        this.item= item;
        this.price= price;
    }

    T getItem(){
        return this.item;
    }

    U getPrice(){
        return this.price;
    }

    void setItem(T item){
        this.item= item;
    }

    void setPrice(U price){
        this.price= price;
    }

    //In this we are writing logic or the class and this logic is compatible with any data type
}

