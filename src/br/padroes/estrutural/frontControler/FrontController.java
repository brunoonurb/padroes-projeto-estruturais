package br.padroes.estrutural.frontControler;

public class FrontController  
{ 
    private Dispatching Dispatching; 
  
    public FrontController() 
    { 
        Dispatching = new Dispatching(); 
    } 
  
    private boolean isAuthenticUser() 
    { 
        System.out.println("Authentication successfull."); 
        return true; 
    } 
  
    private void trackRequest(String request) 
    { 
        System.out.println("Requested View: " + request); 
    } 
  
    public void dispatchRequest(String request) 
    { 
        trackRequest(request); 
        
        if(isAuthenticUser()) 
        { 
            Dispatching.dispatch(request); 
        }     
    } 
}