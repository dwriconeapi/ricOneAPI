package api.model;

import java.io.Serializable;
import java.util.Date;

public class R1StaffAssignment implements Serializable
{
	private static final long serialVersionUID = 4255199616263324174L;
    
	private String staffAssignmentRefId;
	private String staffRefId;
	private String schoolRefId;
	private boolean primaryAssignment;
	private String positionTitle;
	private R1Staff r1Staff;
	private R1School r1School;

	public R1StaffAssignment() {}

	public String getStaffAssignmentRefId() {
		return staffAssignmentRefId;
	}

	public void setStaffAssignmentRefId(String staffAssignmentRefId) {
		this.staffAssignmentRefId = staffAssignmentRefId;
	}

	public String getStaffRefId() {
		return staffRefId;
	}

	public void setStaffRefId(String staffRefId) {
		this.staffRefId = staffRefId;
	}

	public String getSchoolRefId() {
		return schoolRefId;
	}

	public void setSchoolRefId(String schoolRefId) {
		this.schoolRefId = schoolRefId;
	}

	public boolean getPrimaryAssignment() {
		return primaryAssignment;
	}

	public void setPrimaryAssignment(boolean primaryAssignment) {
		this.primaryAssignment = primaryAssignment;
	}

	public String getPositionTitle() {
		return positionTitle;
	}

	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}

	@Override
	public String toString() {
		return "R1StaffAssignment [staffAssignmentRefId="
				+ staffAssignmentRefId + ", staffRefId=" + staffRefId
				+ ", schoolRefId=" + schoolRefId + ", primaryAssignment="
				+ primaryAssignment + ", positionTitle=" + positionTitle + "]";
	}

	public R1Staff getR1Staff()
	{
		return r1Staff;
	}

	public void setR1Staff(R1Staff r1Staff)
	{
		this.r1Staff = r1Staff;
	}

	public R1School getR1School()
	{
		return r1School;
	}

	public void setR1School(R1School r1School)
	{
		this.r1School = r1School;
	}
	
	

}
