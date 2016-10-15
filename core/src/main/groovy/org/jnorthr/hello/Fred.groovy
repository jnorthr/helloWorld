package org.jnorthr.hello;
public class Fred{
    String namex=null;
    Date dob=new Date();
    Integer age=0;
    public String greet(final String name) {
        return "Hello " + (name != null ? name : "stranger") + ". Greeting from Fred.groovy.";
    }
    
    public push(final String name)
    {
    	namex = name;
    }
    
    public int size()
    {
    	return age;
    }
    
    public static void main(String[] args)
    {
    	println "\n-------------------------------"
    	Fred f = new Fred();
    	f.namex="jim";
    	f.age=39;
    	f.dob = new Date();
    	String nm = (args.length > 0) ? args[0] : null;
    	println f.greet(nm);
    	println "---------------------------------\n"
    } // end of main
}

