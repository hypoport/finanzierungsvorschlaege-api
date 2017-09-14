/*
 * Ergebnislisten API
 * Ein Service um eine Ergebnisliste mit Finanzierungsvorschlägen zu ermitteln.
 *
 * OpenAPI spec version: 1.0
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
import com.fasterxml.jackson.annotation.JsonValue;
import de.europace.eli.model.AusgabenMonatlich;
import de.europace.eli.model.BankUndSparguthaben;
import de.europace.eli.model.BestehenderBausparvertrag;
import de.europace.eli.model.EinkuenfteAusNebentaetigkeit;
import de.europace.eli.model.EinnahmenMonatlich;
import de.europace.eli.model.LebensOderRentenversicherungVermoegen;
import de.europace.eli.model.MietAusgaben;
import de.europace.eli.model.Sparplaene;
import de.europace.eli.model.Verbindlichkeit;
import de.europace.eli.model.Vermoegen;
import de.europace.eli.model.Wertpapiere;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * HaushaltsPositionen
 */

public class HaushaltsPositionen {
  @JsonProperty("bankUndSparguthaben")
  private List<BankUndSparguthaben> bankUndSparguthaben = null;

  @JsonProperty("bausparvertraege")
  private List<BestehenderBausparvertrag> bausparvertraege = null;

  @JsonProperty("ehegattenUnterhalt")
  private List<EinnahmenMonatlich> ehegattenUnterhalt = null;

  @JsonProperty("einkuenfteAusNebentaetigkeit")
  private List<EinkuenfteAusNebentaetigkeit> einkuenfteAusNebentaetigkeit = null;

  @JsonProperty("lebensUndRentenVersicherungen")
  private List<LebensOderRentenversicherungVermoegen> lebensUndRentenVersicherungen = null;

  @JsonProperty("mietAusgaben")
  private List<MietAusgaben> mietAusgaben = null;

  @JsonProperty("privateDarlehen")
  private List<Verbindlichkeit> privateDarlehen = null;

  @JsonProperty("privateKrankenversicherung")
  private List<AusgabenMonatlich> privateKrankenversicherung = null;

  @JsonProperty("ratenkredite")
  private List<Verbindlichkeit> ratenkredite = null;

  @JsonProperty("sonstigeAusgaben")
  private List<AusgabenMonatlich> sonstigeAusgaben = null;

  @JsonProperty("sonstigeEinnahmen")
  private List<EinnahmenMonatlich> sonstigeEinnahmen = null;

  @JsonProperty("sonstigeVerbindlichkeiten")
  private List<Verbindlichkeit> sonstigeVerbindlichkeiten = null;

  @JsonProperty("sonstigeVermoegen")
  private List<Vermoegen> sonstigeVermoegen = null;

  @JsonProperty("sparplaene")
  private List<Sparplaene> sparplaene = null;

  @JsonProperty("unbefristeteZusatzRenten")
  private List<EinnahmenMonatlich> unbefristeteZusatzRenten = null;

  @JsonProperty("unterhaltsVerpflichtungen")
  private List<AusgabenMonatlich> unterhaltsVerpflichtungen = null;

  @JsonProperty("variableEinkuenfte")
  private List<EinnahmenMonatlich> variableEinkuenfte = null;

  @JsonProperty("versicherungsAusgaben")
  private List<AusgabenMonatlich> versicherungsAusgaben = null;

  @JsonProperty("wertpapiere")
  private List<Wertpapiere> wertpapiere = null;

  public HaushaltsPositionen bankUndSparguthaben(List<BankUndSparguthaben> bankUndSparguthaben) {
    this.bankUndSparguthaben = bankUndSparguthaben;
    return this;
  }

  public HaushaltsPositionen addBankUndSparguthabenItem(BankUndSparguthaben bankUndSparguthabenItem) {
    if (this.bankUndSparguthaben == null) {
      this.bankUndSparguthaben = new ArrayList<BankUndSparguthaben>();
    }
    this.bankUndSparguthaben.add(bankUndSparguthabenItem);
    return this;
  }

   /**
   * Get bankUndSparguthaben
   * @return bankUndSparguthaben
  **/
  @ApiModelProperty(value = "")
  public List<BankUndSparguthaben> getBankUndSparguthaben() {
    return bankUndSparguthaben;
  }

  public void setBankUndSparguthaben(List<BankUndSparguthaben> bankUndSparguthaben) {
    this.bankUndSparguthaben = bankUndSparguthaben;
  }

  public HaushaltsPositionen bausparvertraege(List<BestehenderBausparvertrag> bausparvertraege) {
    this.bausparvertraege = bausparvertraege;
    return this;
  }

  public HaushaltsPositionen addBausparvertraegeItem(BestehenderBausparvertrag bausparvertraegeItem) {
    if (this.bausparvertraege == null) {
      this.bausparvertraege = new ArrayList<BestehenderBausparvertrag>();
    }
    this.bausparvertraege.add(bausparvertraegeItem);
    return this;
  }

   /**
   * Get bausparvertraege
   * @return bausparvertraege
  **/
  @ApiModelProperty(value = "")
  public List<BestehenderBausparvertrag> getBausparvertraege() {
    return bausparvertraege;
  }

  public void setBausparvertraege(List<BestehenderBausparvertrag> bausparvertraege) {
    this.bausparvertraege = bausparvertraege;
  }

  public HaushaltsPositionen ehegattenUnterhalt(List<EinnahmenMonatlich> ehegattenUnterhalt) {
    this.ehegattenUnterhalt = ehegattenUnterhalt;
    return this;
  }

  public HaushaltsPositionen addEhegattenUnterhaltItem(EinnahmenMonatlich ehegattenUnterhaltItem) {
    if (this.ehegattenUnterhalt == null) {
      this.ehegattenUnterhalt = new ArrayList<EinnahmenMonatlich>();
    }
    this.ehegattenUnterhalt.add(ehegattenUnterhaltItem);
    return this;
  }

   /**
   * Get ehegattenUnterhalt
   * @return ehegattenUnterhalt
  **/
  @ApiModelProperty(value = "")
  public List<EinnahmenMonatlich> getEhegattenUnterhalt() {
    return ehegattenUnterhalt;
  }

  public void setEhegattenUnterhalt(List<EinnahmenMonatlich> ehegattenUnterhalt) {
    this.ehegattenUnterhalt = ehegattenUnterhalt;
  }

  public HaushaltsPositionen einkuenfteAusNebentaetigkeit(List<EinkuenfteAusNebentaetigkeit> einkuenfteAusNebentaetigkeit) {
    this.einkuenfteAusNebentaetigkeit = einkuenfteAusNebentaetigkeit;
    return this;
  }

  public HaushaltsPositionen addEinkuenfteAusNebentaetigkeitItem(EinkuenfteAusNebentaetigkeit einkuenfteAusNebentaetigkeitItem) {
    if (this.einkuenfteAusNebentaetigkeit == null) {
      this.einkuenfteAusNebentaetigkeit = new ArrayList<EinkuenfteAusNebentaetigkeit>();
    }
    this.einkuenfteAusNebentaetigkeit.add(einkuenfteAusNebentaetigkeitItem);
    return this;
  }

   /**
   * Get einkuenfteAusNebentaetigkeit
   * @return einkuenfteAusNebentaetigkeit
  **/
  @ApiModelProperty(value = "")
  public List<EinkuenfteAusNebentaetigkeit> getEinkuenfteAusNebentaetigkeit() {
    return einkuenfteAusNebentaetigkeit;
  }

  public void setEinkuenfteAusNebentaetigkeit(List<EinkuenfteAusNebentaetigkeit> einkuenfteAusNebentaetigkeit) {
    this.einkuenfteAusNebentaetigkeit = einkuenfteAusNebentaetigkeit;
  }

  public HaushaltsPositionen lebensUndRentenVersicherungen(List<LebensOderRentenversicherungVermoegen> lebensUndRentenVersicherungen) {
    this.lebensUndRentenVersicherungen = lebensUndRentenVersicherungen;
    return this;
  }

  public HaushaltsPositionen addLebensUndRentenVersicherungenItem(LebensOderRentenversicherungVermoegen lebensUndRentenVersicherungenItem) {
    if (this.lebensUndRentenVersicherungen == null) {
      this.lebensUndRentenVersicherungen = new ArrayList<LebensOderRentenversicherungVermoegen>();
    }
    this.lebensUndRentenVersicherungen.add(lebensUndRentenVersicherungenItem);
    return this;
  }

   /**
   * Get lebensUndRentenVersicherungen
   * @return lebensUndRentenVersicherungen
  **/
  @ApiModelProperty(value = "")
  public List<LebensOderRentenversicherungVermoegen> getLebensUndRentenVersicherungen() {
    return lebensUndRentenVersicherungen;
  }

  public void setLebensUndRentenVersicherungen(List<LebensOderRentenversicherungVermoegen> lebensUndRentenVersicherungen) {
    this.lebensUndRentenVersicherungen = lebensUndRentenVersicherungen;
  }

  public HaushaltsPositionen mietAusgaben(List<MietAusgaben> mietAusgaben) {
    this.mietAusgaben = mietAusgaben;
    return this;
  }

  public HaushaltsPositionen addMietAusgabenItem(MietAusgaben mietAusgabenItem) {
    if (this.mietAusgaben == null) {
      this.mietAusgaben = new ArrayList<MietAusgaben>();
    }
    this.mietAusgaben.add(mietAusgabenItem);
    return this;
  }

   /**
   * Get mietAusgaben
   * @return mietAusgaben
  **/
  @ApiModelProperty(value = "")
  public List<MietAusgaben> getMietAusgaben() {
    return mietAusgaben;
  }

  public void setMietAusgaben(List<MietAusgaben> mietAusgaben) {
    this.mietAusgaben = mietAusgaben;
  }

  public HaushaltsPositionen privateDarlehen(List<Verbindlichkeit> privateDarlehen) {
    this.privateDarlehen = privateDarlehen;
    return this;
  }

  public HaushaltsPositionen addPrivateDarlehenItem(Verbindlichkeit privateDarlehenItem) {
    if (this.privateDarlehen == null) {
      this.privateDarlehen = new ArrayList<Verbindlichkeit>();
    }
    this.privateDarlehen.add(privateDarlehenItem);
    return this;
  }

   /**
   * Get privateDarlehen
   * @return privateDarlehen
  **/
  @ApiModelProperty(value = "")
  public List<Verbindlichkeit> getPrivateDarlehen() {
    return privateDarlehen;
  }

  public void setPrivateDarlehen(List<Verbindlichkeit> privateDarlehen) {
    this.privateDarlehen = privateDarlehen;
  }

  public HaushaltsPositionen privateKrankenversicherung(List<AusgabenMonatlich> privateKrankenversicherung) {
    this.privateKrankenversicherung = privateKrankenversicherung;
    return this;
  }

  public HaushaltsPositionen addPrivateKrankenversicherungItem(AusgabenMonatlich privateKrankenversicherungItem) {
    if (this.privateKrankenversicherung == null) {
      this.privateKrankenversicherung = new ArrayList<AusgabenMonatlich>();
    }
    this.privateKrankenversicherung.add(privateKrankenversicherungItem);
    return this;
  }

   /**
   * Get privateKrankenversicherung
   * @return privateKrankenversicherung
  **/
  @ApiModelProperty(value = "")
  public List<AusgabenMonatlich> getPrivateKrankenversicherung() {
    return privateKrankenversicherung;
  }

  public void setPrivateKrankenversicherung(List<AusgabenMonatlich> privateKrankenversicherung) {
    this.privateKrankenversicherung = privateKrankenversicherung;
  }

  public HaushaltsPositionen ratenkredite(List<Verbindlichkeit> ratenkredite) {
    this.ratenkredite = ratenkredite;
    return this;
  }

  public HaushaltsPositionen addRatenkrediteItem(Verbindlichkeit ratenkrediteItem) {
    if (this.ratenkredite == null) {
      this.ratenkredite = new ArrayList<Verbindlichkeit>();
    }
    this.ratenkredite.add(ratenkrediteItem);
    return this;
  }

   /**
   * Get ratenkredite
   * @return ratenkredite
  **/
  @ApiModelProperty(value = "")
  public List<Verbindlichkeit> getRatenkredite() {
    return ratenkredite;
  }

  public void setRatenkredite(List<Verbindlichkeit> ratenkredite) {
    this.ratenkredite = ratenkredite;
  }

  public HaushaltsPositionen sonstigeAusgaben(List<AusgabenMonatlich> sonstigeAusgaben) {
    this.sonstigeAusgaben = sonstigeAusgaben;
    return this;
  }

  public HaushaltsPositionen addSonstigeAusgabenItem(AusgabenMonatlich sonstigeAusgabenItem) {
    if (this.sonstigeAusgaben == null) {
      this.sonstigeAusgaben = new ArrayList<AusgabenMonatlich>();
    }
    this.sonstigeAusgaben.add(sonstigeAusgabenItem);
    return this;
  }

   /**
   * Get sonstigeAusgaben
   * @return sonstigeAusgaben
  **/
  @ApiModelProperty(value = "")
  public List<AusgabenMonatlich> getSonstigeAusgaben() {
    return sonstigeAusgaben;
  }

  public void setSonstigeAusgaben(List<AusgabenMonatlich> sonstigeAusgaben) {
    this.sonstigeAusgaben = sonstigeAusgaben;
  }

  public HaushaltsPositionen sonstigeEinnahmen(List<EinnahmenMonatlich> sonstigeEinnahmen) {
    this.sonstigeEinnahmen = sonstigeEinnahmen;
    return this;
  }

  public HaushaltsPositionen addSonstigeEinnahmenItem(EinnahmenMonatlich sonstigeEinnahmenItem) {
    if (this.sonstigeEinnahmen == null) {
      this.sonstigeEinnahmen = new ArrayList<EinnahmenMonatlich>();
    }
    this.sonstigeEinnahmen.add(sonstigeEinnahmenItem);
    return this;
  }

   /**
   * Get sonstigeEinnahmen
   * @return sonstigeEinnahmen
  **/
  @ApiModelProperty(value = "")
  public List<EinnahmenMonatlich> getSonstigeEinnahmen() {
    return sonstigeEinnahmen;
  }

  public void setSonstigeEinnahmen(List<EinnahmenMonatlich> sonstigeEinnahmen) {
    this.sonstigeEinnahmen = sonstigeEinnahmen;
  }

  public HaushaltsPositionen sonstigeVerbindlichkeiten(List<Verbindlichkeit> sonstigeVerbindlichkeiten) {
    this.sonstigeVerbindlichkeiten = sonstigeVerbindlichkeiten;
    return this;
  }

  public HaushaltsPositionen addSonstigeVerbindlichkeitenItem(Verbindlichkeit sonstigeVerbindlichkeitenItem) {
    if (this.sonstigeVerbindlichkeiten == null) {
      this.sonstigeVerbindlichkeiten = new ArrayList<Verbindlichkeit>();
    }
    this.sonstigeVerbindlichkeiten.add(sonstigeVerbindlichkeitenItem);
    return this;
  }

   /**
   * Get sonstigeVerbindlichkeiten
   * @return sonstigeVerbindlichkeiten
  **/
  @ApiModelProperty(value = "")
  public List<Verbindlichkeit> getSonstigeVerbindlichkeiten() {
    return sonstigeVerbindlichkeiten;
  }

  public void setSonstigeVerbindlichkeiten(List<Verbindlichkeit> sonstigeVerbindlichkeiten) {
    this.sonstigeVerbindlichkeiten = sonstigeVerbindlichkeiten;
  }

  public HaushaltsPositionen sonstigeVermoegen(List<Vermoegen> sonstigeVermoegen) {
    this.sonstigeVermoegen = sonstigeVermoegen;
    return this;
  }

  public HaushaltsPositionen addSonstigeVermoegenItem(Vermoegen sonstigeVermoegenItem) {
    if (this.sonstigeVermoegen == null) {
      this.sonstigeVermoegen = new ArrayList<Vermoegen>();
    }
    this.sonstigeVermoegen.add(sonstigeVermoegenItem);
    return this;
  }

   /**
   * Get sonstigeVermoegen
   * @return sonstigeVermoegen
  **/
  @ApiModelProperty(value = "")
  public List<Vermoegen> getSonstigeVermoegen() {
    return sonstigeVermoegen;
  }

  public void setSonstigeVermoegen(List<Vermoegen> sonstigeVermoegen) {
    this.sonstigeVermoegen = sonstigeVermoegen;
  }

  public HaushaltsPositionen sparplaene(List<Sparplaene> sparplaene) {
    this.sparplaene = sparplaene;
    return this;
  }

  public HaushaltsPositionen addSparplaeneItem(Sparplaene sparplaeneItem) {
    if (this.sparplaene == null) {
      this.sparplaene = new ArrayList<Sparplaene>();
    }
    this.sparplaene.add(sparplaeneItem);
    return this;
  }

   /**
   * Get sparplaene
   * @return sparplaene
  **/
  @ApiModelProperty(value = "")
  public List<Sparplaene> getSparplaene() {
    return sparplaene;
  }

  public void setSparplaene(List<Sparplaene> sparplaene) {
    this.sparplaene = sparplaene;
  }

  public HaushaltsPositionen unbefristeteZusatzRenten(List<EinnahmenMonatlich> unbefristeteZusatzRenten) {
    this.unbefristeteZusatzRenten = unbefristeteZusatzRenten;
    return this;
  }

  public HaushaltsPositionen addUnbefristeteZusatzRentenItem(EinnahmenMonatlich unbefristeteZusatzRentenItem) {
    if (this.unbefristeteZusatzRenten == null) {
      this.unbefristeteZusatzRenten = new ArrayList<EinnahmenMonatlich>();
    }
    this.unbefristeteZusatzRenten.add(unbefristeteZusatzRentenItem);
    return this;
  }

   /**
   * Get unbefristeteZusatzRenten
   * @return unbefristeteZusatzRenten
  **/
  @ApiModelProperty(value = "")
  public List<EinnahmenMonatlich> getUnbefristeteZusatzRenten() {
    return unbefristeteZusatzRenten;
  }

  public void setUnbefristeteZusatzRenten(List<EinnahmenMonatlich> unbefristeteZusatzRenten) {
    this.unbefristeteZusatzRenten = unbefristeteZusatzRenten;
  }

  public HaushaltsPositionen unterhaltsVerpflichtungen(List<AusgabenMonatlich> unterhaltsVerpflichtungen) {
    this.unterhaltsVerpflichtungen = unterhaltsVerpflichtungen;
    return this;
  }

  public HaushaltsPositionen addUnterhaltsVerpflichtungenItem(AusgabenMonatlich unterhaltsVerpflichtungenItem) {
    if (this.unterhaltsVerpflichtungen == null) {
      this.unterhaltsVerpflichtungen = new ArrayList<AusgabenMonatlich>();
    }
    this.unterhaltsVerpflichtungen.add(unterhaltsVerpflichtungenItem);
    return this;
  }

   /**
   * Get unterhaltsVerpflichtungen
   * @return unterhaltsVerpflichtungen
  **/
  @ApiModelProperty(value = "")
  public List<AusgabenMonatlich> getUnterhaltsVerpflichtungen() {
    return unterhaltsVerpflichtungen;
  }

  public void setUnterhaltsVerpflichtungen(List<AusgabenMonatlich> unterhaltsVerpflichtungen) {
    this.unterhaltsVerpflichtungen = unterhaltsVerpflichtungen;
  }

  public HaushaltsPositionen variableEinkuenfte(List<EinnahmenMonatlich> variableEinkuenfte) {
    this.variableEinkuenfte = variableEinkuenfte;
    return this;
  }

  public HaushaltsPositionen addVariableEinkuenfteItem(EinnahmenMonatlich variableEinkuenfteItem) {
    if (this.variableEinkuenfte == null) {
      this.variableEinkuenfte = new ArrayList<EinnahmenMonatlich>();
    }
    this.variableEinkuenfte.add(variableEinkuenfteItem);
    return this;
  }

   /**
   * Get variableEinkuenfte
   * @return variableEinkuenfte
  **/
  @ApiModelProperty(value = "")
  public List<EinnahmenMonatlich> getVariableEinkuenfte() {
    return variableEinkuenfte;
  }

  public void setVariableEinkuenfte(List<EinnahmenMonatlich> variableEinkuenfte) {
    this.variableEinkuenfte = variableEinkuenfte;
  }

  public HaushaltsPositionen versicherungsAusgaben(List<AusgabenMonatlich> versicherungsAusgaben) {
    this.versicherungsAusgaben = versicherungsAusgaben;
    return this;
  }

  public HaushaltsPositionen addVersicherungsAusgabenItem(AusgabenMonatlich versicherungsAusgabenItem) {
    if (this.versicherungsAusgaben == null) {
      this.versicherungsAusgaben = new ArrayList<AusgabenMonatlich>();
    }
    this.versicherungsAusgaben.add(versicherungsAusgabenItem);
    return this;
  }

   /**
   * Get versicherungsAusgaben
   * @return versicherungsAusgaben
  **/
  @ApiModelProperty(value = "")
  public List<AusgabenMonatlich> getVersicherungsAusgaben() {
    return versicherungsAusgaben;
  }

  public void setVersicherungsAusgaben(List<AusgabenMonatlich> versicherungsAusgaben) {
    this.versicherungsAusgaben = versicherungsAusgaben;
  }

  public HaushaltsPositionen wertpapiere(List<Wertpapiere> wertpapiere) {
    this.wertpapiere = wertpapiere;
    return this;
  }

  public HaushaltsPositionen addWertpapiereItem(Wertpapiere wertpapiereItem) {
    if (this.wertpapiere == null) {
      this.wertpapiere = new ArrayList<Wertpapiere>();
    }
    this.wertpapiere.add(wertpapiereItem);
    return this;
  }

   /**
   * Get wertpapiere
   * @return wertpapiere
  **/
  @ApiModelProperty(value = "")
  public List<Wertpapiere> getWertpapiere() {
    return wertpapiere;
  }

  public void setWertpapiere(List<Wertpapiere> wertpapiere) {
    this.wertpapiere = wertpapiere;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HaushaltsPositionen haushaltsPositionen = (HaushaltsPositionen) o;
    return Objects.equals(this.bankUndSparguthaben, haushaltsPositionen.bankUndSparguthaben) &&
        Objects.equals(this.bausparvertraege, haushaltsPositionen.bausparvertraege) &&
        Objects.equals(this.ehegattenUnterhalt, haushaltsPositionen.ehegattenUnterhalt) &&
        Objects.equals(this.einkuenfteAusNebentaetigkeit, haushaltsPositionen.einkuenfteAusNebentaetigkeit) &&
        Objects.equals(this.lebensUndRentenVersicherungen, haushaltsPositionen.lebensUndRentenVersicherungen) &&
        Objects.equals(this.mietAusgaben, haushaltsPositionen.mietAusgaben) &&
        Objects.equals(this.privateDarlehen, haushaltsPositionen.privateDarlehen) &&
        Objects.equals(this.privateKrankenversicherung, haushaltsPositionen.privateKrankenversicherung) &&
        Objects.equals(this.ratenkredite, haushaltsPositionen.ratenkredite) &&
        Objects.equals(this.sonstigeAusgaben, haushaltsPositionen.sonstigeAusgaben) &&
        Objects.equals(this.sonstigeEinnahmen, haushaltsPositionen.sonstigeEinnahmen) &&
        Objects.equals(this.sonstigeVerbindlichkeiten, haushaltsPositionen.sonstigeVerbindlichkeiten) &&
        Objects.equals(this.sonstigeVermoegen, haushaltsPositionen.sonstigeVermoegen) &&
        Objects.equals(this.sparplaene, haushaltsPositionen.sparplaene) &&
        Objects.equals(this.unbefristeteZusatzRenten, haushaltsPositionen.unbefristeteZusatzRenten) &&
        Objects.equals(this.unterhaltsVerpflichtungen, haushaltsPositionen.unterhaltsVerpflichtungen) &&
        Objects.equals(this.variableEinkuenfte, haushaltsPositionen.variableEinkuenfte) &&
        Objects.equals(this.versicherungsAusgaben, haushaltsPositionen.versicherungsAusgaben) &&
        Objects.equals(this.wertpapiere, haushaltsPositionen.wertpapiere);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankUndSparguthaben, bausparvertraege, ehegattenUnterhalt, einkuenfteAusNebentaetigkeit, lebensUndRentenVersicherungen, mietAusgaben, privateDarlehen, privateKrankenversicherung, ratenkredite, sonstigeAusgaben, sonstigeEinnahmen, sonstigeVerbindlichkeiten, sonstigeVermoegen, sparplaene, unbefristeteZusatzRenten, unterhaltsVerpflichtungen, variableEinkuenfte, versicherungsAusgaben, wertpapiere);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HaushaltsPositionen {\n");
    
    sb.append("    bankUndSparguthaben: ").append(toIndentedString(bankUndSparguthaben)).append("\n");
    sb.append("    bausparvertraege: ").append(toIndentedString(bausparvertraege)).append("\n");
    sb.append("    ehegattenUnterhalt: ").append(toIndentedString(ehegattenUnterhalt)).append("\n");
    sb.append("    einkuenfteAusNebentaetigkeit: ").append(toIndentedString(einkuenfteAusNebentaetigkeit)).append("\n");
    sb.append("    lebensUndRentenVersicherungen: ").append(toIndentedString(lebensUndRentenVersicherungen)).append("\n");
    sb.append("    mietAusgaben: ").append(toIndentedString(mietAusgaben)).append("\n");
    sb.append("    privateDarlehen: ").append(toIndentedString(privateDarlehen)).append("\n");
    sb.append("    privateKrankenversicherung: ").append(toIndentedString(privateKrankenversicherung)).append("\n");
    sb.append("    ratenkredite: ").append(toIndentedString(ratenkredite)).append("\n");
    sb.append("    sonstigeAusgaben: ").append(toIndentedString(sonstigeAusgaben)).append("\n");
    sb.append("    sonstigeEinnahmen: ").append(toIndentedString(sonstigeEinnahmen)).append("\n");
    sb.append("    sonstigeVerbindlichkeiten: ").append(toIndentedString(sonstigeVerbindlichkeiten)).append("\n");
    sb.append("    sonstigeVermoegen: ").append(toIndentedString(sonstigeVermoegen)).append("\n");
    sb.append("    sparplaene: ").append(toIndentedString(sparplaene)).append("\n");
    sb.append("    unbefristeteZusatzRenten: ").append(toIndentedString(unbefristeteZusatzRenten)).append("\n");
    sb.append("    unterhaltsVerpflichtungen: ").append(toIndentedString(unterhaltsVerpflichtungen)).append("\n");
    sb.append("    variableEinkuenfte: ").append(toIndentedString(variableEinkuenfte)).append("\n");
    sb.append("    versicherungsAusgaben: ").append(toIndentedString(versicherungsAusgaben)).append("\n");
    sb.append("    wertpapiere: ").append(toIndentedString(wertpapiere)).append("\n");
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

