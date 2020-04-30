package observer_design_pattern;

public class Main {

	public static void main(String[] args){
		
		Channel cricketHighlights = new Channel();
		
		//here we can add more subscribers - loose coupling obtained		
		Subscriber s1 = new Subscriber("Karthick");
		Subscriber s2 = new Subscriber("David");
		Subscriber s3 = new Subscriber("Steve");
		
		cricketHighlights.subscribe(s1);
		cricketHighlights.subscribe(s2);
		cricketHighlights.subscribe(s3);
		
		s1.subscribeChannel(cricketHighlights);
		s2.subscribeChannel(cricketHighlights);
		s3.subscribeChannel(cricketHighlights);
		
		cricketHighlights.upload("Ind vs Pak Highlights");
		System.out.println();	
		
		cricketHighlights.unSubscribe(s1);
		
		cricketHighlights.upload("Aus vs SA Highlights");

	}
}
