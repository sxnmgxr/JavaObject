public class Category {


//instance variable
private int id;
private String name;

//constructor
public Category(int id, String name){
    this.id = id;
    this.name = name;
}

//method

//getter for id method
public int getId()
{
    return id;
}

//setter for id method
public void setId(int id){
this.id = id;
}

//getter for name method
public String getName(){
    return name;
}

//setter for name method
public void setName(String name){
    this.name = name;
}

public static String category1() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'category1'");
}

public static String getCategoryId() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCategoryId'");
}

}
