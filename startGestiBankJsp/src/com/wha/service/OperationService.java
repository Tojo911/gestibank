package com.wha.service;
/*test tojo 11h35*/
import java.util.List;

import com.wha.model.Operation;
public interface OperationService {
	
	public void addOperation(Operation operation);

	public List<Operation> getAllOperation();

	public void deleteOperation(Integer numeroOperation);

	public Operation getOperation(int numeroOperation);

	public Operation updateOperation(Operation Operation);

}
