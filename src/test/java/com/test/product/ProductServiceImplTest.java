package com.test.product;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.apache.cxf.message.MessageContentsList;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.test.example.GetProductTypeByName;
import org.test.example.GetProductTypeByNameResponse;

public class ProductServiceImplTest  extends CamelSpringTestSupport {

	@Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/spring/CamelContext.xml");
    }
	
	@Test
    public void testGetProductTypeByName() throws Exception {

        GetProductTypeByName searchProduct = new GetProductTypeByName();
        searchProduct.setName("TestProductType");

        MessageContentsList reply = (MessageContentsList) template.requestBodyAndHeader("cxf:bean:productWS", searchProduct, "operationName", "getProductTypeByName");
        GetProductTypeByNameResponse productType = (GetProductTypeByNameResponse)reply.get(0);
        assertEquals(productType.getProductType().get(0).getName(), "TestProductType");

    }
}
