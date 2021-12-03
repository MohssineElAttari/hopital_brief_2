package com.hospital.interfaces;

import com.hospital.models.Hospital;
import com.hospital.models.Operation;
import java.util.Optional;
import java.util.List;

public interface OperationInterface {

	public Optional<Operation> getOperationByRef(int ref, Hospital hospital);

	public void addOperation(List<Operation> operations, Operation operation);

	public boolean verifyInsurance();

	public double calculateRsefund();

	public double priceTopay();

	public void checkPayementStatus();

	void exceedPayement();

	public void addToHospitalOparationList();

}
