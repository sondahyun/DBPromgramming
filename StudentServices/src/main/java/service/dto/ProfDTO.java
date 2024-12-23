package service.dto;

// 교수정보를 저장하기 위한 DTO
public class ProfDTO {
	private String profNo;		// 교수번호
	private String name;		// 교수명
	private String phoneNo;		// 연락처
	private String roomNo;		// 연구실 위치
	private String deptNo;		// 교수 소속 학과번호
	
	public String setProfNo() {
		return profNo;
	}
	public void setProfNo(String pNo) {
		this.profNo = pNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String dNo) {
		this.deptNo = dNo;
	}
}
