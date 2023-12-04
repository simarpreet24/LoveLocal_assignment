class LengthOfString{
	public int lengthOfLastWord(String s){
		String trimmed_s=s.trim();
		int count=0;
		for(int i=trimmed_s.length()-1; i>=0; i--){
			if(trimmed_s.charAt(i) != ' '){
				count++;
			}
			else{
				break;
			}
		}
		return count;
	}
}