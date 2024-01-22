public class WordScrambler
{
	private String[] scrambledWords;
    private String[] mixedWordQs;
	
	
	/** @param wordArr an array of String objects
	* Precondition: wordArr.length is even
	*/
	public WordScrambler(String[] wordArr)
	{
		scrambledWords = mixedWords(wordArr);
	}
	
	public String testPartA(String word1, String word2)
	{
		return recombine(word1, word2);
	}
	
	
	/** @param word1 a String of characters
	* @param word2 a String of characters
	* @return a String that contains the first half of word1 and the second half of word2
	*/
	private String recombine(String word1, String word2)
	{ /* to be implemented in part (a) */
        //System.out.println("im recombing!");
		return word1.substring(0,(word1.length()/2)) + word2.substring((word2.length()/2)+1);
	}
	
	public void testPartB()
	{
        //System.out.print("im getting classed!!");
		System.out.print("(");
        System.out.print(scrambledWords);
		for(int i=0; i < scrambledWords.length; i++)
		{
			System.out.print( scrambledWords[i] );
			if( i < scrambledWords.length-1 )
				System.out.print(", ");
		}
		System.out.println(")");		
	}
	
	
	/** @param words an array of String objects
	* Precondition: words.length is even
	* @return an array of String objects created by recombining pairs of strings in array words
	* Postcondition: the length of the returned array is words.length
	*/
	private String[] mixedWords(String[] words)
	{ /* to be implemented in part (b) */ 
        //System.out.println("im getting classed!");
        for(int i = 0; i < words.length;i+=2){
            //System.out.println("im about to recombine!");
            //mixedWordQs = recombine(words[i],words[i+1]);
        }
        System.out.println("Scrambled words: " + scrambledWords);
		return scrambledWords;
	}

}