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

import com.upstox.ApiCallback;
import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.ApiResponse;
import com.upstox.Configuration;
import com.upstox.Pair;
import com.upstox.ProgressRequestBody;
import com.upstox.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.upstox.api.ApiGatewayErrorResponse;
import com.upstox.api.GetBrokerageResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChargeApi {
    private ApiClient apiClient;

    public ChargeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChargeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getBrokerage
     * @param instrumentToken Key of the instrument (required)
     * @param quantity Quantity with which the order is to be placed (required)
     * @param product Product with which the order is to be placed (required)
     * @param transactionType Indicates whether its a BUY or SELL order (required)
     * @param price Price with which the order is to be placed (required)
     * @param apiVersion API Version Header (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBrokerageCall(String instrumentToken, Integer quantity, String product, String transactionType, Float price, String apiVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/charges/brokerage";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (instrumentToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("instrument_token", instrumentToken));
        if (quantity != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("quantity", quantity));
        if (product != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("product", product));
        if (transactionType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("transaction_type", transactionType));
        if (price != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price", price));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiVersion != null)
        localVarHeaderParams.put("Api-Version", apiClient.parameterToString(apiVersion));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAUTH2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBrokerageValidateBeforeCall(String instrumentToken, Integer quantity, String product, String transactionType, Float price, String apiVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'instrumentToken' is set
        if (instrumentToken == null) {
            throw new ApiException("Missing the required parameter 'instrumentToken' when calling getBrokerage(Async)");
        }
        // verify the required parameter 'quantity' is set
        if (quantity == null) {
            throw new ApiException("Missing the required parameter 'quantity' when calling getBrokerage(Async)");
        }
        // verify the required parameter 'product' is set
        if (product == null) {
            throw new ApiException("Missing the required parameter 'product' when calling getBrokerage(Async)");
        }
        // verify the required parameter 'transactionType' is set
        if (transactionType == null) {
            throw new ApiException("Missing the required parameter 'transactionType' when calling getBrokerage(Async)");
        }
        // verify the required parameter 'price' is set
        if (price == null) {
            throw new ApiException("Missing the required parameter 'price' when calling getBrokerage(Async)");
        }
        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException("Missing the required parameter 'apiVersion' when calling getBrokerage(Async)");
        }
        
        com.squareup.okhttp.Call call = getBrokerageCall(instrumentToken, quantity, product, transactionType, price, apiVersion, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Brokerage details
     * Compute Brokerage Charges
     * @param instrumentToken Key of the instrument (required)
     * @param quantity Quantity with which the order is to be placed (required)
     * @param product Product with which the order is to be placed (required)
     * @param transactionType Indicates whether its a BUY or SELL order (required)
     * @param price Price with which the order is to be placed (required)
     * @param apiVersion API Version Header (required)
     * @return GetBrokerageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetBrokerageResponse getBrokerage(String instrumentToken, Integer quantity, String product, String transactionType, Float price, String apiVersion) throws ApiException {
        ApiResponse<GetBrokerageResponse> resp = getBrokerageWithHttpInfo(instrumentToken, quantity, product, transactionType, price, apiVersion);
        return resp.getData();
    }

    /**
     * Brokerage details
     * Compute Brokerage Charges
     * @param instrumentToken Key of the instrument (required)
     * @param quantity Quantity with which the order is to be placed (required)
     * @param product Product with which the order is to be placed (required)
     * @param transactionType Indicates whether its a BUY or SELL order (required)
     * @param price Price with which the order is to be placed (required)
     * @param apiVersion API Version Header (required)
     * @return ApiResponse&lt;GetBrokerageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetBrokerageResponse> getBrokerageWithHttpInfo(String instrumentToken, Integer quantity, String product, String transactionType, Float price, String apiVersion) throws ApiException {
        com.squareup.okhttp.Call call = getBrokerageValidateBeforeCall(instrumentToken, quantity, product, transactionType, price, apiVersion, null, null);
        Type localVarReturnType = new TypeToken<GetBrokerageResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Brokerage details (asynchronously)
     * Compute Brokerage Charges
     * @param instrumentToken Key of the instrument (required)
     * @param quantity Quantity with which the order is to be placed (required)
     * @param product Product with which the order is to be placed (required)
     * @param transactionType Indicates whether its a BUY or SELL order (required)
     * @param price Price with which the order is to be placed (required)
     * @param apiVersion API Version Header (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBrokerageAsync(String instrumentToken, Integer quantity, String product, String transactionType, Float price, String apiVersion, final ApiCallback<GetBrokerageResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getBrokerageValidateBeforeCall(instrumentToken, quantity, product, transactionType, price, apiVersion, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetBrokerageResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
