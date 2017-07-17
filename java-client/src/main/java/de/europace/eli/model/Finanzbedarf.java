/**
 * Ergebnislisten API
 * Ein Service um eine Ergebnisliste mit Finanzierungsvorschlägen zu ermitteln.
 *
 * OpenAPI spec version: 0.1
 * Contact: helpdesk@europace2.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package de.europace.eli.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;


/**
 * Finanzbedarf
 */

public class Finanzbedarf   {
  @JsonProperty("aussenAnlagen")
  private BigDecimal aussenAnlagen = null;

  @JsonProperty("bauNebenkosten")
  private BigDecimal bauNebenkosten = null;

  @JsonProperty("beratungsHonorar")
  private BigDecimal beratungsHonorar = null;

  @JsonProperty("bereitsBeglichen")
  private BigDecimal bereitsBeglichen = null;

  @JsonProperty("erschliessung")
  private BigDecimal erschliessung = null;

  @JsonProperty("grunderwerbsteuer")
  private BigDecimal grunderwerbsteuer = null;

  @JsonProperty("grundstueckBereitsBezahlt")
  private Boolean grundstueckBereitsBezahlt = null;

  @JsonProperty("grundstuecksKaufpreis")
  private BigDecimal grundstuecksKaufpreis = null;

  @JsonProperty("herstellung")
  private BigDecimal herstellung = null;

  @JsonProperty("kapitalBeschaffung")
  private BigDecimal kapitalBeschaffung = null;

  @JsonProperty("kaufpreis")
  private BigDecimal kaufpreis = null;

  @JsonProperty("maklergebuehr")
  private BigDecimal maklergebuehr = null;

  @JsonProperty("mobiliar")
  private BigDecimal mobiliar = null;

  @JsonProperty("modernisierung")
  private BigDecimal modernisierung = null;

  @JsonProperty("notargebuehr")
  private BigDecimal notargebuehr = null;

  @JsonProperty("renovierung")
  private BigDecimal renovierung = null;

  @JsonProperty("sonstigeKosten")
  private BigDecimal sonstigeKosten = null;

  @JsonProperty("zusaetzlichesKapital")
  private BigDecimal zusaetzlichesKapital = null;

  public Finanzbedarf aussenAnlagen(BigDecimal aussenAnlagen) {
    this.aussenAnlagen = aussenAnlagen;
    return this;
  }

   /**
   * Get aussenAnlagen
   * @return aussenAnlagen
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getAussenAnlagen() {
    return aussenAnlagen;
  }

  public void setAussenAnlagen(BigDecimal aussenAnlagen) {
    this.aussenAnlagen = aussenAnlagen;
  }

  public Finanzbedarf bauNebenkosten(BigDecimal bauNebenkosten) {
    this.bauNebenkosten = bauNebenkosten;
    return this;
  }

   /**
   * Get bauNebenkosten
   * @return bauNebenkosten
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getBauNebenkosten() {
    return bauNebenkosten;
  }

  public void setBauNebenkosten(BigDecimal bauNebenkosten) {
    this.bauNebenkosten = bauNebenkosten;
  }

  public Finanzbedarf beratungsHonorar(BigDecimal beratungsHonorar) {
    this.beratungsHonorar = beratungsHonorar;
    return this;
  }

   /**
   * Get beratungsHonorar
   * @return beratungsHonorar
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getBeratungsHonorar() {
    return beratungsHonorar;
  }

  public void setBeratungsHonorar(BigDecimal beratungsHonorar) {
    this.beratungsHonorar = beratungsHonorar;
  }

  public Finanzbedarf bereitsBeglichen(BigDecimal bereitsBeglichen) {
    this.bereitsBeglichen = bereitsBeglichen;
    return this;
  }

   /**
   * Get bereitsBeglichen
   * @return bereitsBeglichen
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getBereitsBeglichen() {
    return bereitsBeglichen;
  }

  public void setBereitsBeglichen(BigDecimal bereitsBeglichen) {
    this.bereitsBeglichen = bereitsBeglichen;
  }

  public Finanzbedarf erschliessung(BigDecimal erschliessung) {
    this.erschliessung = erschliessung;
    return this;
  }

   /**
   * Get erschliessung
   * @return erschliessung
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getErschliessung() {
    return erschliessung;
  }

  public void setErschliessung(BigDecimal erschliessung) {
    this.erschliessung = erschliessung;
  }

  public Finanzbedarf grunderwerbsteuer(BigDecimal grunderwerbsteuer) {
    this.grunderwerbsteuer = grunderwerbsteuer;
    return this;
  }

   /**
   * Nebenkosten
   * @return grunderwerbsteuer
  **/
  @ApiModelProperty(example = "null", value = "Nebenkosten")
  public BigDecimal getGrunderwerbsteuer() {
    return grunderwerbsteuer;
  }

  public void setGrunderwerbsteuer(BigDecimal grunderwerbsteuer) {
    this.grunderwerbsteuer = grunderwerbsteuer;
  }

  public Finanzbedarf grundstueckBereitsBezahlt(Boolean grundstueckBereitsBezahlt) {
    this.grundstueckBereitsBezahlt = grundstueckBereitsBezahlt;
    return this;
  }

   /**
   * Get grundstueckBereitsBezahlt
   * @return grundstueckBereitsBezahlt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getGrundstueckBereitsBezahlt() {
    return grundstueckBereitsBezahlt;
  }

  public void setGrundstueckBereitsBezahlt(Boolean grundstueckBereitsBezahlt) {
    this.grundstueckBereitsBezahlt = grundstueckBereitsBezahlt;
  }

  public Finanzbedarf grundstuecksKaufpreis(BigDecimal grundstuecksKaufpreis) {
    this.grundstuecksKaufpreis = grundstuecksKaufpreis;
    return this;
  }

   /**
   * Get grundstuecksKaufpreis
   * @return grundstuecksKaufpreis
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getGrundstuecksKaufpreis() {
    return grundstuecksKaufpreis;
  }

  public void setGrundstuecksKaufpreis(BigDecimal grundstuecksKaufpreis) {
    this.grundstuecksKaufpreis = grundstuecksKaufpreis;
  }

  public Finanzbedarf herstellung(BigDecimal herstellung) {
    this.herstellung = herstellung;
    return this;
  }

   /**
   * inklusive Eigenleistungen
   * @return herstellung
  **/
  @ApiModelProperty(example = "null", value = "inklusive Eigenleistungen")
  public BigDecimal getHerstellung() {
    return herstellung;
  }

  public void setHerstellung(BigDecimal herstellung) {
    this.herstellung = herstellung;
  }

  public Finanzbedarf kapitalBeschaffung(BigDecimal kapitalBeschaffung) {
    this.kapitalBeschaffung = kapitalBeschaffung;
    return this;
  }

   /**
   * Get kapitalBeschaffung
   * @return kapitalBeschaffung
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getKapitalBeschaffung() {
    return kapitalBeschaffung;
  }

  public void setKapitalBeschaffung(BigDecimal kapitalBeschaffung) {
    this.kapitalBeschaffung = kapitalBeschaffung;
  }

  public Finanzbedarf kaufpreis(BigDecimal kaufpreis) {
    this.kaufpreis = kaufpreis;
    return this;
  }

   /**
   * inklusive Eigenleistungen
   * @return kaufpreis
  **/
  @ApiModelProperty(example = "null", value = "inklusive Eigenleistungen")
  public BigDecimal getKaufpreis() {
    return kaufpreis;
  }

  public void setKaufpreis(BigDecimal kaufpreis) {
    this.kaufpreis = kaufpreis;
  }

  public Finanzbedarf maklergebuehr(BigDecimal maklergebuehr) {
    this.maklergebuehr = maklergebuehr;
    return this;
  }

   /**
   * Nebenkosten
   * @return maklergebuehr
  **/
  @ApiModelProperty(example = "null", value = "Nebenkosten")
  public BigDecimal getMaklergebuehr() {
    return maklergebuehr;
  }

  public void setMaklergebuehr(BigDecimal maklergebuehr) {
    this.maklergebuehr = maklergebuehr;
  }

  public Finanzbedarf mobiliar(BigDecimal mobiliar) {
    this.mobiliar = mobiliar;
    return this;
  }

   /**
   * Get mobiliar
   * @return mobiliar
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getMobiliar() {
    return mobiliar;
  }

  public void setMobiliar(BigDecimal mobiliar) {
    this.mobiliar = mobiliar;
  }

  public Finanzbedarf modernisierung(BigDecimal modernisierung) {
    this.modernisierung = modernisierung;
    return this;
  }

   /**
   * inklusive Eigenleistungen
   * @return modernisierung
  **/
  @ApiModelProperty(example = "null", value = "inklusive Eigenleistungen")
  public BigDecimal getModernisierung() {
    return modernisierung;
  }

  public void setModernisierung(BigDecimal modernisierung) {
    this.modernisierung = modernisierung;
  }

  public Finanzbedarf notargebuehr(BigDecimal notargebuehr) {
    this.notargebuehr = notargebuehr;
    return this;
  }

   /**
   * Nebenkosten
   * @return notargebuehr
  **/
  @ApiModelProperty(example = "null", value = "Nebenkosten")
  public BigDecimal getNotargebuehr() {
    return notargebuehr;
  }

  public void setNotargebuehr(BigDecimal notargebuehr) {
    this.notargebuehr = notargebuehr;
  }

  public Finanzbedarf renovierung(BigDecimal renovierung) {
    this.renovierung = renovierung;
    return this;
  }

   /**
   * Get renovierung
   * @return renovierung
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getRenovierung() {
    return renovierung;
  }

  public void setRenovierung(BigDecimal renovierung) {
    this.renovierung = renovierung;
  }

  public Finanzbedarf sonstigeKosten(BigDecimal sonstigeKosten) {
    this.sonstigeKosten = sonstigeKosten;
    return this;
  }

   /**
   * Get sonstigeKosten
   * @return sonstigeKosten
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getSonstigeKosten() {
    return sonstigeKosten;
  }

  public void setSonstigeKosten(BigDecimal sonstigeKosten) {
    this.sonstigeKosten = sonstigeKosten;
  }

  public Finanzbedarf zusaetzlichesKapital(BigDecimal zusaetzlichesKapital) {
    this.zusaetzlichesKapital = zusaetzlichesKapital;
    return this;
  }

   /**
   * Get zusaetzlichesKapital
   * @return zusaetzlichesKapital
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getZusaetzlichesKapital() {
    return zusaetzlichesKapital;
  }

  public void setZusaetzlichesKapital(BigDecimal zusaetzlichesKapital) {
    this.zusaetzlichesKapital = zusaetzlichesKapital;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Finanzbedarf finanzbedarf = (Finanzbedarf) o;
    return Objects.equals(this.aussenAnlagen, finanzbedarf.aussenAnlagen) &&
        Objects.equals(this.bauNebenkosten, finanzbedarf.bauNebenkosten) &&
        Objects.equals(this.beratungsHonorar, finanzbedarf.beratungsHonorar) &&
        Objects.equals(this.bereitsBeglichen, finanzbedarf.bereitsBeglichen) &&
        Objects.equals(this.erschliessung, finanzbedarf.erschliessung) &&
        Objects.equals(this.grunderwerbsteuer, finanzbedarf.grunderwerbsteuer) &&
        Objects.equals(this.grundstueckBereitsBezahlt, finanzbedarf.grundstueckBereitsBezahlt) &&
        Objects.equals(this.grundstuecksKaufpreis, finanzbedarf.grundstuecksKaufpreis) &&
        Objects.equals(this.herstellung, finanzbedarf.herstellung) &&
        Objects.equals(this.kapitalBeschaffung, finanzbedarf.kapitalBeschaffung) &&
        Objects.equals(this.kaufpreis, finanzbedarf.kaufpreis) &&
        Objects.equals(this.maklergebuehr, finanzbedarf.maklergebuehr) &&
        Objects.equals(this.mobiliar, finanzbedarf.mobiliar) &&
        Objects.equals(this.modernisierung, finanzbedarf.modernisierung) &&
        Objects.equals(this.notargebuehr, finanzbedarf.notargebuehr) &&
        Objects.equals(this.renovierung, finanzbedarf.renovierung) &&
        Objects.equals(this.sonstigeKosten, finanzbedarf.sonstigeKosten) &&
        Objects.equals(this.zusaetzlichesKapital, finanzbedarf.zusaetzlichesKapital);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aussenAnlagen, bauNebenkosten, beratungsHonorar, bereitsBeglichen, erschliessung, grunderwerbsteuer, grundstueckBereitsBezahlt, grundstuecksKaufpreis, herstellung, kapitalBeschaffung, kaufpreis, maklergebuehr, mobiliar, modernisierung, notargebuehr, renovierung, sonstigeKosten, zusaetzlichesKapital);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Finanzbedarf {\n");
    
    sb.append("    aussenAnlagen: ").append(toIndentedString(aussenAnlagen)).append("\n");
    sb.append("    bauNebenkosten: ").append(toIndentedString(bauNebenkosten)).append("\n");
    sb.append("    beratungsHonorar: ").append(toIndentedString(beratungsHonorar)).append("\n");
    sb.append("    bereitsBeglichen: ").append(toIndentedString(bereitsBeglichen)).append("\n");
    sb.append("    erschliessung: ").append(toIndentedString(erschliessung)).append("\n");
    sb.append("    grunderwerbsteuer: ").append(toIndentedString(grunderwerbsteuer)).append("\n");
    sb.append("    grundstueckBereitsBezahlt: ").append(toIndentedString(grundstueckBereitsBezahlt)).append("\n");
    sb.append("    grundstuecksKaufpreis: ").append(toIndentedString(grundstuecksKaufpreis)).append("\n");
    sb.append("    herstellung: ").append(toIndentedString(herstellung)).append("\n");
    sb.append("    kapitalBeschaffung: ").append(toIndentedString(kapitalBeschaffung)).append("\n");
    sb.append("    kaufpreis: ").append(toIndentedString(kaufpreis)).append("\n");
    sb.append("    maklergebuehr: ").append(toIndentedString(maklergebuehr)).append("\n");
    sb.append("    mobiliar: ").append(toIndentedString(mobiliar)).append("\n");
    sb.append("    modernisierung: ").append(toIndentedString(modernisierung)).append("\n");
    sb.append("    notargebuehr: ").append(toIndentedString(notargebuehr)).append("\n");
    sb.append("    renovierung: ").append(toIndentedString(renovierung)).append("\n");
    sb.append("    sonstigeKosten: ").append(toIndentedString(sonstigeKosten)).append("\n");
    sb.append("    zusaetzlichesKapital: ").append(toIndentedString(zusaetzlichesKapital)).append("\n");
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

