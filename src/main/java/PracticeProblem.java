public class PracticeProblem {

	public static void main(String args[]) {
 
	}

	public static int lettersToFive(String sent, char letter){
		int num = 0;
		int times = 0;
		while (num<sent.length()){
			if (sent.charAt(num)== letter){
				times++;
			}
			
			if (times == 5){
				return num;
			}
			num++;
		}
		return -1;

}
}
