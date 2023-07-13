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
import java.util.ArrayList;
import java.util.List;
/**
 * Response data for user profile
 */
@Schema(description = "Response data for user profile")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-12T20:29:09.823661+05:30[Asia/Kolkata]")

public class ProfileData {
  @SerializedName("email")
  private String email = null;

  /**
   * Lists the exchanges to which the user has access
   */
  @JsonAdapter(ExchangesEnum.Adapter.class)
  public enum ExchangesEnum {
    @SerializedName("NSE")
    NSE("NSE"),
    @SerializedName("NFO")
    NFO("NFO"),
    @SerializedName("CDS")
    CDS("CDS"),
    @SerializedName("BSE")
    BSE("BSE"),
    @SerializedName("BCD")
    BCD("BCD"),
    @SerializedName("MCX")
    MCX("MCX");

    private String value;

    ExchangesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ExchangesEnum fromValue(String input) {
      for (ExchangesEnum b : ExchangesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ExchangesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExchangesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ExchangesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ExchangesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("exchanges")
  private List<ExchangesEnum> exchanges = null;

  /**
   * Lists the products types to which the user has access
   */
  @JsonAdapter(ProductsEnum.Adapter.class)
  public enum ProductsEnum {
    @SerializedName("I")
    I("I"),
    @SerializedName("D")
    D("D"),
    @SerializedName("CO")
    CO("CO"),
    @SerializedName("OCO")
    OCO("OCO"),
    @SerializedName("MTF")
    MTF("MTF");

    private String value;

    ProductsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProductsEnum fromValue(String input) {
      for (ProductsEnum b : ProductsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProductsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductsEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProductsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProductsEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("products")
  private List<ProductsEnum> products = null;

  @SerializedName("broker")
  private String broker = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("user_name")
  private String userName = null;

  /**
   * Order types enabled for the user
   */
  @JsonAdapter(OrderTypesEnum.Adapter.class)
  public enum OrderTypesEnum {
    @SerializedName("MARKET")
    MARKET("MARKET"),
    @SerializedName("LIMIT")
    LIMIT("LIMIT"),
    @SerializedName("SL")
    SL("SL"),
    @SerializedName("SL-M")
    SL_M("SL-M");

    private String value;

    OrderTypesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OrderTypesEnum fromValue(String input) {
      for (OrderTypesEnum b : OrderTypesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OrderTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderTypesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OrderTypesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OrderTypesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("order_types")
  private List<OrderTypesEnum> orderTypes = null;

  @SerializedName("user_type")
  private String userType = null;

  @SerializedName("poa")
  private Boolean poa = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

   /**
   * E-mail address of the user
   * @return email
  **/
  @Schema(example = "client@email.com", description = "E-mail address of the user")
  public String getEmail() {
    return email;
  }

   /**
   * Lists the exchanges to which the user has access
   * @return exchanges
  **/
  @Schema(example = "NSE", description = "Lists the exchanges to which the user has access")
  public List<ExchangesEnum> getExchanges() {
    return exchanges;
  }

   /**
   * Lists the products types to which the user has access
   * @return products
  **/
  @Schema(example = "D", description = "Lists the products types to which the user has access")
  public List<ProductsEnum> getProducts() {
    return products;
  }

   /**
   * The broker ID
   * @return broker
  **/
  @Schema(example = "UPSTOX", description = "The broker ID")
  public String getBroker() {
    return broker;
  }

   /**
   * Uniquely identifies the user
   * @return userId
  **/
  @Schema(example = "202251", description = "Uniquely identifies the user")
  public String getUserId() {
    return userId;
  }

   /**
   * Name of the user
   * @return userName
  **/
  @Schema(example = "client", description = "Name of the user")
  public String getUserName() {
    return userName;
  }

   /**
   * Order types enabled for the user
   * @return orderTypes
  **/
  @Schema(example = "LIMIT", description = "Order types enabled for the user")
  public List<OrderTypesEnum> getOrderTypes() {
    return orderTypes;
  }

   /**
   *   Identifies the user&#x27;s registered role at the broker. This will be individual for all retail users
   * @return userType
  **/
  @Schema(example = "individual", description = "  Identifies the user's registered role at the broker. This will be individual for all retail users")
  public String getUserType() {
    return userType;
  }

   /**
   *   To depict if the user has given power of attorney for transactions
   * @return poa
  **/
  @Schema(example = "true", description = "  To depict if the user has given power of attorney for transactions")
  public Boolean isPoa() {
    return poa;
  }

   /**
   *   Whether the status of account is active or not
   * @return isActive
  **/
  @Schema(example = "true", description = "  Whether the status of account is active or not")
  public Boolean isIsActive() {
    return isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileData profileData = (ProfileData) o;
    return Objects.equals(this.email, profileData.email) &&
        Objects.equals(this.exchanges, profileData.exchanges) &&
        Objects.equals(this.products, profileData.products) &&
        Objects.equals(this.broker, profileData.broker) &&
        Objects.equals(this.userId, profileData.userId) &&
        Objects.equals(this.userName, profileData.userName) &&
        Objects.equals(this.orderTypes, profileData.orderTypes) &&
        Objects.equals(this.userType, profileData.userType) &&
        Objects.equals(this.poa, profileData.poa) &&
        Objects.equals(this.isActive, profileData.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, exchanges, products, broker, userId, userName, orderTypes, userType, poa, isActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileData {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    exchanges: ").append(toIndentedString(exchanges)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    orderTypes: ").append(toIndentedString(orderTypes)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    poa: ").append(toIndentedString(poa)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
