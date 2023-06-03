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
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * FeatureTvshowAttributesSeasonsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T20:07:01.076156+02:00[Europe/Amsterdam]")
public class FeatureTvshowAttributesSeasonsInner {
  public static final String SERIALIZED_NAME_SEASON_NUMBER = "season_number";
  @SerializedName(SERIALIZED_NAME_SEASON_NUMBER)
  private BigDecimal seasonNumber;

  public static final String SERIALIZED_NAME_EPISODES = "episodes";
  @SerializedName(SERIALIZED_NAME_EPISODES)
  private Set<FeatureTvshowAttributesSeasonsInnerEpisodesInner> episodes;

  public FeatureTvshowAttributesSeasonsInner() {
  }

  public FeatureTvshowAttributesSeasonsInner seasonNumber(BigDecimal seasonNumber) {

    this.seasonNumber = seasonNumber;
    return this;
  }

   /**
   * Get seasonNumber
   * @return seasonNumber
  **/
  @javax.annotation.Nonnull

  public BigDecimal getSeasonNumber() {
    return seasonNumber;
  }


  public void setSeasonNumber(BigDecimal seasonNumber) {
    this.seasonNumber = seasonNumber;
  }


  public FeatureTvshowAttributesSeasonsInner episodes(Set<FeatureTvshowAttributesSeasonsInnerEpisodesInner> episodes) {

    this.episodes = episodes;
    return this;
  }

  public FeatureTvshowAttributesSeasonsInner addEpisodesItem(FeatureTvshowAttributesSeasonsInnerEpisodesInner episodesItem) {
    if (this.episodes == null) {
      this.episodes = new LinkedHashSet<>();
    }
    this.episodes.add(episodesItem);
    return this;
  }

   /**
   * Get episodes
   * @return episodes
  **/
  @javax.annotation.Nullable

  public Set<FeatureTvshowAttributesSeasonsInnerEpisodesInner> getEpisodes() {
    return episodes;
  }


  public void setEpisodes(Set<FeatureTvshowAttributesSeasonsInnerEpisodesInner> episodes) {
    this.episodes = episodes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureTvshowAttributesSeasonsInner featureTvshowAttributesSeasonsInner = (FeatureTvshowAttributesSeasonsInner) o;
    return Objects.equals(this.seasonNumber, featureTvshowAttributesSeasonsInner.seasonNumber) &&
        Objects.equals(this.episodes, featureTvshowAttributesSeasonsInner.episodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seasonNumber, episodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureTvshowAttributesSeasonsInner {\n");
    sb.append("    seasonNumber: ").append(toIndentedString(seasonNumber)).append("\n");
    sb.append("    episodes: ").append(toIndentedString(episodes)).append("\n");
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
