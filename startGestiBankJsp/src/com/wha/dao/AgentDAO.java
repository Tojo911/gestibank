package com.wha.dao;

import java.util.List;

import com.wha.model.Agent;

public interface AgentDAO {

	public void addAgent(Agent agent);

	public List<Agent> getAllAgents();

	public void deleteAgent(Integer agentId);

	public Agent updateAgent(Agent agent);

	public Agent getAgent(int agentId);
}
