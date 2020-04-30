package epfo_obs_design;

public interface NotifyMember {

	String notificationOfMember();
}

class Email implements NotifyMember {

	@Override
	public String notificationOfMember() {
		return " Email has been sent to user;";
	}
}

class SMS implements NotifyMember {

	@Override
	public String notificationOfMember() {
		return " SMS has been sent to user;";
	}
}
class APP implements NotifyMember {

	@Override
	public String notificationOfMember() {
		return " App Notification has been sent to user;";
	}
}
