package br.com.qsd.politeismo.ecommerce.service;

public class ResourceNotFoundException extends RuntimeException{

   private static final long serialVersionUID = 1L;

// exceção quando procuro um id que não existe
   public ResourceNotFoundException(String msg) {
	   super(msg);
   }
}