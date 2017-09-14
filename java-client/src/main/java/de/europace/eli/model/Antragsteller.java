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
import de.europace.eli.model.Beschaeftigung;
import de.europace.eli.model.LegitimationsDaten;
import de.europace.eli.model.Postadresse;
import de.europace.eli.model.Staat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Antragsteller
 */

public class Antragsteller {
  /**
   * Gets or Sets anrede
   */
  public enum AnredeEnum {
    FRAU("FRAU"),
    
    HERR("HERR");

    private String value;

    AnredeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AnredeEnum fromValue(String text) {
      for (AnredeEnum b : AnredeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("anrede")
  private AnredeEnum anrede = null;

  @JsonProperty("anschrift")
  private Postadresse anschrift = null;

  @JsonProperty("arbeitserlaubnis")
  private Boolean arbeitserlaubnis = null;

  @JsonProperty("arbeitserlaubnisBefristetBis")
  private LocalDate arbeitserlaubnisBefristetBis = null;

  /**
   * wenn keine deutsche Staatsangehörigkeit
   */
  public enum AufenthaltsTitelEnum {
    VISUM("VISUM"),
    
    AUFENTHALTS_ERLAUBNIS("AUFENTHALTS_ERLAUBNIS"),
    
    NIEDERLASSUNGS_ERLAUBNIS("NIEDERLASSUNGS_ERLAUBNIS"),
    
    DAUERAUFENTHALT_EU("DAUERAUFENTHALT_EU");

    private String value;

    AufenthaltsTitelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AufenthaltsTitelEnum fromValue(String text) {
      for (AufenthaltsTitelEnum b : AufenthaltsTitelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("aufenthaltsTitel")
  private AufenthaltsTitelEnum aufenthaltsTitel = null;

  @JsonProperty("aufenthaltsTitelBefristetBis")
  private LocalDate aufenthaltsTitelBefristetBis = null;

  @JsonProperty("beschaeftigung")
  private Beschaeftigung beschaeftigung = null;

  @JsonProperty("bruttoVorjahresEinkommen")
  private BigDecimal bruttoVorjahresEinkommen = null;

  @JsonProperty("email")
  private String email = null;

  /**
   * Gets or Sets familienstand
   */
  public enum FamilienstandEnum {
    GESCHIEDEN("GESCHIEDEN"),
    
    GETRENNT_LEBEND("GETRENNT_LEBEND"),
    
    LEBENSPARTNERSCHAFT("LEBENSPARTNERSCHAFT"),
    
    LEDIG("LEDIG"),
    
    VERHEIRATET("VERHEIRATET"),
    
    VERWITWET("VERWITWET");

    private String value;

    FamilienstandEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FamilienstandEnum fromValue(String text) {
      for (FamilienstandEnum b : FamilienstandEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("familienstand")
  private FamilienstandEnum familienstand = null;

  @JsonProperty("geburtsdatum")
  private LocalDate geburtsdatum = null;

  @JsonProperty("geburtsort")
  private String geburtsort = null;

  @JsonProperty("guetertrennungVereinbartWennVerheiratet")
  private Boolean guetertrennungVereinbartWennVerheiratet = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("inDeutschlandSeit")
  private LocalDate inDeutschlandSeit = null;

  @JsonProperty("legitimationsDaten")
  private LegitimationsDaten legitimationsDaten = null;

  @JsonProperty("nachname")
  private String nachname = null;

  @JsonProperty("staatsangehoerigkeit")
  private Staat staatsangehoerigkeit = null;

  @JsonProperty("telefonnummer")
  private String telefonnummer = null;

  @JsonProperty("telefonnummerVorwahl")
  private String telefonnummerVorwahl = null;

  @JsonProperty("titelDoktor")
  private Boolean titelDoktor = null;

  @JsonProperty("titelProfessor")
  private Boolean titelProfessor = null;

  @JsonProperty("vorAnschrift")
  private Postadresse vorAnschrift = null;

  @JsonProperty("vorname")
  private String vorname = null;

  @JsonProperty("weitereKontaktMoeglichkeiten")
  private String weitereKontaktMoeglichkeiten = null;

  @JsonProperty("wohnhaftSeit")
  private LocalDate wohnhaftSeit = null;

  public Antragsteller anrede(AnredeEnum anrede) {
    this.anrede = anrede;
    return this;
  }

   /**
   * Get anrede
   * @return anrede
  **/
  @ApiModelProperty(value = "")
  public AnredeEnum getAnrede() {
    return anrede;
  }

  public void setAnrede(AnredeEnum anrede) {
    this.anrede = anrede;
  }

  public Antragsteller anschrift(Postadresse anschrift) {
    this.anschrift = anschrift;
    return this;
  }

   /**
   * Get anschrift
   * @return anschrift
  **/
  @ApiModelProperty(value = "")
  public Postadresse getAnschrift() {
    return anschrift;
  }

  public void setAnschrift(Postadresse anschrift) {
    this.anschrift = anschrift;
  }

  public Antragsteller arbeitserlaubnis(Boolean arbeitserlaubnis) {
    this.arbeitserlaubnis = arbeitserlaubnis;
    return this;
  }

   /**
   * wenn keine deutsche Staatsangehörigkeit
   * @return arbeitserlaubnis
  **/
  @ApiModelProperty(example = "false", value = "wenn keine deutsche Staatsangehörigkeit")
  public Boolean getArbeitserlaubnis() {
    return arbeitserlaubnis;
  }

  public void setArbeitserlaubnis(Boolean arbeitserlaubnis) {
    this.arbeitserlaubnis = arbeitserlaubnis;
  }

  public Antragsteller arbeitserlaubnisBefristetBis(LocalDate arbeitserlaubnisBefristetBis) {
    this.arbeitserlaubnisBefristetBis = arbeitserlaubnisBefristetBis;
    return this;
  }

   /**
   * wenn Arbeitserlaubnis befristet
   * @return arbeitserlaubnisBefristetBis
  **/
  @ApiModelProperty(value = "wenn Arbeitserlaubnis befristet")
  public LocalDate getArbeitserlaubnisBefristetBis() {
    return arbeitserlaubnisBefristetBis;
  }

  public void setArbeitserlaubnisBefristetBis(LocalDate arbeitserlaubnisBefristetBis) {
    this.arbeitserlaubnisBefristetBis = arbeitserlaubnisBefristetBis;
  }

  public Antragsteller aufenthaltsTitel(AufenthaltsTitelEnum aufenthaltsTitel) {
    this.aufenthaltsTitel = aufenthaltsTitel;
    return this;
  }

   /**
   * wenn keine deutsche Staatsangehörigkeit
   * @return aufenthaltsTitel
  **/
  @ApiModelProperty(value = "wenn keine deutsche Staatsangehörigkeit")
  public AufenthaltsTitelEnum getAufenthaltsTitel() {
    return aufenthaltsTitel;
  }

  public void setAufenthaltsTitel(AufenthaltsTitelEnum aufenthaltsTitel) {
    this.aufenthaltsTitel = aufenthaltsTitel;
  }

  public Antragsteller aufenthaltsTitelBefristetBis(LocalDate aufenthaltsTitelBefristetBis) {
    this.aufenthaltsTitelBefristetBis = aufenthaltsTitelBefristetBis;
    return this;
  }

   /**
   * wenn Aufenthaltstitel befristet
   * @return aufenthaltsTitelBefristetBis
  **/
  @ApiModelProperty(value = "wenn Aufenthaltstitel befristet")
  public LocalDate getAufenthaltsTitelBefristetBis() {
    return aufenthaltsTitelBefristetBis;
  }

  public void setAufenthaltsTitelBefristetBis(LocalDate aufenthaltsTitelBefristetBis) {
    this.aufenthaltsTitelBefristetBis = aufenthaltsTitelBefristetBis;
  }

  public Antragsteller beschaeftigung(Beschaeftigung beschaeftigung) {
    this.beschaeftigung = beschaeftigung;
    return this;
  }

   /**
   * Get beschaeftigung
   * @return beschaeftigung
  **/
  @ApiModelProperty(value = "")
  public Beschaeftigung getBeschaeftigung() {
    return beschaeftigung;
  }

  public void setBeschaeftigung(Beschaeftigung beschaeftigung) {
    this.beschaeftigung = beschaeftigung;
  }

  public Antragsteller bruttoVorjahresEinkommen(BigDecimal bruttoVorjahresEinkommen) {
    this.bruttoVorjahresEinkommen = bruttoVorjahresEinkommen;
    return this;
  }

   /**
   * Get bruttoVorjahresEinkommen
   * @return bruttoVorjahresEinkommen
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getBruttoVorjahresEinkommen() {
    return bruttoVorjahresEinkommen;
  }

  public void setBruttoVorjahresEinkommen(BigDecimal bruttoVorjahresEinkommen) {
    this.bruttoVorjahresEinkommen = bruttoVorjahresEinkommen;
  }

  public Antragsteller email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "max.mustermann@test.de", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Antragsteller familienstand(FamilienstandEnum familienstand) {
    this.familienstand = familienstand;
    return this;
  }

   /**
   * Get familienstand
   * @return familienstand
  **/
  @ApiModelProperty(value = "")
  public FamilienstandEnum getFamilienstand() {
    return familienstand;
  }

  public void setFamilienstand(FamilienstandEnum familienstand) {
    this.familienstand = familienstand;
  }

  public Antragsteller geburtsdatum(LocalDate geburtsdatum) {
    this.geburtsdatum = geburtsdatum;
    return this;
  }

   /**
   * Get geburtsdatum
   * @return geburtsdatum
  **/
  @ApiModelProperty(value = "")
  public LocalDate getGeburtsdatum() {
    return geburtsdatum;
  }

  public void setGeburtsdatum(LocalDate geburtsdatum) {
    this.geburtsdatum = geburtsdatum;
  }

  public Antragsteller geburtsort(String geburtsort) {
    this.geburtsort = geburtsort;
    return this;
  }

   /**
   * Get geburtsort
   * @return geburtsort
  **/
  @ApiModelProperty(value = "")
  public String getGeburtsort() {
    return geburtsort;
  }

  public void setGeburtsort(String geburtsort) {
    this.geburtsort = geburtsort;
  }

  public Antragsteller guetertrennungVereinbartWennVerheiratet(Boolean guetertrennungVereinbartWennVerheiratet) {
    this.guetertrennungVereinbartWennVerheiratet = guetertrennungVereinbartWennVerheiratet;
    return this;
  }

   /**
   * nur wenn verheiratet
   * @return guetertrennungVereinbartWennVerheiratet
  **/
  @ApiModelProperty(example = "false", value = "nur wenn verheiratet")
  public Boolean getGuetertrennungVereinbartWennVerheiratet() {
    return guetertrennungVereinbartWennVerheiratet;
  }

  public void setGuetertrennungVereinbartWennVerheiratet(Boolean guetertrennungVereinbartWennVerheiratet) {
    this.guetertrennungVereinbartWennVerheiratet = guetertrennungVereinbartWennVerheiratet;
  }

  public Antragsteller id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Zur Referenzierung an anderer Stelle notwendig. Wenn nicht angegeben, dann wird dieses Feld automatisch befüllt.
   * @return id
  **/
  @ApiModelProperty(value = "Zur Referenzierung an anderer Stelle notwendig. Wenn nicht angegeben, dann wird dieses Feld automatisch befüllt.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Antragsteller inDeutschlandSeit(LocalDate inDeutschlandSeit) {
    this.inDeutschlandSeit = inDeutschlandSeit;
    return this;
  }

   /**
   * Get inDeutschlandSeit
   * @return inDeutschlandSeit
  **/
  @ApiModelProperty(value = "")
  public LocalDate getInDeutschlandSeit() {
    return inDeutschlandSeit;
  }

  public void setInDeutschlandSeit(LocalDate inDeutschlandSeit) {
    this.inDeutschlandSeit = inDeutschlandSeit;
  }

  public Antragsteller legitimationsDaten(LegitimationsDaten legitimationsDaten) {
    this.legitimationsDaten = legitimationsDaten;
    return this;
  }

   /**
   * Get legitimationsDaten
   * @return legitimationsDaten
  **/
  @ApiModelProperty(value = "")
  public LegitimationsDaten getLegitimationsDaten() {
    return legitimationsDaten;
  }

  public void setLegitimationsDaten(LegitimationsDaten legitimationsDaten) {
    this.legitimationsDaten = legitimationsDaten;
  }

  public Antragsteller nachname(String nachname) {
    this.nachname = nachname;
    return this;
  }

   /**
   * Get nachname
   * @return nachname
  **/
  @ApiModelProperty(value = "")
  public String getNachname() {
    return nachname;
  }

  public void setNachname(String nachname) {
    this.nachname = nachname;
  }

  public Antragsteller staatsangehoerigkeit(Staat staatsangehoerigkeit) {
    this.staatsangehoerigkeit = staatsangehoerigkeit;
    return this;
  }

   /**
   * Get staatsangehoerigkeit
   * @return staatsangehoerigkeit
  **/
  @ApiModelProperty(value = "")
  public Staat getStaatsangehoerigkeit() {
    return staatsangehoerigkeit;
  }

  public void setStaatsangehoerigkeit(Staat staatsangehoerigkeit) {
    this.staatsangehoerigkeit = staatsangehoerigkeit;
  }

  public Antragsteller telefonnummer(String telefonnummer) {
    this.telefonnummer = telefonnummer;
    return this;
  }

   /**
   * Get telefonnummer
   * @return telefonnummer
  **/
  @ApiModelProperty(value = "")
  public String getTelefonnummer() {
    return telefonnummer;
  }

  public void setTelefonnummer(String telefonnummer) {
    this.telefonnummer = telefonnummer;
  }

  public Antragsteller telefonnummerVorwahl(String telefonnummerVorwahl) {
    this.telefonnummerVorwahl = telefonnummerVorwahl;
    return this;
  }

   /**
   * Get telefonnummerVorwahl
   * @return telefonnummerVorwahl
  **/
  @ApiModelProperty(value = "")
  public String getTelefonnummerVorwahl() {
    return telefonnummerVorwahl;
  }

  public void setTelefonnummerVorwahl(String telefonnummerVorwahl) {
    this.telefonnummerVorwahl = telefonnummerVorwahl;
  }

  public Antragsteller titelDoktor(Boolean titelDoktor) {
    this.titelDoktor = titelDoktor;
    return this;
  }

   /**
   * Get titelDoktor
   * @return titelDoktor
  **/
  @ApiModelProperty(value = "")
  public Boolean getTitelDoktor() {
    return titelDoktor;
  }

  public void setTitelDoktor(Boolean titelDoktor) {
    this.titelDoktor = titelDoktor;
  }

  public Antragsteller titelProfessor(Boolean titelProfessor) {
    this.titelProfessor = titelProfessor;
    return this;
  }

   /**
   * Get titelProfessor
   * @return titelProfessor
  **/
  @ApiModelProperty(value = "")
  public Boolean getTitelProfessor() {
    return titelProfessor;
  }

  public void setTitelProfessor(Boolean titelProfessor) {
    this.titelProfessor = titelProfessor;
  }

  public Antragsteller vorAnschrift(Postadresse vorAnschrift) {
    this.vorAnschrift = vorAnschrift;
    return this;
  }

   /**
   * Get vorAnschrift
   * @return vorAnschrift
  **/
  @ApiModelProperty(value = "")
  public Postadresse getVorAnschrift() {
    return vorAnschrift;
  }

  public void setVorAnschrift(Postadresse vorAnschrift) {
    this.vorAnschrift = vorAnschrift;
  }

  public Antragsteller vorname(String vorname) {
    this.vorname = vorname;
    return this;
  }

   /**
   * Get vorname
   * @return vorname
  **/
  @ApiModelProperty(value = "")
  public String getVorname() {
    return vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public Antragsteller weitereKontaktMoeglichkeiten(String weitereKontaktMoeglichkeiten) {
    this.weitereKontaktMoeglichkeiten = weitereKontaktMoeglichkeiten;
    return this;
  }

   /**
   * Get weitereKontaktMoeglichkeiten
   * @return weitereKontaktMoeglichkeiten
  **/
  @ApiModelProperty(value = "")
  public String getWeitereKontaktMoeglichkeiten() {
    return weitereKontaktMoeglichkeiten;
  }

  public void setWeitereKontaktMoeglichkeiten(String weitereKontaktMoeglichkeiten) {
    this.weitereKontaktMoeglichkeiten = weitereKontaktMoeglichkeiten;
  }

  public Antragsteller wohnhaftSeit(LocalDate wohnhaftSeit) {
    this.wohnhaftSeit = wohnhaftSeit;
    return this;
  }

   /**
   * Get wohnhaftSeit
   * @return wohnhaftSeit
  **/
  @ApiModelProperty(value = "")
  public LocalDate getWohnhaftSeit() {
    return wohnhaftSeit;
  }

  public void setWohnhaftSeit(LocalDate wohnhaftSeit) {
    this.wohnhaftSeit = wohnhaftSeit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Antragsteller antragsteller = (Antragsteller) o;
    return Objects.equals(this.anrede, antragsteller.anrede) &&
        Objects.equals(this.anschrift, antragsteller.anschrift) &&
        Objects.equals(this.arbeitserlaubnis, antragsteller.arbeitserlaubnis) &&
        Objects.equals(this.arbeitserlaubnisBefristetBis, antragsteller.arbeitserlaubnisBefristetBis) &&
        Objects.equals(this.aufenthaltsTitel, antragsteller.aufenthaltsTitel) &&
        Objects.equals(this.aufenthaltsTitelBefristetBis, antragsteller.aufenthaltsTitelBefristetBis) &&
        Objects.equals(this.beschaeftigung, antragsteller.beschaeftigung) &&
        Objects.equals(this.bruttoVorjahresEinkommen, antragsteller.bruttoVorjahresEinkommen) &&
        Objects.equals(this.email, antragsteller.email) &&
        Objects.equals(this.familienstand, antragsteller.familienstand) &&
        Objects.equals(this.geburtsdatum, antragsteller.geburtsdatum) &&
        Objects.equals(this.geburtsort, antragsteller.geburtsort) &&
        Objects.equals(this.guetertrennungVereinbartWennVerheiratet, antragsteller.guetertrennungVereinbartWennVerheiratet) &&
        Objects.equals(this.id, antragsteller.id) &&
        Objects.equals(this.inDeutschlandSeit, antragsteller.inDeutschlandSeit) &&
        Objects.equals(this.legitimationsDaten, antragsteller.legitimationsDaten) &&
        Objects.equals(this.nachname, antragsteller.nachname) &&
        Objects.equals(this.staatsangehoerigkeit, antragsteller.staatsangehoerigkeit) &&
        Objects.equals(this.telefonnummer, antragsteller.telefonnummer) &&
        Objects.equals(this.telefonnummerVorwahl, antragsteller.telefonnummerVorwahl) &&
        Objects.equals(this.titelDoktor, antragsteller.titelDoktor) &&
        Objects.equals(this.titelProfessor, antragsteller.titelProfessor) &&
        Objects.equals(this.vorAnschrift, antragsteller.vorAnschrift) &&
        Objects.equals(this.vorname, antragsteller.vorname) &&
        Objects.equals(this.weitereKontaktMoeglichkeiten, antragsteller.weitereKontaktMoeglichkeiten) &&
        Objects.equals(this.wohnhaftSeit, antragsteller.wohnhaftSeit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anrede, anschrift, arbeitserlaubnis, arbeitserlaubnisBefristetBis, aufenthaltsTitel, aufenthaltsTitelBefristetBis, beschaeftigung, bruttoVorjahresEinkommen, email, familienstand, geburtsdatum, geburtsort, guetertrennungVereinbartWennVerheiratet, id, inDeutschlandSeit, legitimationsDaten, nachname, staatsangehoerigkeit, telefonnummer, telefonnummerVorwahl, titelDoktor, titelProfessor, vorAnschrift, vorname, weitereKontaktMoeglichkeiten, wohnhaftSeit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Antragsteller {\n");
    
    sb.append("    anrede: ").append(toIndentedString(anrede)).append("\n");
    sb.append("    anschrift: ").append(toIndentedString(anschrift)).append("\n");
    sb.append("    arbeitserlaubnis: ").append(toIndentedString(arbeitserlaubnis)).append("\n");
    sb.append("    arbeitserlaubnisBefristetBis: ").append(toIndentedString(arbeitserlaubnisBefristetBis)).append("\n");
    sb.append("    aufenthaltsTitel: ").append(toIndentedString(aufenthaltsTitel)).append("\n");
    sb.append("    aufenthaltsTitelBefristetBis: ").append(toIndentedString(aufenthaltsTitelBefristetBis)).append("\n");
    sb.append("    beschaeftigung: ").append(toIndentedString(beschaeftigung)).append("\n");
    sb.append("    bruttoVorjahresEinkommen: ").append(toIndentedString(bruttoVorjahresEinkommen)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    familienstand: ").append(toIndentedString(familienstand)).append("\n");
    sb.append("    geburtsdatum: ").append(toIndentedString(geburtsdatum)).append("\n");
    sb.append("    geburtsort: ").append(toIndentedString(geburtsort)).append("\n");
    sb.append("    guetertrennungVereinbartWennVerheiratet: ").append(toIndentedString(guetertrennungVereinbartWennVerheiratet)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inDeutschlandSeit: ").append(toIndentedString(inDeutschlandSeit)).append("\n");
    sb.append("    legitimationsDaten: ").append(toIndentedString(legitimationsDaten)).append("\n");
    sb.append("    nachname: ").append(toIndentedString(nachname)).append("\n");
    sb.append("    staatsangehoerigkeit: ").append(toIndentedString(staatsangehoerigkeit)).append("\n");
    sb.append("    telefonnummer: ").append(toIndentedString(telefonnummer)).append("\n");
    sb.append("    telefonnummerVorwahl: ").append(toIndentedString(telefonnummerVorwahl)).append("\n");
    sb.append("    titelDoktor: ").append(toIndentedString(titelDoktor)).append("\n");
    sb.append("    titelProfessor: ").append(toIndentedString(titelProfessor)).append("\n");
    sb.append("    vorAnschrift: ").append(toIndentedString(vorAnschrift)).append("\n");
    sb.append("    vorname: ").append(toIndentedString(vorname)).append("\n");
    sb.append("    weitereKontaktMoeglichkeiten: ").append(toIndentedString(weitereKontaktMoeglichkeiten)).append("\n");
    sb.append("    wohnhaftSeit: ").append(toIndentedString(wohnhaftSeit)).append("\n");
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

