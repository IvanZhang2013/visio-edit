package org.belle.topit.visio.base  ;

import com4j.*;

@IID("{000D0734-0000-0000-C000-000000000046}")
public interface IVGraphicItems extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type test.IVApplication
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  org.belle.topit.visio.base.IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type test.IVDocument
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  org.belle.topit.visio.base.IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type test.tagVisObjectTypes
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  org.belle.topit.visio.base.tagVisObjectTypes objectType();


  /**
   * <p>
   * Getter method for the COM property "DataGraphic"
   * </p>
   * @return  Returns a value of type test.IVMaster
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  org.belle.topit.visio.base.IVMaster dataGraphic();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  int count();


  /**
   * @param graphicItem Mandatory test.IVGraphicItem parameter.
   * @return  Returns a value of type test.IVGraphicItem
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  org.belle.topit.visio.base.IVGraphicItem addCopy(
    org.belle.topit.visio.base.IVGraphicItem graphicItem);


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type test.IVGraphicItem
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(14)
  @DefaultMethod
  org.belle.topit.visio.base.IVGraphicItem item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "ItemFromID"
   * </p>
   * @param objectID Mandatory int parameter.
   * @return  Returns a value of type test.IVGraphicItem
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  org.belle.topit.visio.base.IVGraphicItem itemFromID(
    int objectID);


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  short stat();


  // Properties:
}
