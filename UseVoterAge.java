package functionalinter;

public class UseVoterAge {
	public static void main(String[] args) {
		VoteAge n=a->{
			if(a>=18) {
			
				return "elegible";
			}
			else {
				return "not elegible";
			}
		};
		
		int number =18;
		System.out.println(n.findVoterAge(number));

	
	}
}
