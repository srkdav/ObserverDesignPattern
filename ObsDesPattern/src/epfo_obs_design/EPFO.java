package epfo_obs_design;

import java.util.ArrayList;
import java.util.List;

public class EPFO implements Subject {

	List<Member> list = new ArrayList<Member>();
	NotifyMember notification;

	@Override
	public void registerMember(Member member) {
		list.add(member);

	}

	@Override
	public void removeMember(Member member) {
		list.remove(member);
	}

	public void claims_update(Member member,Long pf_required,Long pension_required) {
		System.out.println("Message for EPFO : Member ID-"+ member.memberId+" has requested for claims.");
		Long newPf = member.getPf()-pf_required;
		Long newPension = member.getPension()-pension_required;
		member.setPf(newPf);
		member.setPension(newPension);
		member.update();
	}
}
