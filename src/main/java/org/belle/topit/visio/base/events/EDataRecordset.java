package org.belle.topit.visio.base.events;

import com4j.*;

/**
 * Visio DataRecordset Event Interface
 */
@IID("{000D0B11-0000-0000-C000-000000000046}")
public abstract class EDataRecordset {
  // Methods:
  /**
   * @param dataRecordsetChanged Mandatory test.IVDataRecordsetChangedEvent parameter.
   */

  @DISPID(8224)
  public void dataRecordsetChanged(
    org.belle.topit.visio.base.IVDataRecordsetChangedEvent dataRecordsetChanged) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param dataRecordset Mandatory test.IVDataRecordset parameter.
   */

  @DISPID(16416)
  public void beforeDataRecordsetDelete(
    org.belle.topit.visio.base.IVDataRecordset dataRecordset) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
