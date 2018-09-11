package com.wha.dao;

import java.util.List;

import com.wha.model.Agent;

public interface AgentDAO {

	public void addAgent(Agent Agent);

	public List<Agent> getAllAgents();

	public void deleteAgent(Integer AgentId);

	public Agent updateAgent(Agent Agent);

	public Agent getAgent(int Agentid);
}
