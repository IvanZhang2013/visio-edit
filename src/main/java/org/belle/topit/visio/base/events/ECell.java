package org.belle.topit.visio.base.events;

import com4j.*;

/**
 * Visio Cell Event Interface
 */
@IID("{000D0B0D-0000-0000-C000-000000000046}")
public abstract class ECell {
  // Methods:
  /**
   * <p>
   * Fires after a cell's value changes.
   * </p>
   * @param cell Mandatory test.IVCell parameter.
   */

  @DISPID(10240)
  public void cellChanged(
    org.belle.topit.visio.base.IVCell cell) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after a cell's formula changes.
   * </p>
   * @param cell Mandatory test.IVCell parameter.
   */

  @DISPID(12288)
  public void formulaChanged(
    org.belle.topit.visio.base.IVCell cell) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
