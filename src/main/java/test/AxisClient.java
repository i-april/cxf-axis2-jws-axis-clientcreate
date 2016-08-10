package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import axis.MainServiceBingdingStub;
import axis.MainServiceLocator;

public class AxisClient {

	public static void main(String[] args) throws ServiceException,
			RemoteException, MalformedURLException {

		String webervice_address = "http://192.130.228.19:9099/adapter/services/wsadapter";
		String sb = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\" ?><ROOT><head><bipcode>BIP_SG_004</bipcode><actioncode>ACT_SG_004</actioncode> <ret_code/> <ret_msg/> </head> <body> <phone_no>65501984</phone_no> <id_no>11004945420</id_no><loginNo>Z9MA50</loginNo></body></ROOT>";

		MainServiceLocator locator = new MainServiceLocator();

		MainServiceBingdingStub port = (MainServiceBingdingStub) locator
				.getMainServicePort(new URL(webervice_address));

		System.out.println(port.callService(sb));
	}

}
