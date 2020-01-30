package Collections;

public class SuperMarket {
	  
	String productid;
	String productName;
	double productPrize;
	public SuperMarket(String productid, String productName, double productPrize) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productPrize = productPrize;
	}
	@Override
	public String toString() {
		return "SuperMarket [productid=" + productid + ", productName=" + productName + ", productPrize=" + productPrize
				+ "]";
	}
	

}
