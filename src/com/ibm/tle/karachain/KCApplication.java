package com.ibm.tle.karachain;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.ibm.tle.karachain.resource.KCResource;


public class KCApplication extends Application{
	public KCApplication(){}
	private Set<Class<?>> classes = null;
	
	 @Override
	    public Set<Class<?>> getClasses() {
	       
	        try {
	            if (classes == null) {
	                classes = new HashSet<Class<?>>();
	                classes.add(KCResource.class);
	                
	            }
	            return classes;
	        } finally {
	            
	        }
	    }

}
