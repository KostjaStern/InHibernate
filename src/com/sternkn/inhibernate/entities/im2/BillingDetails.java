package com.sternkn.inhibernate.entities.im2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class BillingDetails
{
   private Long id;
   private String owner;
   
   public BillingDetails()
   {
   }
   
   @Id
   @Column(name="TH_BILL_RECID")
   @SequenceGenerator(name="BILL_SEQ", sequenceName="SEQ_TH_IM2_BILL_RECID", allocationSize=1) 
   @GeneratedValue(generator="BILL_SEQ", strategy=GenerationType.SEQUENCE)
   public Long getId()
   {
      return id;
   }
   public void setId(Long val)
   {
      id = val;
   }
   
   @Column(name="TH_BILL_OWNER", nullable=false)
   public String getOwner()
   {
      return owner;
   }
   public void setOwner(String val)
   {
      owner = val;
   }
}
