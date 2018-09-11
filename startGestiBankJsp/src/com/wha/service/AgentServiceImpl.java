package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.AgentDAO;
import com.wha.model.Agent;

@Service
@Transactional
public class AgentServiceImpl implements AgentService {

	@Autowired
    private AgentDAO AgentDAO;
 
    @Override
    @Transactional
    public void addAgent(Agent Agent) {
        AgentDAO.addAgent(Agent);
    }
 
    @Override
    @Transactional
    public List<Agent> getAllAgents() {
        return AgentDAO.getAllAgents();
    }
 
    @Override
    @Transactional
    public void deleteAgent(Integer AgentId) {
        AgentDAO.deleteAgent(AgentId);
    }
 
    public Agent getAgent(int empid) {
        return AgentDAO.getAgent(empid);
    }
 
    public Agent updateAgent(Agent Agent) {
        // TODO Auto-generated method stub
        return AgentDAO.updateAgent(Agent);
    }
 
    public void setAgentDAO(AgentDAO AgentDAO) {
        this.AgentDAO = AgentDAO;
    }

}
