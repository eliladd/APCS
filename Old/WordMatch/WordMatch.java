public class WordMatch 
{ 
	/** The secret string. */ 
	private String secret; 
	
	
	
	/** Constructs a WordMatch object with the given secret string of lowercase letters. */ 
	public WordMatch(String word) 
	{ 
		secret = word;
		
	} 
	
	
	
	/** Returns a score for guess, as described in part (a). 
	* Precondition: 0 < guess.length() <= secret.length() 
	*/ 
	public int scoreGuess(String guess) 
	{ /* to be implemented in part (a) */ 
		int score = 0;
		for(int i=0; i<guess.length(); i++){
			//use substring to get the letters at the index
			if(secret.substring(i, i+guess.length()-1).equals(guess)){
				score += 1;
			}
		}
		score *= guess.length();
		return score;
		
	} 
	
	
	/** Returns the better of two guesses, as determined by scoreGuess and the rules for a 
	* tie-breaker that are described in part (b). 
	* Precondition: guess1 and guess2 contain all lowercase letters. 
	* guess1 is not the same as guess2. 
	*/ 
	public String findBetterGuess(String guess1, String guess2) 
	{ /* to be implemented in part (b) */ 
		int score1 = 0;
		for(int i=0; i<guess1.length(); i++){
			//use substring to get the letters at the index
			if(secret.substring(i, i+1).equals(guess1)){
				score1 += 1;
			}
		}
		score1 *= guess1.length();
		int score2 = 0;
		for(int i=0; i<guess2.length(); i++){
			//use substring to get the letters at the index
			if(secret.substring(i, i+1).equals(guess2)){
				score2 += 1;
			}
		}
		score2 *= guess2.length();
		if(score1 > score2){
			return guess1;
		} 
		else if(score2 > score1){
			return guess2;
		}
		else{
			return guess1;
		}
	}
} 
