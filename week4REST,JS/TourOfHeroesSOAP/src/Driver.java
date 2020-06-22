import javax.xml.ws.Endpoint;

import com.revature.tourofheroes.menu.MainMenu;
import com.revature.tourofheroes.service.HeroServiceImpl;


public class Driver {
//Class scope
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new keyword allocates space
		
		//MainMenu menu = new MainMenu();
		//menu.start();
		
		Endpoint.publish("http://localhost:9999/service", new HeroServiceImpl());
		
	}

}
