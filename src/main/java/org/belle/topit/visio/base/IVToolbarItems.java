package org.belle.topit.visio.base  ;

import com4j.*;

@IID("{000D0245-0000-0000-C000-000000000046}")
public interface IVToolbarItems extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * The first item in a ToolbarItems collection is item 0.
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param lIndex Mandatory int parameter.
   * @return  Returns a value of type test.IVToolbarItem
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  org.belle.topit.visio.base.IVToolbarItem item(
    int lIndex);


  /**
   * @return  Returns a value of type test.IVToolbarItem
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  org.belle.topit.visio.base.IVToolbarItem add();


  /**
   * @param lIndex Mandatory int parameter.
   * @return  Returns a value of type test.IVToolbarItem
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  org.belle.topit.visio.base.IVToolbarItem addAt(
    int lIndex);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type test.IVToolbar
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  org.belle.topit.visio.base.IVToolbar parent();


  /**
   * <p>
   * Getter method for the COM property "ParentItem"
   * </p>
   * @return  Returns a value of type test.IVToolbarItem
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  org.belle.topit.visio.base.IVToolbarItem parentItem();


  // Properties:
}
