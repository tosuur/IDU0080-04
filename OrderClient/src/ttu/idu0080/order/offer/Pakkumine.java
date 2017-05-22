package ttu.idu0080.order.offer;

public class Pakkumine {
	
	protected String offerId;
    protected float price;
    protected int deliveryTime;
    
    public Pakkumine(String offerId, float price, int deliveryTime) {
		this.offerId = offerId;
		this.price = price;
		this.deliveryTime = deliveryTime;
	}
    
    public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getOfferId() {
        return offerId;
    }
    
    public float getPrice() {
        return price;
    }
    
    public int getDeliveryTime() {
        return deliveryTime;
    }

}

