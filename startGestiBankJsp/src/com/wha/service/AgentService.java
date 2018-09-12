package com.wha.service;

import java.util.List;

import com.wha.model.Agent;

public interface AgentService {
	public void addAgent(Agent agent);

	public List<Agent> getAllAgents();

	public void deleteAgent(Integer agentId);

	public Agent getAgent(int agentId);

	public Agent updateAgent(Agent agent);
}
