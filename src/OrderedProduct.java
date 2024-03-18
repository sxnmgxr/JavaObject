public class OrderedProduct{
//instance variable
private int orderID;
private int produtID;
private int quantity;




//constructor
public OrderedProduct(int orderID, int produtID, int quantity)
{
    this.orderID = orderID;
    this.produtID = produtID;
    this.quantity = quantity;

}

//getter for the orderID method
public int getOrderId(){
    return orderID;
}

//setter for the orderID method
public void setOrderId(int orderID){
    this.orderID = orderID;
}

//getter for the productId method
public int getProductId(){
    return produtID;
}

//setter for the productId
public void setProductId(int productID){
    this.produtID = productID;
}

//getter for the quantity
public int getQuantity(){
    return quantity;
}

//setter for the quantity
public void setProduct(int quantity){
    this.quantity = quantity;
}
}