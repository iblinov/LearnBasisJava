package dish;

import java.util.StringJoiner;

public class Pizza {
  private boolean pasta;
  private boolean kase;
  private boolean salami;
  private boolean speck;
  private boolean knoblauch;
  private boolean mais;
  private boolean pfefferoni;
  private boolean oliven;
  private boolean kalzone;

  public Pizza() {

  }

  public Pizza(boolean pasta, boolean kase, boolean salami, boolean speck, boolean knoblauch, boolean mais, boolean pfefferoni, boolean oliven, boolean kalzone) {
    this.pasta = pasta;
    this.kase = kase;
    this.salami = salami;
    this.speck = speck;
    this.knoblauch = knoblauch;
    this.mais = mais;
    this.pfefferoni = pfefferoni;
    this.oliven = oliven;
    this.kalzone = kalzone;
  }

  public boolean isPasta() {
    return pasta;
  }

  public void setPasta(boolean pasta) {
    this.pasta = pasta;
  }

  public boolean isKase() {
    return kase;
  }

  public void setKase(boolean kase) {
    this.kase = kase;
  }

  public boolean isSalami() {
    return salami;
  }

  public void setSalami(boolean salami) {
    this.salami = salami;
  }

  public boolean isSpeck() {
    return speck;
  }

  public void setSpeck(boolean speck) {
    this.speck = speck;
  }

  public boolean isKnoblauch() {
    return knoblauch;
  }

  public void setKnoblauch(boolean knoblauch) {
    this.knoblauch = knoblauch;
  }

  public boolean isMais() {
    return mais;
  }

  public void setMais(boolean mais) {
    this.mais = mais;
  }

  public boolean isPfefferoni() {
    return pfefferoni;
  }

  public void setPfefferoni(boolean pfefferoni) {
    this.pfefferoni = pfefferoni;
  }

  public boolean isOliven() {
    return oliven;
  }

  public void setOliven(boolean oliven) {
    this.oliven = oliven;
  }

  public boolean isKalzone() {
    return kalzone;
  }

  public void setKalzone(boolean kalzone) {
    this.kalzone = kalzone;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Pizza.class.getSimpleName() + "[", "]")
            .add("pasta=" + pasta)
            .add("kase=" + kase)
            .add("salami=" + salami)
            .add("speck=" + speck)
            .add("knoblauch=" + knoblauch)
            .add("mais=" + mais)
            .add("pfefferoni=" + pfefferoni)
            .add("oliven=" + oliven)
            .add("kalzone=" + kalzone)
            .toString();
  }
}
