package com.wha.dao;
/*Test Marie 14h:52*/
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




import com.wha.model.Operation;

@Repository
public class OperationDAOImpl  implements OperationDAO{
	@Autowired
    private SessionFactory sessionFactory;

	public OperationDAOImpl() {
		// TODO Auto-generated constructor stub
	}


	public void addOperation(Operation operation)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(operation);
	}

	@SuppressWarnings("unchecked")
	public List<Operation> getAllOperation()
	{ 
		return sessionFactory.getCurrentSession().createQuery("from Operation")
                .list();
	}

	@Override
	public void deleteOperation(Integer numeroOperation)
	{
		Operation operation = (Operation) sessionFactory.getCurrentSession().load(
				Operation.class,numeroOperation);
        if (null != operation) {
            this.sessionFactory.getCurrentSession().delete(operation);
        }
 
	}

	public Operation updateOperation(Operation operation)
	{  sessionFactory.getCurrentSession().update(operation);
       return operation ;}

	public Operation getOperation(int numeroOperation)
	{
		 return (Operation) sessionFactory.getCurrentSession().get(
				 Operation.class,numeroOperation );
	}
}
