package com.wmart.postit_drools.driver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wmart.postit_drools.drools.KieFileSystemContainer;
import com.wmart.postit_drools.posit.model.LineItemPojo;
import com.wmart.postit_drools.posit.model.OrderEvent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Drive {
    private static KieFileSystemContainer driver;

    public static void main(String[] args) {
//        KieFileSystemContainer.delta();

        driver = new KieFileSystemContainer(true).setWithDrlStr(true).build();
        try {
            String source = getSouceString();
            transform(source);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }



    }

    public static String getSouceString() throws IOException {
        InputStream is = new FileInputStream(new File("src/main/resources/post_it_source.json"));
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(is, "UTF-8");
        for (; ; ) {
            int rsz = in.read(buffer, 0, buffer.length);
            if (rsz < 0)
                break;
            out.append(buffer, 0, rsz);
        }
        return out.toString();
    }


    public static String transform(String order_event) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        OrderEvent event = mapper.readValue(order_event, OrderEvent.class);

        List<LineItemPojo> inputItems = new ArrayList<>();
        for(int i=0;i<event.getConceptCode().size();i++) {
            LineItemPojo lineItemPojo = new LineItemPojo(event.getBudgetLine().get(i), event.getAssignmentNbr().get(i), event.getQuantityAmount().get(i),
                    event.getQuantityUOM().get(i), event.getTaxtype().get(i), event.getReferenceNbr().get(i), event.getDocInfo().get(i),
                    event.getDetermineTaxBase().get(i), event.getBaseAmount().get(i), event.getJurisdiction().get(i), event.getItem().get(i),
                    event.getDepartment().get(i), event.getLegacyPO().get(i), event.getInternalOrder().get(i), event.getTradingPartner().get(i),
                    event.getBusinessTransaction().get(i), event.getAccountType().get(i), event.getAccountID().get(i), event.getCompany().get(i),
                    event.getProfitCenter().get(i), event.getCostCenter().get(i), event.getCostAmount().get(i), event.getRetailAmount().get(i),
                    event.getConceptCode().get(i), null, event.getAdditionalField1().get(i), event.getAdditionalField2().get(i),
                    event.getAdditionalField3().get(i), event.getAdditionalField4().get(i), event.getAdditionalField5().get(i));
            inputItems.add(lineItemPojo);
        }

        List<LineItemPojo> transformedItems = driver.execute(inputItems);

        //aggregation of line items
        System.out.println("Total count of input line items : " + inputItems.size());
        System.out.println("Total count of transformed line items : " + transformedItems.size());
//        aggregateTransformedObject(i_eventpojo,transformed_list);
//        System.out.println("~~~~"+i_eventpojo.getIn_Reference_To());
//        String response=mapper.writeValueAsString(i_eventpojo);
//        System.out.println(response);
//        return response;
        return "";
    }

}
