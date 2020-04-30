package epfo_obs_design;

public class Member {

	Long memberId;
	Long pf;
	Long pension;
	boolean notify_app;
	boolean notify_sms;
	boolean notify_email;

	public Member(Long memberId, Long pf, Long pension, boolean notify_app, boolean notify_sms, boolean notify_email) {
		super();
		this.memberId = memberId;
		this.pf = pf;
		this.pension = pension;
		this.notify_app = notify_app;
		this.notify_sms = notify_sms;
		this.notify_email = notify_email;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getPf() {
		return pf;
	}

	public void setPf(Long pf) {
		this.pf = pf;
	}

	public Long getPension() {
		return pension;
	}

	public void setPension(Long pension) {
		this.pension = pension;
	}

	public boolean isNotify_app() {
		return notify_app;
	}

	public void setNotify_app(boolean notify_app) {
		this.notify_app = notify_app;
	}

	public boolean isNotify_sms() {
		return notify_sms;
	}

	public void setNotify_sms(boolean notify_sms) {
		this.notify_sms = notify_sms;
	}

	public boolean isNotify_email() {
		return notify_email;
	}

	public void setNotify_email(boolean notify_email) {
		this.notify_email = notify_email;
	}

	public void update() {
		if (notify_app || notify_email || notify_sms) {
			System.out.println("Message for customer: ");
			if (notify_app) {
				System.out.println("Notified by app");
			}
			if (notify_email) {
				System.out.println("Notified by Email");
			}
			if (notify_sms) {
				System.out.println("Notified by SMS");
			}
		}
	}

}
