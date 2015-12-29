package org.belle.topit.visio.base.events;

import com4j.*;

/**
 * Visio Document Event Interface
 */
@IID("{000D0750-0000-0000-C000-000000000046}")
public abstract class EDocument {
  // Methods:
  /**
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(2)
  public void documentOpened(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(1)
  public void documentCreated(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(3)
  public void documentSaved(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(4)
  public void documentSavedAs(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(8194)
  public void documentChanged(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(16386)
  public void beforeDocumentClose(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param style Mandatory test.IVStyle parameter.
   */

  @DISPID(32772)
  public void styleAdded(
    org.belle.topit.visio.base.IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param style Mandatory test.IVStyle parameter.
   */

  @DISPID(8196)
  public void styleChanged(
    org.belle.topit.visio.base.IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param style Mandatory test.IVStyle parameter.
   */

  @DISPID(16388)
  public void beforeStyleDelete(
    org.belle.topit.visio.base.IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param master Mandatory test.IVMaster parameter.
   */

  @DISPID(32776)
  public void masterAdded(
    org.belle.topit.visio.base.IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param master Mandatory test.IVMaster parameter.
   */

  @DISPID(8200)
  public void masterChanged(
    org.belle.topit.visio.base.IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param master Mandatory test.IVMaster parameter.
   */

  @DISPID(16392)
  public void beforeMasterDelete(
    org.belle.topit.visio.base.IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param page Mandatory test.IVPage parameter.
   */

  @DISPID(32784)
  public void pageAdded(
    org.belle.topit.visio.base.IVPage page) {
        throw new UnsupportedOperationException();
  }


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
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(5)
  public void runModeEntered(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(6)
  public void designModeEntered(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(7)
  public void beforeDocumentSave(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(8)
  public void beforeDocumentSaveAs(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel close of document? T:Yes F:No
   * </p>
   * @param doc Mandatory test.IVDocument parameter.
   * @return  Returns a value of type void
   */

  @DISPID(9)
  public void queryCancelDocumentClose(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Document close operation was canceled.
   * </p>
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(10)
  public void documentCloseCanceled(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel delete of style? T:Yes F:No
   * </p>
   * @param style Mandatory test.IVStyle parameter.
   * @return  Returns a value of type void
   */

  @DISPID(300)
  public void queryCancelStyleDelete(
    org.belle.topit.visio.base.IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Delete style operation was canceled.
   * </p>
   * @param style Mandatory test.IVStyle parameter.
   */

  @DISPID(301)
  public void styleDeleteCanceled(
    org.belle.topit.visio.base.IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel delete of master? T:Yes F:No
   * </p>
   * @param master Mandatory test.IVMaster parameter.
   * @return  Returns a value of type void
   */

  @DISPID(400)
  public void queryCancelMasterDelete(
    org.belle.topit.visio.base.IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Delete master operation was canceled.
   * </p>
   * @param master Mandatory test.IVMaster parameter.
   */

  @DISPID(401)
  public void masterDeleteCanceled(
    org.belle.topit.visio.base.IVMaster master) {
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
   * @param dataRecordset Mandatory test.IVDataRecordset parameter.
   */

  @DISPID(16416)
  public void beforeDataRecordsetDelete(
    org.belle.topit.visio.base.IVDataRecordset dataRecordset) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param dataRecordset Mandatory test.IVDataRecordset parameter.
   */

  @DISPID(32800)
  public void dataRecordsetAdded(
    org.belle.topit.visio.base.IVDataRecordset dataRecordset) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(11)
  public void afterRemoveHiddenInformation(
    org.belle.topit.visio.base.IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param ruleSet Mandatory test.IVValidationRuleSet parameter.
   */

  @DISPID(13)
  public void ruleSetValidated(
    org.belle.topit.visio.base.IVValidationRuleSet ruleSet) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
