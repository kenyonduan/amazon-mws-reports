/*******************************************************************************
 * Copyright 2009-2016 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Inventory Supply Detail List
 * API Version: 2010-10-01
 * Library Version: 2014-09-30
 * Generated: Mon Mar 21 09:01:27 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInventory.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * InventorySupplyDetailList complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InventorySupplyDetailList"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="member" type="{http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/}InventorySupplyDetail" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="InventorySupplyDetailList", propOrder={
    "member"
})
@XmlRootElement(name = "InventorySupplyDetailList")
public class InventorySupplyDetailList extends AbstractMwsObject {

    @XmlElement(name="member")
    private List<InventorySupplyDetail> member;

    /**
     * Get the value of member.
     *
     * @return The value of member.
     */
    public List<InventorySupplyDetail> getMember() {
        if (member==null) {
            member = new ArrayList<InventorySupplyDetail>();
        }
        return member;
    }

    /**
     * Set the value of member.
     *
     * @param member
     *            The new value to set.
     */
    public void setMember(List<InventorySupplyDetail> member) {
        this.member = member;
    }

    /**
     * Clear member.
     */
    public void unsetMember() {
        this.member = null;
    }

    /**
     * Check to see if member is set.
     *
     * @return true if member is set.
     */
    public boolean isSetMember() {
        return member != null && !member.isEmpty();
    }

    /**
     * Add values for member, return this.
     *
     * @param member
     *             New values to add.
     *
     * @return This instance.
     */
    public InventorySupplyDetailList withMember(InventorySupplyDetail... values) {
        List<InventorySupplyDetail> list = getMember();
        for (InventorySupplyDetail value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Read members from a MwsReader.
     *
     * @param r
     *      The reader to read from.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        member = r.readList("member", InventorySupplyDetail.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("member", member);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInventory/2010-10-01/", "InventorySupplyDetailList",this);
    }

    /** Value constructor. */
    public InventorySupplyDetailList(List<InventorySupplyDetail> member) {
        this.member = member;
    }    
    

    /** Default constructor. */
    public InventorySupplyDetailList() {
        super();
    }

}
