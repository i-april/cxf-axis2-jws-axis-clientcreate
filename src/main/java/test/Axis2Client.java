package test;

import java.rmi.RemoteException;

import axis2.com.sitech.ws.MainServiceStub;
import axis2.com.sitech.ws.MainServiceStub.CallService;
import axis2.com.sitech.ws.MainServiceStub.CallServiceResponse;

public class Axis2Client {
	public static void main(String[] args) throws RemoteException {
		String sb = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\" ?><ROOT><head><bipcode>BIP_SG_004</bipcode><actioncode>ACT_SG_004</actioncode> <ret_code/> <ret_msg/> </head> <body> <phone_no>65501984</phone_no> <id_no>11004945420</id_no><loginNo>Z9MA50</loginNo></body></ROOT>";

		String url = "http://192.130.228.19:9099/adapter/services/wsadapter";
		MainServiceStub stub = new MainServiceStub(url);
		CallService request = new CallService();
		request.setSvcCont(sb);
		CallServiceResponse response = stub.callService(request);
		System.out.println(response.getSvcCont());

	}
}
