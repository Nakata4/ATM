package Pack;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import com.server.wsdl.Service;

public class Service_Service
extends javax.xml.ws.Service
{

private final static URL SERVICE_WSDL_LOCATION;
private final static WebServiceException SERVICE_EXCEPTION;
private final static QName SERVICE_QNAME = new QName("http://service.server.com/", "service");

static {
    URL url = null;
    WebServiceException e = null;
    try {
        url = new URL("http://localhost:8080/soapwebservice/service?WSDL");
    } catch (MalformedURLException ex) {
        e = new WebServiceException(ex);
    }
    SERVICE_WSDL_LOCATION = url;
    SERVICE_EXCEPTION = e;
}

public Service_Service() {
    super(__getWsdlLocation(), SERVICE_QNAME);
}

public Service_Service(WebServiceFeature... features) {
    super(__getWsdlLocation(), SERVICE_QNAME, features);
}

public Service_Service(URL wsdlLocation) {
    super(wsdlLocation, SERVICE_QNAME);
}

public Service_Service(URL wsdlLocation, WebServiceFeature... features) {
    super(wsdlLocation, SERVICE_QNAME, features);
}

public Service_Service(URL wsdlLocation, QName serviceName) {
    super(wsdlLocation, serviceName);
}

public Service_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
    super(wsdlLocation, serviceName, features);
}

public com.server.wsdl.Service getServicePort() {
    return super.getPort(new QName("http://service.server.com/", "servicePort"), Service.class);
}

public com.server.wsdl.Service getServicePort(WebServiceFeature... features) {
    return super.getPort(new QName("http://service.server.com/", "servicePort"), Service.class, features);
}

private static URL __getWsdlLocation() {
    if (SERVICE_EXCEPTION!= null) {
        throw SERVICE_EXCEPTION;
    }
    return SERVICE_WSDL_LOCATION;
}

}
