package com.traveliko.platform.ws.siteminder;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.13
 * 2017-07-25T16:33:31.564+05:00
 * Generated source version: 3.0.13
 * 
 */
@WebService(targetNamespace = "https://www.siteminder.com.au:443/siteconnect", name = "SiteConnectService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SiteConnectService {

    @WebMethod(operationName = "HotelResNotifRQ", action = "http://www.siteminder.com.au/siteconnect/HotelResNotifRQ")
    @WebResult(name = "OTA_HotelResNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelResNotifRS")
    public OTAHotelResNotifRS hotelResNotifRQ(
        @WebParam(partName = "OTA_HotelResNotifRQ", name = "OTA_HotelResNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
        OTAHotelResNotifRQ otaHotelResNotifRQ
    );

    @WebMethod(operationName = "HotelAvailNotifRQ", action = "http://www.siteminder.com.au/siteconnect/HotelAvailNotifRQ")
    @WebResult(name = "OTA_HotelAvailNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelAvailNotifRS")
    public MessageAcknowledgementType hotelAvailNotifRQ(
        @WebParam(partName = "OTA_HotelAvailNotifRQ", name = "OTA_HotelAvailNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
        OTAHotelAvailNotifRQ otaHotelAvailNotifRQ
    );

    @WebMethod(operationName = "HotelRateAmountNotifRQ", action = "http://www.siteminder.com.au/siteconnect/HotelRateAmountNotifRQ")
    @WebResult(name = "OTA_HotelRateAmountNotifRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelRateAmountNotifRS")
    public MessageAcknowledgementType hotelRateAmountNotifRQ(
        @WebParam(partName = "OTA_HotelRateAmountNotifRQ", name = "OTA_HotelRateAmountNotifRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
        OTAHotelRateAmountNotifRQ otaHotelRateAmountNotifRQ
    );

    @WebMethod(operationName = "HotelAvailRQ", action = "http://www.siteminder.com.au/siteconnect/HotelAvailRQ")
    @WebResult(name = "OTA_HotelAvailRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "OTA_HotelAvailRS")
    public OTAHotelAvailRS hotelAvailRQ(
        @WebParam(partName = "OTA_HotelAvailRQ", name = "OTA_HotelAvailRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
        OTAHotelAvailRQ otaHotelAvailRQ
    );
}
