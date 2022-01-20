package forms;

import dao.ISmartPhoneRemote;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import dao.IUserRemote;
import entity.User;

public class TestUserClient {
    
   
	
	public static dao.IUserRemote lookUpUserRemote() throws NamingException{
		Hashtable<Object, Object> jndiProperties = new Hashtable<Object, Object>();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		final Context context = new InitialContext(jndiProperties);
		return (IUserRemote) context.lookup("ejb:Application_Tracker_EAR/Application_Tracker/user!dao.IUserRemote");
	}
        public static dao.ISmartPhoneRemote lookUpSmartPhoneRemote() throws NamingException{
		Hashtable<Object, Object> jndiProperties = new Hashtable<Object, Object>();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		final Context context = new InitialContext(jndiProperties);
		return (ISmartPhoneRemote) context.lookup("ejb:Application_Tracker_EAR/Application_Tracker/smartphone!dao.ISmartPhoneRemote");
	}
	
	public static void main(String[] args) throws ParseException {
		try {
			IUserRemote u=lookUpUserRemote();
			//String nom, String prenom, String telephone, String email, Date dateNaissance
			// /training//MyBean!mypackage.MyBeanRemote
			DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
			//u.create(new User("azzouz","youssef","06984554741","azzouz@gmail.com",df.parse("24-12-1996")));
			u.findAll().forEach(x->{System.out.println(x);});
		} catch (NamingException e) {
		}
		
	}

}
