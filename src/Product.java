public class Product {

    //instance variable
    private int id;
    private int price;
    private String name;
    private int categoryId;

    //constructor

    public Product(int id, int price, String name, int categoryId)
    {
        this.id = id;
        this.price = price;
        this.name = name;
        this.categoryId = categoryId;
    }

    //getter for id method
    public int getId(){
        return id;
    }

    //setter for id method
    public void setId(int id)
    {
        this.id = id;
    }

    //getter for price
    public int getPrice(){
        return price;
    }

    //setter for price method
    public void setPrice(int price)
    {
        this.price = price;
    }

    //setter for name method
    public String getName(){
        return name;
    }

    //setter for name method
    public void setName(String name){
        this.name = name;
    }

    //getter for categoryId Method
    public int getCategoryId(){
        return categoryId;
    }

    //setter for catergoryId method
    public void setCategoryId(int categoryId)
    {
        this.categoryId = categoryId;
    }



}
