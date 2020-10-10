package net.summerProject.service;

import net.summerProject.model.MedicalRecord;
import net.summerProject.model.User;

public interface MRService {
	void save(MedicalRecord md, User user);
}