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
 * FeatureTvshowAttributesSubtitlesCounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T20:07:01.076156+02:00[Europe/Amsterdam]")
public class FeatureTvshowAttributesSubtitlesCounts {
  public static final String SERIALIZED_NAME_PL = "pl";
  @SerializedName(SERIALIZED_NAME_PL)
  private BigDecimal pl;

  public static final String SERIALIZED_NAME_EN = "en";
  @SerializedName(SERIALIZED_NAME_EN)
  private BigDecimal en;

  public static final String SERIALIZED_NAME_PT_B_R = "pt-BR";
  @SerializedName(SERIALIZED_NAME_PT_B_R)
  private BigDecimal ptBR;

  public static final String SERIALIZED_NAME_RO = "ro";
  @SerializedName(SERIALIZED_NAME_RO)
  private BigDecimal ro;

  public static final String SERIALIZED_NAME_NL = "nl";
  @SerializedName(SERIALIZED_NAME_NL)
  private BigDecimal nl;

  public static final String SERIALIZED_NAME_PT_P_T = "pt-PT";
  @SerializedName(SERIALIZED_NAME_PT_P_T)
  private BigDecimal ptPT;

  public static final String SERIALIZED_NAME_ES = "es";
  @SerializedName(SERIALIZED_NAME_ES)
  private BigDecimal es;

  public static final String SERIALIZED_NAME_HE = "he";
  @SerializedName(SERIALIZED_NAME_HE)
  private BigDecimal he;

  public static final String SERIALIZED_NAME_HU = "hu";
  @SerializedName(SERIALIZED_NAME_HU)
  private BigDecimal hu;

  public static final String SERIALIZED_NAME_EL = "el";
  @SerializedName(SERIALIZED_NAME_EL)
  private BigDecimal el;

  public static final String SERIALIZED_NAME_FR = "fr";
  @SerializedName(SERIALIZED_NAME_FR)
  private BigDecimal fr;

  public static final String SERIALIZED_NAME_TR = "tr";
  @SerializedName(SERIALIZED_NAME_TR)
  private BigDecimal tr;

  public static final String SERIALIZED_NAME_CS = "cs";
  @SerializedName(SERIALIZED_NAME_CS)
  private BigDecimal cs;

  public static final String SERIALIZED_NAME_FI = "fi";
  @SerializedName(SERIALIZED_NAME_FI)
  private BigDecimal fi;

  public static final String SERIALIZED_NAME_AR = "ar";
  @SerializedName(SERIALIZED_NAME_AR)
  private BigDecimal ar;

  public static final String SERIALIZED_NAME_HR = "hr";
  @SerializedName(SERIALIZED_NAME_HR)
  private BigDecimal hr;

  public static final String SERIALIZED_NAME_SL = "sl";
  @SerializedName(SERIALIZED_NAME_SL)
  private BigDecimal sl;

  public static final String SERIALIZED_NAME_BG = "bg";
  @SerializedName(SERIALIZED_NAME_BG)
  private BigDecimal bg;

  public static final String SERIALIZED_NAME_SR = "sr";
  @SerializedName(SERIALIZED_NAME_SR)
  private BigDecimal sr;

  public static final String SERIALIZED_NAME_SV = "sv";
  @SerializedName(SERIALIZED_NAME_SV)
  private BigDecimal sv;

  public static final String SERIALIZED_NAME_DE = "de";
  @SerializedName(SERIALIZED_NAME_DE)
  private BigDecimal de;

  public static final String SERIALIZED_NAME_ET = "et";
  @SerializedName(SERIALIZED_NAME_ET)
  private BigDecimal et;

  public static final String SERIALIZED_NAME_DA = "da";
  @SerializedName(SERIALIZED_NAME_DA)
  private BigDecimal da;

  public static final String SERIALIZED_NAME_BS = "bs";
  @SerializedName(SERIALIZED_NAME_BS)
  private BigDecimal bs;

  public static final String SERIALIZED_NAME_IT = "it";
  @SerializedName(SERIALIZED_NAME_IT)
  private BigDecimal it;

  public static final String SERIALIZED_NAME_MK = "mk";
  @SerializedName(SERIALIZED_NAME_MK)
  private BigDecimal mk;

  public static final String SERIALIZED_NAME_RU = "ru";
  @SerializedName(SERIALIZED_NAME_RU)
  private BigDecimal ru;

  public static final String SERIALIZED_NAME_NO = "no";
  @SerializedName(SERIALIZED_NAME_NO)
  private BigDecimal no;

  public static final String SERIALIZED_NAME_TH = "th";
  @SerializedName(SERIALIZED_NAME_TH)
  private BigDecimal th;

  public static final String SERIALIZED_NAME_VI = "vi";
  @SerializedName(SERIALIZED_NAME_VI)
  private BigDecimal vi;

  public static final String SERIALIZED_NAME_JA = "ja";
  @SerializedName(SERIALIZED_NAME_JA)
  private BigDecimal ja;

  public static final String SERIALIZED_NAME_FA = "fa";
  @SerializedName(SERIALIZED_NAME_FA)
  private BigDecimal fa;

  public static final String SERIALIZED_NAME_ZH_C_N = "zh-CN";
  @SerializedName(SERIALIZED_NAME_ZH_C_N)
  private BigDecimal zhCN;

  public static final String SERIALIZED_NAME_CA = "ca";
  @SerializedName(SERIALIZED_NAME_CA)
  private BigDecimal ca;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_SK = "sk";
  @SerializedName(SERIALIZED_NAME_SK)
  private BigDecimal sk;

  public static final String SERIALIZED_NAME_KO = "ko";
  @SerializedName(SERIALIZED_NAME_KO)
  private BigDecimal ko;

  public static final String SERIALIZED_NAME_ZH_T_W = "zh-TW";
  @SerializedName(SERIALIZED_NAME_ZH_T_W)
  private BigDecimal zhTW;

  public FeatureTvshowAttributesSubtitlesCounts() {
  }

  public FeatureTvshowAttributesSubtitlesCounts pl(BigDecimal pl) {

    this.pl = pl;
    return this;
  }

   /**
   * Get pl
   * @return pl
  **/
  @javax.annotation.Nonnull

  public BigDecimal getPl() {
    return pl;
  }


  public void setPl(BigDecimal pl) {
    this.pl = pl;
  }


  public FeatureTvshowAttributesSubtitlesCounts en(BigDecimal en) {

    this.en = en;
    return this;
  }

   /**
   * Get en
   * @return en
  **/
  @javax.annotation.Nonnull

  public BigDecimal getEn() {
    return en;
  }


  public void setEn(BigDecimal en) {
    this.en = en;
  }


  public FeatureTvshowAttributesSubtitlesCounts ptBR(BigDecimal ptBR) {

    this.ptBR = ptBR;
    return this;
  }

   /**
   * Get ptBR
   * @return ptBR
  **/
  @javax.annotation.Nonnull

  public BigDecimal getPtBR() {
    return ptBR;
  }


  public void setPtBR(BigDecimal ptBR) {
    this.ptBR = ptBR;
  }


  public FeatureTvshowAttributesSubtitlesCounts ro(BigDecimal ro) {

    this.ro = ro;
    return this;
  }

   /**
   * Get ro
   * @return ro
  **/
  @javax.annotation.Nonnull

  public BigDecimal getRo() {
    return ro;
  }


  public void setRo(BigDecimal ro) {
    this.ro = ro;
  }


  public FeatureTvshowAttributesSubtitlesCounts nl(BigDecimal nl) {

    this.nl = nl;
    return this;
  }

   /**
   * Get nl
   * @return nl
  **/
  @javax.annotation.Nonnull

  public BigDecimal getNl() {
    return nl;
  }


  public void setNl(BigDecimal nl) {
    this.nl = nl;
  }


  public FeatureTvshowAttributesSubtitlesCounts ptPT(BigDecimal ptPT) {

    this.ptPT = ptPT;
    return this;
  }

   /**
   * Get ptPT
   * @return ptPT
  **/
  @javax.annotation.Nonnull

  public BigDecimal getPtPT() {
    return ptPT;
  }


  public void setPtPT(BigDecimal ptPT) {
    this.ptPT = ptPT;
  }


  public FeatureTvshowAttributesSubtitlesCounts es(BigDecimal es) {

    this.es = es;
    return this;
  }

   /**
   * Get es
   * @return es
  **/
  @javax.annotation.Nonnull

  public BigDecimal getEs() {
    return es;
  }


  public void setEs(BigDecimal es) {
    this.es = es;
  }


  public FeatureTvshowAttributesSubtitlesCounts he(BigDecimal he) {

    this.he = he;
    return this;
  }

   /**
   * Get he
   * @return he
  **/
  @javax.annotation.Nonnull

  public BigDecimal getHe() {
    return he;
  }


  public void setHe(BigDecimal he) {
    this.he = he;
  }


  public FeatureTvshowAttributesSubtitlesCounts hu(BigDecimal hu) {

    this.hu = hu;
    return this;
  }

   /**
   * Get hu
   * @return hu
  **/
  @javax.annotation.Nonnull

  public BigDecimal getHu() {
    return hu;
  }


  public void setHu(BigDecimal hu) {
    this.hu = hu;
  }


  public FeatureTvshowAttributesSubtitlesCounts el(BigDecimal el) {

    this.el = el;
    return this;
  }

   /**
   * Get el
   * @return el
  **/
  @javax.annotation.Nonnull

  public BigDecimal getEl() {
    return el;
  }


  public void setEl(BigDecimal el) {
    this.el = el;
  }


  public FeatureTvshowAttributesSubtitlesCounts fr(BigDecimal fr) {

    this.fr = fr;
    return this;
  }

   /**
   * Get fr
   * @return fr
  **/
  @javax.annotation.Nonnull

  public BigDecimal getFr() {
    return fr;
  }


  public void setFr(BigDecimal fr) {
    this.fr = fr;
  }


  public FeatureTvshowAttributesSubtitlesCounts tr(BigDecimal tr) {

    this.tr = tr;
    return this;
  }

   /**
   * Get tr
   * @return tr
  **/
  @javax.annotation.Nonnull

  public BigDecimal getTr() {
    return tr;
  }


  public void setTr(BigDecimal tr) {
    this.tr = tr;
  }


  public FeatureTvshowAttributesSubtitlesCounts cs(BigDecimal cs) {

    this.cs = cs;
    return this;
  }

   /**
   * Get cs
   * @return cs
  **/
  @javax.annotation.Nonnull

  public BigDecimal getCs() {
    return cs;
  }


  public void setCs(BigDecimal cs) {
    this.cs = cs;
  }


  public FeatureTvshowAttributesSubtitlesCounts fi(BigDecimal fi) {

    this.fi = fi;
    return this;
  }

   /**
   * Get fi
   * @return fi
  **/
  @javax.annotation.Nonnull

  public BigDecimal getFi() {
    return fi;
  }


  public void setFi(BigDecimal fi) {
    this.fi = fi;
  }


  public FeatureTvshowAttributesSubtitlesCounts ar(BigDecimal ar) {

    this.ar = ar;
    return this;
  }

   /**
   * Get ar
   * @return ar
  **/
  @javax.annotation.Nonnull

  public BigDecimal getAr() {
    return ar;
  }


  public void setAr(BigDecimal ar) {
    this.ar = ar;
  }


  public FeatureTvshowAttributesSubtitlesCounts hr(BigDecimal hr) {

    this.hr = hr;
    return this;
  }

   /**
   * Get hr
   * @return hr
  **/
  @javax.annotation.Nonnull

  public BigDecimal getHr() {
    return hr;
  }


  public void setHr(BigDecimal hr) {
    this.hr = hr;
  }


  public FeatureTvshowAttributesSubtitlesCounts sl(BigDecimal sl) {

    this.sl = sl;
    return this;
  }

   /**
   * Get sl
   * @return sl
  **/
  @javax.annotation.Nonnull

  public BigDecimal getSl() {
    return sl;
  }


  public void setSl(BigDecimal sl) {
    this.sl = sl;
  }


  public FeatureTvshowAttributesSubtitlesCounts bg(BigDecimal bg) {

    this.bg = bg;
    return this;
  }

   /**
   * Get bg
   * @return bg
  **/
  @javax.annotation.Nonnull

  public BigDecimal getBg() {
    return bg;
  }


  public void setBg(BigDecimal bg) {
    this.bg = bg;
  }


  public FeatureTvshowAttributesSubtitlesCounts sr(BigDecimal sr) {

    this.sr = sr;
    return this;
  }

   /**
   * Get sr
   * @return sr
  **/
  @javax.annotation.Nonnull

  public BigDecimal getSr() {
    return sr;
  }


  public void setSr(BigDecimal sr) {
    this.sr = sr;
  }


  public FeatureTvshowAttributesSubtitlesCounts sv(BigDecimal sv) {

    this.sv = sv;
    return this;
  }

   /**
   * Get sv
   * @return sv
  **/
  @javax.annotation.Nonnull

  public BigDecimal getSv() {
    return sv;
  }


  public void setSv(BigDecimal sv) {
    this.sv = sv;
  }


  public FeatureTvshowAttributesSubtitlesCounts de(BigDecimal de) {

    this.de = de;
    return this;
  }

   /**
   * Get de
   * @return de
  **/
  @javax.annotation.Nonnull

  public BigDecimal getDe() {
    return de;
  }


  public void setDe(BigDecimal de) {
    this.de = de;
  }


  public FeatureTvshowAttributesSubtitlesCounts et(BigDecimal et) {

    this.et = et;
    return this;
  }

   /**
   * Get et
   * @return et
  **/
  @javax.annotation.Nonnull

  public BigDecimal getEt() {
    return et;
  }


  public void setEt(BigDecimal et) {
    this.et = et;
  }


  public FeatureTvshowAttributesSubtitlesCounts da(BigDecimal da) {

    this.da = da;
    return this;
  }

   /**
   * Get da
   * @return da
  **/
  @javax.annotation.Nonnull

  public BigDecimal getDa() {
    return da;
  }


  public void setDa(BigDecimal da) {
    this.da = da;
  }


  public FeatureTvshowAttributesSubtitlesCounts bs(BigDecimal bs) {

    this.bs = bs;
    return this;
  }

   /**
   * Get bs
   * @return bs
  **/
  @javax.annotation.Nonnull

  public BigDecimal getBs() {
    return bs;
  }


  public void setBs(BigDecimal bs) {
    this.bs = bs;
  }


  public FeatureTvshowAttributesSubtitlesCounts it(BigDecimal it) {

    this.it = it;
    return this;
  }

   /**
   * Get it
   * @return it
  **/
  @javax.annotation.Nonnull

  public BigDecimal getIt() {
    return it;
  }


  public void setIt(BigDecimal it) {
    this.it = it;
  }


  public FeatureTvshowAttributesSubtitlesCounts mk(BigDecimal mk) {

    this.mk = mk;
    return this;
  }

   /**
   * Get mk
   * @return mk
  **/
  @javax.annotation.Nonnull

  public BigDecimal getMk() {
    return mk;
  }


  public void setMk(BigDecimal mk) {
    this.mk = mk;
  }


  public FeatureTvshowAttributesSubtitlesCounts ru(BigDecimal ru) {

    this.ru = ru;
    return this;
  }

   /**
   * Get ru
   * @return ru
  **/
  @javax.annotation.Nonnull

  public BigDecimal getRu() {
    return ru;
  }


  public void setRu(BigDecimal ru) {
    this.ru = ru;
  }


  public FeatureTvshowAttributesSubtitlesCounts no(BigDecimal no) {

    this.no = no;
    return this;
  }

   /**
   * Get no
   * @return no
  **/
  @javax.annotation.Nonnull

  public BigDecimal getNo() {
    return no;
  }


  public void setNo(BigDecimal no) {
    this.no = no;
  }


  public FeatureTvshowAttributesSubtitlesCounts th(BigDecimal th) {

    this.th = th;
    return this;
  }

   /**
   * Get th
   * @return th
  **/
  @javax.annotation.Nonnull

  public BigDecimal getTh() {
    return th;
  }


  public void setTh(BigDecimal th) {
    this.th = th;
  }


  public FeatureTvshowAttributesSubtitlesCounts vi(BigDecimal vi) {

    this.vi = vi;
    return this;
  }

   /**
   * Get vi
   * @return vi
  **/
  @javax.annotation.Nonnull

  public BigDecimal getVi() {
    return vi;
  }


  public void setVi(BigDecimal vi) {
    this.vi = vi;
  }


  public FeatureTvshowAttributesSubtitlesCounts ja(BigDecimal ja) {

    this.ja = ja;
    return this;
  }

   /**
   * Get ja
   * @return ja
  **/
  @javax.annotation.Nonnull

  public BigDecimal getJa() {
    return ja;
  }


  public void setJa(BigDecimal ja) {
    this.ja = ja;
  }


  public FeatureTvshowAttributesSubtitlesCounts fa(BigDecimal fa) {

    this.fa = fa;
    return this;
  }

   /**
   * Get fa
   * @return fa
  **/
  @javax.annotation.Nonnull

  public BigDecimal getFa() {
    return fa;
  }


  public void setFa(BigDecimal fa) {
    this.fa = fa;
  }


  public FeatureTvshowAttributesSubtitlesCounts zhCN(BigDecimal zhCN) {

    this.zhCN = zhCN;
    return this;
  }

   /**
   * Get zhCN
   * @return zhCN
  **/
  @javax.annotation.Nonnull

  public BigDecimal getZhCN() {
    return zhCN;
  }


  public void setZhCN(BigDecimal zhCN) {
    this.zhCN = zhCN;
  }


  public FeatureTvshowAttributesSubtitlesCounts ca(BigDecimal ca) {

    this.ca = ca;
    return this;
  }

   /**
   * Get ca
   * @return ca
  **/
  @javax.annotation.Nonnull

  public BigDecimal getCa() {
    return ca;
  }


  public void setCa(BigDecimal ca) {
    this.ca = ca;
  }


  public FeatureTvshowAttributesSubtitlesCounts id(BigDecimal id) {

    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public BigDecimal getId() {
    return id;
  }


  public void setId(BigDecimal id) {
    this.id = id;
  }


  public FeatureTvshowAttributesSubtitlesCounts sk(BigDecimal sk) {

    this.sk = sk;
    return this;
  }

   /**
   * Get sk
   * @return sk
  **/
  @javax.annotation.Nonnull

  public BigDecimal getSk() {
    return sk;
  }


  public void setSk(BigDecimal sk) {
    this.sk = sk;
  }


  public FeatureTvshowAttributesSubtitlesCounts ko(BigDecimal ko) {

    this.ko = ko;
    return this;
  }

   /**
   * Get ko
   * @return ko
  **/
  @javax.annotation.Nonnull

  public BigDecimal getKo() {
    return ko;
  }


  public void setKo(BigDecimal ko) {
    this.ko = ko;
  }


  public FeatureTvshowAttributesSubtitlesCounts zhTW(BigDecimal zhTW) {

    this.zhTW = zhTW;
    return this;
  }

   /**
   * Get zhTW
   * @return zhTW
  **/
  @javax.annotation.Nonnull

  public BigDecimal getZhTW() {
    return zhTW;
  }


  public void setZhTW(BigDecimal zhTW) {
    this.zhTW = zhTW;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureTvshowAttributesSubtitlesCounts featureTvshowAttributesSubtitlesCounts = (FeatureTvshowAttributesSubtitlesCounts) o;
    return Objects.equals(this.pl, featureTvshowAttributesSubtitlesCounts.pl) &&
        Objects.equals(this.en, featureTvshowAttributesSubtitlesCounts.en) &&
        Objects.equals(this.ptBR, featureTvshowAttributesSubtitlesCounts.ptBR) &&
        Objects.equals(this.ro, featureTvshowAttributesSubtitlesCounts.ro) &&
        Objects.equals(this.nl, featureTvshowAttributesSubtitlesCounts.nl) &&
        Objects.equals(this.ptPT, featureTvshowAttributesSubtitlesCounts.ptPT) &&
        Objects.equals(this.es, featureTvshowAttributesSubtitlesCounts.es) &&
        Objects.equals(this.he, featureTvshowAttributesSubtitlesCounts.he) &&
        Objects.equals(this.hu, featureTvshowAttributesSubtitlesCounts.hu) &&
        Objects.equals(this.el, featureTvshowAttributesSubtitlesCounts.el) &&
        Objects.equals(this.fr, featureTvshowAttributesSubtitlesCounts.fr) &&
        Objects.equals(this.tr, featureTvshowAttributesSubtitlesCounts.tr) &&
        Objects.equals(this.cs, featureTvshowAttributesSubtitlesCounts.cs) &&
        Objects.equals(this.fi, featureTvshowAttributesSubtitlesCounts.fi) &&
        Objects.equals(this.ar, featureTvshowAttributesSubtitlesCounts.ar) &&
        Objects.equals(this.hr, featureTvshowAttributesSubtitlesCounts.hr) &&
        Objects.equals(this.sl, featureTvshowAttributesSubtitlesCounts.sl) &&
        Objects.equals(this.bg, featureTvshowAttributesSubtitlesCounts.bg) &&
        Objects.equals(this.sr, featureTvshowAttributesSubtitlesCounts.sr) &&
        Objects.equals(this.sv, featureTvshowAttributesSubtitlesCounts.sv) &&
        Objects.equals(this.de, featureTvshowAttributesSubtitlesCounts.de) &&
        Objects.equals(this.et, featureTvshowAttributesSubtitlesCounts.et) &&
        Objects.equals(this.da, featureTvshowAttributesSubtitlesCounts.da) &&
        Objects.equals(this.bs, featureTvshowAttributesSubtitlesCounts.bs) &&
        Objects.equals(this.it, featureTvshowAttributesSubtitlesCounts.it) &&
        Objects.equals(this.mk, featureTvshowAttributesSubtitlesCounts.mk) &&
        Objects.equals(this.ru, featureTvshowAttributesSubtitlesCounts.ru) &&
        Objects.equals(this.no, featureTvshowAttributesSubtitlesCounts.no) &&
        Objects.equals(this.th, featureTvshowAttributesSubtitlesCounts.th) &&
        Objects.equals(this.vi, featureTvshowAttributesSubtitlesCounts.vi) &&
        Objects.equals(this.ja, featureTvshowAttributesSubtitlesCounts.ja) &&
        Objects.equals(this.fa, featureTvshowAttributesSubtitlesCounts.fa) &&
        Objects.equals(this.zhCN, featureTvshowAttributesSubtitlesCounts.zhCN) &&
        Objects.equals(this.ca, featureTvshowAttributesSubtitlesCounts.ca) &&
        Objects.equals(this.id, featureTvshowAttributesSubtitlesCounts.id) &&
        Objects.equals(this.sk, featureTvshowAttributesSubtitlesCounts.sk) &&
        Objects.equals(this.ko, featureTvshowAttributesSubtitlesCounts.ko) &&
        Objects.equals(this.zhTW, featureTvshowAttributesSubtitlesCounts.zhTW);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pl, en, ptBR, ro, nl, ptPT, es, he, hu, el, fr, tr, cs, fi, ar, hr, sl, bg, sr, sv, de, et, da, bs, it, mk, ru, no, th, vi, ja, fa, zhCN, ca, id, sk, ko, zhTW);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureTvshowAttributesSubtitlesCounts {\n");
    sb.append("    pl: ").append(toIndentedString(pl)).append("\n");
    sb.append("    en: ").append(toIndentedString(en)).append("\n");
    sb.append("    ptBR: ").append(toIndentedString(ptBR)).append("\n");
    sb.append("    ro: ").append(toIndentedString(ro)).append("\n");
    sb.append("    nl: ").append(toIndentedString(nl)).append("\n");
    sb.append("    ptPT: ").append(toIndentedString(ptPT)).append("\n");
    sb.append("    es: ").append(toIndentedString(es)).append("\n");
    sb.append("    he: ").append(toIndentedString(he)).append("\n");
    sb.append("    hu: ").append(toIndentedString(hu)).append("\n");
    sb.append("    el: ").append(toIndentedString(el)).append("\n");
    sb.append("    fr: ").append(toIndentedString(fr)).append("\n");
    sb.append("    tr: ").append(toIndentedString(tr)).append("\n");
    sb.append("    cs: ").append(toIndentedString(cs)).append("\n");
    sb.append("    fi: ").append(toIndentedString(fi)).append("\n");
    sb.append("    ar: ").append(toIndentedString(ar)).append("\n");
    sb.append("    hr: ").append(toIndentedString(hr)).append("\n");
    sb.append("    sl: ").append(toIndentedString(sl)).append("\n");
    sb.append("    bg: ").append(toIndentedString(bg)).append("\n");
    sb.append("    sr: ").append(toIndentedString(sr)).append("\n");
    sb.append("    sv: ").append(toIndentedString(sv)).append("\n");
    sb.append("    de: ").append(toIndentedString(de)).append("\n");
    sb.append("    et: ").append(toIndentedString(et)).append("\n");
    sb.append("    da: ").append(toIndentedString(da)).append("\n");
    sb.append("    bs: ").append(toIndentedString(bs)).append("\n");
    sb.append("    it: ").append(toIndentedString(it)).append("\n");
    sb.append("    mk: ").append(toIndentedString(mk)).append("\n");
    sb.append("    ru: ").append(toIndentedString(ru)).append("\n");
    sb.append("    no: ").append(toIndentedString(no)).append("\n");
    sb.append("    th: ").append(toIndentedString(th)).append("\n");
    sb.append("    vi: ").append(toIndentedString(vi)).append("\n");
    sb.append("    ja: ").append(toIndentedString(ja)).append("\n");
    sb.append("    fa: ").append(toIndentedString(fa)).append("\n");
    sb.append("    zhCN: ").append(toIndentedString(zhCN)).append("\n");
    sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
    sb.append("    ko: ").append(toIndentedString(ko)).append("\n");
    sb.append("    zhTW: ").append(toIndentedString(zhTW)).append("\n");
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

