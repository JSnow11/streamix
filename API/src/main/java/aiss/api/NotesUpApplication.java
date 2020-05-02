package aiss.api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import aiss.api.resources.LabelResource;
import aiss.api.resources.NoteResource;

public class NotesUpApplication extends Application{
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();
	
	public NotesUpApplication() {
		singletons.add(LabelResource.getInstance());
		singletons.add(NoteResource.getInstance());
	}
	

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
