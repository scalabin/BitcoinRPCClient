package com.cdelargy.bitcoin;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RPCClientTest {

  @Test
  public void getinfo() {
	  RPCClient client = new RPCClient();
	  JSONObject json = client.getInfo();
	  Assert.assertNotNull(json);
	  System.out.println(json.toString());
  }
  
  @Test
  public void getnewaddress() {
	  RPCClient client = new RPCClient();
	  String address = client.getNewAddress("address-label");
	  Assert.assertNotNull(address);
	  System.out.println("new address: " + address);
  }
  
  @Test
  public void getbalance() {
	  RPCClient client = new RPCClient();
	  Double balance = client.getBalance("address-label");
	  Assert.assertEquals(balance, 0d);
	  System.out.println("balance: " + balance);
  }
}
