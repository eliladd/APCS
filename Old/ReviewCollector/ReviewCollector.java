import java.util.ArrayList;

public class ReviewCollector
{
	private ArrayList<ProductReview> reviewList;
	private ArrayList<String> productList;
	
	/** Constructs a ReviewCollector object and initializes the instance variables. */
	public ReviewCollector()
	{
		reviewList = new ArrayList<ProductReview>();
		productList = new ArrayList<String>();
	}
	
	/** Adds a new review to the collection of reviews, as described in part (a). */
	public void addReview(ProductReview prodReview)
	{ 
		/* to be implemented in part (a) */
		reviewList.add(prodReview);
		if(!productList.contains(prodReview.getName())){
			productList.add(prodReview.getName());
		}
		
	
	}


	/** Returns the number of good reviews for a given product name, as described in part (b). */
	public int getNumGoodReviews(String prodName)
	{ /* to be implemented in part (b) */
		int count = 0;
		for(int i=0; i<reviewList.size(); i++){
			if(reviewList.get(i).getName().equals(prodName) && reviewList.get(i).getReview().indexOf("best") != -1){
				count++;
			}
		}
		return count;
	
	}

	// There may be instance variables, constructors, and methods not shown.
	public String toString(){
		String text = "";
		for(int i=0; i<reviewList.size(); i++){
			
			text += "Name: " + reviewList.get(i).getName() + "\n";
			text += "Review: " + reviewList.get(i).getReview() + "\n";
			text += "\n";
			
		}
		
		text += "Product List:\n";
		for(int i=0; i<productList.size(); i++){
			text += productList.get(i) + "\n";
		}
		
		return text;
	}

}
