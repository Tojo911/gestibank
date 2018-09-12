package com.wha.dao;
/*Tojo 12h08*/
import java.util.List;

import com.wha.model.Operation;

public interface OperationDAO {
	
	public void addOperation(Operation operation);

	public List<Operation> getAllOperation();

	public void deleteOperation(Integer numeroOperation);

	public Operation updateOperation(Operation operation);

	public Operation getOperation(int numeroOperation);

}
