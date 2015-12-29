package org.belle.topit.visio.base  ;

import com4j.*;

@IID("{000D0725-0000-0000-C000-000000000046}")
public interface IVRow extends Com4jObject {
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

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  org.belle.topit.visio.base.IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type test.IVShape
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  org.belle.topit.visio.base.IVShape shape();


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type test.IVStyle
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  org.belle.topit.visio.base.IVStyle style();


  /**
   * <p>
   * Getter method for the COM property "ContainingSection"
   * </p>
   * @return  Returns a value of type test.IVSection
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  org.belle.topit.visio.base.IVSection containingSection();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={org.belle.topit.visio.base.IVSection.class})
  org.belle.topit.visio.base.IVRow containingSection(
    short index);

  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  short index();


  /**
   * <p>
   * Returns visObjTypeRow (45).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type test.IVEventList
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  org.belle.topit.visio.base.IVEventList eventList();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={org.belle.topit.visio.base.IVEventList.class})
  org.belle.topit.visio.base.IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  short persistsEvents();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  short stat();


  /**
   * <p>
   * Row's locale specific name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String name();


  /**
   * <p>
   * Row's locale specific name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param lpLocaleSpecificName Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  void name(
    java.lang.String lpLocaleSpecificName);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(18)
  short count();


  /**
   * <p>
   * The first cell in a row is item 0. Name treated as locale specific.
   * </p>
   * <p>
   * Getter method for the COM property "Cell"
   * </p>
   * @param nameOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type test.IVCell
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(19)
  @DefaultMethod
  org.belle.topit.visio.base.IVCell cell(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);


  /**
   * <p>
   * Row's locale independent name.
   * </p>
   * <p>
   * Getter method for the COM property "NameU"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String nameU();


  /**
   * <p>
   * Row's locale independent name.
   * </p>
   * <p>
   * Setter method for the COM property "NameU"
   * </p>
   * @param lpLocaleIndependentName Mandatory java.lang.String parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(21)
  void nameU(
    java.lang.String lpLocaleIndependentName);


  /**
   * <p>
   * The first cell in a row is item 0. Name treated as locale independent.
   * </p>
   * <p>
   * Getter method for the COM property "CellU"
   * </p>
   * @param nameOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type test.IVCell
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(22)
  org.belle.topit.visio.base.IVCell cellU(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);


  /**
   * @param flags Mandatory short parameter.
   * @return  Returns a value of type double[]
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(23)
  double[] getPolylineData(
    short flags);


  /**
   * <p>
   * Getter method for the COM property "ContainingPageID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  int containingPageID();


  /**
   * <p>
   * Getter method for the COM property "ContainingMasterID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(25)
  int containingMasterID();


  // Properties:
}
