package org.belle.topit.visio.base  ;

import com4j.*;

@IID("{000D0273-0000-0000-C000-000000000046}")
public interface IEnumVStatusBarItem extends Com4jObject {
  // Methods:
  /**
   * @param celt Mandatory int parameter.
   * @param rgelt Mandatory Holder<test.IVStatusBarItem> parameter.
   * @param pceltFetched Mandatory Holder<Integer> parameter.
   */

  @VTID(3)
  void next(
    int celt,
    Holder<org.belle.topit.visio.base.IVStatusBarItem> rgelt,
    Holder<Integer> pceltFetched);


  /**
   * @param celt Mandatory int parameter.
   */

  @VTID(4)
  void skip(
    int celt);


  /**
   */

  @VTID(5)
  void reset();


  /**
   * @return  Returns a value of type test.IEnumVStatusBarItem
   */

  @VTID(6)
  org.belle.topit.visio.base.IEnumVStatusBarItem clone();


  // Properties:
}
