package aiss.api;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

import aiss.api.resources.LabelResource;
import aiss.api.resources.NoteResource;

public class NotesUpApp extends Application{
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();

	// Loads all resources that are implemented in the application
	// so that they can be found by RESTEasy.
	public NotesUPApp() {

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
