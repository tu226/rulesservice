package life.genny.rules;

import java.util.HashMap;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import io.vertx.core.json.JsonObject;
import life.genny.qwanda.message.QEventAttributeValueChangeMessage;
import life.genny.qwanda.message.QEventMessage;

public class RulesTest {
	
	 static KieServices ks = KieServices.Factory.get();
	 static KieContainer kContainer;
	 static KieSession kSession;

	
	 @Before
	 public void init() {	   
	   kContainer = ks.getKieClasspathContainer();
	    kSession = kContainer.newKieSession("ksession-rules");

//	    kSession.setGlobal("REACT_APP_QWANDA_API_URL", qwandaApiUrl);
//	    kSession.setGlobal("REACT_APP_VERTX_URL", vertxUrl);
//	    kSession.setGlobal("KEYCLOAKIP", hostIp);
	    	
	 }
	 
	 /*	@Test
	public void entity_attribute_change() {
		
		System.out.println("JUNit Test");
		
        final Map<String, String> keyValue = new HashMap<String, String>();
       // QEventAttributeValueChangeMessage evtMsg = new 
      // QEventAttributeValueChangeMessage("PER_USER1","PER_USER1", "PRI_FIRSTNAME", "Sudan", "Sudan", null);
       JsonObject dataObj = new JsonObject();
           dataObj.put("code", "PRI_FIRSTNAME");
        JsonObject obj = new JsonObject();
           obj.put("msg_type", "EVT_MSG");
           obj.put("event_type", "EVT_ATTRIBUTE_VALUE_CHANGE");
           obj.put("sourceBaseEntityCode", "PER_USER1");
           obj.put("targetBaseEntityCode", "PER_USER1");
           obj.put("oldValue", "Sudan");
           obj.put("newValue", "Sudan");
           obj.put("token", "null");
           obj.put("data", dataObj);
        

        		   
	    keyValue.put("token", null);
	    kSession.insert(keyValue);
     //   kSession.insert(evtMsg);
//	    kSession.insert(roles);
//	    kSession.insert(bus);
//	    kSession.insert(eventMsg);
		kSession.fireAllRules();  		
		
	}
	
	
*/	
	

}
