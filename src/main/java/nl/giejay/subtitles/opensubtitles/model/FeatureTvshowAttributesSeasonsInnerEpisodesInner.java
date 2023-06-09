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

import java.math.BigDecimal;

/**
 * FeatureTvshowAttributesSeasonsInnerEpisodesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T20:07:01.076156+02:00[Europe/Amsterdam]")
public class FeatureTvshowAttributesSeasonsInnerEpisodesInner {
  public static final String SERIALIZED_NAME_EPISODE_NUMBER = "episode_number";
  @SerializedName(SERIALIZED_NAME_EPISODE_NUMBER)
  private BigDecimal episodeNumber;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_FEATURE_ID = "feature_id";
  @SerializedName(SERIALIZED_NAME_FEATURE_ID)
  private BigDecimal featureId;

  public static final String SERIALIZED_NAME_FEATURE_IMDB_ID = "feature_imdb_id";
  @SerializedName(SERIALIZED_NAME_FEATURE_IMDB_ID)
  private BigDecimal featureImdbId;

  public FeatureTvshowAttributesSeasonsInnerEpisodesInner() {
  }

  public FeatureTvshowAttributesSeasonsInnerEpisodesInner episodeNumber(BigDecimal episodeNumber) {

    this.episodeNumber = episodeNumber;
    return this;
  }

   /**
   * Get episodeNumber
   * @return episodeNumber
  **/
  @javax.annotation.Nonnull

  public BigDecimal getEpisodeNumber() {
    return episodeNumber;
  }


  public void setEpisodeNumber(BigDecimal episodeNumber) {
    this.episodeNumber = episodeNumber;
  }


  public FeatureTvshowAttributesSeasonsInnerEpisodesInner title(String title) {

    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public FeatureTvshowAttributesSeasonsInnerEpisodesInner featureId(BigDecimal featureId) {

    this.featureId = featureId;
    return this;
  }

   /**
   * Get featureId
   * @return featureId
  **/
  @javax.annotation.Nonnull

  public BigDecimal getFeatureId() {
    return featureId;
  }


  public void setFeatureId(BigDecimal featureId) {
    this.featureId = featureId;
  }


  public FeatureTvshowAttributesSeasonsInnerEpisodesInner featureImdbId(BigDecimal featureImdbId) {

    this.featureImdbId = featureImdbId;
    return this;
  }

   /**
   * Get featureImdbId
   * @return featureImdbId
  **/
  @javax.annotation.Nonnull

  public BigDecimal getFeatureImdbId() {
    return featureImdbId;
  }


  public void setFeatureImdbId(BigDecimal featureImdbId) {
    this.featureImdbId = featureImdbId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureTvshowAttributesSeasonsInnerEpisodesInner featureTvshowAttributesSeasonsInnerEpisodesInner = (FeatureTvshowAttributesSeasonsInnerEpisodesInner) o;
    return Objects.equals(this.episodeNumber, featureTvshowAttributesSeasonsInnerEpisodesInner.episodeNumber) &&
        Objects.equals(this.title, featureTvshowAttributesSeasonsInnerEpisodesInner.title) &&
        Objects.equals(this.featureId, featureTvshowAttributesSeasonsInnerEpisodesInner.featureId) &&
        Objects.equals(this.featureImdbId, featureTvshowAttributesSeasonsInnerEpisodesInner.featureImdbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(episodeNumber, title, featureId, featureImdbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureTvshowAttributesSeasonsInnerEpisodesInner {\n");
    sb.append("    episodeNumber: ").append(toIndentedString(episodeNumber)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    featureImdbId: ").append(toIndentedString(featureImdbId)).append("\n");
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

