package org.belle.topit.visio.base  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * A running instance of Visio. ProgId: "Visio.Application"
   */
  public static org.belle.topit.visio.base.IVApplication createApplication() {
    return COM4J.createInstance( org.belle.topit.visio.base.IVApplication.class, "{00021A20-0000-0000-C000-000000000046}" );
  }

  /**
   * The object to create to make an invisible Visio instance. ProgId: "Visio.InvisibleApp".
   */
  public static org.belle.topit.visio.base.IVInvisibleApp createInvisibleApp() {
    return COM4J.createInstance( org.belle.topit.visio.base.IVInvisibleApp.class, "{000D0A26-0000-0000-C000-000000000046}" );
  }
}
