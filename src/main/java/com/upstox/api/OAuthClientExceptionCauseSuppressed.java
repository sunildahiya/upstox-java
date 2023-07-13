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

package com.upstox.api;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.upstox.api.OAuthClientExceptionCauseStackTrace;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * OAuthClientExceptionCauseSuppressed
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-12T20:29:09.823661+05:30[Asia/Kolkata]")

public class OAuthClientExceptionCauseSuppressed {
  @SerializedName("stackTrace")
  private List<OAuthClientExceptionCauseStackTrace> stackTrace = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("localizedMessage")
  private String localizedMessage = null;

  public OAuthClientExceptionCauseSuppressed stackTrace(List<OAuthClientExceptionCauseStackTrace> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  public OAuthClientExceptionCauseSuppressed addStackTraceItem(OAuthClientExceptionCauseStackTrace stackTraceItem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<OAuthClientExceptionCauseStackTrace>();
    }
    this.stackTrace.add(stackTraceItem);
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @Schema(description = "")
  public List<OAuthClientExceptionCauseStackTrace> getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(List<OAuthClientExceptionCauseStackTrace> stackTrace) {
    this.stackTrace = stackTrace;
  }

  public OAuthClientExceptionCauseSuppressed message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OAuthClientExceptionCauseSuppressed localizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
    return this;
  }

   /**
   * Get localizedMessage
   * @return localizedMessage
  **/
  @Schema(description = "")
  public String getLocalizedMessage() {
    return localizedMessage;
  }

  public void setLocalizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthClientExceptionCauseSuppressed oauthClientExceptionCauseSuppressed = (OAuthClientExceptionCauseSuppressed) o;
    return Objects.equals(this.stackTrace, oauthClientExceptionCauseSuppressed.stackTrace) &&
        Objects.equals(this.message, oauthClientExceptionCauseSuppressed.message) &&
        Objects.equals(this.localizedMessage, oauthClientExceptionCauseSuppressed.localizedMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stackTrace, message, localizedMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthClientExceptionCauseSuppressed {\n");
    
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
