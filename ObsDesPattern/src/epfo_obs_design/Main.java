package epfo_obs_design;

public class Main {

	public static void main(String[] args) {
		EPFO epfo = new EPFO();
		//memberId, pf,pension, notify_app, notify_sms, notify_email
		Member m1 = new Member((long)1,(long) 1000, (long)100.0, true, false, false);
		Member m2 = new Member((long)2,(long) 2000, (long)200.0, false, true, false);
		Member m3 = new Member((long)3,(long) 3000, (long)300.0, false, true, true);
		
		epfo.registerMember(m1);
		epfo.registerMember(m2);
		epfo.registerMember(m3);
		
		
		epfo.claims_update(m1, (long)110, (long)0);
		
	}

}
