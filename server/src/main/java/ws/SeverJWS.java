package ws;

import javax.xml.ws.Endpoint;

public class SeverJWS {
    public static void main(String[] args) {
        /// http://localhost:8786/?wsdl ///
        String url="http://localhost:8786/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service déployé sur "+url);
    }
}
