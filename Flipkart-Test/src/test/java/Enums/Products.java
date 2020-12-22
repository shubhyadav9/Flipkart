package Enums;

public class Products {

	    HIS("0345397604", "Humans in space");
	
	    
	    private String id;
	    private String productTitle;

	    Products(String id, String productTitle){
	        this.id = id;
	        this.productTitle = productTitle;
	    }

	    public String getProductId(){
	        return id;
	    }

	    public String getProductTitle(){
	        return productTitle;
	    }

}
