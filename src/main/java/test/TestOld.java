package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import old.CallService;
import old.CallServiceResponse;
import old.MainServiceLocator;

public class TestOld {
	public static void main(String[] args) throws RemoteException,
			MalformedURLException, ServiceException {
		String webervice_address = "http://192.130.228.19:9099/adapter/services/wsadapter";
		MainServiceLocator service = new MainServiceLocator();
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\" ?><ROOT><head><bipcode>"
				+ "BIP_SG_004"
				+ "</bipcode><actioncode>"
				+ "ACT_SG_004"
				+ "</actioncode> <ret_code/> <ret_msg/> </head> <body> <phone_no>"
				+ "65501984"
				+ "</phone_no> <id_no>"
				+ "11004945420"
				+ "</id_no><loginNo>" + "Z9MA50" + "</loginNo></body></ROOT>");

		CallService param = new CallService(sb.toString());
		CallServiceResponse ret = service.getMainServicePort(
				new URL(webervice_address)).callService(param);
		System.out.println(ret.getSvcCont());
	}

}
