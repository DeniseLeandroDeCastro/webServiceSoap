

public class MyFirstSOAPWebServiceProxy implements br.edu.ifrn.ws.soap.MyFirstSOAPWebService {
  private String _endpoint = null;
  private br.edu.ifrn.ws.soap.MyFirstSOAPWebService myFirstSOAPWebService = null;
  
  public MyFirstSOAPWebServiceProxy() {
    _initMyFirstSOAPWebServiceProxy();
  }
  
  public MyFirstSOAPWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMyFirstSOAPWebServiceProxy();
  }
  
  private void _initMyFirstSOAPWebServiceProxy() {
    try {
      myFirstSOAPWebService = (new br.edu.ifrn.ws.soap.MyFirstSOAPWebServiceServiceLocator()).getMyFirstSOAPWebServicePort();
      if (myFirstSOAPWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)myFirstSOAPWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)myFirstSOAPWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (myFirstSOAPWebService != null)
      ((javax.xml.rpc.Stub)myFirstSOAPWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.edu.ifrn.ws.soap.MyFirstSOAPWebService getMyFirstSOAPWebService() {
    if (myFirstSOAPWebService == null)
      _initMyFirstSOAPWebServiceProxy();
    return myFirstSOAPWebService;
  }
  
  public java.lang.String[] getMinhaPrimeiraLista() throws java.rmi.RemoteException{
    if (myFirstSOAPWebService == null)
      _initMyFirstSOAPWebServiceProxy();
    return myFirstSOAPWebService.getMinhaPrimeiraLista();
  }
  
  public java.lang.String ping(java.lang.String nome) throws java.rmi.RemoteException{
    if (myFirstSOAPWebService == null)
      _initMyFirstSOAPWebServiceProxy();
    return myFirstSOAPWebService.ping(nome);
  }
  
  public br.edu.ifrn.ws.soap.Carro[] getMeusCarros() throws java.rmi.RemoteException{
    if (myFirstSOAPWebService == null)
      _initMyFirstSOAPWebServiceProxy();
    return myFirstSOAPWebService.getMeusCarros();
  }
  
  
}