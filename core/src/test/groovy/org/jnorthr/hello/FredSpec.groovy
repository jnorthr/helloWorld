package org.jnorthr.hello;
import spock.lang.Specification
 
class fredSpec extends Specification {
    //Fields
	//Fixture methods - all of these are optional
	def setup() {}          // run before every feature method
	def cleanup() {}        // run after every feature method
	def setupSpec() {}     // run before the first feature method
	def cleanupSpec() {}   // run after the last feature method     //Feature methods
    //Helper methods 
    
    // Feature Method 1
	def "pushing an element on the stack"() 
	{
  		// blocks go here
  		setup:
			def stack = new Fred()
			def elem = "push me"
		when:
			stack.push(elem)

		then:
			stack!=null
			stack.size() == 0
			stack.greet() == "Hello stranger. Greeting from Fred.groovy."
			println "Value = [${stack.greet()}]"
	} // end of Feature Method 1
	
} // end of class