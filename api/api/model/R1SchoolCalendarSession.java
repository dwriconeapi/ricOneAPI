/*
 * SIF3Session.java
 * Created: 30/01/2014
 *
 * Copyright 2014 Systemic Pty Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License 
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package api.model;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


public class R1SchoolCalendarSession implements Serializable
{
	private static final long serialVersionUID = 4255194616261324178L;
    
	private String schoolCalendarSessionRefId;
	private String schoolCalendarRefId;
	private String designator;
	private Date beginDate;
	private Date endDate;
	private String sessionTypeCode;
	private BigDecimal instructionalMinutes;
	private String code;
	private String description;
	private boolean markingTermIndicator;
	private boolean schedulingTermIndicator;
	private boolean attendanceTermIndicator;
	private int daysInSession;
	private Date firstInstructionDate;
	private Date lastInstructionDate;
	private int minutesPerDay;
	private Date sessionStartTime;
	private Date sessionEndTime;
	
	
	public R1SchoolCalendarSession() {}


	public String getSchoolCalendarSessionRefId() {
		return schoolCalendarSessionRefId;
	}


	public void setSchoolCalendarSessionRefId(String schoolCalendarSessionRefId) {
		this.schoolCalendarSessionRefId = schoolCalendarSessionRefId;
	}


	public String getSchoolCalendarRefId() {
		return schoolCalendarRefId;
	}


	public void setSchoolCalendarRefId(String schoolCalendarRefId) {
		this.schoolCalendarRefId = schoolCalendarRefId;
	}


	public String getDesignator() {
		return designator;
	}


	public void setDesignator(String designator) {
		this.designator = designator;
	}


	public Date getBeginDate() {
		return beginDate;
	}


	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getSessionTypeCode() {
		return sessionTypeCode;
	}


	public void setSessionTypeCode(String sessionTypeCode) {
		this.sessionTypeCode = sessionTypeCode;
	}


	public BigDecimal getInstructionalMinutes() {
		return instructionalMinutes;
	}


	public void setInstructionalMinutes(BigDecimal instructionalMinutes) {
		this.instructionalMinutes = instructionalMinutes;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isMarkingTermIndicator() 
	{
		return markingTermIndicator;
	}


	public void setMarkingTermIndicator(boolean markingTermIndicator) 
	{
		this.markingTermIndicator = markingTermIndicator;
	}


	public boolean isSchedulingTermIndicator() 
	{
		return schedulingTermIndicator;
	}


	public void setSchedulingTermIndicator(boolean schedulingTermIndicator) {
		this.schedulingTermIndicator = schedulingTermIndicator;
	}


	public boolean isAttendanceTermIndicator() {
		return attendanceTermIndicator;
	}


	public void setAttendanceTermIndicator(boolean attendanceTermIndicator) {
		this.attendanceTermIndicator = attendanceTermIndicator;
	}


	public int getDaysInSession() {
		return daysInSession;
	}


	public void setDaysInSession(int daysInSession) {
		this.daysInSession = daysInSession;
	}


	public Date getFirstInstructionDate() {
		return firstInstructionDate;
	}


	public void setFirstInstructionDate(Date firstInstructionDate) {
		this.firstInstructionDate = firstInstructionDate;
	}


	public Date getLastInstructionDate() {
		return lastInstructionDate;
	}


	public void setLastInstructionDate(Date lastInstructionDate) {
		this.lastInstructionDate = lastInstructionDate;
	}


	public int getMinutesPerDay() {
		return minutesPerDay;
	}


	public void setMinutesPerDay(int minutesPerDay) {
		this.minutesPerDay = minutesPerDay;
	}


	public Date getSessionStartTime() {
		return sessionStartTime;
	}


	public void setSessionStartTime(Date sessionStartTime) {
		this.sessionStartTime = sessionStartTime;
	}


	public Date getSessionEndTime() {
		return sessionEndTime;
	}


	public void setSessionEndTime(Date sessionEndTime) {
		this.sessionEndTime = sessionEndTime;
	}


	@Override
	public String toString() {
		return "R1SchoolCalendarSession [schoolCalendarSessionRefId="
				+ schoolCalendarSessionRefId + ", schoolCalendarRefId="
				+ schoolCalendarRefId + ", designator=" + designator
				+ ", beginDate=" + beginDate + ", endDate=" + endDate
				+ ", sessionTypeCode=" + sessionTypeCode
				+ ", instructionalMinutes=" + instructionalMinutes + ", code="
				+ code + ", description=" + description
				+ ", markingTermIndicator=" + markingTermIndicator
				+ ", schedulingTermIndicator=" + schedulingTermIndicator
				+ ", attendanceTermIndicator=" + attendanceTermIndicator
				+ ", daysInSession=" + daysInSession
				+ ", firstInstructionDate=" + firstInstructionDate
				+ ", lastInstructionDate=" + lastInstructionDate
				+ ", minutesPerDay=" + minutesPerDay + ", sessionStartTime="
				+ sessionStartTime + ", sessionEndTime=" + sessionEndTime + "]";
	}

}
