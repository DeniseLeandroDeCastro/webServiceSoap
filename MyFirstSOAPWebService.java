/**
 * MyFirstSOAPWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


public interface MyFirstSOAPWebService extends java.rmi.Remote {
    public java.lang.String[] getMinhaPrimeiraLista() throws java.rmi.RemoteException;
    public java.lang.String ping(java.lang.String nome) throws java.rmi.RemoteException;
    public br.edu.ifrn.ws.soap.Carro[] getMeusCarros() throws java.rmi.RemoteException;
}
