/*
 * Ergebnislisten API
 * Ein Service um eine Ergebnisliste mit Finanzierungsvorschlägen zu ermitteln.
 *
 * OpenAPI spec version: 0.1
 * Contact: helpdesk@europace2.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.europace.eli.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LeadTracking
 */

public class LeadTracking {
  @JsonProperty("kampagne")
  private String kampagne = null;

  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("kundenBetreuerBenachrichtigen")
  private Boolean kundenBetreuerBenachrichtigen = null;

  @JsonProperty("trackingId")
  private String trackingId = null;

  public LeadTracking kampagne(String kampagne) {
    this.kampagne = kampagne;
    return this;
  }

   /**
   * Get kampagne
   * @return kampagne
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKampagne() {
    return kampagne;
  }

  public void setKampagne(String kampagne) {
    this.kampagne = kampagne;
  }

  public LeadTracking keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public LeadTracking kundenBetreuerBenachrichtigen(Boolean kundenBetreuerBenachrichtigen) {
    this.kundenBetreuerBenachrichtigen = kundenBetreuerBenachrichtigen;
    return this;
  }

   /**
   * Get kundenBetreuerBenachrichtigen
   * @return kundenBetreuerBenachrichtigen
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getKundenBetreuerBenachrichtigen() {
    return kundenBetreuerBenachrichtigen;
  }

  public void setKundenBetreuerBenachrichtigen(Boolean kundenBetreuerBenachrichtigen) {
    this.kundenBetreuerBenachrichtigen = kundenBetreuerBenachrichtigen;
  }

  public LeadTracking trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Get trackingId
   * @return trackingId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadTracking leadTracking = (LeadTracking) o;
    return Objects.equals(this.kampagne, leadTracking.kampagne) &&
        Objects.equals(this.keyword, leadTracking.keyword) &&
        Objects.equals(this.kundenBetreuerBenachrichtigen, leadTracking.kundenBetreuerBenachrichtigen) &&
        Objects.equals(this.trackingId, leadTracking.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kampagne, keyword, kundenBetreuerBenachrichtigen, trackingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadTracking {\n");
    
    sb.append("    kampagne: ").append(toIndentedString(kampagne)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    kundenBetreuerBenachrichtigen: ").append(toIndentedString(kundenBetreuerBenachrichtigen)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
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

