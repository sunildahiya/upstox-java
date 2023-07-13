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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OAuthClientExceptionCauseStackTrace
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-12T20:29:09.823661+05:30[Asia/Kolkata]")

public class OAuthClientExceptionCauseStackTrace {
  @SerializedName("classLoaderName")
  private String classLoaderName = null;

  @SerializedName("moduleName")
  private String moduleName = null;

  @SerializedName("moduleVersion")
  private String moduleVersion = null;

  @SerializedName("methodName")
  private String methodName = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("lineNumber")
  private Integer lineNumber = null;

  @SerializedName("className")
  private String className = null;

  @SerializedName("nativeMethod")
  private Boolean nativeMethod = null;

  public OAuthClientExceptionCauseStackTrace classLoaderName(String classLoaderName) {
    this.classLoaderName = classLoaderName;
    return this;
  }

   /**
   * Get classLoaderName
   * @return classLoaderName
  **/
  @Schema(description = "")
  public String getClassLoaderName() {
    return classLoaderName;
  }

  public void setClassLoaderName(String classLoaderName) {
    this.classLoaderName = classLoaderName;
  }

  public OAuthClientExceptionCauseStackTrace moduleName(String moduleName) {
    this.moduleName = moduleName;
    return this;
  }

   /**
   * Get moduleName
   * @return moduleName
  **/
  @Schema(description = "")
  public String getModuleName() {
    return moduleName;
  }

  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
  }

  public OAuthClientExceptionCauseStackTrace moduleVersion(String moduleVersion) {
    this.moduleVersion = moduleVersion;
    return this;
  }

   /**
   * Get moduleVersion
   * @return moduleVersion
  **/
  @Schema(description = "")
  public String getModuleVersion() {
    return moduleVersion;
  }

  public void setModuleVersion(String moduleVersion) {
    this.moduleVersion = moduleVersion;
  }

  public OAuthClientExceptionCauseStackTrace methodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

   /**
   * Get methodName
   * @return methodName
  **/
  @Schema(description = "")
  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public OAuthClientExceptionCauseStackTrace fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @Schema(description = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public OAuthClientExceptionCauseStackTrace lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Get lineNumber
   * @return lineNumber
  **/
  @Schema(description = "")
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public OAuthClientExceptionCauseStackTrace className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @Schema(description = "")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public OAuthClientExceptionCauseStackTrace nativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
    return this;
  }

   /**
   * Get nativeMethod
   * @return nativeMethod
  **/
  @Schema(description = "")
  public Boolean isNativeMethod() {
    return nativeMethod;
  }

  public void setNativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthClientExceptionCauseStackTrace oauthClientExceptionCauseStackTrace = (OAuthClientExceptionCauseStackTrace) o;
    return Objects.equals(this.classLoaderName, oauthClientExceptionCauseStackTrace.classLoaderName) &&
        Objects.equals(this.moduleName, oauthClientExceptionCauseStackTrace.moduleName) &&
        Objects.equals(this.moduleVersion, oauthClientExceptionCauseStackTrace.moduleVersion) &&
        Objects.equals(this.methodName, oauthClientExceptionCauseStackTrace.methodName) &&
        Objects.equals(this.fileName, oauthClientExceptionCauseStackTrace.fileName) &&
        Objects.equals(this.lineNumber, oauthClientExceptionCauseStackTrace.lineNumber) &&
        Objects.equals(this.className, oauthClientExceptionCauseStackTrace.className) &&
        Objects.equals(this.nativeMethod, oauthClientExceptionCauseStackTrace.nativeMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classLoaderName, moduleName, moduleVersion, methodName, fileName, lineNumber, className, nativeMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthClientExceptionCauseStackTrace {\n");
    
    sb.append("    classLoaderName: ").append(toIndentedString(classLoaderName)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
    sb.append("    moduleVersion: ").append(toIndentedString(moduleVersion)).append("\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    nativeMethod: ").append(toIndentedString(nativeMethod)).append("\n");
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
