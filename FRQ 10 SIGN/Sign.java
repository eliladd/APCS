public class Sign {
    String message;
    int width;
    public Sign(String s, int n) {
        message = s;
        width = n;
    }
    public int numberOfLines() {
        int count = 0;
        for (int i = 0; i < message.length(); i += width) {
            count++;
        }
        return count;
    }
    public String getLines() {
        String result = "";
        if(message.equals("")){
            return null;
        }
        else{
            for (int i = 0; i < message.length(); i += width) {
                result += message.substring(i, Math.min(i + width, message.length())) ;
                if (numberOfLines() == i-1){
                }
                else{
                    result += ";";
                }
            }
            return result;
        }
        
    }
		
}