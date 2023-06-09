/*
 * OpenSubtitles API
 * Explore subtitles API here
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: support@opensubtitles.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package nl.giejay.subtitles.opensubtitles.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Formats200ResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T20:07:01.076156+02:00[Europe/Amsterdam]")
public class Formats200ResponseData {
  public static final String SERIALIZED_NAME_OUTPUT_FORMATS = "output_formats";
  @SerializedName(SERIALIZED_NAME_OUTPUT_FORMATS)
  private List<Object> outputFormats = new ArrayList<>();

  public Formats200ResponseData() {
  }

  public Formats200ResponseData outputFormats(List<Object> outputFormats) {

    this.outputFormats = outputFormats;
    return this;
  }

  public Formats200ResponseData addOutputFormatsItem(Object outputFormatsItem) {
    if (this.outputFormats == null) {
      this.outputFormats = new ArrayList<>();
    }
    this.outputFormats.add(outputFormatsItem);
    return this;
  }

   /**
   * Get outputFormats
   * @return outputFormats
  **/
  @javax.annotation.Nonnull

  public List<Object> getOutputFormats() {
    return outputFormats;
  }


  public void setOutputFormats(List<Object> outputFormats) {
    this.outputFormats = outputFormats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Formats200ResponseData formats200ResponseData = (Formats200ResponseData) o;
    return Objects.equals(this.outputFormats, formats200ResponseData.outputFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputFormats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Formats200ResponseData {\n");
    sb.append("    outputFormats: ").append(toIndentedString(outputFormats)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

