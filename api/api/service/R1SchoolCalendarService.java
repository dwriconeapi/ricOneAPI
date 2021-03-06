package api.service;

import java.util.List;

import api.dao.BaseDAO;
import api.dao.R1SchoolCalendarDAO;
import api.model.R1School;
import api.model.R1SchoolCalendar;
import api.common.BasicTransaction;
import sif3.common.exception.PersistenceException;
import sif3.common.model.PagingInfo;
import sif3.common.model.SIFContext;
import sif3.common.model.SIFZone;

public class R1SchoolCalendarService extends DBService
{
    private R1SchoolCalendarDAO r1SchoolCalendarDAO = new R1SchoolCalendarDAO();
    
    @Override
    public BaseDAO getDAO()
    {
	    return r1SchoolCalendarDAO;
    }

    //getSchoolCalendars
    public R1SchoolCalendar getSchoolCalendar(String schoolCalendarRefID, SIFZone zone, SIFContext context) throws IllegalArgumentException, PersistenceException
    {
    	R1SchoolCalendar row = null;
    	BasicTransaction tx = null;

    	try
    	{
    		tx = startTransaction();
        	row = r1SchoolCalendarDAO.getSchoolCalendar(tx, schoolCalendarRefID, zone, context);
    		tx.commit();
    	}
    	catch (Exception ex)
    	{
    		rollback(tx);
    		System.out.println("DW-Exception: " + ex.getMessage());
    		exceptionMapper(ex, "(Error: R1SchoolCalendarService) Failed to retrieve schoolCalendar for schoolCalendarRefID = "+ schoolCalendarRefID, true, false);
    	}
		return row;
    }
    
    public List<R1SchoolCalendar> getSchoolCalendars(SIFZone zone, SIFContext context, PagingInfo pagingInfo) throws IllegalArgumentException, PersistenceException
    {
    	List<R1SchoolCalendar> list = null;
    	BasicTransaction tx = null;

    	try
    	{
    		tx = startTransaction();
    		
        	list = r1SchoolCalendarDAO.getSchoolCalendars(tx, zone, context, pagingInfo);
    		tx.commit();
    	}
    	catch (Exception ex)
    	{
    		rollback(tx);
    		System.out.println("DW-Exception: " + ex.getMessage());
    		exceptionMapper(ex, "Failed to retrieve schoolCalendars...some error here = '" , true, false);
    	}
		return list;
    }
    

    public boolean deleteSchoolCalendar(String schoolCalendarRefID, SIFZone zone, SIFContext context) throws IllegalArgumentException, PersistenceException
    {
    	R1SchoolCalendar row = null;
    	BasicTransaction tx = null;

    	try
    	{
    		tx = startTransaction();
        	row = r1SchoolCalendarDAO.getSchoolCalendar(tx, schoolCalendarRefID, zone, context);
    		tx.getSession().delete(row);
    		tx.commit();
    		return true;
    	}
    	catch (Exception ex)
    	{
    		rollback(tx);
    		exceptionMapper(ex, "(Error: R1SchoolCalendarService) Failed to retrieve School Calendar for schoolCalendarRefID = "+ schoolCalendarRefID, true, false);
    		return false;
    	}		
    }
    

}
