package model;

import java.sql.Date;

public class Member {

	private String memberid;
	private String memberpwd;
	private String memberName;
	private Date memberEnrollDate;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String memberid, String memberpwd, String memberName, Date memberEnrollDate) {
		super();
		this.memberid = memberid;
		this.memberpwd = memberpwd;
		this.memberName = memberName;
		this.memberEnrollDate = memberEnrollDate;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getMemberpwd() {
		return memberpwd;
	}
	public void setMemberpwd(String memberpwd) {
		this.memberpwd = memberpwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Date getMemberEnrollDate() {
		return memberEnrollDate;
	}
	public void setMemberEnrollDate(Date memberEnrollDate) {
		this.memberEnrollDate = memberEnrollDate;
	}
	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", memberpwd=" + memberpwd + ", memberName=" + memberName
				+ ", memberEnrollDate=" + memberEnrollDate + "]";
	}
	
}
