package com.wha.service;

import java.util.List;

import com.wha.model.CompteCourAvD;

public interface CompteCourAvDService {
	public void addCompteCourAvD(CompteCourAvD compteCourAvD);

	public List<CompteCourAvD> getAllCompteCourAvDs();

	public void deleteCompteCourAvD(Integer compteCourAvDId);

	public CompteCourAvD getCompteCourAvD(int compteCourAvDid);

	public CompteCourAvD updateCompteCourAvD(CompteCourAvD compteCourAvD);
}
