package org.belle.topit.visio.base  ;

import com4j.*;

@IID("{000D070D-0000-0000-C000-000000000046}")
public interface IVShapes extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type test.IVApplication
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(7)
  org.belle.topit.visio.base.IVApplication application();


  /**
   * <p>
   * Returns visObjTypeShapes (18).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  short objectType();


  /**
   * <p>
   * The first item in a Shapes collection is item 1. Name treated as locale specific.
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param nameUIDOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type test.IVShape
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  org.belle.topit.visio.base.IVShape item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameUIDOrIndex);


  /**
   * <p>
   * Getter method for the COM property "Count16"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  short count16();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type test.IVDocument
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  org.belle.topit.visio.base.IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "ContainingPage"
   * </p>
   * @return  Returns a value of type test.IVPage
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  org.belle.topit.visio.base.IVPage containingPage();


  /**
   * <p>
   * Getter method for the COM property "ContainingMaster"
   * </p>
   * @return  Returns a value of type test.IVMaster
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  org.belle.topit.visio.base.IVMaster containingMaster();


  /**
   * <p>
   * Getter method for the COM property "ContainingShape"
   * </p>
   * @return  Returns a value of type test.IVShape
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  org.belle.topit.visio.base.IVShape containingShape();


  /**
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(15)
  void centerDrawing();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(16)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type test.IVEventList
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  org.belle.topit.visio.base.IVEventList eventList();


  @VTID(17)
  @ReturnValue(defaultPropertyThrough={org.belle.topit.visio.base.IVEventList.class})
  org.belle.topit.visio.base.IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(18)
  short persistsEvents();


  /**
   * <p>
   * Getter method for the COM property "ItemFromID16"
   * </p>
   * @param objectID Mandatory short parameter.
   * @return  Returns a value of type test.IVShape
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(19)
  org.belle.topit.visio.base.IVShape itemFromID16(
    short objectID);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(20)
  int count();


  /**
   * <p>
   * Getter method for the COM property "ItemFromID"
   * </p>
   * @param objectID Mandatory int parameter.
   * @return  Returns a value of type test.IVShape
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(21)
  org.belle.topit.visio.base.IVShape itemFromID(
    int objectID);


  /**
   * <p>
   * Like Item() but names treated locale independent.
   * </p>
   * <p>
   * Getter method for the COM property "ItemU"
   * </p>
   * @param nameUIDOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type test.IVShape
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(22)
  org.belle.topit.visio.base.IVShape itemU(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameUIDOrIndex);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(23)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "ItemFromUniqueID"
   * </p>
   * @param uniqueID Mandatory java.lang.String parameter.
   * @return  Returns a value of type test.IVShape
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  org.belle.topit.visio.base.IVShape itemFromUniqueID(
    java.lang.String uniqueID);


  // Properties:
}
