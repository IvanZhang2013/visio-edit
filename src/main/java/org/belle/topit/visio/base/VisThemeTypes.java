package org.belle.topit.visio.base  ;

import com4j.*;

/**
 */
public enum VisThemeTypes implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visThemeTypeColor(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visThemeTypeEffect(2),
  ;

  private final int value;
  VisThemeTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
