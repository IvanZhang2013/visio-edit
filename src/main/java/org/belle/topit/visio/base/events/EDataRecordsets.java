package org.belle.topit.visio.base.events;

import com4j.*;

/**
 * Visio DataRecordsets Event Interface
 */
@IID("{000D0B10-0000-0000-C000-000000000046}")
public abstract class EDataRecordsets {
  // Methods:
  /**
   * @param dataRecordset Mandatory test.IVDataRecordset parameter.
   */

  @DISPID(32800)
  public void dataRecordsetAdded(
    org.belle.topit.visio.base.IVDataRecordset dataRecordset) {
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


  /**
   * @param dataRecordsetChanged Mandatory test.IVDataRecordsetChangedEvent parameter.
   */

  @DISPID(8224)
  public void dataRecordsetChanged(
    org.belle.topit.visio.base.IVDataRecordsetChangedEvent dataRecordsetChanged) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
