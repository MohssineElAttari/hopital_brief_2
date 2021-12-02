package com.hospital.models;

import java.sql.Date;

import com.hospital.enumerations.InsuranceType;
import com.hospital.enumerations.OperationType;

public class Operation {

	// Une opération sera dans un hopital, dans une salle spécifique, et géré par un
	// médecin X qui fait partie de l'hopital :)

	// Il faut vérifier l'assurance du patient avant de passer l'opération

	// Ajouter une classe infirmière pour aider le médecin dans son travail

	// l'assurance rembourse un pourcentage de 70% si c'est CNSS et 80% pour RAMED
	// et 100% pour CNOPS

	// chaque opération a un prix, le patient doit payer le montant et après
	// l'hopital va lui remboursser (le cas du CNSS et CNOPS) , si RAMED le patient
	// va juste
	// payer la différence dès le début (20%)

	// Proposition : Ajouter un attribut portefeuille à la classe Patient pour gérer
	// le solde du patient, et du coup il faut avoir aussi une classe transaction
	// qui traçe les
	// actions de payments avec la date...

	// Essayer de structurer votre travail avec la création des interfaces qui vous
	// permettez d'implémenter les méthodes nécessaires.

	// Après le payement d'une opération et si c'est passé avec succès le programme
	// est terminé, sinon il faut renvoyer le montant vers la portefeuille patient
	// et dans ce cas son dossier est en stand by pour le discuter au tribunal.
	// (vous devez gérer les status de chaque opération)

	private Long reference;
	private String name;
	private String type;
	private double priceOfOperation;
	private boolean isPayed;
	private Date paymentDate;
	private double refund;
	private InsuranceType insuranceType;
	private OperationType operationType;
	private Date operationDate;
	private TimeSlot timeOperation;

	public Operation(Long reference, String name, String type, double priceOfOperation, boolean isPayed,
			Date paymentDate, double refund, InsuranceType insuranceType, OperationType operationType,
			Date operationDate, TimeSlot timeOperation) {
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

	@Override
	public String toString() {
		return "Operation [reference=" + reference + ", name=" + name + ", type=" + type + ", isPayed=" + isPayed
				+ ", operationType=" + operationType + ", insuranceType=" + insuranceType + ", operationDate="
				+ operationDate + ", paymentDate=" + paymentDate + "]";
	}

}