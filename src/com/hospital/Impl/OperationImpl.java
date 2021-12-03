package com.hospital.Impl;

import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.hospital.enumerations.InsuranceType;
import com.hospital.interfaces.OperationInterface;
import com.hospital.models.Hospital;
import com.hospital.models.Operation;

public class OperationImpl implements OperationInterface {

	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	Scanner scan = new Scanner(System.in);
	private Operation operation;

	@Override
	public Optional<Operation> getOperationByRef(int ref, Hospital hospital) {
		Optional<Operation> operation = null;
		for (Operation op : hospital.getOperations()) {
			if (op.getReference().equals(ref)) {
				operation = Optional.ofNullable(op);
			}
		}
		return operation;
	}

	@Override
	public void addOperation(List<Operation> operations, Operation operation) {
		operations.add(operation);
	}

	@Override
	public boolean verifyInsurance() {
		if (this.operation.getPatient().getInsuranceType().getValue() == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public double calculateRsefund() {
		if (this.verifyInsurance()) {
			if (this.operation.getPatient().getInsuranceType().equals(InsuranceType.RAMED)) {
				return 0;
			}
			return (this.operation.getPriceOfOperation() * this.operation.getPatient().getInsuranceType().getValue());
		}
		return 0;
	}

	@Override
	public double priceTopay() {
		if (this.operation.getPatient().getInsuranceType().equals(InsuranceType.RAMED)) {
			return this.operation.getPriceOfOperation() - (this.operation.getPriceOfOperation()
					* this.operation.getPatient().getInsuranceType().getValue());
		}
		return this.operation.getPriceOfOperation();
	}

	@Override
	public void checkPayementStatus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exceedPayement() {

	}

	@Override
	public void addToHospitalOparationList() {
		// TODO Auto-generated method stub

	}

}
