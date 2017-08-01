
package com.amazonaws.mws.reports.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for TypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * Generated by AWS Code Generator
 * <p/>
 * Wed Feb 18 13:28:59 PST 2009
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeList", propOrder = {
    "type"
})
public class TypeList {

    @XmlElement(name = "Type", required = true)
    protected List<String> type;

    /**
     * Default constructor
     * 
     */
    public TypeList() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public TypeList(final List<String> type) {
        this.type = type;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<String>();
        }
        return this.type;
    }

    public boolean isSetType() {
        return ((this.type!= null)&&(!this.type.isEmpty()));
    }

    public void unsetType() {
        this.type = null;
    }

    /**
     * Sets the value of the Type property.
     * 
     * @param values
     * @return
     *     this instance
     */
    public TypeList withType(String... values) {
        for (String value: values) {
            getType().add(value);
        }
        return this;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param type
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(List<String> type) {
        this.type = type;
    }
    

    /**
     * 
     * XML fragment representation of this object
     * 
     * @return XML fragment for this object. Name for outer
     * tag expected to be set by calling method. This fragment
     * returns inner properties representation only
     */
    protected String toXMLFragment() {
        StringBuffer xml = new StringBuffer();
        java.util.List<String> typeList  =  getType();
        for (String type : typeList) { 
            xml.append("<Type>");
            xml.append(escapeXML(type));
            xml.append("</Type>");
        }	
        return xml.toString();
    }

    /**
     * 
     * Escape XML special characters
     */
    private String escapeXML(String string) {
        StringBuffer sb = new StringBuffer();
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '&':
                sb.append("&amp;");
                break;
            case '<':
                sb.append("&lt;");
                break;
            case '>':
                sb.append("&gt;");
                break;
            case '\'':
                sb.append("&#039;");
                break;
            case '"':
                sb.append("&quot;");
                break;
            default:
                sb.append(c);
            }
        }
        return sb.toString();
    }



    /**
     *
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     *
     */
    protected String toJSONFragment() {
        StringBuffer json = new StringBuffer();
        boolean first = true;
        if (isSetType()) {
            if (!first) json.append(", ");
            json.append("\"Type\" : [");
            java.util.List<String> typeList  =  getType();
            for (String type : typeList) {
                if (typeList.indexOf(type) > 0) json.append(", ");
                    json.append(quoteJSON(type));
            }
            json.append("]");
            first = false;
        }
        return json.toString();
    }

    /**
     *
     * Quote JSON string
     */
    private String quoteJSON(String string) {
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '/':
                sb.append("\\/");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            default:
                if (c <  ' ') {
                    sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                } else {
                sb.append(c);
            }
        }
        }
        sb.append("\"");
        return sb.toString();
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="ReportInfo" type="{http://mws.amazonaws.com/doc/2009-01-01/}ReportInfo" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * Generated by AWS Code Generator
     * <p/>
     * Wed Feb 18 13:28:59 PST 2009
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "count",
        "reportInfo"
    })
    @XmlRootElement(name = "UpdateReportAcknowledgementsResult")
    public static class UpdateReportAcknowledgementsResult {

        @XmlElement(name = "Count")
        protected int count;
        @XmlElement(name = "ReportInfo", required = true)
        protected List<ReportInfo> reportInfo;

        /**
         * Default constructor
         *
         */
        public UpdateReportAcknowledgementsResult() {
            super();
        }

        /**
         * Value constructor
         *
         */
        public UpdateReportAcknowledgementsResult(final int count, final List<ReportInfo> reportInfo) {
            this.count = count;
            this.reportInfo = reportInfo;
        }

        /**
         * Gets the value of the count property.
         *
         */
        public int getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         *
         */
        public void setCount(int value) {
            this.count = value;
        }

        public boolean isSetCount() {
            return true;
        }

        /**
         * Gets the value of the reportInfo property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportInfo property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportInfo().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportInfo }
         *
         *
         */
        public List<ReportInfo> getReportInfoList() {
            if (reportInfo == null) {
                reportInfo = new ArrayList<ReportInfo>();
            }
            return this.reportInfo;
        }

        public boolean isSetReportInfoList() {
            return ((this.reportInfo!= null)&&(!this.reportInfo.isEmpty()));
        }

        public void unsetReportInfoList() {
            this.reportInfo = null;
        }

        /**
         * Sets the value of the Count property.
         *
         * @param value
         * @return
         *     this instance
         */
        public UpdateReportAcknowledgementsResult withCount(int value) {
            setCount(value);
            return this;
        }

        /**
         * Sets the value of the ReportInfo property.
         *
         * @param values
         * @return
         *     this instance
         */
        public UpdateReportAcknowledgementsResult withReportInfoList(ReportInfo... values) {
            for (ReportInfo value: values) {
                getReportInfoList().add(value);
            }
            return this;
        }

        /**
         * Sets the value of the reportInfo property.
         *
         * @param reportInfo
         *     allowed object is
         *     {@link ReportInfo }
         *
         */
        public void setReportInfoList(List<ReportInfo> reportInfo) {
            this.reportInfo = reportInfo;
        }


        /**
         *
         * XML fragment representation of this object
         *
         * @return XML fragment for this object. Name for outer
         * tag expected to be set by calling method. This fragment
         * returns inner properties representation only
         */
        protected String toXMLFragment() {
            StringBuffer xml = new StringBuffer();
            if (isSetCount()) {
                xml.append("<Count>");
                xml.append(getCount() + "");
                xml.append("</Count>");
            }
            List<ReportInfo> reportInfoList = getReportInfoList();
            for (ReportInfo reportInfo : reportInfoList) {
                xml.append("<ReportInfo>");
                xml.append(reportInfo.toXMLFragment());
                xml.append("</ReportInfo>");
            }
            return xml.toString();
        }

        /**
         *
         * Escape XML special characters
         */
        private String escapeXML(String string) {
            StringBuffer sb = new StringBuffer();
            int length = string.length();
            for (int i = 0; i < length; ++i) {
                char c = string.charAt(i);
                switch (c) {
                case '&':
                    sb.append("&amp;");
                    break;
                case '<':
                    sb.append("&lt;");
                    break;
                case '>':
                    sb.append("&gt;");
                    break;
                case '\'':
                    sb.append("&#039;");
                    break;
                case '"':
                    sb.append("&quot;");
                    break;
                default:
                    sb.append(c);
                }
            }
            return sb.toString();
        }



        /**
         *
         * JSON fragment representation of this object
         *
         * @return JSON fragment for this object. Name for outer
         * object expected to be set by calling method. This fragment
         * returns inner properties representation only
         *
         */
        protected String toJSONFragment() {
            StringBuffer json = new StringBuffer();
            boolean first = true;
            if (isSetCount()) {
                if (!first) json.append(", ");
                json.append(quoteJSON("Count"));
                json.append(" : ");
                json.append(quoteJSON(getCount() + ""));
                first = false;
            }
            if (isSetReportInfoList()) {
                if (!first) json.append(", ");
                json.append("\"ReportInfo\" : [");
                List<ReportInfo> reportInfoList = getReportInfoList();
                for (ReportInfo reportInfo : reportInfoList) {
                    if (reportInfoList.indexOf(reportInfo) > 0) json.append(", ");
                    json.append("{");
                    json.append("");
                    json.append(reportInfo.toJSONFragment());
                    json.append("}");
                    first = false;
                }
                json.append("]");
            }
            return json.toString();
        }

        /**
         *
         * Quote JSON string
         */
        private String quoteJSON(String string) {
            StringBuffer sb = new StringBuffer();
            sb.append("\"");
            int length = string.length();
            for (int i = 0; i < length; ++i) {
                char c = string.charAt(i);
                switch (c) {
                case '"':
                    sb.append("\\\"");
                    break;
                case '\\':
                    sb.append("\\\\");
                    break;
                case '/':
                    sb.append("\\/");
                    break;
                case '\b':
                    sb.append("\\b");
                    break;
                case '\f':
                    sb.append("\\f");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
                case '\t':
                    sb.append("\\t");
                    break;
                default:
                    if (c <  ' ') {
                        sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                    } else {
                    sb.append(c);
                }
            }
            }
            sb.append("\"");
            return sb.toString();
        }


    }

    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://mws.amazonaws.com/doc/2009-01-01/}UpdateReportAcknowledgementsResult"/>
     *         &lt;element ref="{http://mws.amazonaws.com/doc/2009-01-01/}ResponseMetadata"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * Generated by AWS Code Generator
     * <p/>
     * Wed Feb 18 13:28:59 PST 2009
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "updateReportAcknowledgementsResult",
        "responseMetadata"
    })
    @XmlRootElement(name = "UpdateReportAcknowledgementsResponse")
    public static class UpdateReportAcknowledgementsResponse {

        @XmlElement(name = "UpdateReportAcknowledgementsResult", required = true)
        protected UpdateReportAcknowledgementsResult updateReportAcknowledgementsResult;
        @XmlElement(name = "ResponseMetadata", required = true)
        protected ResponseMetadata responseMetadata;

        /**
         * Default constructor
         *
         */
        public UpdateReportAcknowledgementsResponse() {
            super();
        }

        /**
         * Value constructor
         *
         */
        public UpdateReportAcknowledgementsResponse(final UpdateReportAcknowledgementsResult updateReportAcknowledgementsResult, final ResponseMetadata responseMetadata) {
            this.updateReportAcknowledgementsResult = updateReportAcknowledgementsResult;
            this.responseMetadata = responseMetadata;
        }

        /**
         * Gets the value of the updateReportAcknowledgementsResult property.
         *
         * @return
         *     possible object is
         *     {@link UpdateReportAcknowledgementsResult }
         *
         */
        public UpdateReportAcknowledgementsResult getUpdateReportAcknowledgementsResult() {
            return updateReportAcknowledgementsResult;
        }

        /**
         * Sets the value of the updateReportAcknowledgementsResult property.
         *
         * @param value
         *     allowed object is
         *     {@link UpdateReportAcknowledgementsResult }
         *
         */
        public void setUpdateReportAcknowledgementsResult(UpdateReportAcknowledgementsResult value) {
            this.updateReportAcknowledgementsResult = value;
        }

        public boolean isSetUpdateReportAcknowledgementsResult() {
            return (this.updateReportAcknowledgementsResult!= null);
        }

        /**
         * Gets the value of the responseMetadata property.
         *
         * @return
         *     possible object is
         *     {@link ResponseMetadata }
         *
         */
        public ResponseMetadata getResponseMetadata() {
            return responseMetadata;
        }

        /**
         * Sets the value of the responseMetadata property.
         *
         * @param value
         *     allowed object is
         *     {@link ResponseMetadata }
         *
         */
        public void setResponseMetadata(ResponseMetadata value) {
            this.responseMetadata = value;
        }

        public boolean isSetResponseMetadata() {
            return (this.responseMetadata!= null);
        }

        /**
         * Sets the value of the UpdateReportAcknowledgementsResult property.
         *
         * @param value
         * @return
         *     this instance
         */
        public UpdateReportAcknowledgementsResponse withUpdateReportAcknowledgementsResult(UpdateReportAcknowledgementsResult value) {
            setUpdateReportAcknowledgementsResult(value);
            return this;
        }

        /**
         * Sets the value of the ResponseMetadata property.
         *
         * @param value
         * @return
         *     this instance
         */
        public UpdateReportAcknowledgementsResponse withResponseMetadata(ResponseMetadata value) {
            setResponseMetadata(value);
            return this;
        }

        @XmlTransient
        private ResponseHeaderMetadata responseHeaderMetadata;


        public boolean isSetResponseHeaderMetadata() {
            return this.responseHeaderMetadata != null;
        }


        public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
            this.responseHeaderMetadata = responseHeaderMetadata;
        }


        public ResponseHeaderMetadata getResponseHeaderMetadata() {
            return responseHeaderMetadata;
        }

        /**
         *
         * XML string representation of this object
         *
         * @return XML String
         */
        public String toXML() {
            StringBuffer xml = new StringBuffer();
            xml.append("<UpdateReportAcknowledgementsResponse xmlns=\"http://mws.amazonaws.com/doc/2009-01-01/\">");
            if (isSetUpdateReportAcknowledgementsResult()) {
                UpdateReportAcknowledgementsResult updateReportAcknowledgementsResult = getUpdateReportAcknowledgementsResult();
                xml.append("<UpdateReportAcknowledgementsResult>");
                xml.append(updateReportAcknowledgementsResult.toXMLFragment());
                xml.append("</UpdateReportAcknowledgementsResult>");
            }
            if (isSetResponseMetadata()) {
                ResponseMetadata  responseMetadata = getResponseMetadata();
                xml.append("<ResponseMetadata>");
                xml.append(responseMetadata.toXMLFragment());
                xml.append("</ResponseMetadata>");
            }
            xml.append("</UpdateReportAcknowledgementsResponse>");
            return xml.toString();
        }

        /**
         *
         * Escape XML special characters
         */
        private String escapeXML(String string) {
            StringBuffer sb = new StringBuffer();
            int length = string.length();
            for (int i = 0; i < length; ++i) {
                char c = string.charAt(i);
                switch (c) {
                case '&':
                    sb.append("&amp;");
                    break;
                case '<':
                    sb.append("&lt;");
                    break;
                case '>':
                    sb.append("&gt;");
                    break;
                case '\'':
                    sb.append("&#039;");
                    break;
                case '"':
                    sb.append("&quot;");
                    break;
                default:
                    sb.append(c);
                }
            }
            return sb.toString();
        }



        /**
         *
         * JSON string representation of this object
         *
         * @return JSON String
         */
        public String toJSON() {
            StringBuffer json = new StringBuffer();
            json.append("{\"UpdateReportAcknowledgementsResponse\" : {");
            json.append(quoteJSON("@xmlns"));
            json.append(" : ");
            json.append(quoteJSON("http://mws.amazonaws.com/doc/2009-01-01/"));
            boolean first = true;
            json.append(", ");
            if (isSetUpdateReportAcknowledgementsResult()) {
                if (!first) json.append(", ");
                json.append("\"UpdateReportAcknowledgementsResult\" : {");
                UpdateReportAcknowledgementsResult updateReportAcknowledgementsResult = getUpdateReportAcknowledgementsResult();

                json.append(updateReportAcknowledgementsResult.toJSONFragment());
                json.append("}");
                first = false;
            }
            if (isSetResponseMetadata()) {
                if (!first) json.append(", ");
                json.append("\"ResponseMetadata\" : {");
                ResponseMetadata  responseMetadata = getResponseMetadata();

                json.append(responseMetadata.toJSONFragment());
                json.append("}");
                first = false;
            }
            json.append("}");
            json.append("}");
            return json.toString();
        }

        /**
         *
         * Quote JSON string
         */
        private String quoteJSON(String string) {
            StringBuffer sb = new StringBuffer();
            sb.append("\"");
            int length = string.length();
            for (int i = 0; i < length; ++i) {
                char c = string.charAt(i);
                switch (c) {
                case '"':
                    sb.append("\\\"");
                    break;
                case '\\':
                    sb.append("\\\\");
                    break;
                case '/':
                    sb.append("\\/");
                    break;
                case '\b':
                    sb.append("\\b");
                    break;
                case '\f':
                    sb.append("\\f");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
                case '\t':
                    sb.append("\\t");
                    break;
                default:
                    if (c <  ' ') {
                        sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                    } else {
                    sb.append(c);
                    }
                }
            }
            sb.append("\"");
            return sb.toString();
        }


    }

    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ReportIdList" type="{http://mws.amazonaws.com/doc/2009-01-01/}IdList"/>
     *         &lt;element name="Acknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * Generated by AWS Code Generator
     * <p/>
     * Wed Feb 18 13:28:59 PST 2009
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "marketplace",
        "merchant",
        "reportIdList",
        "acknowledged",
        "mwsAuthToken"
    })
    @XmlRootElement(name = "UpdateReportAcknowledgementsRequest")
    public static class UpdateReportAcknowledgementsRequest {

        @XmlElement(name = "Marketplace")
        protected String marketplace;
        @XmlElement(name = "Merchant", required = true)
        protected String merchant;
        @XmlElement(name = "ReportIdList", required = true)
        protected IdList reportIdList;
        @XmlElement(name = "Acknowledged")
        protected Boolean acknowledged;
        @XmlElement(name = "MWSAuthToken")
        protected String mwsAuthToken;
        /**
         * Default constructor
         *
         */
        public UpdateReportAcknowledgementsRequest() {
            super();
        }

        /**
         * Value constructor
         *
         */
        public UpdateReportAcknowledgementsRequest(final String marketplace, final String merchant, final IdList reportIdList, final Boolean acknowledged) {
            this(marketplace, merchant, reportIdList, acknowledged, null);
        }

        public UpdateReportAcknowledgementsRequest(final String marketplace,
                final String merchant,
                final IdList reportIdList,
                final Boolean acknowledged,
                final String mwsAuthToken) {
            this.marketplace = marketplace;
            this.merchant = merchant;
            this.reportIdList = reportIdList;
            this.acknowledged = acknowledged;
            this.mwsAuthToken = mwsAuthToken;
        }

        /**
         * Gets the value of the marketplace property.
         *
         * @deprecated  See {@link #setMarketplace(String)}
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMarketplace() {
            return marketplace;
        }

        /**
         * Sets the value of the marketplace property.
         *
         * @deprecated Not used anymore.  MWS ignores this parameter, but it is left
         * in here for backwards compatibility.
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMarketplace(String value) {
            this.marketplace = value;
        }

        /**
         * @deprecated  See {@link #setMarketplace(String)}
         */
        public boolean isSetMarketplace() {
            return (this.marketplace!= null);
        }

        /**
         * Gets the value of the merchant property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMerchant() {
            return merchant;
        }

        /**
         * Sets the value of the merchant property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMerchant(String value) {
            this.merchant = value;
        }

        public boolean isSetMerchant() {
            return (this.merchant!= null);
        }

        /**
         * Gets the value of the reportIdList property.
         *
         * @return
         *     possible object is
         *     {@link IdList }
         *
         */
        public IdList getReportIdList() {
            return reportIdList;
        }

        /**
         * Sets the value of the reportIdList property.
         *
         * @param value
         *     allowed object is
         *     {@link IdList }
         *
         */
        public void setReportIdList(IdList value) {
            this.reportIdList = value;
        }

        public boolean isSetReportIdList() {
            return (this.reportIdList!= null);
        }

        /**
         * Gets the value of the acknowledged property.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isAcknowledged() {
            return acknowledged;
        }

        /**
         * Sets the value of the acknowledged property.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setAcknowledged(Boolean value) {
            this.acknowledged = value;
        }

        public boolean isSetAcknowledged() {
            return (this.acknowledged!= null);
        }

        /**
         * Gets the value of the mwsAuthToken property.
         *
         * possible object is
         *     {@link String}
         */
        public String getMWSAuthToken() {
            return mwsAuthToken;
        }

        /**
         * Sets the value of the mwsAuthToken property
         * @param authTokenValue
         * 		allowed object is
         * 		{@link String}
         */
        public void setMWSAuthToken(String authTokenValue) {
            this.mwsAuthToken = authTokenValue;
        }

        public boolean isSetMWSAuthToken() {
            return (this.mwsAuthToken!=null);
        }

        /**
         * Sets the value of the Marketplace property.
         *
         * @deprecated  See {@link #setMarketplace(String)}
         * @param value
         * @return
         *     this instance
         */
        public UpdateReportAcknowledgementsRequest withMarketplace(String value) {
            setMarketplace(value);
            return this;
        }

        /**
         * Sets the value of the Merchant property.
         *
         * @param value
         * @return
         *     this instance
         */
        public UpdateReportAcknowledgementsRequest withMerchant(String value) {
            setMerchant(value);
            return this;
        }

        /**
         * Sets the value of the MWSAuthToken property.
         *
         * @param value
         * @return
         *     this instance
         */
        public UpdateReportAcknowledgementsRequest withMWSAuthToken(String value) {
            setMWSAuthToken(value);
            return this;
        }

        /**
         * Sets the value of the ReportIdList property.
         *
         * @param value
         * @return
         *     this instance
         */
        public UpdateReportAcknowledgementsRequest withReportIdList(IdList value) {
            setReportIdList(value);
            return this;
        }

        /**
         * Sets the value of the Acknowledged property.
         *
         * @param value
         * @return
         *     this instance
         */
        public UpdateReportAcknowledgementsRequest withAcknowledged(Boolean value) {
            setAcknowledged(value);
            return this;
        }



        /**
         *
         * JSON fragment representation of this object
         *
         * @return JSON fragment for this object. Name for outer
         * object expected to be set by calling method. This fragment
         * returns inner properties representation only
         *
         */
        protected String toJSONFragment() {
            StringBuffer json = new StringBuffer();
            boolean first = true;
            if (isSetMarketplace()) {
                if (!first) json.append(", ");
                json.append(quoteJSON("Marketplace"));
                json.append(" : ");
                json.append(quoteJSON(getMarketplace()));
                first = false;
            }
            if (isSetMerchant()) {
                if (!first) json.append(", ");
                json.append(quoteJSON("Merchant"));
                json.append(" : ");
                json.append(quoteJSON(getMerchant()));
                first = false;
            }
            if (isSetReportIdList()) {
                if (!first) json.append(", ");
                json.append("\"ReportIdList\" : {");
                IdList  reportIdList = getReportIdList();


                json.append(reportIdList.toJSONFragment());
                json.append("}");
                first = false;
            }
            if (isSetAcknowledged()) {
                if (!first) json.append(", ");
                json.append(quoteJSON("Acknowledged"));
                json.append(" : ");
                json.append(quoteJSON(isAcknowledged() + ""));
                first = false;
            }
            if (isSetMWSAuthToken()) {
                if (!first) json.append(", ");
                json.append(quoteJSON("MWSAuthToken"));
                json.append(" : ");
                json.append(quoteJSON(getMWSAuthToken()));
                first = false;
            }
            return json.toString();
        }

        /**
         *
         * Quote JSON string
         */
        private String quoteJSON(String string) {
            StringBuffer sb = new StringBuffer();
            sb.append("\"");
            int length = string.length();
            for (int i = 0; i < length; ++i) {
                char c = string.charAt(i);
                switch (c) {
                case '"':
                    sb.append("\\\"");
                    break;
                case '\\':
                    sb.append("\\\\");
                    break;
                case '/':
                    sb.append("\\/");
                    break;
                case '\b':
                    sb.append("\\b");
                    break;
                case '\f':
                    sb.append("\\f");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
                case '\t':
                    sb.append("\\t");
                    break;
                default:
                    if (c <  ' ') {
                        sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                    } else {
                    sb.append(c);
                }
            }
            }
            sb.append("\"");
            return sb.toString();
        }


    }
}