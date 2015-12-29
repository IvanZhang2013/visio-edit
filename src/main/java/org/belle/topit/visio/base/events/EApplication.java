package org.belle.topit.visio.base.events;

import com4j.*;

/**
 * Visio Application Event Interface
 */
@IID("{000D0B00-0000-0000-C000-000000000046}")
public abstract class EApplication {
  // Methods:
  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(4097)
  public void appActivated(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(4098)
  public void appDeactivated(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(4100)
  public void appObjActivated(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(4104)
  public void appObjDeactivated(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(4112)
  public void beforeQuit(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(4128)
  public void beforeModal(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(4160)
  public void afterModal(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory test.IVWindow parameter.
   */

  @DISPID(32769)
  public void windowOpened(
    org.belle.topit.visio.base.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory test.IVWindow parameter.
   */

  @DISPID(701)
  public void selectionChanged(
    org.belle.topit.visio.base.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory test.IVWindow parameter.
   */

  @DISPID(16385)
  public void beforeWindowClosed(
    org.belle.topit.visio.base.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory test.IVWindow parameter.
   */

  @DISPID(4224)
  public void windowActivated(
    org.belle.topit.visio.base.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory test.IVWindow parameter.
   */

  @DISPID(702)
  public void beforeWindowSelDelete(
    org.belle.topit.visio.base.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory test.IVWindow parameter.
   */

  @DISPID(703)
  public void beforeWindowPageTurn(
    org.belle.topit.visio.base.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory test.IVWindow parameter.
   */

  @DISPID(704)
  public void windowTurnedToPage(
    org.belle.topit.visio.base.IVWindow window) {
        throw new UnsupportedOperationException();
  }


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
   * @param app Mandatory test.IVApplication parameter.
   * @param sequenceNum Mandatory int parameter.
   * @param contextString Mandatory java.lang.String parameter.
   */

  @DISPID(4352)
  public void markerEvent(
    org.belle.topit.visio.base.IVApplication app,
    int sequenceNum,
    java.lang.String contextString) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(4608)
  public void noEventsPending(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(5120)
  public void visioIsIdle(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(200)
  public void mustFlushScopeBeginning(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(201)
  public void mustFlushScopeEnded(
    org.belle.topit.visio.base.IVApplication app) {
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
   * @param app Mandatory test.IVApplication parameter.
   * @param nScopeID Mandatory int parameter.
   * @param bstrDescription Mandatory java.lang.String parameter.
   */

  @DISPID(202)
  public void enterScope(
    org.belle.topit.visio.base.IVApplication app,
    int nScopeID,
    java.lang.String bstrDescription) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   * @param nScopeID Mandatory int parameter.
   * @param bstrDescription Mandatory java.lang.String parameter.
   * @param bErrOrCancelled Mandatory boolean parameter.
   */

  @DISPID(203)
  public void exitScope(
    org.belle.topit.visio.base.IVApplication app,
    int nScopeID,
    java.lang.String bstrDescription,
    boolean bErrOrCancelled) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel terminate of application? T:Yes F:No
   * </p>
   * @param app Mandatory test.IVApplication parameter.
   * @return  Returns a value of type void
   */

  @DISPID(204)
  public void queryCancelQuit(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Terminate application operation was canceled.
   * </p>
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(205)
  public void quitCanceled(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after a window's size or position changes
   * </p>
   * @param window Mandatory test.IVWindow parameter.
   */

  @DISPID(8193)
  public void windowChanged(
    org.belle.topit.visio.base.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after scroll or zoom in a drawing window
   * </p>
   * @param window Mandatory test.IVWindow parameter.
   */

  @DISPID(705)
  public void viewChanged(
    org.belle.topit.visio.base.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel close of window? T:Yes F:No
   * </p>
   * @param window Mandatory test.IVWindow parameter.
   * @return  Returns a value of type void
   */

  @DISPID(706)
  public void queryCancelWindowClose(
    org.belle.topit.visio.base.IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Window close operation was canceled.
   * </p>
   * @param window Mandatory test.IVWindow parameter.
   */

  @DISPID(707)
  public void windowCloseCanceled(
    org.belle.topit.visio.base.IVWindow window) {
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
   * Cancel suspension of application? T:Yes F:No
   * </p>
   * @param app Mandatory test.IVApplication parameter.
   * @return  Returns a value of type void
   */

  @DISPID(206)
  public void queryCancelSuspend(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Suspend application operation was canceled.
   * </p>
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(207)
  public void suspendCanceled(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(208)
  public void beforeSuspend(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(209)
  public void afterResume(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keystroke message received for Addon window. True return indicates message was handled.
   * </p>
   * @param msg Mandatory test.IVMSGWrap parameter.
   * @return  Returns a value of type void
   */

  @DISPID(708)
  public void onKeystrokeMessageForAddon(
    org.belle.topit.visio.base.IVMSGWrap msg) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when mousedown message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param button Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(709)
  public void mouseDown(
    int button,
    int keyButtonState,
    double x,
    double y,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when mousemove message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param button Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(710)
  public void mouseMove(
    int button,
    int keyButtonState,
    double x,
    double y,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when mouseup message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param button Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(711)
  public void mouseUp(
    int button,
    int keyButtonState,
    double x,
    double y,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keydown message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param keyCode Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(712)
  public void keyDown(
    int keyCode,
    int keyButtonState,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keypress message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param keyAscii Mandatory int parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(713)
  public void keyPress(
    int keyAscii,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keyup message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param keyCode Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(714)
  public void keyUp(
    int keyCode,
    int keyButtonState,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel suspension of application events? T:Yes F:No
   * </p>
   * @param app Mandatory test.IVApplication parameter.
   * @return  Returns a value of type void
   */

  @DISPID(210)
  public void queryCancelSuspendEvents(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Suspend application events operation was canceled.
   * </p>
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(211)
  public void suspendEventsCanceled(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(212)
  public void beforeSuspendEvents(
    org.belle.topit.visio.base.IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory test.IVApplication parameter.
   */

  @DISPID(213)
  public void afterResumeEvents(
    org.belle.topit.visio.base.IVApplication app) {
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

  @DISPID(32800)
  public void dataRecordsetAdded(
    org.belle.topit.visio.base.IVDataRecordset dataRecordset) {
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
   * @param doc Mandatory test.IVDocument parameter.
   */

  @DISPID(11)
  public void afterRemoveHiddenInformation(
    org.belle.topit.visio.base.IVDocument doc) {
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
