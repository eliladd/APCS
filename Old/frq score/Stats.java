import java.util.ArrayList;

public class Stats
{
	private ArrayList<ScoreInfo> scoreList;
	
	// listed in increasing score order; no two ScoreInfo objects contain the same score
	
	public Stats(char type)
	{
		scoreList = new ArrayList<ScoreInfo>();
		
		if( type == 'a' )
		{
			for(int i=10; i < 110; i+=10)
				scoreList.add(new ScoreInfo(i));
		}
	}
	
	/** Records a score in the database, keeping the database in increasing score order. If no other
	* ScoreInfo object represents score, a new ScoreInfo object representing score
	* is added to the database; otherwise, the frequency in the ScoreInfo object representing
	* score is incremented.
	* @param score a score to be recorded in the list
	* @return true if a new ScoreInfo object representing score was added to the list;
	* false otherwise
	*/
	public boolean record(int score){ /* to be implemented in part (a) */
		boolean returned = false;
		for (int i = 0; i < scoreList.size(); i++){
			if (scoreList[i].getScore == score){
				scoreList[i].increment();
				returned = true;
				return true;
			}
		}
		if(!returned){
			scoreList.add(new ScoreInfo(score));
			return false;
		}
		
	}

	public void recordScores(int[] stuScores)
	{ /* to be implemented in part (b) */
		for(int i = 0; i < stuScores.length; i++){
			for(int o = 0; o < stuScores[i].getFrequency; o++){
				record(stuScores[i].getScore);
			}
		}
	}
	
	
	public void printScores()
	{
		for(ScoreInfo each : scoreList)
		{
			System.out.println("Score: " + each.getScore() + " Frequency: " + each.getFrequency() );
		}
	}
	// There may be instance variables, constructors, and methods that are not shown.
}