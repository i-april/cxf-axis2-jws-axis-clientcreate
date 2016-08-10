package test;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

public class Axis2Client {
	public static void main(String[] args) throws AxisFault {
		String sb = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\" ?><ROOT><head><bipcode>BIP_SG_004</bipcode><actioncode>ACT_SG_004</actioncode> <ret_code/> <ret_msg/> </head> <body> <phone_no>65501984</phone_no> <id_no>11004945420</id_no><loginNo>Z9MA50</loginNo></body></ROOT>";
//		RPCServiceClient ser = new RPCServiceClient();
//		Options options = ser.getOptions();
//
//		// 指定调用WebService的URL
//		EndpointReference targetEPR = new EndpointReference(
//				"http://192.130.228.19:9099/adapter/services/wsadapter");
//		options.setTo(targetEPR);
//		// options.setAction("命名空间/WS 方法名");
//		options.setAction("http://ws.sitech.com/callService");
//
//		// 指定sfexpressService方法的参数值
//		Object[] opAddEntryArgs = new Object[] { sb.toString() };
//		// 指定sfexpressService方法返回值的数据类型的Class对象
//		Class[] classes = new Class[] { String.class };
//		// 指定要调用的sfexpressService方法及WSDL文件的命名空间
//		QName opAddEntry = new QName(
//				"http://ws.sitech.com/",
//				"callService");
//		// 调用sfexpressService方法并输出该方法的返回值
//		Object[] str = ser.invokeBlocking(opAddEntry, opAddEntryArgs, classes);
//		System.out.println(str[0].toString());
		
		
		
	}
}
