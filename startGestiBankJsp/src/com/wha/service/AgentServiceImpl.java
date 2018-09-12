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
    private AgentDAO agentDAO;
 
    @Override
    @Transactional
    public void addAgent(Agent agent) {
        agentDAO.addAgent(agent);
    }
 
    @Override
    @Transactional
    public List<Agent> getAllAgents() {
        return agentDAO.getAllAgents();
    }
 
    @Override
    @Transactional
    public void deleteAgent(Integer agentId) {
        agentDAO.deleteAgent(agentId);
    }
 
    public Agent getAgent(int agentId) {
        return agentDAO.getAgent(agentId);
    }
 
    public Agent updateAgent(Agent agent) {
        // TODO Auto-generated method stub
        return agentDAO.updateAgent(agent);
    }
 
    public void setAgentDAO(AgentDAO agentDAO) {
        this.agentDAO = agentDAO;
    }

}
