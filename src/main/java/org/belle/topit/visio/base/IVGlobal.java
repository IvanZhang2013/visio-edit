package org.belle.topit.visio.base  ;

import com4j.*;

@IID("{000D071C-0000-0000-C000-000000000046}")
public interface IVGlobal extends Com4jObject {
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

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  org.belle.topit.visio.base.IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "ActiveDocument"
   * </p>
   * @return  Returns a value of type test.IVDocument
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  org.belle.topit.visio.base.IVDocument activeDocument();


  /**
   * <p>
   * Getter method for the COM property "ActivePage"
   * </p>
   * @return  Returns a value of type test.IVPage
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  org.belle.topit.visio.base.IVPage activePage();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type test.IVWindow
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  org.belle.topit.visio.base.IVWindow activeWindow();


  /**
   * <p>
   * Getter method for the COM property "Documents"
   * </p>
   * @return  Returns a value of type test.IVDocuments
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  org.belle.topit.visio.base.IVDocuments documents();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={org.belle.topit.visio.base.IVDocuments.class})
  org.belle.topit.visio.base.IVDocument documents(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type test.IVWindows
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  org.belle.topit.visio.base.IVWindows windows();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={org.belle.topit.visio.base.IVWindows.class})
  org.belle.topit.visio.base.IVWindow windows(
    short index);

  /**
   * <p>
   * Getter method for the COM property "Addons"
   * </p>
   * @return  Returns a value of type test.IVAddons
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  org.belle.topit.visio.base.IVAddons addons();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={org.belle.topit.visio.base.IVAddons.class})
  org.belle.topit.visio.base.IVAddon addons(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Vbe"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject vbe();


  // Properties:
}
