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
import java.util.ArrayList;
import java.util.List;

/**
 * FeatureEpisodeAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T20:07:01.076156+02:00[Europe/Amsterdam]")
public class FeatureEpisodeAttributes {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ORIGINAL_TITLE = "original_title";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_TITLE)
  private Object originalTitle;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year;

  public static final String SERIALIZED_NAME_PARENT_IMDB_ID = "parent_imdb_id";
  @SerializedName(SERIALIZED_NAME_PARENT_IMDB_ID)
  private Object parentImdbId;

  public static final String SERIALIZED_NAME_PARENT_TITLE = "parent_title";
  @SerializedName(SERIALIZED_NAME_PARENT_TITLE)
  private String parentTitle;

  public static final String SERIALIZED_NAME_SEASON_NUMBER = "season_number";
  @SerializedName(SERIALIZED_NAME_SEASON_NUMBER)
  private BigDecimal seasonNumber;

  public static final String SERIALIZED_NAME_EPISODE_NUMBER = "episode_number";
  @SerializedName(SERIALIZED_NAME_EPISODE_NUMBER)
  private BigDecimal episodeNumber;

  public static final String SERIALIZED_NAME_IMDB_ID = "imdb_id";
  @SerializedName(SERIALIZED_NAME_IMDB_ID)
  private BigDecimal imdbId;

  public static final String SERIALIZED_NAME_TMDB_ID = "tmdb_id";
  @SerializedName(SERIALIZED_NAME_TMDB_ID)
  private BigDecimal tmdbId;

  public static final String SERIALIZED_NAME_TITLE_AKA = "title_aka";
  @SerializedName(SERIALIZED_NAME_TITLE_AKA)
  private List<Object> titleAka = new ArrayList<>();

  public static final String SERIALIZED_NAME_FEATURE_ID = "feature_id";
  @SerializedName(SERIALIZED_NAME_FEATURE_ID)
  private String featureId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_IMG_URL = "img_url";
  @SerializedName(SERIALIZED_NAME_IMG_URL)
  private String imgUrl;

  public static final String SERIALIZED_NAME_SUBTITLES_COUNTS = "subtitles_counts";
  @SerializedName(SERIALIZED_NAME_SUBTITLES_COUNTS)
  private FeatureEpisodeAttributesSubtitlesCounts subtitlesCounts;

  public static final String SERIALIZED_NAME_SUBTITLES_COUNT = "subtitles_count";
  @SerializedName(SERIALIZED_NAME_SUBTITLES_COUNT)
  private BigDecimal subtitlesCount;

  public FeatureEpisodeAttributes() {
  }

  public FeatureEpisodeAttributes title(String title) {

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


  public FeatureEpisodeAttributes originalTitle(Object originalTitle) {

    this.originalTitle = originalTitle;
    return this;
  }

   /**
   * Get originalTitle
   * @return originalTitle
  **/
  @javax.annotation.Nullable

  public Object getOriginalTitle() {
    return originalTitle;
  }


  public void setOriginalTitle(Object originalTitle) {
    this.originalTitle = originalTitle;
  }


  public FeatureEpisodeAttributes year(String year) {

    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nonnull

  public String getYear() {
    return year;
  }


  public void setYear(String year) {
    this.year = year;
  }


  public FeatureEpisodeAttributes parentImdbId(Object parentImdbId) {

    this.parentImdbId = parentImdbId;
    return this;
  }

   /**
   * Get parentImdbId
   * @return parentImdbId
  **/
  @javax.annotation.Nullable

  public Object getParentImdbId() {
    return parentImdbId;
  }


  public void setParentImdbId(Object parentImdbId) {
    this.parentImdbId = parentImdbId;
  }


  public FeatureEpisodeAttributes parentTitle(String parentTitle) {

    this.parentTitle = parentTitle;
    return this;
  }

   /**
   * Get parentTitle
   * @return parentTitle
  **/
  @javax.annotation.Nonnull

  public String getParentTitle() {
    return parentTitle;
  }


  public void setParentTitle(String parentTitle) {
    this.parentTitle = parentTitle;
  }


  public FeatureEpisodeAttributes seasonNumber(BigDecimal seasonNumber) {

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


  public FeatureEpisodeAttributes episodeNumber(BigDecimal episodeNumber) {

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


  public FeatureEpisodeAttributes imdbId(BigDecimal imdbId) {

    this.imdbId = imdbId;
    return this;
  }

   /**
   * Get imdbId
   * @return imdbId
  **/
  @javax.annotation.Nonnull

  public BigDecimal getImdbId() {
    return imdbId;
  }


  public void setImdbId(BigDecimal imdbId) {
    this.imdbId = imdbId;
  }


  public FeatureEpisodeAttributes tmdbId(BigDecimal tmdbId) {

    this.tmdbId = tmdbId;
    return this;
  }

   /**
   * Get tmdbId
   * @return tmdbId
  **/
  @javax.annotation.Nonnull

  public BigDecimal getTmdbId() {
    return tmdbId;
  }


  public void setTmdbId(BigDecimal tmdbId) {
    this.tmdbId = tmdbId;
  }


  public FeatureEpisodeAttributes titleAka(List<Object> titleAka) {

    this.titleAka = titleAka;
    return this;
  }

  public FeatureEpisodeAttributes addTitleAkaItem(Object titleAkaItem) {
    if (this.titleAka == null) {
      this.titleAka = new ArrayList<>();
    }
    this.titleAka.add(titleAkaItem);
    return this;
  }

   /**
   * Get titleAka
   * @return titleAka
  **/
  @javax.annotation.Nonnull

  public List<Object> getTitleAka() {
    return titleAka;
  }


  public void setTitleAka(List<Object> titleAka) {
    this.titleAka = titleAka;
  }


  public FeatureEpisodeAttributes featureId(String featureId) {

    this.featureId = featureId;
    return this;
  }

   /**
   * Get featureId
   * @return featureId
  **/
  @javax.annotation.Nonnull

  public String getFeatureId() {
    return featureId;
  }


  public void setFeatureId(String featureId) {
    this.featureId = featureId;
  }


  public FeatureEpisodeAttributes url(String url) {

    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public FeatureEpisodeAttributes imgUrl(String imgUrl) {

    this.imgUrl = imgUrl;
    return this;
  }

   /**
   * Get imgUrl
   * @return imgUrl
  **/
  @javax.annotation.Nonnull

  public String getImgUrl() {
    return imgUrl;
  }


  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public FeatureEpisodeAttributes subtitlesCounts(FeatureEpisodeAttributesSubtitlesCounts subtitlesCounts) {

    this.subtitlesCounts = subtitlesCounts;
    return this;
  }

   /**
   * Get subtitlesCounts
   * @return subtitlesCounts
  **/
  @javax.annotation.Nonnull

  public FeatureEpisodeAttributesSubtitlesCounts getSubtitlesCounts() {
    return subtitlesCounts;
  }


  public void setSubtitlesCounts(FeatureEpisodeAttributesSubtitlesCounts subtitlesCounts) {
    this.subtitlesCounts = subtitlesCounts;
  }


  public FeatureEpisodeAttributes subtitlesCount(BigDecimal subtitlesCount) {

    this.subtitlesCount = subtitlesCount;
    return this;
  }

   /**
   * Get subtitlesCount
   * @return subtitlesCount
  **/
  @javax.annotation.Nonnull

  public BigDecimal getSubtitlesCount() {
    return subtitlesCount;
  }


  public void setSubtitlesCount(BigDecimal subtitlesCount) {
    this.subtitlesCount = subtitlesCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureEpisodeAttributes featureEpisodeAttributes = (FeatureEpisodeAttributes) o;
    return Objects.equals(this.title, featureEpisodeAttributes.title) &&
        Objects.equals(this.originalTitle, featureEpisodeAttributes.originalTitle) &&
        Objects.equals(this.year, featureEpisodeAttributes.year) &&
        Objects.equals(this.parentImdbId, featureEpisodeAttributes.parentImdbId) &&
        Objects.equals(this.parentTitle, featureEpisodeAttributes.parentTitle) &&
        Objects.equals(this.seasonNumber, featureEpisodeAttributes.seasonNumber) &&
        Objects.equals(this.episodeNumber, featureEpisodeAttributes.episodeNumber) &&
        Objects.equals(this.imdbId, featureEpisodeAttributes.imdbId) &&
        Objects.equals(this.tmdbId, featureEpisodeAttributes.tmdbId) &&
        Objects.equals(this.titleAka, featureEpisodeAttributes.titleAka) &&
        Objects.equals(this.featureId, featureEpisodeAttributes.featureId) &&
        Objects.equals(this.url, featureEpisodeAttributes.url) &&
        Objects.equals(this.imgUrl, featureEpisodeAttributes.imgUrl) &&
        Objects.equals(this.subtitlesCounts, featureEpisodeAttributes.subtitlesCounts) &&
        Objects.equals(this.subtitlesCount, featureEpisodeAttributes.subtitlesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, originalTitle, year, parentImdbId, parentTitle, seasonNumber, episodeNumber, imdbId, tmdbId, titleAka, featureId, url, imgUrl, subtitlesCounts, subtitlesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureEpisodeAttributes {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    parentImdbId: ").append(toIndentedString(parentImdbId)).append("\n");
    sb.append("    parentTitle: ").append(toIndentedString(parentTitle)).append("\n");
    sb.append("    seasonNumber: ").append(toIndentedString(seasonNumber)).append("\n");
    sb.append("    episodeNumber: ").append(toIndentedString(episodeNumber)).append("\n");
    sb.append("    imdbId: ").append(toIndentedString(imdbId)).append("\n");
    sb.append("    tmdbId: ").append(toIndentedString(tmdbId)).append("\n");
    sb.append("    titleAka: ").append(toIndentedString(titleAka)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
    sb.append("    subtitlesCounts: ").append(toIndentedString(subtitlesCounts)).append("\n");
    sb.append("    subtitlesCount: ").append(toIndentedString(subtitlesCount)).append("\n");
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

