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
 * Get Pallet Labels Request
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * GetPalletLabelsRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetPalletLabelsRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="PageType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="NumberOfPallets" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="GetPalletLabelsRequest", propOrder={
    "sellerId",
    "mwsAuthToken",
    "shipmentId",
    "pageType",
    "numberOfPallets"
})
@XmlRootElement(name = "GetPalletLabelsRequest")
public class GetPalletLabelsRequest extends AbstractMwsObject {

    @XmlElement(name="SellerId",required=true)
    private String sellerId;

    @XmlElement(name="MWSAuthToken")
    private String mwsAuthToken;

    @XmlElement(name="ShipmentId",required=true)
    private String shipmentId;

    @XmlElement(name="PageType",required=true)
    private String pageType;

    @XmlElement(name="NumberOfPallets",required=true)
    private int numberOfPallets;

    /**
     * Get the value of SellerId.
     *
     * @return The value of SellerId.
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Set the value of SellerId.
     *
     * @param sellerId
     *            The new value to set.
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Check to see if SellerId is set.
     *
     * @return true if SellerId is set.
     */
    public boolean isSetSellerId() {
        return sellerId != null;
    }

    /**
     * Set the value of SellerId, return this.
     *
     * @param sellerId
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPalletLabelsRequest withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of MWSAuthToken.
     *
     * @return The value of MWSAuthToken.
     */
    public String getMWSAuthToken() {
        return mwsAuthToken;
    }

    /**
     * Set the value of MWSAuthToken.
     *
     * @param mwsAuthToken
     *            The new value to set.
     */
    public void setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Check to see if MWSAuthToken is set.
     *
     * @return true if MWSAuthToken is set.
     */
    public boolean isSetMWSAuthToken() {
        return mwsAuthToken != null;
    }

    /**
     * Set the value of MWSAuthToken, return this.
     *
     * @param mwsAuthToken
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPalletLabelsRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of ShipmentId.
     *
     * @return The value of ShipmentId.
     */
    public String getShipmentId() {
        return shipmentId;
    }

    /**
     * Set the value of ShipmentId.
     *
     * @param shipmentId
     *            The new value to set.
     */
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    /**
     * Check to see if ShipmentId is set.
     *
     * @return true if ShipmentId is set.
     */
    public boolean isSetShipmentId() {
        return shipmentId != null;
    }

    /**
     * Set the value of ShipmentId, return this.
     *
     * @param shipmentId
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPalletLabelsRequest withShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * Get the value of PageType.
     *
     * @return The value of PageType.
     */
    public String getPageType() {
        return pageType;
    }

    /**
     * Set the value of PageType.
     *
     * @param pageType
     *            The new value to set.
     */
    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    /**
     * Check to see if PageType is set.
     *
     * @return true if PageType is set.
     */
    public boolean isSetPageType() {
        return pageType != null;
    }

    /**
     * Set the value of PageType, return this.
     *
     * @param pageType
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPalletLabelsRequest withPageType(String pageType) {
        this.pageType = pageType;
        return this;
    }

    /**
     * Get the value of NumberOfPallets.
     *
     * @return The value of NumberOfPallets.
     */
    public int getNumberOfPallets() {
        return numberOfPallets;
    }

    /**
     * Set the value of NumberOfPallets.
     *
     * @param numberOfPallets
     *            The new value to set.
     */
    public void setNumberOfPallets(int numberOfPallets) {
        this.numberOfPallets = numberOfPallets;
    }

    /**
     * Set the value of NumberOfPallets, return this.
     *
     * @param numberOfPallets
     *             The new value to set.
     *
     * @return This instance.
     */
    public GetPalletLabelsRequest withNumberOfPallets(int numberOfPallets) {
        this.numberOfPallets = numberOfPallets;
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
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        shipmentId = r.read("ShipmentId", String.class);
        pageType = r.read("PageType", String.class);
        numberOfPallets = r.read("NumberOfPallets", int.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerId", sellerId);
        w.write("MWSAuthToken", mwsAuthToken);
        w.write("ShipmentId", shipmentId);
        w.write("PageType", pageType);
        w.write("NumberOfPallets", numberOfPallets);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "GetPalletLabelsRequest",this);
    }

    /** Value constructor. */
    public GetPalletLabelsRequest(String sellerId,String mwsAuthToken,String shipmentId,String pageType,int numberOfPallets) {
        this.sellerId = sellerId;
        this.mwsAuthToken = mwsAuthToken;
        this.shipmentId = shipmentId;
        this.pageType = pageType;
        this.numberOfPallets = numberOfPallets;
    }

    /** Value constructor. */
    public GetPalletLabelsRequest(String sellerId,String shipmentId,String pageType,int numberOfPallets) {
        this.sellerId = sellerId;
        this.shipmentId = shipmentId;
        this.pageType = pageType;
        this.numberOfPallets = numberOfPallets;
    }    

    /** Default constructor. */
    public GetPalletLabelsRequest() {
        super();
    }

}
