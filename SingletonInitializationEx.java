package assignmentByMudit;

class EagerInitialize {
	public static EagerInitialize instance = new EagerInitialize();
	
	public String s;
	
	private EagerInitialize() {
		s = "Hello! you are using singleton class with Eager Initialization";
	}
	
	public static EagerInitialize createInstance() 
    { 
        if (instance == null) 
            instance = new EagerInitialize(); 
  
        return instance; 
    } 
}

class LazyInitialization {
	
	public static LazyInitialization instance;
	
	public String s = "Hello! you are using singleton class with Lazy Initialization";
	
	public static LazyInitialization createInstance() 
    { 
        if (instance == null) 
            instance = new LazyInitialization(); 
  
        return instance; 
    } 
}

class ThreadSafeInitialization {
	
	public static ThreadSafeInitialization instance;
	
	public String s = "Hello! you are using singleton class with Thread Safe Initialization";
	
	public static synchronized ThreadSafeInitialization createInstance() 
    { 
        if (instance == null) 
            instance = new ThreadSafeInitialization(); 
  
        return instance; 
    } 
}

public class SingletonInitializationEx {

	public static void main(String[] args) {

		EagerInitialize e = EagerInitialize.createInstance();
		System.out.println(e.s);
		
		LazyInitialization l = LazyInitialization.createInstance();
		System.out.println(l.s);
		
		ThreadSafeInitialization t = ThreadSafeInitialization.createInstance();
		System.out.println(t.s); 

	}

}