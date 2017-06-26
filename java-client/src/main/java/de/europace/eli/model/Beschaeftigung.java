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
import de.europace.eli.model.SituationNachRenteneintritt;
import de.europace.eli.model.Staat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;

/**
 * Beschaeftigung
 */

public class Beschaeftigung {
  @JsonProperty("anzahlGehaelterProJahr")
  private Double anzahlGehaelterProJahr = null;

  @JsonProperty("arbeitgeber")
  private String arbeitgeber = null;

  @JsonProperty("arbeitgeberInDeutschlandAnsaessig")
  private Boolean arbeitgeberInDeutschlandAnsaessig = null;

  @JsonProperty("arbeitgeberLand")
  private Staat arbeitgeberLand = null;

  @JsonProperty("art")
  private String art = null;

  /**
   * nur bei art==ANGESTELLTER,ARBEITER
   */
  public enum BefristungsStatusEnum {
    BEFRISTET("BEFRISTET"),
    
    UNBEFRISTET("UNBEFRISTET");

    private String value;

    BefristungsStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BefristungsStatusEnum fromValue(String text) {
      for (BefristungsStatusEnum b : BefristungsStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("befristungsStatus")
  private BefristungsStatusEnum befristungsStatus = null;

  @JsonProperty("beruf")
  private String beruf = null;

  @JsonProperty("beschaeftigtSeit")
  private LocalDate beschaeftigtSeit = null;

  @JsonProperty("einkommenNettoJaehrlich")
  private BigDecimal einkommenNettoJaehrlich = null;

  @JsonProperty("einkommenNettoMonatlich")
  private BigDecimal einkommenNettoMonatlich = null;

  @JsonProperty("inProbezeit")
  private Boolean inProbezeit = null;

  @JsonProperty("situationNachRenteneintritt")
  private SituationNachRenteneintritt situationNachRenteneintritt = null;

  @JsonProperty("sonstigesRegelmaessigesEinkommenNettoMonatlich")
  private BigDecimal sonstigesRegelmaessigesEinkommenNettoMonatlich = null;

  @JsonProperty("staatlicheRenteNettoMonatlich")
  private BigDecimal staatlicheRenteNettoMonatlich = null;

  @JsonProperty("taetigkeit")
  private String taetigkeit = null;

  public Beschaeftigung anzahlGehaelterProJahr(Double anzahlGehaelterProJahr) {
    this.anzahlGehaelterProJahr = anzahlGehaelterProJahr;
    return this;
  }

   /**
   * nur bei art==ANGESTELLTER,ARBEITER,BEAMTER
   * @return anzahlGehaelterProJahr
  **/
  @ApiModelProperty(example = "null", value = "nur bei art==ANGESTELLTER,ARBEITER,BEAMTER")
  public Double getAnzahlGehaelterProJahr() {
    return anzahlGehaelterProJahr;
  }

  public void setAnzahlGehaelterProJahr(Double anzahlGehaelterProJahr) {
    this.anzahlGehaelterProJahr = anzahlGehaelterProJahr;
  }

  public Beschaeftigung arbeitgeber(String arbeitgeber) {
    this.arbeitgeber = arbeitgeber;
    return this;
  }

   /**
   * nur bei art==ANGESTELLTER,ARBEITER,BEAMTER
   * @return arbeitgeber
  **/
  @ApiModelProperty(example = "null", value = "nur bei art==ANGESTELLTER,ARBEITER,BEAMTER")
  public String getArbeitgeber() {
    return arbeitgeber;
  }

  public void setArbeitgeber(String arbeitgeber) {
    this.arbeitgeber = arbeitgeber;
  }

  public Beschaeftigung arbeitgeberInDeutschlandAnsaessig(Boolean arbeitgeberInDeutschlandAnsaessig) {
    this.arbeitgeberInDeutschlandAnsaessig = arbeitgeberInDeutschlandAnsaessig;
    return this;
  }

   /**
   * nur bei art==ANGESTELLTER,ARBEITER,BEAMTER
   * @return arbeitgeberInDeutschlandAnsaessig
  **/
  @ApiModelProperty(example = "false", value = "nur bei art==ANGESTELLTER,ARBEITER,BEAMTER")
  public Boolean getArbeitgeberInDeutschlandAnsaessig() {
    return arbeitgeberInDeutschlandAnsaessig;
  }

  public void setArbeitgeberInDeutschlandAnsaessig(Boolean arbeitgeberInDeutschlandAnsaessig) {
    this.arbeitgeberInDeutschlandAnsaessig = arbeitgeberInDeutschlandAnsaessig;
  }

  public Beschaeftigung arbeitgeberLand(Staat arbeitgeberLand) {
    this.arbeitgeberLand = arbeitgeberLand;
    return this;
  }

   /**
   * Get arbeitgeberLand
   * @return arbeitgeberLand
  **/
  @ApiModelProperty(example = "null", value = "")
  public Staat getArbeitgeberLand() {
    return arbeitgeberLand;
  }

  public void setArbeitgeberLand(Staat arbeitgeberLand) {
    this.arbeitgeberLand = arbeitgeberLand;
  }

  public Beschaeftigung art(String art) {
    this.art = art;
    return this;
  }

   /**
   * Erlaubte Werte sind: ANGESTELLTER, ARBEITER, ARBEITSLOSER, BEAMTER, FREIBERUFLER, HAUSFRAU, RENTNER, SELBSTAENDIGER
   * @return art
  **/
  @ApiModelProperty(example = "null", value = "Erlaubte Werte sind: ANGESTELLTER, ARBEITER, ARBEITSLOSER, BEAMTER, FREIBERUFLER, HAUSFRAU, RENTNER, SELBSTAENDIGER")
  public String getArt() {
    return art;
  }

  public void setArt(String art) {
    this.art = art;
  }

  public Beschaeftigung befristungsStatus(BefristungsStatusEnum befristungsStatus) {
    this.befristungsStatus = befristungsStatus;
    return this;
  }

   /**
   * nur bei art==ANGESTELLTER,ARBEITER
   * @return befristungsStatus
  **/
  @ApiModelProperty(example = "null", value = "nur bei art==ANGESTELLTER,ARBEITER")
  public BefristungsStatusEnum getBefristungsStatus() {
    return befristungsStatus;
  }

  public void setBefristungsStatus(BefristungsStatusEnum befristungsStatus) {
    this.befristungsStatus = befristungsStatus;
  }

  public Beschaeftigung beruf(String beruf) {
    this.beruf = beruf;
    return this;
  }

   /**
   * nur bei art!=RENTNER
   * @return beruf
  **/
  @ApiModelProperty(example = "null", value = "nur bei art!=RENTNER")
  public String getBeruf() {
    return beruf;
  }

  public void setBeruf(String beruf) {
    this.beruf = beruf;
  }

  public Beschaeftigung beschaeftigtSeit(LocalDate beschaeftigtSeit) {
    this.beschaeftigtSeit = beschaeftigtSeit;
    return this;
  }

   /**
   * nur bei art==ANGESTELLTER,ARBEITER,BEAMTER,FREIBERUFLER,SELBSTAENDIGER
   * @return beschaeftigtSeit
  **/
  @ApiModelProperty(example = "null", value = "nur bei art==ANGESTELLTER,ARBEITER,BEAMTER,FREIBERUFLER,SELBSTAENDIGER")
  public LocalDate getBeschaeftigtSeit() {
    return beschaeftigtSeit;
  }

  public void setBeschaeftigtSeit(LocalDate beschaeftigtSeit) {
    this.beschaeftigtSeit = beschaeftigtSeit;
  }

  public Beschaeftigung einkommenNettoJaehrlich(BigDecimal einkommenNettoJaehrlich) {
    this.einkommenNettoJaehrlich = einkommenNettoJaehrlich;
    return this;
  }

   /**
   * nur bei art==FREIBERUFLER,SELBSTAENDIGER
   * @return einkommenNettoJaehrlich
  **/
  @ApiModelProperty(example = "null", value = "nur bei art==FREIBERUFLER,SELBSTAENDIGER")
  public BigDecimal getEinkommenNettoJaehrlich() {
    return einkommenNettoJaehrlich;
  }

  public void setEinkommenNettoJaehrlich(BigDecimal einkommenNettoJaehrlich) {
    this.einkommenNettoJaehrlich = einkommenNettoJaehrlich;
  }

  public Beschaeftigung einkommenNettoMonatlich(BigDecimal einkommenNettoMonatlich) {
    this.einkommenNettoMonatlich = einkommenNettoMonatlich;
    return this;
  }

   /**
   * nur bei art==ANGESTELLTER,ARBEITER,BEAMTER
   * @return einkommenNettoMonatlich
  **/
  @ApiModelProperty(example = "null", value = "nur bei art==ANGESTELLTER,ARBEITER,BEAMTER")
  public BigDecimal getEinkommenNettoMonatlich() {
    return einkommenNettoMonatlich;
  }

  public void setEinkommenNettoMonatlich(BigDecimal einkommenNettoMonatlich) {
    this.einkommenNettoMonatlich = einkommenNettoMonatlich;
  }

  public Beschaeftigung inProbezeit(Boolean inProbezeit) {
    this.inProbezeit = inProbezeit;
    return this;
  }

   /**
   * nur bei art==ANGESTELLTER,ARBEITER,BEAMTER
   * @return inProbezeit
  **/
  @ApiModelProperty(example = "false", value = "nur bei art==ANGESTELLTER,ARBEITER,BEAMTER")
  public Boolean getInProbezeit() {
    return inProbezeit;
  }

  public void setInProbezeit(Boolean inProbezeit) {
    this.inProbezeit = inProbezeit;
  }

  public Beschaeftigung situationNachRenteneintritt(SituationNachRenteneintritt situationNachRenteneintritt) {
    this.situationNachRenteneintritt = situationNachRenteneintritt;
    return this;
  }

   /**
   * nur bei art!=RENTNER
   * @return situationNachRenteneintritt
  **/
  @ApiModelProperty(example = "null", value = "nur bei art!=RENTNER")
  public SituationNachRenteneintritt getSituationNachRenteneintritt() {
    return situationNachRenteneintritt;
  }

  public void setSituationNachRenteneintritt(SituationNachRenteneintritt situationNachRenteneintritt) {
    this.situationNachRenteneintritt = situationNachRenteneintritt;
  }

  public Beschaeftigung sonstigesRegelmaessigesEinkommenNettoMonatlich(BigDecimal sonstigesRegelmaessigesEinkommenNettoMonatlich) {
    this.sonstigesRegelmaessigesEinkommenNettoMonatlich = sonstigesRegelmaessigesEinkommenNettoMonatlich;
    return this;
  }

   /**
   * nur bei art==ARBEITSLOSER,HAUSFRAU
   * @return sonstigesRegelmaessigesEinkommenNettoMonatlich
  **/
  @ApiModelProperty(example = "null", value = "nur bei art==ARBEITSLOSER,HAUSFRAU")
  public BigDecimal getSonstigesRegelmaessigesEinkommenNettoMonatlich() {
    return sonstigesRegelmaessigesEinkommenNettoMonatlich;
  }

  public void setSonstigesRegelmaessigesEinkommenNettoMonatlich(BigDecimal sonstigesRegelmaessigesEinkommenNettoMonatlich) {
    this.sonstigesRegelmaessigesEinkommenNettoMonatlich = sonstigesRegelmaessigesEinkommenNettoMonatlich;
  }

  public Beschaeftigung staatlicheRenteNettoMonatlich(BigDecimal staatlicheRenteNettoMonatlich) {
    this.staatlicheRenteNettoMonatlich = staatlicheRenteNettoMonatlich;
    return this;
  }

   /**
   * nur bei art==RENTNER
   * @return staatlicheRenteNettoMonatlich
  **/
  @ApiModelProperty(example = "null", value = "nur bei art==RENTNER")
  public BigDecimal getStaatlicheRenteNettoMonatlich() {
    return staatlicheRenteNettoMonatlich;
  }

  public void setStaatlicheRenteNettoMonatlich(BigDecimal staatlicheRenteNettoMonatlich) {
    this.staatlicheRenteNettoMonatlich = staatlicheRenteNettoMonatlich;
  }

  public Beschaeftigung taetigkeit(String taetigkeit) {
    this.taetigkeit = taetigkeit;
    return this;
  }

   /**
   * nur bei art==FREIBERUFLER,SELBSTAENDIGER. Erlaubte Werte sind:   ALTENPFLEGER, AMBULANTER_KRANKENPFLEGER, ANWALT, APOTHEKER, ARCHITEKT, ARZT, BESTATTER, DATENSCHUTZBEAUFTRAGTER, DEKORATEUR, DIAETASSISTENT, DOLMETSCHER, EDV_BERATER, ERGOTHERAPEUT, ERNAEHRUNGSBERATER, FOTOGRAF, GEOGRAF, GRAFIKDESIGNER, GRAFIKER, HEBAMME, HEILMASSEUR, HEILPRAKTIKER, HISTORIKER, INFORMATIKER, INGENIEUR, INSOLVENZVERWALTER, JOURNALIST, KLASSISCHER_KONZERTMUSIKER, KONSTRUKTEUR, KRANKENGYMNAST, KRANKENPFLEGER, KRANKENSCHWESTER, LOGOPAEDE, MEDIZINISCH_TECHN_ASSISTENT, NOTAR, OPERNSAENGER, PERSONALBERATER, PHYSIOTHERAPEUT, PSYCHOLOGE, RAUMAUSSTATTER, RUNDFUNKSPRECHER, SACHVERSTAENDIGER, STADTPLANER, STATIKER, STEUERBERATER, TIERARZT, UNTERNEHMENSBERATER, VERMITTLER, WIRTSCH_BUCHPRUEFER_REVISOR, ZAHNARZT, ZAHNTECHNIKER, SONSTIGES.
   * @return taetigkeit
  **/
  @ApiModelProperty(example = "null", value = "nur bei art==FREIBERUFLER,SELBSTAENDIGER. Erlaubte Werte sind:   ALTENPFLEGER, AMBULANTER_KRANKENPFLEGER, ANWALT, APOTHEKER, ARCHITEKT, ARZT, BESTATTER, DATENSCHUTZBEAUFTRAGTER, DEKORATEUR, DIAETASSISTENT, DOLMETSCHER, EDV_BERATER, ERGOTHERAPEUT, ERNAEHRUNGSBERATER, FOTOGRAF, GEOGRAF, GRAFIKDESIGNER, GRAFIKER, HEBAMME, HEILMASSEUR, HEILPRAKTIKER, HISTORIKER, INFORMATIKER, INGENIEUR, INSOLVENZVERWALTER, JOURNALIST, KLASSISCHER_KONZERTMUSIKER, KONSTRUKTEUR, KRANKENGYMNAST, KRANKENPFLEGER, KRANKENSCHWESTER, LOGOPAEDE, MEDIZINISCH_TECHN_ASSISTENT, NOTAR, OPERNSAENGER, PERSONALBERATER, PHYSIOTHERAPEUT, PSYCHOLOGE, RAUMAUSSTATTER, RUNDFUNKSPRECHER, SACHVERSTAENDIGER, STADTPLANER, STATIKER, STEUERBERATER, TIERARZT, UNTERNEHMENSBERATER, VERMITTLER, WIRTSCH_BUCHPRUEFER_REVISOR, ZAHNARZT, ZAHNTECHNIKER, SONSTIGES.")
  public String getTaetigkeit() {
    return taetigkeit;
  }

  public void setTaetigkeit(String taetigkeit) {
    this.taetigkeit = taetigkeit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beschaeftigung beschaeftigung = (Beschaeftigung) o;
    return Objects.equals(this.anzahlGehaelterProJahr, beschaeftigung.anzahlGehaelterProJahr) &&
        Objects.equals(this.arbeitgeber, beschaeftigung.arbeitgeber) &&
        Objects.equals(this.arbeitgeberInDeutschlandAnsaessig, beschaeftigung.arbeitgeberInDeutschlandAnsaessig) &&
        Objects.equals(this.arbeitgeberLand, beschaeftigung.arbeitgeberLand) &&
        Objects.equals(this.art, beschaeftigung.art) &&
        Objects.equals(this.befristungsStatus, beschaeftigung.befristungsStatus) &&
        Objects.equals(this.beruf, beschaeftigung.beruf) &&
        Objects.equals(this.beschaeftigtSeit, beschaeftigung.beschaeftigtSeit) &&
        Objects.equals(this.einkommenNettoJaehrlich, beschaeftigung.einkommenNettoJaehrlich) &&
        Objects.equals(this.einkommenNettoMonatlich, beschaeftigung.einkommenNettoMonatlich) &&
        Objects.equals(this.inProbezeit, beschaeftigung.inProbezeit) &&
        Objects.equals(this.situationNachRenteneintritt, beschaeftigung.situationNachRenteneintritt) &&
        Objects.equals(this.sonstigesRegelmaessigesEinkommenNettoMonatlich, beschaeftigung.sonstigesRegelmaessigesEinkommenNettoMonatlich) &&
        Objects.equals(this.staatlicheRenteNettoMonatlich, beschaeftigung.staatlicheRenteNettoMonatlich) &&
        Objects.equals(this.taetigkeit, beschaeftigung.taetigkeit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anzahlGehaelterProJahr, arbeitgeber, arbeitgeberInDeutschlandAnsaessig, arbeitgeberLand, art, befristungsStatus, beruf, beschaeftigtSeit, einkommenNettoJaehrlich, einkommenNettoMonatlich, inProbezeit, situationNachRenteneintritt, sonstigesRegelmaessigesEinkommenNettoMonatlich, staatlicheRenteNettoMonatlich, taetigkeit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beschaeftigung {\n");
    
    sb.append("    anzahlGehaelterProJahr: ").append(toIndentedString(anzahlGehaelterProJahr)).append("\n");
    sb.append("    arbeitgeber: ").append(toIndentedString(arbeitgeber)).append("\n");
    sb.append("    arbeitgeberInDeutschlandAnsaessig: ").append(toIndentedString(arbeitgeberInDeutschlandAnsaessig)).append("\n");
    sb.append("    arbeitgeberLand: ").append(toIndentedString(arbeitgeberLand)).append("\n");
    sb.append("    art: ").append(toIndentedString(art)).append("\n");
    sb.append("    befristungsStatus: ").append(toIndentedString(befristungsStatus)).append("\n");
    sb.append("    beruf: ").append(toIndentedString(beruf)).append("\n");
    sb.append("    beschaeftigtSeit: ").append(toIndentedString(beschaeftigtSeit)).append("\n");
    sb.append("    einkommenNettoJaehrlich: ").append(toIndentedString(einkommenNettoJaehrlich)).append("\n");
    sb.append("    einkommenNettoMonatlich: ").append(toIndentedString(einkommenNettoMonatlich)).append("\n");
    sb.append("    inProbezeit: ").append(toIndentedString(inProbezeit)).append("\n");
    sb.append("    situationNachRenteneintritt: ").append(toIndentedString(situationNachRenteneintritt)).append("\n");
    sb.append("    sonstigesRegelmaessigesEinkommenNettoMonatlich: ").append(toIndentedString(sonstigesRegelmaessigesEinkommenNettoMonatlich)).append("\n");
    sb.append("    staatlicheRenteNettoMonatlich: ").append(toIndentedString(staatlicheRenteNettoMonatlich)).append("\n");
    sb.append("    taetigkeit: ").append(toIndentedString(taetigkeit)).append("\n");
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

