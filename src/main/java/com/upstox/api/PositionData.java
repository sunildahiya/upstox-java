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
 * Response data for position details
 */
@Schema(description = "Response data for position details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-12T20:29:09.823661+05:30[Asia/Kolkata]")

public class PositionData {
  /**
   * Exchange to which the order is associated
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

  @SerializedName("multiplier")
  private Float multiplier = null;

  @SerializedName("value")
  private Float value = null;

  @SerializedName("pnl")
  private Float pnl = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("instrument_token")
  private String instrumentToken = null;

  @SerializedName("average_price")
  private Float averagePrice = null;

  @SerializedName("buy_value")
  private Float buyValue = null;

  @SerializedName("overnight_quantity")
  private Integer overnightQuantity = null;

  @SerializedName("day_buy_value")
  private Float dayBuyValue = null;

  @SerializedName("day_buy_price")
  private Float dayBuyPrice = null;

  @SerializedName("overnight_buy_amount")
  private Float overnightBuyAmount = null;

  @SerializedName("overnight_buy_quantity")
  private Integer overnightBuyQuantity = null;

  @SerializedName("day_buy_quantity")
  private Integer dayBuyQuantity = null;

  @SerializedName("day_sell_value")
  private Float daySellValue = null;

  @SerializedName("day_sell_price")
  private Float daySellPrice = null;

  @SerializedName("overnight_sell_amount")
  private Float overnightSellAmount = null;

  @SerializedName("overnight_sell_quantity")
  private Integer overnightSellQuantity = null;

  @SerializedName("day_sell_quantity")
  private Integer daySellQuantity = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("last_price")
  private Float lastPrice = null;

  @SerializedName("unrealised")
  private Float unrealised = null;

  @SerializedName("realised")
  private Float realised = null;

  @SerializedName("sell_value")
  private Float sellValue = null;

  @SerializedName("tradingsymbol")
  private String tradingsymbol = null;

  @SerializedName("trading_symbol")
  private String tradingSymbol = null;

  @SerializedName("close_price")
  private Float closePrice = null;

  @SerializedName("buy_price")
  private Float buyPrice = null;

  @SerializedName("sell_price")
  private Float sellPrice = null;

   /**
   * Exchange to which the order is associated
   * @return exchange
  **/
  @Schema(example = "NSE", description = "Exchange to which the order is associated")
  public ExchangeEnum getExchange() {
    return exchange;
  }

   /**
   * The quantity/lot size multiplier used for calculating P&amp;Ls
   * @return multiplier
  **/
  @Schema(example = "1", description = "The quantity/lot size multiplier used for calculating P&Ls")
  public Float getMultiplier() {
    return multiplier;
  }

   /**
   * Net value of the position
   * @return value
  **/
  @Schema(example = "120", description = "Net value of the position")
  public Float getValue() {
    return value;
  }

   /**
   * Profit and loss - net returns on the position
   * @return pnl
  **/
  @Schema(example = "121.01", description = "Profit and loss - net returns on the position")
  public Float getPnl() {
    return pnl;
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
   * Key issued by Upstox for the instrument
   * @return instrumentToken
  **/
  @Schema(example = "151064324", description = "Key issued by Upstox for the instrument")
  public String getInstrumentToken() {
    return instrumentToken;
  }

   /**
   * Average price at which the net position quantity was acquired
   * @return averagePrice
  **/
  @Schema(example = "120.01", description = "Average price at which the net position quantity was acquired")
  public Float getAveragePrice() {
    return averagePrice;
  }

   /**
   * Net value of the bought quantities
   * @return buyValue
  **/
  @Schema(example = "120", description = "Net value of the bought quantities")
  public Float getBuyValue() {
    return buyValue;
  }

   /**
   * Quantity held previously and carried forward over night
   * @return overnightQuantity
  **/
  @Schema(example = "1", description = "Quantity held previously and carried forward over night")
  public Integer getOvernightQuantity() {
    return overnightQuantity;
  }

   /**
   * Amount at which the quantity is bought during the day
   * @return dayBuyValue
  **/
  @Schema(example = "120.01", description = "Amount at which the quantity is bought during the day")
  public Float getDayBuyValue() {
    return dayBuyValue;
  }

   /**
   * Average price at which the day qty was bought. Default is empty string
   * @return dayBuyPrice
  **/
  @Schema(example = "120.01", description = "Average price at which the day qty was bought. Default is empty string")
  public Float getDayBuyPrice() {
    return dayBuyPrice;
  }

   /**
   * Amount at which the quantity was bought in the previous session
   * @return overnightBuyAmount
  **/
  @Schema(example = "12", description = "Amount at which the quantity was bought in the previous session")
  public Float getOvernightBuyAmount() {
    return overnightBuyAmount;
  }

   /**
   * Quantity bought in the previous session
   * @return overnightBuyQuantity
  **/
  @Schema(example = "12", description = "Quantity bought in the previous session")
  public Integer getOvernightBuyQuantity() {
    return overnightBuyQuantity;
  }

   /**
   * Quantity bought during the day
   * @return dayBuyQuantity
  **/
  @Schema(example = "1", description = "Quantity bought during the day")
  public Integer getDayBuyQuantity() {
    return dayBuyQuantity;
  }

   /**
   * Amount at which the quantity is sold during the day
   * @return daySellValue
  **/
  @Schema(example = "0", description = "Amount at which the quantity is sold during the day")
  public Float getDaySellValue() {
    return daySellValue;
  }

   /**
   * Average price at which the day quantity was sold
   * @return daySellPrice
  **/
  @Schema(example = "0", description = "Average price at which the day quantity was sold")
  public Float getDaySellPrice() {
    return daySellPrice;
  }

   /**
   * Amount at which the quantity was sold in the previous session
   * @return overnightSellAmount
  **/
  @Schema(example = "120.01", description = "Amount at which the quantity was sold in the previous session")
  public Float getOvernightSellAmount() {
    return overnightSellAmount;
  }

   /**
   * Quantity sold short in the previous session
   * @return overnightSellQuantity
  **/
  @Schema(example = "0", description = "Quantity sold short in the previous session")
  public Integer getOvernightSellQuantity() {
    return overnightSellQuantity;
  }

   /**
   * Quantity sold during the day
   * @return daySellQuantity
  **/
  @Schema(example = "0", description = "Quantity sold during the day")
  public Integer getDaySellQuantity() {
    return daySellQuantity;
  }

   /**
   * Quantity left after nullifying Day and CF buy quantity towards Day and CF sell quantity
   * @return quantity
  **/
  @Schema(example = "2", description = "Quantity left after nullifying Day and CF buy quantity towards Day and CF sell quantity")
  public Integer getQuantity() {
    return quantity;
  }

   /**
   * Last traded market price of the instrument
   * @return lastPrice
  **/
  @Schema(example = "120.01", description = "Last traded market price of the instrument")
  public Float getLastPrice() {
    return lastPrice;
  }

   /**
   * Day PnL generated against open positions
   * @return unrealised
  **/
  @Schema(example = "121.01", description = "Day PnL generated against open positions")
  public Float getUnrealised() {
    return unrealised;
  }

   /**
   * Day PnL generated against closed positions
   * @return realised
  **/
  @Schema(example = "0", description = "Day PnL generated against closed positions")
  public Float getRealised() {
    return realised;
  }

   /**
   * Net value of the sold quantities
   * @return sellValue
  **/
  @Schema(example = "0", description = "Net value of the sold quantities")
  public Float getSellValue() {
    return sellValue;
  }

   /**
   * Shows the trading symbol of the instrument
   * @return tradingsymbol
  **/
  @Schema(example = "GMR", description = "Shows the trading symbol of the instrument")
  public String getTradingsymbol() {
    return tradingsymbol;
  }

   /**
   * Shows the trading symbol of the instrument
   * @return tradingSymbol
  **/
  @Schema(example = "GMR", description = "Shows the trading symbol of the instrument")
  public String getTradingSymbol() {
    return tradingSymbol;
  }

   /**
   * Closing price of the instrument from the last trading day
   * @return closePrice
  **/
  @Schema(example = "102.0", description = "Closing price of the instrument from the last trading day")
  public Float getClosePrice() {
    return closePrice;
  }

   /**
   * Average price at which quantities were bought
   * @return buyPrice
  **/
  @Schema(example = "102.0", description = "Average price at which quantities were bought")
  public Float getBuyPrice() {
    return buyPrice;
  }

   /**
   * Average price at which quantities were sold
   * @return sellPrice
  **/
  @Schema(example = "102.0", description = "Average price at which quantities were sold")
  public Float getSellPrice() {
    return sellPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionData positionData = (PositionData) o;
    return Objects.equals(this.exchange, positionData.exchange) &&
        Objects.equals(this.multiplier, positionData.multiplier) &&
        Objects.equals(this.value, positionData.value) &&
        Objects.equals(this.pnl, positionData.pnl) &&
        Objects.equals(this.product, positionData.product) &&
        Objects.equals(this.instrumentToken, positionData.instrumentToken) &&
        Objects.equals(this.averagePrice, positionData.averagePrice) &&
        Objects.equals(this.buyValue, positionData.buyValue) &&
        Objects.equals(this.overnightQuantity, positionData.overnightQuantity) &&
        Objects.equals(this.dayBuyValue, positionData.dayBuyValue) &&
        Objects.equals(this.dayBuyPrice, positionData.dayBuyPrice) &&
        Objects.equals(this.overnightBuyAmount, positionData.overnightBuyAmount) &&
        Objects.equals(this.overnightBuyQuantity, positionData.overnightBuyQuantity) &&
        Objects.equals(this.dayBuyQuantity, positionData.dayBuyQuantity) &&
        Objects.equals(this.daySellValue, positionData.daySellValue) &&
        Objects.equals(this.daySellPrice, positionData.daySellPrice) &&
        Objects.equals(this.overnightSellAmount, positionData.overnightSellAmount) &&
        Objects.equals(this.overnightSellQuantity, positionData.overnightSellQuantity) &&
        Objects.equals(this.daySellQuantity, positionData.daySellQuantity) &&
        Objects.equals(this.quantity, positionData.quantity) &&
        Objects.equals(this.lastPrice, positionData.lastPrice) &&
        Objects.equals(this.unrealised, positionData.unrealised) &&
        Objects.equals(this.realised, positionData.realised) &&
        Objects.equals(this.sellValue, positionData.sellValue) &&
        Objects.equals(this.tradingsymbol, positionData.tradingsymbol) &&
        Objects.equals(this.tradingSymbol, positionData.tradingSymbol) &&
        Objects.equals(this.closePrice, positionData.closePrice) &&
        Objects.equals(this.buyPrice, positionData.buyPrice) &&
        Objects.equals(this.sellPrice, positionData.sellPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange, multiplier, value, pnl, product, instrumentToken, averagePrice, buyValue, overnightQuantity, dayBuyValue, dayBuyPrice, overnightBuyAmount, overnightBuyQuantity, dayBuyQuantity, daySellValue, daySellPrice, overnightSellAmount, overnightSellQuantity, daySellQuantity, quantity, lastPrice, unrealised, realised, sellValue, tradingsymbol, tradingSymbol, closePrice, buyPrice, sellPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionData {\n");
    
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    pnl: ").append(toIndentedString(pnl)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    instrumentToken: ").append(toIndentedString(instrumentToken)).append("\n");
    sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
    sb.append("    buyValue: ").append(toIndentedString(buyValue)).append("\n");
    sb.append("    overnightQuantity: ").append(toIndentedString(overnightQuantity)).append("\n");
    sb.append("    dayBuyValue: ").append(toIndentedString(dayBuyValue)).append("\n");
    sb.append("    dayBuyPrice: ").append(toIndentedString(dayBuyPrice)).append("\n");
    sb.append("    overnightBuyAmount: ").append(toIndentedString(overnightBuyAmount)).append("\n");
    sb.append("    overnightBuyQuantity: ").append(toIndentedString(overnightBuyQuantity)).append("\n");
    sb.append("    dayBuyQuantity: ").append(toIndentedString(dayBuyQuantity)).append("\n");
    sb.append("    daySellValue: ").append(toIndentedString(daySellValue)).append("\n");
    sb.append("    daySellPrice: ").append(toIndentedString(daySellPrice)).append("\n");
    sb.append("    overnightSellAmount: ").append(toIndentedString(overnightSellAmount)).append("\n");
    sb.append("    overnightSellQuantity: ").append(toIndentedString(overnightSellQuantity)).append("\n");
    sb.append("    daySellQuantity: ").append(toIndentedString(daySellQuantity)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    unrealised: ").append(toIndentedString(unrealised)).append("\n");
    sb.append("    realised: ").append(toIndentedString(realised)).append("\n");
    sb.append("    sellValue: ").append(toIndentedString(sellValue)).append("\n");
    sb.append("    tradingsymbol: ").append(toIndentedString(tradingsymbol)).append("\n");
    sb.append("    tradingSymbol: ").append(toIndentedString(tradingSymbol)).append("\n");
    sb.append("    closePrice: ").append(toIndentedString(closePrice)).append("\n");
    sb.append("    buyPrice: ").append(toIndentedString(buyPrice)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
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
