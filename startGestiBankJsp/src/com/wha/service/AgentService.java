package com.wha.service;

import java.util.List;

import com.wha.model.Agent;

public interface AgentService {
	public void addAgent(Agent Agent);

	public List<Agent> getAllAgents();

	public void deleteAgent(Integer AgentId);

	public Agent getAgent(int Agentid);

	public Agent updateAgent(Agent Agent);
}
