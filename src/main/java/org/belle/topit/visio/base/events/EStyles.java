package org.belle.topit.visio.base.events;

import com4j.*;

/**
 * Visio Styles Event Interface
 */
@IID("{000D0B05-0000-0000-C000-000000000046}")
public abstract class EStyles {
  // Methods:
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


  // Properties:
}
