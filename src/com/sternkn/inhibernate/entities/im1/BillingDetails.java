package com.sternkn.inhibernate.entities.im1;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BillingDetails
{
   private String owner;
   
   public BillingDetails()
   {
   }
   
   
   @Column(name="OWNER", nullable=false)
   public String getOwner()
   {
      return owner;
   }
   public void setOwner(String val)
   {
      owner = val;
   }
}
