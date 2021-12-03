package com.hospital.models;

import java.sql.Date;

import com.hospital.enumerations.InsuranceType;
import com.hospital.enumerations.OperationStatus;
import com.hospital.enumerations.OperationType;

public class Operation {

	// Une op�ration sera dans un hopital, dans une salle sp�cifique, et g�r� par un
	// m�decin X qui fait partie de l'hopital :)

	// Il faut v�rifier l'assurance du patient avant de passer l'op�ration

	// Ajouter une classe infirmi�re pour aider le m�decin dans son travail

	// l'assurance rembourse un pourcentage de 70% si c'est CNSS et 80% pour RAMED
	// et 100% pour CNOPS

	// chaque op�ration a un prix, le patient doit payer le montant et apr�s
	// l'hopital va lui remboursser (le cas du CNSS et CNOPS) , si RAMED le patient
	// va juste
	// payer la diff�rence d�s le d�but (20%)

	// Proposition : Ajouter un attribut portefeuille � la classe Patient pour g�rer
	// le solde du patient, et du coup il faut avoir aussi une classe transaction
	// qui tra�e les
	// actions de payments avec la date...

	// Essayer de structurer votre travail avec la cr�ation des interfaces qui vous
	// permettez d'impl�menter les m�thodes n�cessaires.

	// Apr�s le payement d'une op�ration et si c'est pass� avec succ�s le programme
	// est termin�, sinon il faut renvoyer le montant vers la portefeuille patient
	// et dans ce cas son dossier est en stand by pour le discuter au tribunal.
	// (vous devez g�rer les status de chaque op�ration)

	private Long reference;
	private String name;
	private String type;
	private double priceOfOperation;
	private boolean isPayed;
	private Date paymentDate;
	private double refund = 0;
	private InsuranceType insuranceType;
	private OperationType operationType;
	private Date operationDate;
	private TimeSlot timeOperation;
	private Hospital hospital;
	private Room room;
	private Doctor doctor;
	private Patient patient;
	private OperationStatus operationStatus;
	



	public Operation(Long reference, String name, String type, double priceOfOperation, boolean isPayed,
			Date paymentDate, double refund, InsuranceType insuranceType, OperationType operationType,
			Date operationDate, TimeSlot timeOperation, Hospital hospital, Room room, Doctor doctor, Patient patient,
			OperationStatus operationStatus) {
		super();
		this.reference = reference;
		this.name = name;
		this.type = type;
		this.priceOfOperation = priceOfOperation;
		this.isPayed = isPayed;
		this.paymentDate = paymentDate;
		this.refund = refund;
		this.insuranceType = insuranceType;
		this.operationType = operationType;
		this.operationDate = operationDate;
		this.timeOperation = timeOperation;
		this.hospital = hospital;
		this.room = room;
		this.doctor = doctor;
		this.patient = patient;
		this.operationStatus = operationStatus;
	}

	public Operation() {
		super();
	}

	public Long getReference() {
		return reference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isPayed() {
		return isPayed;
	}

	public void setPayed(boolean isPayed) {
		this.isPayed = isPayed;
	}

	public OperationType getOperationType() {
		return operationType;
	}

	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}

	public InsuranceType getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getPriceOfOperation() {
		return priceOfOperation;
	}

	public void setPriceOfOperation(double priceOfOperation) {
		this.priceOfOperation = priceOfOperation;
	}

	public double getRefund() {
		return refund;
	}

	public void setRefund(double refund) {
		this.refund = refund;
	}

	public TimeSlot getTimeOperation() {
		return timeOperation;
	}

	public void setTimeOperation(TimeSlot timeOperation) {
		this.timeOperation = timeOperation;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public OperationStatus getOperationStatus() {
		return operationStatus;
	}

	public void setOperationStatus(OperationStatus operationStatus) {
		this.operationStatus = operationStatus;
	}

	public void setReference(Long reference) {
		this.reference = reference;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Operation [reference=" + reference + ", name=" + name + ", type=" + type + ", priceOfOperation="
				+ priceOfOperation + ", isPayed=" + isPayed + ", paymentDate=" + paymentDate + ", refund=" + refund
				+ ", insuranceType=" + insuranceType + ", operationType=" + operationType + ", operationDate="
				+ operationDate + ", timeOperation=" + timeOperation + ", hospital=" + hospital + ", room=" + room
				+ ", doctor=" + doctor + ", patient=" + patient + ", operationStatus=" + operationStatus + "]";
	}
}