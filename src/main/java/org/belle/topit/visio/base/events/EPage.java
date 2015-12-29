package org.belle.topit.visio.base.events;

import com4j.*;

/**
 * Visio Page Event Interface
 */
@IID("{000D0B0A-0000-0000-C000-000000000046}")
public abstract class EPage {
  // Methods:
  /**
   * @param page Mandatory test.IVPage parameter.
   */

  @DISPID(8208)
  public void pageChanged(
    org.belle.topit.visio.base.IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param page Mandatory test.IVPage parameter.
   */

  @DISPID(16400)
  public void beforePageDelete(
    org.belle.topit.visio.base.IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory test.IVShape parameter.
   */

  @DISPID(32832)
  public void shapeAdded(
    org.belle.topit.visio.base.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param selection Mandatory test.IVSelection parameter.
   */

  @DISPID(901)
  public void beforeSelectionDelete(
    org.belle.topit.visio.base.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory test.IVShape parameter.
   */

  @DISPID(8256)
  public void shapeChanged(
    org.belle.topit.visio.base.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param selection Mandatory test.IVSelection parameter.
   */

  @DISPID(902)
  public void selectionAdded(
    org.belle.topit.visio.base.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory test.IVShape parameter.
   */

  @DISPID(16448)
  public void beforeShapeDelete(
    org.belle.topit.visio.base.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory test.IVShape parameter.
   */

  @DISPID(8320)
  public void textChanged(
    org.belle.topit.visio.base.IVShape shape) {
        throw new UnsupportedOperationException();
  }


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


  /**
   * @param connects Mandatory test.IVConnects parameter.
   */

  @DISPID(33024)
  public void connectionsAdded(
    org.belle.topit.visio.base.IVConnects connects) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param connects Mandatory test.IVConnects parameter.
   */

  @DISPID(16640)
  public void connectionsDeleted(
    org.belle.topit.visio.base.IVConnects connects) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel delete of page? T:Yes F:No
   * </p>
   * @param page Mandatory test.IVPage parameter.
   * @return  Returns a value of type void
   */

  @DISPID(500)
  public void queryCancelPageDelete(
    org.belle.topit.visio.base.IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Delete page operation was canceled.
   * </p>
   * @param page Mandatory test.IVPage parameter.
   */

  @DISPID(501)
  public void pageDeleteCanceled(
    org.belle.topit.visio.base.IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory test.IVShape parameter.
   */

  @DISPID(802)
  public void shapeParentChanged(
    org.belle.topit.visio.base.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory test.IVShape parameter.
   */

  @DISPID(803)
  public void beforeShapeTextEdit(
    org.belle.topit.visio.base.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory test.IVShape parameter.
   */

  @DISPID(804)
  public void shapeExitedTextEdit(
    org.belle.topit.visio.base.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel delete of shapes? T:Yes F:No
   * </p>
   * @param selection Mandatory test.IVSelection parameter.
   * @return  Returns a value of type void
   */

  @DISPID(903)
  public void queryCancelSelectionDelete(
    org.belle.topit.visio.base.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Delete shapes operation was canceled.
   * </p>
   * @param selection Mandatory test.IVSelection parameter.
   */

  @DISPID(904)
  public void selectionDeleteCanceled(
    org.belle.topit.visio.base.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel ungroup operation? T:Yes F:No
   * </p>
   * @param selection Mandatory test.IVSelection parameter.
   * @return  Returns a value of type void
   */

  @DISPID(905)
  public void queryCancelUngroup(
    org.belle.topit.visio.base.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Ungroup operation was canceled.
   * </p>
   * @param selection Mandatory test.IVSelection parameter.
   */

  @DISPID(906)
  public void ungroupCanceled(
    org.belle.topit.visio.base.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel convert to group operation? T:Yes F:No
   * </p>
   * @param selection Mandatory test.IVSelection parameter.
   * @return  Returns a value of type void
   */

  @DISPID(907)
  public void queryCancelConvertToGroup(
    org.belle.topit.visio.base.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Convert to group operation was canceled.
   * </p>
   * @param selection Mandatory test.IVSelection parameter.
   */

  @DISPID(908)
  public void convertToGroupCanceled(
    org.belle.topit.visio.base.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel group operation? T:Yes F:No
   * </p>
   * @param selection Mandatory test.IVSelection parameter.
   * @return  Returns a value of type void
   */

  @DISPID(909)
  public void queryCancelGroup(
    org.belle.topit.visio.base.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Group operation was canceled.
   * </p>
   * @param selection Mandatory test.IVSelection parameter.
   */

  @DISPID(910)
  public void groupCanceled(
    org.belle.topit.visio.base.IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory test.IVShape parameter.
   */

  @DISPID(807)
  public void shapeDataGraphicChanged(
    org.belle.topit.visio.base.IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory test.IVShape parameter.
   * @param dataRecordsetID Mandatory int parameter.
   * @param dataRowID Mandatory int parameter.
   */

  @DISPID(805)
  public void shapeLinkAdded(
    org.belle.topit.visio.base.IVShape shape,
    int dataRecordsetID,
    int dataRowID) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory test.IVShape parameter.
   * @param dataRecordsetID Mandatory int parameter.
   * @param dataRowID Mandatory int parameter.
   */

  @DISPID(806)
  public void shapeLinkDeleted(
    org.belle.topit.visio.base.IVShape shape,
    int dataRecordsetID,
    int dataRowID) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shapePair Mandatory test.IVRelatedShapePairEvent parameter.
   */

  @DISPID(502)
  public void containerRelationshipAdded(
    org.belle.topit.visio.base.IVRelatedShapePairEvent shapePair) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shapePair Mandatory test.IVRelatedShapePairEvent parameter.
   */

  @DISPID(503)
  public void containerRelationshipDeleted(
    org.belle.topit.visio.base.IVRelatedShapePairEvent shapePair) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shapePair Mandatory test.IVRelatedShapePairEvent parameter.
   */

  @DISPID(504)
  public void calloutRelationshipAdded(
    org.belle.topit.visio.base.IVRelatedShapePairEvent shapePair) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shapePair Mandatory test.IVRelatedShapePairEvent parameter.
   */

  @DISPID(505)
  public void calloutRelationshipDeleted(
    org.belle.topit.visio.base.IVRelatedShapePairEvent shapePair) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
