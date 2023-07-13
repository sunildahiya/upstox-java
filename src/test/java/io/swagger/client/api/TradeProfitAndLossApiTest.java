/*
 * Upstox Developer API
 * Build your App on the Upstox platform  ![Banner](https://api-v2.upstox.com/api-docs/images/banner.jpg \"banner\")  # Introduction  Upstox API is a set of rest APIs that provide data required to build a complete investment and trading platform. Execute orders in real time, manage user portfolio, stream live market data (using Websocket), and more, with the easy to understand API collection.  All requests are over HTTPS and the requests are sent with the content-type ‘application/json’. Developers have the option of choosing the response type as JSON or CSV for a few API calls.  To be able to use these APIs you need to create an App in the Developer Console and generate your **apiKey** and **apiSecret**. You can use a redirect URL which will be called after the login flow.  If you are a **trader**, you can directly create apps from Upstox mobile app or the desktop platform itself from **Apps** sections inside the **Account** Tab. Head over to <a href=\"http://account.upstox.com/developer/apps\" target=\"_blank\">account.upstox.com/developer/apps</a>.</br> If you are a **business** looking to integrate Upstox APIs, reach out to us and we will get a custom app created for you in no time.  It is highly recommended that you do not embed the **apiSecret** in your frontend app. Create a remote backend which does the handshake on behalf of the frontend app. Marking the apiSecret in the frontend app will make your app vulnerable to threats and potential issues. 
 *
 * OpenAPI spec version: v2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import com.upstox.api.ApiGatewayErrorResponse;
import com.upstox.api.GetProfitAndLossChargesResponse;
import com.upstox.api.GetTradeWiseProfitAndLossDataResponse;
import com.upstox.api.GetTradeWiseProfitAndLossMetaDataResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TradeProfitAndLossApi
 */
@Ignore
public class TradeProfitAndLossApiTest {

    private final TradeProfitAndLossApi api = new TradeProfitAndLossApi();

    /**
     * Get profit and loss on trades
     *
     * This API gives the charges incurred by users for their trades
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProfitAndLossChargesTest() throws Exception {
        String segment = null;
        String financialYear = null;
        String apiVersion = null;
        String fromDate = null;
        String toDate = null;
        GetProfitAndLossChargesResponse response = api.getProfitAndLossCharges(segment, financialYear, apiVersion, fromDate, toDate);

        // TODO: test validations
    }
    /**
     * Get Trade-wise Profit and Loss Report Data
     *
     * This API gives the data of the realised Profit and Loss report requested by a user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTradeWiseProfitAndLossDataTest() throws Exception {
        String segment = null;
        String financialYear = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        String apiVersion = null;
        String fromDate = null;
        String toDate = null;
        GetTradeWiseProfitAndLossDataResponse response = api.getTradeWiseProfitAndLossData(segment, financialYear, pageNumber, pageSize, apiVersion, fromDate, toDate);

        // TODO: test validations
    }
    /**
     * Get profit and loss meta data on trades
     *
     * This API gives the data of the realised Profit and Loss report requested by a user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTradeWiseProfitAndLossMetaDataTest() throws Exception {
        String segment = null;
        String financialYear = null;
        String apiVersion = null;
        String fromDate = null;
        String toDate = null;
        GetTradeWiseProfitAndLossMetaDataResponse response = api.getTradeWiseProfitAndLossMetaData(segment, financialYear, apiVersion, fromDate, toDate);

        // TODO: test validations
    }
}
