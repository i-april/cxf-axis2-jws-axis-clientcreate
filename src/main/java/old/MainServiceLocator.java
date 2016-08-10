/**
 * MainServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package old;

public class MainServiceLocator extends org.apache.axis.client.Service implements MainService {

    public MainServiceLocator() {
    }


    public MainServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MainServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MainServicePort
    //  private java.lang.String MainServicePort_address = "http://192.130.228.17:9099/adapter/services/wsadapter";  生产地址
    private java.lang.String MainServicePort_address = "http://192.168.228.2:9099/adapter/services/wsadapter";    //测试地址

    public java.lang.String getMainServicePortAddress() {
        return MainServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MainServicePortWSDDServiceName = "MainServicePort";

    public java.lang.String getMainServicePortWSDDServiceName() {
        return MainServicePortWSDDServiceName;
    }

    public void setMainServicePortWSDDServiceName(java.lang.String name) {
        MainServicePortWSDDServiceName = name;
    }

    public MainServicePortType getMainServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MainServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMainServicePort(endpoint);
    }

    public MainServicePortType getMainServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            MainServiceBingdingStub _stub = new MainServiceBingdingStub(portAddress, this);
            _stub.setPortName(getMainServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMainServicePortEndpointAddress(java.lang.String address) {
        MainServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (MainServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                MainServiceBingdingStub _stub = new MainServiceBingdingStub(new java.net.URL(MainServicePort_address), this);
                _stub.setPortName(getMainServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MainServicePort".equals(inputPortName)) {
            return getMainServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.sitech.com", "MainService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.sitech.com", "MainServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MainServicePort".equals(portName)) {
            setMainServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
