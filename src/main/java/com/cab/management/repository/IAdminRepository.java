package com.cab.management.repository;

import com.cab.management.model.Admin;

public interface IAdminRepository {

	public void insert(Admin admin);

	public Admin getAdmin(String id);

}
