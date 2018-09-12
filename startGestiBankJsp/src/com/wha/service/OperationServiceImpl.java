package com.wha.service;
/*11h35*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.EmployeeDAO;
import com.wha.dao.OperationDAO;
import com.wha.model.Employee;
import com.wha.model.Operation;;


@Service
@Transactional
public class OperationServiceImpl implements OperationService{

	public OperationServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
    private OperationDAO operationDAO;
 
    @Override
    @Transactional
    public void addOperation(Operation operation) {
        operationDAO.addOperation(operation);
    }
 
    @Override
    @Transactional
    public List<Operation> getAllOperation() {
        return operationDAO.getAllOperation();
    }
 
    @Override
    @Transactional
    public void deleteOperation(Integer numeroOperation) {
        operationDAO.deleteOperation(numeroOperation);
    }
 
    public Operation getOperation(int numeroOperation) {
        return operationDAO.getOperation(numeroOperation);
    }
 
    public Operation updateOperation(Operation operation) {
        // TODO Auto-generated method stub
        return operationDAO.updateOperation(operation);
    }
 
    public void setOperationDAO(OperationDAO operationDAO) {
        this.operationDAO = operationDAO;
    }


}
