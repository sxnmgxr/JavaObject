public class Order {

    //instance variable


    private int id;
    private int amount;
    private String date;
    private int CustomerID;
    

    //constructor for the variable
    public Order(int id, int amount, String date, int CustomerID)
    {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.CustomerID = CustomerID;
    }

    //getter method for id
    public int getId()
    {
        return id;
    }
    //setter method for id
    public void setId(int id)
    {
        this.id = id;
    }

    //getter method for amount
    public int getAmount()
    {
        return amount;
    }
    //setter method for amount
    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    //getter method for date
    public String getDate()
    {
        return date;
    }
    //setter method for id
    public void setDate(String date)
    {
        this.date = date;
    }

    //getter method for customerId
    public int getCustomerId()
    {
        return CustomerID;
    }
    //setter method for id
    public void setCustomerId(int CustomerID)
    {
        this.CustomerID = CustomerID;
    }
}
