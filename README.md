# spring-form-data-controller

https://www.baeldung.com/spring-mvc-form-tutorial

https://www.programmergate.com/pass-data-from-jsp-to-spring-controller/

There 2 ways of passing form values from JSP to Controller :
1) Passing form value to controller using normal way as in "addAccount()" , path: localhost:8089/
2) Using model attribute to pass data as in "addAccount()" and "showForm()", path: localhost:8089/indexForm


Points to remember :

1)the name of the class fields match exactly the name of the form fields.

The method is defined as “POST” and is set to accept a “AccountForm” object, there is no need to annotate the object, by default Spring will compare the form fields with the class fields, if they don’t match then it throws a “400 Bad Request” error.

Note: Applicable for 1st way
2)
public String submit(
  @Valid @ModelAttribute("employee") Employee employee,
  BindingResult result,
  ModelMap model)
The BindingResult argument needs to be positioned right after our form backing object – it's one of the rare cases where the order of the method arguments matters. Otherwise, we'll run into the following exception:

java.lang.IllegalStateException: 
  Errors/BindingResult argument declared without preceding model attribute. 
    Check your handler method signature!
    
3)Note that if the object called “accountForm” is not added to the model, Spring would complain when we try to access the JSP because the JSP will be set up to bind the form to the “accountForm” model attribute:

java.lang.IllegalStateException: 
  Neither BindingResult nor plain target object 
    for bean name 'employee' available as request attribute
  at o.s.w.s.s.BindStatus.<init>(BindStatus.java:141)
  
  Fix by adding
  
  @RequestMapping(value = "/indexForm", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("indexForm", "accountForm", new AccountForm());//required
	}
    
