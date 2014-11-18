package api.dao;

import api.model.R1StudentCourseSection;
import api.common.BasicTransaction;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

import sif3.common.exception.PersistenceException;
import sif3.common.model.PagingInfo;
import sif3.common.model.SIFContext;
import sif3.common.model.SIFZone;

public class R1StudentCourseSectionDAO extends BaseDAO
{
	protected final Logger logger = Logger.getLogger(getClass());
	
	//Return Single R1StudentCourseSection Object
    @SuppressWarnings("unchecked")
    public R1StudentCourseSection getStudentCourseSection(BasicTransaction tx, String studentCourseSectionRefId, SIFZone zone, SIFContext context) throws IllegalArgumentException, PersistenceException
    {
    	 try
         {
             Criteria criteria = tx.getSession().createCriteria(R1StudentCourseSection.class)
                .add(Restrictions.eq("studentCourseSectionRefId", studentCourseSectionRefId)); //the actual sql type query
               
             
             List<R1StudentCourseSection> studentCourseSections = criteria.list();
             
             // There can only be a maximum of one
             if (studentCourseSections.isEmpty()) 
             {
            	 logger.debug("No StudentCourseSection with staffRefID = "+ studentCourseSectionRefId);
                 return null;
             }
             else // already exists
             {
             	return studentCourseSections.get(0); //always 1 if looking for a specific record, so index 0 is the first record
             }
         }
         catch (HibernateException e)
         {
             throw new PersistenceException("Unable to retrieve R1StudentCourseSection with studentCourseSectionRefId = "+ studentCourseSectionRefId, e);
         }	
    }
    
    //Return Multiple R1StudentCourseSection Objects
    @SuppressWarnings("unchecked")
	public List<R1StudentCourseSection> getStudentCourseSections(BasicTransaction tx, SIFZone zone, SIFContext context, PagingInfo pagingInfo) throws IllegalArgumentException, PersistenceException
    {        
    	try
        {
            Criteria criteria = tx.getSession().createCriteria(R1StudentCourseSection.class);
               //.add(Restrictions.eq("environmentID", environmentID))
               //.add(Restrictions.eq("adapterType", adapterType.name()));
            
            return criteria.list();  
        }
        catch (HibernateException e)
        {
            throw new PersistenceException("Unable to retrieve List of R1StudentCourseSections from R1StudentCourseSectionDAO");
        }	
    }

}