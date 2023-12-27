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
 * Response data for holdings
 */
@Schema(description = "Response data for holdings")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-12T20:29:09.823661+05:30[Asia/Kolkata]")

public class HoldingsData {
  @SerializedName("isin")
  private String isin = null;

  @SerializedName("cnc_used_quantity")
  private Integer cncUsedQuantity = null;

  @SerializedName("collateral_type")
  private String collateralType = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("haircut")
  private Float haircut = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("tradingsymbol")
  private String tradingsymbol = null;

  @SerializedName("trading_symbol")
  private String tradingSymbol = null;

  @SerializedName("last_price")
  private Float lastPrice = null;

  @SerializedName("close_price")
  private Float closePrice = null;

  @SerializedName("pnl")
  private Float pnl = null;

  @SerializedName("day_change")
  private Float dayChange = null;

  @SerializedName("day_change_percentage")
  private Float dayChangePercentage = null;

  @SerializedName("instrument_token")
  private String instrumentToken = null;

  @SerializedName("average_price")
  private Float averagePrice = null;

  @SerializedName("collateral_quantity")
  private Integer collateralQuantity = null;

  @SerializedName("collateral_update_quantity")
  private Integer collateralUpdateQuantity = null;

  @SerializedName("t1_quantity")
  private Integer t1Quantity = null;

  /**
   * Exchange of the trading symbol
   */
  @JsonAdapter(ExchangeEnum.Adapter.class)
  public enum ExchangeEnum {
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
    @SerializedName("BFO")
    BFO("BFO"),
    @SerializedName("MCX")
    MCX("MCX");

    private String value;

    ExchangeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ExchangeEnum fromValue(String input) {
      for (ExchangeEnum b : ExchangeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ExchangeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExchangeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ExchangeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ExchangeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("exchange")
  private ExchangeEnum exchange = null;

   /**
   * The standard ISIN representing stocks listed on multiple exchanges
   * @return isin
  **/
  @Schema(example = "INE118H01025", description = "The standard ISIN representing stocks listed on multiple exchanges")
  public String getIsin() {
    return isin;
  }

   /**
   * Quantity either blocked towards open or completed order
   * @return cncUsedQuantity
  **/
  @Schema(example = "0", description = "Quantity either blocked towards open or completed order")
  public Integer getCncUsedQuantity() {
    return cncUsedQuantity;
  }

   /**
   * Category of collateral assigned by RMS
   * @return collateralType
  **/
  @Schema(example = "WC", description = "Category of collateral assigned by RMS")
  public String getCollateralType() {
    return collateralType;
  }

   /**
   * Name of the company
   * @return companyName
  **/
  @Schema(example = "BSE LIM", description = "Name of the company")
  public String getCompanyName() {
    return companyName;
  }

   /**
   * This is the haircut percentage applied from RMS (applicable incase of collateral)
   * @return haircut
  **/
  @Schema(example = "0.23", description = "This is the haircut percentage applied from RMS (applicable incase of collateral)")
  public Float getHaircut() {
    return haircut;
  }

   /**
   * Shows if the order was either Intraday, Delivery, CO or OCO
   * @return product
  **/
  @Schema(example = "D", description = "Shows if the order was either Intraday, Delivery, CO or OCO")
  public String getProduct() {
    return product;
  }

   /**
   * The total holding qty
   * @return quantity
  **/
  @Schema(example = "1", description = "The total holding qty")
  public Integer getQuantity() {
    return quantity;
  }

   /**
   * Shows the trading symbol of the instrument
   * @return tradingsymbol
  **/
  @Schema(example = "BSE", description = "Shows the trading symbol of the instrument")
  public String getTradingsymbol() {
    return tradingsymbol;
  }

   /**
   * Shows the trading symbol of the instrument
   * @return trading_symbol
  **/
  @Schema(example = "BSE", description = "Shows the trading symbol of the instrument")
  public String getTradingSymbol() {
    return tradingSymbol;
  }

   /**
   * The last traded price of the instrument
   * @return lastPrice
  **/
  @Schema(example = "120.01", description = "The last traded price of the instrument")
  public Float getLastPrice() {
    return lastPrice;
  }

   /**
   * Closing price of the instrument from the last trading day
   * @return closePrice
  **/
  @Schema(example = "120.01", description = "Closing price of the instrument from the last trading day")
  public Float getClosePrice() {
    return closePrice;
  }

   /**
   * Profit and Loss
   * @return pnl
  **/
  @Schema(example = "120.01", description = "Profit and Loss")
  public Float getPnl() {
    return pnl;
  }

   /**
   * Day&#x27;s change in absolute value for the stock
   * @return dayChange
  **/
  @Schema(example = "0", description = "Day's change in absolute value for the stock")
  public Float getDayChange() {
    return dayChange;
  }

   /**
   * Day&#x27;s change in percentage for the stock
   * @return dayChangePercentage
  **/
  @Schema(example = "0", description = "Day's change in percentage for the stock")
  public Float getDayChangePercentage() {
    return dayChangePercentage;
  }

   /**
   * Key issued by Upstox for the instrument
   * @return instrumentToken
  **/
  @Schema(example = "151064324", description = "Key issued by Upstox for the instrument")
  public String getInstrumentToken() {
    return instrumentToken;
  }

   /**
   * Average price at which the net holding quantity was acquired
   * @return averagePrice
  **/
  @Schema(example = "120.01", description = "Average price at which the net holding quantity was acquired")
  public Float getAveragePrice() {
    return averagePrice;
  }

   /**
   * Quantity marked as collateral by RMS on users request
   * @return collateralQuantity
  **/
  @Schema(example = "0", description = "Quantity marked as collateral by RMS on users request")
  public Integer getCollateralQuantity() {
    return collateralQuantity;
  }

   /**
   * Get collateralUpdateQuantity
   * @return collateralUpdateQuantity
  **/
  @Schema(example = "0", description = "")
  public Integer getCollateralUpdateQuantity() {
    return collateralUpdateQuantity;
  }

   /**
   * Quantity on T+1 day after order execution
   * @return t1Quantity
  **/
  @Schema(example = "0", description = "Quantity on T+1 day after order execution")
  public Integer getT1Quantity() {
    return t1Quantity;
  }

   /**
   * Exchange of the trading symbol
   * @return exchange
  **/
  @Schema(example = "NSE", description = "Exchange of the trading symbol")
  public ExchangeEnum getExchange() {
    return exchange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoldingsData holdingsData = (HoldingsData) o;
    return Objects.equals(this.isin, holdingsData.isin) &&
        Objects.equals(this.cncUsedQuantity, holdingsData.cncUsedQuantity) &&
        Objects.equals(this.collateralType, holdingsData.collateralType) &&
        Objects.equals(this.companyName, holdingsData.companyName) &&
        Objects.equals(this.haircut, holdingsData.haircut) &&
        Objects.equals(this.product, holdingsData.product) &&
        Objects.equals(this.quantity, holdingsData.quantity) &&
        Objects.equals(this.tradingsymbol, holdingsData.tradingsymbol) &&
        Objects.equals(this.tradingSymbol, holdingsData.tradingSymbol) &&
        Objects.equals(this.lastPrice, holdingsData.lastPrice) &&
        Objects.equals(this.closePrice, holdingsData.closePrice) &&
        Objects.equals(this.pnl, holdingsData.pnl) &&
        Objects.equals(this.dayChange, holdingsData.dayChange) &&
        Objects.equals(this.dayChangePercentage, holdingsData.dayChangePercentage) &&
        Objects.equals(this.instrumentToken, holdingsData.instrumentToken) &&
        Objects.equals(this.averagePrice, holdingsData.averagePrice) &&
        Objects.equals(this.collateralQuantity, holdingsData.collateralQuantity) &&
        Objects.equals(this.collateralUpdateQuantity, holdingsData.collateralUpdateQuantity) &&
        Objects.equals(this.t1Quantity, holdingsData.t1Quantity) &&
        Objects.equals(this.exchange, holdingsData.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isin, cncUsedQuantity, collateralType, companyName, haircut, product, quantity, tradingsymbol, tradingSymbol, lastPrice, closePrice, pnl, dayChange, dayChangePercentage, instrumentToken, averagePrice, collateralQuantity, collateralUpdateQuantity, t1Quantity, exchange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingsData {\n");
    
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    cncUsedQuantity: ").append(toIndentedString(cncUsedQuantity)).append("\n");
    sb.append("    collateralType: ").append(toIndentedString(collateralType)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    haircut: ").append(toIndentedString(haircut)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    tradingsymbol: ").append(toIndentedString(tradingsymbol)).append("\n");
    sb.append("    tradingSymbol: ").append(toIndentedString(tradingSymbol)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    closePrice: ").append(toIndentedString(closePrice)).append("\n");
    sb.append("    pnl: ").append(toIndentedString(pnl)).append("\n");
    sb.append("    dayChange: ").append(toIndentedString(dayChange)).append("\n");
    sb.append("    dayChangePercentage: ").append(toIndentedString(dayChangePercentage)).append("\n");
    sb.append("    instrumentToken: ").append(toIndentedString(instrumentToken)).append("\n");
    sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
    sb.append("    collateralQuantity: ").append(toIndentedString(collateralQuantity)).append("\n");
    sb.append("    collateralUpdateQuantity: ").append(toIndentedString(collateralUpdateQuantity)).append("\n");
    sb.append("    t1Quantity: ").append(toIndentedString(t1Quantity)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
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
