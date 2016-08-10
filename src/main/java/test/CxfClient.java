package test;


public class CxfClient {
	// <?xml version="1.0" encoding="utf-8" standalone="no" ?>
	// <ROOT>
	// <head>
	// <bipcode>BIP_SG_021</bipcode>
	// <actioncode>ACT_SG_021</actioncode>
	// <ret_code/><ret_msg/>
	// </head>
	// <body>
	// <iOp_Code>1501</iOp_Code>
	// <iLogin_No>" + iLogin_No + "</iLogin_No>
	// <iCust_Id>" + iCust_Id + "</iCust_Id>
	// <orgCode>" + orgCode + "</orgCode>
	// </body>
	// </ROOT>
	public static void main(String[] args) {
		String address = "http://192.130.228.19:9099/adapter/services/wsadapter"; // 此处最好用系统参数
		// JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();
		// bean.setAddress(address);
		// bean.getInInterceptors().add(new LoggingInInterceptor());
		// bean.getOutInterceptors().add(new LoggingOutInterceptor());
		// bean.setServiceClass(MainServicePortType.class);
		// MainServicePortType ws = (MainServicePortType) bean.create();
		// String sb =
		// "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\" ?><ROOT><head><bipcode>BIP_SG_021</bipcode><actioncode>ACT_SG_021</actioncode><ret_code/><ret_msg/></head><body><iOp_Code>1501</iOp_Code><iLogin_No>"
		// + "</iLogin_No><iCust_Id>"
		// + "</iCust_Id><orgCode>"
		// + "</orgCode></body></ROOT>";
		// // System.out.println(ws.callService(sb).toString());
		// sb =
		// "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\" ?><ROOT><head><bipcode>BIP_SG_004</bipcode><actioncode>ACT_SG_004</actioncode> <ret_code/> <ret_msg/> </head> <body> <phone_no>65501984</phone_no> <id_no>11004945420</id_no><loginNo>Z9MA50</loginNo></body></ROOT>";
		// ws.callService(sb);
	}

}
