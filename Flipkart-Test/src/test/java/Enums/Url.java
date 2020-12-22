package Enums;

public enum Url {


	    PRODUCT_SECTION("/gp/product"),
	    BASEURL("http://www.flipkart.com"),
	    SIGNOUT("");

	    String url;

	    Url(String url){
	        this.url = url;
	    }

	    public String getURL() {
	        return url;
	    }
}
