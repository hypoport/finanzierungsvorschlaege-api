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
import org.joda.time.LocalDate;

/**
 * LegitimationsDaten
 */

public class LegitimationsDaten {
  @JsonProperty("ausstellendeBehoerde")
  private String ausstellendeBehoerde = null;

  @JsonProperty("ausstellungsdatum")
  private LocalDate ausstellungsdatum = null;

  /**
   * Gets or Sets ausweisArt
   */
  public enum AusweisArtEnum {
    PERSONALAUSWEIS("PERSONALAUSWEIS"),
    
    REISEPASS("REISEPASS"),
    
    ANDERE("ANDERE");

    private String value;

    AusweisArtEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AusweisArtEnum fromValue(String text) {
      for (AusweisArtEnum b : AusweisArtEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ausweisArt")
  private AusweisArtEnum ausweisArt = null;

  @JsonProperty("ausweisArtBeiAndererAusweis")
  private String ausweisArtBeiAndererAusweis = null;

  @JsonProperty("ausweisNummer")
  private String ausweisNummer = null;

  public LegitimationsDaten ausstellendeBehoerde(String ausstellendeBehoerde) {
    this.ausstellendeBehoerde = ausstellendeBehoerde;
    return this;
  }

   /**
   * Get ausstellendeBehoerde
   * @return ausstellendeBehoerde
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAusstellendeBehoerde() {
    return ausstellendeBehoerde;
  }

  public void setAusstellendeBehoerde(String ausstellendeBehoerde) {
    this.ausstellendeBehoerde = ausstellendeBehoerde;
  }

  public LegitimationsDaten ausstellungsdatum(LocalDate ausstellungsdatum) {
    this.ausstellungsdatum = ausstellungsdatum;
    return this;
  }

   /**
   * Get ausstellungsdatum
   * @return ausstellungsdatum
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getAusstellungsdatum() {
    return ausstellungsdatum;
  }

  public void setAusstellungsdatum(LocalDate ausstellungsdatum) {
    this.ausstellungsdatum = ausstellungsdatum;
  }

  public LegitimationsDaten ausweisArt(AusweisArtEnum ausweisArt) {
    this.ausweisArt = ausweisArt;
    return this;
  }

   /**
   * Get ausweisArt
   * @return ausweisArt
  **/
  @ApiModelProperty(example = "null", value = "")
  public AusweisArtEnum getAusweisArt() {
    return ausweisArt;
  }

  public void setAusweisArt(AusweisArtEnum ausweisArt) {
    this.ausweisArt = ausweisArt;
  }

  public LegitimationsDaten ausweisArtBeiAndererAusweis(String ausweisArtBeiAndererAusweis) {
    this.ausweisArtBeiAndererAusweis = ausweisArtBeiAndererAusweis;
    return this;
  }

   /**
   * Nur wenn ausweisArt = ANDERE
   * @return ausweisArtBeiAndererAusweis
  **/
  @ApiModelProperty(example = "null", value = "Nur wenn ausweisArt = ANDERE")
  public String getAusweisArtBeiAndererAusweis() {
    return ausweisArtBeiAndererAusweis;
  }

  public void setAusweisArtBeiAndererAusweis(String ausweisArtBeiAndererAusweis) {
    this.ausweisArtBeiAndererAusweis = ausweisArtBeiAndererAusweis;
  }

  public LegitimationsDaten ausweisNummer(String ausweisNummer) {
    this.ausweisNummer = ausweisNummer;
    return this;
  }

   /**
   * Get ausweisNummer
   * @return ausweisNummer
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAusweisNummer() {
    return ausweisNummer;
  }

  public void setAusweisNummer(String ausweisNummer) {
    this.ausweisNummer = ausweisNummer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegitimationsDaten legitimationsDaten = (LegitimationsDaten) o;
    return Objects.equals(this.ausstellendeBehoerde, legitimationsDaten.ausstellendeBehoerde) &&
        Objects.equals(this.ausstellungsdatum, legitimationsDaten.ausstellungsdatum) &&
        Objects.equals(this.ausweisArt, legitimationsDaten.ausweisArt) &&
        Objects.equals(this.ausweisArtBeiAndererAusweis, legitimationsDaten.ausweisArtBeiAndererAusweis) &&
        Objects.equals(this.ausweisNummer, legitimationsDaten.ausweisNummer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ausstellendeBehoerde, ausstellungsdatum, ausweisArt, ausweisArtBeiAndererAusweis, ausweisNummer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegitimationsDaten {\n");
    
    sb.append("    ausstellendeBehoerde: ").append(toIndentedString(ausstellendeBehoerde)).append("\n");
    sb.append("    ausstellungsdatum: ").append(toIndentedString(ausstellungsdatum)).append("\n");
    sb.append("    ausweisArt: ").append(toIndentedString(ausweisArt)).append("\n");
    sb.append("    ausweisArtBeiAndererAusweis: ").append(toIndentedString(ausweisArtBeiAndererAusweis)).append("\n");
    sb.append("    ausweisNummer: ").append(toIndentedString(ausweisNummer)).append("\n");
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

