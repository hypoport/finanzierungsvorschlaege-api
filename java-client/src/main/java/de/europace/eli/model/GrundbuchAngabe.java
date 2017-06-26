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
import de.europace.eli.model.Flurstueck;
import de.europace.eli.model.RechteAbteilung2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * GrundbuchAngabe
 */

public class GrundbuchAngabe {
  @JsonProperty("anmerkungen")
  private String anmerkungen = null;

  @JsonProperty("bandUndBlatt")
  private String bandUndBlatt = null;

  @JsonProperty("flurstuecke")
  private List<Flurstueck> flurstuecke = new ArrayList<Flurstueck>();

  @JsonProperty("ort")
  private String ort = null;

  @JsonProperty("rechteInAbteilung2")
  private RechteAbteilung2 rechteInAbteilung2 = null;

  public GrundbuchAngabe anmerkungen(String anmerkungen) {
    this.anmerkungen = anmerkungen;
    return this;
  }

   /**
   * Get anmerkungen
   * @return anmerkungen
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAnmerkungen() {
    return anmerkungen;
  }

  public void setAnmerkungen(String anmerkungen) {
    this.anmerkungen = anmerkungen;
  }

  public GrundbuchAngabe bandUndBlatt(String bandUndBlatt) {
    this.bandUndBlatt = bandUndBlatt;
    return this;
  }

   /**
   * Angabe von Band und Blatt
   * @return bandUndBlatt
  **/
  @ApiModelProperty(example = "null", value = "Angabe von Band und Blatt")
  public String getBandUndBlatt() {
    return bandUndBlatt;
  }

  public void setBandUndBlatt(String bandUndBlatt) {
    this.bandUndBlatt = bandUndBlatt;
  }

  public GrundbuchAngabe flurstuecke(List<Flurstueck> flurstuecke) {
    this.flurstuecke = flurstuecke;
    return this;
  }

  public GrundbuchAngabe addFlurstueckeItem(Flurstueck flurstueckeItem) {
    this.flurstuecke.add(flurstueckeItem);
    return this;
  }

   /**
   * Get flurstuecke
   * @return flurstuecke
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Flurstueck> getFlurstuecke() {
    return flurstuecke;
  }

  public void setFlurstuecke(List<Flurstueck> flurstuecke) {
    this.flurstuecke = flurstuecke;
  }

  public GrundbuchAngabe ort(String ort) {
    this.ort = ort;
    return this;
  }

   /**
   * Ort des als Grundbuchamt zuständigen Amtsgerichtes
   * @return ort
  **/
  @ApiModelProperty(example = "null", value = "Ort des als Grundbuchamt zuständigen Amtsgerichtes")
  public String getOrt() {
    return ort;
  }

  public void setOrt(String ort) {
    this.ort = ort;
  }

  public GrundbuchAngabe rechteInAbteilung2(RechteAbteilung2 rechteInAbteilung2) {
    this.rechteInAbteilung2 = rechteInAbteilung2;
    return this;
  }

   /**
   * Belastungen und Beschränkungen in der Nutzbarkeit des Grundstücks. Leitungsrechte, Verzichte auf Abstandsflächen, Wegerechte, Insolvenzvermerke.
   * @return rechteInAbteilung2
  **/
  @ApiModelProperty(example = "null", value = "Belastungen und Beschränkungen in der Nutzbarkeit des Grundstücks. Leitungsrechte, Verzichte auf Abstandsflächen, Wegerechte, Insolvenzvermerke.")
  public RechteAbteilung2 getRechteInAbteilung2() {
    return rechteInAbteilung2;
  }

  public void setRechteInAbteilung2(RechteAbteilung2 rechteInAbteilung2) {
    this.rechteInAbteilung2 = rechteInAbteilung2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrundbuchAngabe grundbuchAngabe = (GrundbuchAngabe) o;
    return Objects.equals(this.anmerkungen, grundbuchAngabe.anmerkungen) &&
        Objects.equals(this.bandUndBlatt, grundbuchAngabe.bandUndBlatt) &&
        Objects.equals(this.flurstuecke, grundbuchAngabe.flurstuecke) &&
        Objects.equals(this.ort, grundbuchAngabe.ort) &&
        Objects.equals(this.rechteInAbteilung2, grundbuchAngabe.rechteInAbteilung2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anmerkungen, bandUndBlatt, flurstuecke, ort, rechteInAbteilung2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrundbuchAngabe {\n");
    
    sb.append("    anmerkungen: ").append(toIndentedString(anmerkungen)).append("\n");
    sb.append("    bandUndBlatt: ").append(toIndentedString(bandUndBlatt)).append("\n");
    sb.append("    flurstuecke: ").append(toIndentedString(flurstuecke)).append("\n");
    sb.append("    ort: ").append(toIndentedString(ort)).append("\n");
    sb.append("    rechteInAbteilung2: ").append(toIndentedString(rechteInAbteilung2)).append("\n");
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

