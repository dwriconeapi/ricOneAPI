package api.service;

import java.util.List;

import api.dao.BaseDAO;
import api.dao.R1StaffDAO;
import api.model.R1Staff;
import api.model.R1Student;
import api.common.BasicTransaction;
import sif3.common.exception.PersistenceException;
import sif3.common.model.PagingInfo;
import sif3.common.model.SIFContext;
import sif3.common.model.SIFZone;
import sif3.common.ws.OperationStatus;

public class R1StaffService extends DBService
{
    private R1StaffDAO r1StaffDAO = new R1StaffDAO();
    
    @Override
    public BaseDAO getDAO()
    {
	    return r1StaffDAO;
    }

    //getStaffs
    public R1Staff getStaff(String staffRefID, SIFZone zone, SIFContext context) throws IllegalArgumentException, PersistenceException
    {
    	R1Staff row = null;
    	BasicTransaction tx = null;

    	try
    	{
    		tx = startTransaction();
        	row = r1StaffDAO.getStaff(tx, staffRefID, zone, context);
    		tx.commit();
    	}
    	catch (Exception ex)
    	{
    		rollback(tx);
    		System.out.println("DW-Exception: " + ex.getMessage());
    		exceptionMapper(ex, "(Error: R1StaffService) Failed to retrieve staff for staffRefID ="+ staffRefID, true, false);
    	}
		return row;
    }
    
    public List<R1Staff> getStaffs(SIFZone zone, SIFContext context, PagingInfo pagingInfo) throws IllegalArgumentException, PersistenceException
    {
    	List<R1Staff> list = null;
    	BasicTransaction tx = null;

    	try
    	{
    		tx = startTransaction();
        	list = r1StaffDAO.getStaffs(tx, zone, context, pagingInfo); //returning null
    		tx.commit();
    	}
    	catch (Exception ex)
    	{
    		rollback(tx);
    		System.out.println("DW-Exception: " + ex.getMessage());
    		exceptionMapper(ex, "Failed to retrieve all staffs...(R1StaffService)" , true, false);
    	}
		return list;
    }
    
    public boolean deleteStaff(String staffRefId, SIFZone zone, SIFContext context) throws IllegalArgumentException, PersistenceException
    {
    	BasicTransaction tx = null;
    	try
    	{
    		tx = startTransaction();
    		if(r1StaffDAO.deleteStaff(tx, staffRefId, zone, context))
    		{
    			tx.commit();
    			return true;
    		}
    		else
    		{
    			rollback(tx);
    			return false;
    		}  		
    	}
    	catch (Exception ex)
    	{
    		rollback(tx);
    		exceptionMapper(ex, "(Error: R1StaffService) Failed to retrieve staff for staffRefID = "+ staffRefId, true, false);
    		return false;
    	}		
    }
    
}
