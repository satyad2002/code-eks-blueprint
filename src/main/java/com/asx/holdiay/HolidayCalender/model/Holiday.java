package com.asx.holdiay.HolidayCalender.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Holiday
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-11-22T00:20:34.404919150Z[GMT]")


public class Holiday   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("information")
  private String information = null;

  @JsonProperty("date")
  private String date = null;

  
  /**
   * Gets or Sets jurisdiction
   */
  public enum JurisdictionEnum {
    NSW("NSW"),
    
    VIC("VIC"),
    
    SA("SA"),
    
    WA("WA"),
    
    ACT("ACT"),
    
    NT("NT");

    private String value;

    JurisdictionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static JurisdictionEnum fromValue(String text) {
      for (JurisdictionEnum b : JurisdictionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("jurisdiction")
  private JurisdictionEnum jurisdiction = null;

  public Holiday id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "10", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Holiday name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Labor Holiday", description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Holiday information(String information) {
    this.information = information;
    return this;
  }

  /**
   * Get information
   * @return information
   **/
  @Schema(example = "7", description = "")
  
    public String getInformation() {
    return information;
  }

  public void setInformation(String information) {
    this.information = information;
  }

  public Holiday date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(description = "")
  
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  

  public Holiday jurisdiction(JurisdictionEnum jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

  /**
   * Get jurisdiction
   * @return jurisdiction
   **/
  @Schema(description = "")
  
    public JurisdictionEnum getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(JurisdictionEnum jurisdiction) {
    this.jurisdiction = jurisdiction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Holiday holiday = (Holiday) o;
    return Objects.equals(this.id, holiday.id) &&
        Objects.equals(this.name, holiday.name) &&
        Objects.equals(this.information, holiday.information) &&
        Objects.equals(this.date, holiday.date) &&
        
        Objects.equals(this.jurisdiction, holiday.jurisdiction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, information, date,  jurisdiction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Holiday {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    information: ").append(toIndentedString(information)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");

    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
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
