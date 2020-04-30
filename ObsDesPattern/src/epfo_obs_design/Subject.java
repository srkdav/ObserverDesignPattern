package epfo_obs_design;

public interface Subject {

	public void registerMember(Member member);
	public void removeMember(Member member);
	public void claims_update(Member member,Long pf_required,Long pension_required);
}
