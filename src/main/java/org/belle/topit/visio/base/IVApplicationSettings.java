package org.belle.topit.visio.base  ;

import com4j.*;

/**
 * Interface provides access  Global application settings
 */
@IID("{000D072D-0000-0000-C000-000000000046}")
public interface IVApplicationSettings extends Com4jObject {
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

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  org.belle.topit.visio.base.IVApplication application();


  /**
   * <p>
   * Returns visObjTypeApplicationSettings (51).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type test.tagVisObjectTypes
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  org.belle.topit.visio.base.tagVisObjectTypes objectType();


  /**
   * <p>
   * Getter method for the COM property "DrawingAids"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  boolean drawingAids();


  /**
   * <p>
   * Setter method for the COM property "DrawingAids"
   * </p>
   * @param retVal Mandatory boolean parameter.
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(10)
  void drawingAids(
    boolean retVal);


  /**
   * <p>
   * Getter method for the COM property "SnapStrengthRulerX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int snapStrengthRulerX();


  /**
   * <p>
   * Setter method for the COM property "SnapStrengthRulerX"
   * </p>
   * @param strength Mandatory int parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  void snapStrengthRulerX(
    int strength);


  /**
   * <p>
   * Getter method for the COM property "SnapStrengthRulerY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  int snapStrengthRulerY();


  /**
   * <p>
   * Setter method for the COM property "SnapStrengthRulerY"
   * </p>
   * @param strength Mandatory int parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  void snapStrengthRulerY(
    int strength);


  /**
   * <p>
   * Getter method for the COM property "SnapStrengthGridX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  int snapStrengthGridX();


  /**
   * <p>
   * Setter method for the COM property "SnapStrengthGridX"
   * </p>
   * @param strength Mandatory int parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  void snapStrengthGridX(
    int strength);


  /**
   * <p>
   * Getter method for the COM property "SnapStrengthGridY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  int snapStrengthGridY();


  /**
   * <p>
   * Setter method for the COM property "SnapStrengthGridY"
   * </p>
   * @param strength Mandatory int parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(18)
  void snapStrengthGridY(
    int strength);


  /**
   * <p>
   * Getter method for the COM property "SnapStrengthGuidesX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  int snapStrengthGuidesX();


  /**
   * <p>
   * Setter method for the COM property "SnapStrengthGuidesX"
   * </p>
   * @param strength Mandatory int parameter.
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(20)
  void snapStrengthGuidesX(
    int strength);


  /**
   * <p>
   * Getter method for the COM property "SnapStrengthGuidesY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  int snapStrengthGuidesY();


  /**
   * <p>
   * Setter method for the COM property "SnapStrengthGuidesY"
   * </p>
   * @param strength Mandatory int parameter.
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(22)
  void snapStrengthGuidesY(
    int strength);


  /**
   * <p>
   * Getter method for the COM property "SnapStrengthPointsX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  int snapStrengthPointsX();


  /**
   * <p>
   * Setter method for the COM property "SnapStrengthPointsX"
   * </p>
   * @param strength Mandatory int parameter.
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(24)
  void snapStrengthPointsX(
    int strength);


  /**
   * <p>
   * Getter method for the COM property "SnapStrengthPointsY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(25)
  int snapStrengthPointsY();


  /**
   * <p>
   * Setter method for the COM property "SnapStrengthPointsY"
   * </p>
   * @param strength Mandatory int parameter.
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(26)
  void snapStrengthPointsY(
    int strength);


  /**
   * <p>
   * Getter method for the COM property "SnapStrengthGeometryX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(27)
  int snapStrengthGeometryX();


  /**
   * <p>
   * Setter method for the COM property "SnapStrengthGeometryX"
   * </p>
   * @param strength Mandatory int parameter.
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(28)
  void snapStrengthGeometryX(
    int strength);


  /**
   * <p>
   * Getter method for the COM property "SnapStrengthGeometryY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(29)
  int snapStrengthGeometryY();


  /**
   * <p>
   * Setter method for the COM property "SnapStrengthGeometryY"
   * </p>
   * @param strength Mandatory int parameter.
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(30)
  void snapStrengthGeometryY(
    int strength);


  /**
   * <p>
   * Getter method for the COM property "SnapStrengthExtensionsX"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
  @VTID(31)
  int snapStrengthExtensionsX();


  /**
   * <p>
   * Setter method for the COM property "SnapStrengthExtensionsX"
   * </p>
   * @param strength Mandatory int parameter.
   */

  @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
  @VTID(32)
  void snapStrengthExtensionsX(
    int strength);


  /**
   * <p>
   * Getter method for the COM property "SnapStrengthExtensionsY"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(33)
  int snapStrengthExtensionsY();


  /**
   * <p>
   * Setter method for the COM property "SnapStrengthExtensionsY"
   * </p>
   * @param strength Mandatory int parameter.
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(34)
  void snapStrengthExtensionsY(
    int strength);


  /**
   * <p>
   * Getter method for the COM property "ShowFileSaveWarnings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(35)
  boolean showFileSaveWarnings();


  /**
   * <p>
   * Setter method for the COM property "ShowFileSaveWarnings"
   * </p>
   * @param show Mandatory boolean parameter.
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(36)
  void showFileSaveWarnings(
    boolean show);


  /**
   * <p>
   * Getter method for the COM property "ShowFileOpenWarnings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743838) //= 0x6002001e. The runtime will prefer the VTID if present
  @VTID(37)
  boolean showFileOpenWarnings();


  /**
   * <p>
   * Setter method for the COM property "ShowFileOpenWarnings"
   * </p>
   * @param show Mandatory boolean parameter.
   */

  @DISPID(1610743838) //= 0x6002001e. The runtime will prefer the VTID if present
  @VTID(38)
  void showFileOpenWarnings(
    boolean show);


  /**
   * <p>
   * Getter method for the COM property "DefaultSaveFormat"
   * </p>
   * @return  Returns a value of type test.VisDefaultSaveFormats
   */

  @DISPID(1610743840) //= 0x60020020. The runtime will prefer the VTID if present
  @VTID(39)
  org.belle.topit.visio.base.VisDefaultSaveFormats defaultSaveFormat();


  /**
   * <p>
   * Setter method for the COM property "DefaultSaveFormat"
   * </p>
   * @param pFormatType Mandatory test.VisDefaultSaveFormats parameter.
   */

  @DISPID(1610743840) //= 0x60020020. The runtime will prefer the VTID if present
  @VTID(40)
  void defaultSaveFormat(
    org.belle.topit.visio.base.VisDefaultSaveFormats pFormatType);


  /**
   * <p>
   * Getter method for the COM property "DrawingPageColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743842) //= 0x60020022. The runtime will prefer the VTID if present
  @VTID(41)
  int drawingPageColor();


  /**
   * <p>
   * Setter method for the COM property "DrawingPageColor"
   * </p>
   * @param pColor Mandatory int parameter.
   */

  @DISPID(1610743842) //= 0x60020022. The runtime will prefer the VTID if present
  @VTID(42)
  void drawingPageColor(
    int pColor);


  /**
   * <p>
   * Getter method for the COM property "DrawingBackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743844) //= 0x60020024. The runtime will prefer the VTID if present
  @VTID(43)
  int drawingBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "DrawingBackgroundColor"
   * </p>
   * @param pColor Mandatory int parameter.
   */

  @DISPID(1610743844) //= 0x60020024. The runtime will prefer the VTID if present
  @VTID(44)
  void drawingBackgroundColor(
    int pColor);


  /**
   * <p>
   * Getter method for the COM property "DrawingBackgroundColorGradient"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743846) //= 0x60020026. The runtime will prefer the VTID if present
  @VTID(45)
  int drawingBackgroundColorGradient();


  /**
   * <p>
   * Setter method for the COM property "DrawingBackgroundColorGradient"
   * </p>
   * @param pColor Mandatory int parameter.
   */

  @DISPID(1610743846) //= 0x60020026. The runtime will prefer the VTID if present
  @VTID(46)
  void drawingBackgroundColorGradient(
    int pColor);


  /**
   * <p>
   * Getter method for the COM property "StencilBackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743848) //= 0x60020028. The runtime will prefer the VTID if present
  @VTID(47)
  int stencilBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "StencilBackgroundColor"
   * </p>
   * @param pColor Mandatory int parameter.
   */

  @DISPID(1610743848) //= 0x60020028. The runtime will prefer the VTID if present
  @VTID(48)
  void stencilBackgroundColor(
    int pColor);


  /**
   * <p>
   * Getter method for the COM property "StencilBackgroundColorGradient"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743850) //= 0x6002002a. The runtime will prefer the VTID if present
  @VTID(49)
  int stencilBackgroundColorGradient();


  /**
   * <p>
   * Setter method for the COM property "StencilBackgroundColorGradient"
   * </p>
   * @param pColor Mandatory int parameter.
   */

  @DISPID(1610743850) //= 0x6002002a. The runtime will prefer the VTID if present
  @VTID(50)
  void stencilBackgroundColorGradient(
    int pColor);


  /**
   * <p>
   * Getter method for the COM property "StencilTextColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743852) //= 0x6002002c. The runtime will prefer the VTID if present
  @VTID(51)
  int stencilTextColor();


  /**
   * <p>
   * Setter method for the COM property "StencilTextColor"
   * </p>
   * @param pColor Mandatory int parameter.
   */

  @DISPID(1610743852) //= 0x6002002c. The runtime will prefer the VTID if present
  @VTID(52)
  void stencilTextColor(
    int pColor);


  /**
   * <p>
   * Getter method for the COM property "PrintPreviewBackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743854) //= 0x6002002e. The runtime will prefer the VTID if present
  @VTID(53)
  int printPreviewBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "PrintPreviewBackgroundColor"
   * </p>
   * @param pColor Mandatory int parameter.
   */

  @DISPID(1610743854) //= 0x6002002e. The runtime will prefer the VTID if present
  @VTID(54)
  void printPreviewBackgroundColor(
    int pColor);


  /**
   * <p>
   * Getter method for the COM property "FullScreenBackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743856) //= 0x60020030. The runtime will prefer the VTID if present
  @VTID(55)
  int fullScreenBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "FullScreenBackgroundColor"
   * </p>
   * @param pColor Mandatory int parameter.
   */

  @DISPID(1610743856) //= 0x60020030. The runtime will prefer the VTID if present
  @VTID(56)
  void fullScreenBackgroundColor(
    int pColor);


  /**
   * <p>
   * Getter method for the COM property "ShowStartupDialog"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743858) //= 0x60020032. The runtime will prefer the VTID if present
  @VTID(57)
  boolean showStartupDialog();


  /**
   * <p>
   * Setter method for the COM property "ShowStartupDialog"
   * </p>
   * @param pShow Mandatory boolean parameter.
   */

  @DISPID(1610743858) //= 0x60020032. The runtime will prefer the VTID if present
  @VTID(58)
  void showStartupDialog(
    boolean pShow);


  /**
   * <p>
   * Getter method for the COM property "ShowSmartTags"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743860) //= 0x60020034. The runtime will prefer the VTID if present
  @VTID(59)
  boolean showSmartTags();


  /**
   * <p>
   * Setter method for the COM property "ShowSmartTags"
   * </p>
   * @param pShow Mandatory boolean parameter.
   */

  @DISPID(1610743860) //= 0x60020034. The runtime will prefer the VTID if present
  @VTID(60)
  void showSmartTags(
    boolean pShow);


  /**
   * <p>
   * Getter method for the COM property "TextDisplayQuality"
   * </p>
   * @return  Returns a value of type test.VisTextDisplayQualityTypes
   */

  @DISPID(1610743862) //= 0x60020036. The runtime will prefer the VTID if present
  @VTID(61)
  org.belle.topit.visio.base.VisTextDisplayQualityTypes textDisplayQuality();


  /**
   * <p>
   * Setter method for the COM property "TextDisplayQuality"
   * </p>
   * @param pTextQuality Mandatory test.VisTextDisplayQualityTypes parameter.
   */

  @DISPID(1610743862) //= 0x60020036. The runtime will prefer the VTID if present
  @VTID(62)
  void textDisplayQuality(
    org.belle.topit.visio.base.VisTextDisplayQualityTypes pTextQuality);


  /**
   * <p>
   * Getter method for the COM property "HigherQualityShapeDisplay"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743864) //= 0x60020038. The runtime will prefer the VTID if present
  @VTID(63)
  boolean higherQualityShapeDisplay();


  /**
   * <p>
   * Setter method for the COM property "HigherQualityShapeDisplay"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(1610743864) //= 0x60020038. The runtime will prefer the VTID if present
  @VTID(64)
  void higherQualityShapeDisplay(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "SmoothDrawing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743866) //= 0x6002003a. The runtime will prefer the VTID if present
  @VTID(65)
  boolean smoothDrawing();


  /**
   * <p>
   * Setter method for the COM property "SmoothDrawing"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(1610743866) //= 0x6002003a. The runtime will prefer the VTID if present
  @VTID(66)
  void smoothDrawing(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "StencilCharactersPerLine"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743868) //= 0x6002003c. The runtime will prefer the VTID if present
  @VTID(67)
  int stencilCharactersPerLine();


  /**
   * <p>
   * Setter method for the COM property "StencilCharactersPerLine"
   * </p>
   * @param pCharCount Mandatory int parameter.
   */

  @DISPID(1610743868) //= 0x6002003c. The runtime will prefer the VTID if present
  @VTID(68)
  void stencilCharactersPerLine(
    int pCharCount);


  /**
   * <p>
   * Getter method for the COM property "StencilLinesPerMaster"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743870) //= 0x6002003e. The runtime will prefer the VTID if present
  @VTID(69)
  int stencilLinesPerMaster();


  /**
   * <p>
   * Setter method for the COM property "StencilLinesPerMaster"
   * </p>
   * @param pLineCount Mandatory int parameter.
   */

  @DISPID(1610743870) //= 0x6002003e. The runtime will prefer the VTID if present
  @VTID(70)
  void stencilLinesPerMaster(
    int pLineCount);


  /**
   * <p>
   * Getter method for the COM property "UserName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743872) //= 0x60020040. The runtime will prefer the VTID if present
  @VTID(71)
  java.lang.String userName();


  /**
   * <p>
   * Setter method for the COM property "UserName"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(1610743872) //= 0x60020040. The runtime will prefer the VTID if present
  @VTID(72)
  void userName(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "UserInitials"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743874) //= 0x60020042. The runtime will prefer the VTID if present
  @VTID(73)
  java.lang.String userInitials();


  /**
   * <p>
   * Setter method for the COM property "UserInitials"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(1610743874) //= 0x60020042. The runtime will prefer the VTID if present
  @VTID(74)
  void userInitials(
    java.lang.String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "ZoomOnRoll"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743876) //= 0x60020044. The runtime will prefer the VTID if present
  @VTID(75)
  boolean zoomOnRoll();


  /**
   * <p>
   * Setter method for the COM property "ZoomOnRoll"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743876) //= 0x60020044. The runtime will prefer the VTID if present
  @VTID(76)
  void zoomOnRoll(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "UndoLevels"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743878) //= 0x60020046. The runtime will prefer the VTID if present
  @VTID(77)
  int undoLevels();


  /**
   * <p>
   * Setter method for the COM property "UndoLevels"
   * </p>
   * @param pNumLevels Mandatory int parameter.
   */

  @DISPID(1610743878) //= 0x60020046. The runtime will prefer the VTID if present
  @VTID(78)
  void undoLevels(
    int pNumLevels);


  /**
   * <p>
   * Getter method for the COM property "RecentFilesListSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743880) //= 0x60020048. The runtime will prefer the VTID if present
  @VTID(79)
  int recentFilesListSize();


  /**
   * <p>
   * Setter method for the COM property "RecentFilesListSize"
   * </p>
   * @param pNumFiles Mandatory int parameter.
   */

  @DISPID(1610743880) //= 0x60020048. The runtime will prefer the VTID if present
  @VTID(80)
  void recentFilesListSize(
    int pNumFiles);


  /**
   * <p>
   * Getter method for the COM property "CenterSelectionOnZoom"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743882) //= 0x6002004a. The runtime will prefer the VTID if present
  @VTID(81)
  boolean centerSelectionOnZoom();


  /**
   * <p>
   * Setter method for the COM property "CenterSelectionOnZoom"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743882) //= 0x6002004a. The runtime will prefer the VTID if present
  @VTID(82)
  void centerSelectionOnZoom(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "ConnectorSplittingEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743884) //= 0x6002004c. The runtime will prefer the VTID if present
  @VTID(83)
  boolean connectorSplittingEnabled();


  /**
   * <p>
   * Setter method for the COM property "ConnectorSplittingEnabled"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743884) //= 0x6002004c. The runtime will prefer the VTID if present
  @VTID(84)
  void connectorSplittingEnabled(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "AsianTextUI"
   * </p>
   * @return  Returns a value of type test.VisRegionalUIOptions
   */

  @DISPID(1610743886) //= 0x6002004e. The runtime will prefer the VTID if present
  @VTID(85)
  org.belle.topit.visio.base.VisRegionalUIOptions asianTextUI();


  /**
   * <p>
   * Setter method for the COM property "AsianTextUI"
   * </p>
   * @param pAsianTextUIOption Mandatory test.VisRegionalUIOptions parameter.
   */

  @DISPID(1610743886) //= 0x6002004e. The runtime will prefer the VTID if present
  @VTID(86)
  void asianTextUI(
    org.belle.topit.visio.base.VisRegionalUIOptions pAsianTextUIOption);


  /**
   * <p>
   * Getter method for the COM property "ComplexTextUI"
   * </p>
   * @return  Returns a value of type test.VisRegionalUIOptions
   */

  @DISPID(1610743888) //= 0x60020050. The runtime will prefer the VTID if present
  @VTID(87)
  org.belle.topit.visio.base.VisRegionalUIOptions complexTextUI();


  /**
   * <p>
   * Setter method for the COM property "ComplexTextUI"
   * </p>
   * @param pComplexTextUIOption Mandatory test.VisRegionalUIOptions parameter.
   */

  @DISPID(1610743888) //= 0x60020050. The runtime will prefer the VTID if present
  @VTID(88)
  void complexTextUI(
    org.belle.topit.visio.base.VisRegionalUIOptions pComplexTextUIOption);


  /**
   * <p>
   * Getter method for the COM property "KanaFindAndReplace"
   * </p>
   * @return  Returns a value of type test.VisRegionalUIOptions
   */

  @DISPID(1610743890) //= 0x60020052. The runtime will prefer the VTID if present
  @VTID(89)
  org.belle.topit.visio.base.VisRegionalUIOptions kanaFindAndReplace();


  /**
   * <p>
   * Setter method for the COM property "KanaFindAndReplace"
   * </p>
   * @param pKanaOption Mandatory test.VisRegionalUIOptions parameter.
   */

  @DISPID(1610743890) //= 0x60020052. The runtime will prefer the VTID if present
  @VTID(90)
  void kanaFindAndReplace(
    org.belle.topit.visio.base.VisRegionalUIOptions pKanaOption);


  /**
   * <p>
   * Getter method for the COM property "FreeformDrawingPrecision"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743892) //= 0x60020054. The runtime will prefer the VTID if present
  @VTID(91)
  int freeformDrawingPrecision();


  /**
   * <p>
   * Setter method for the COM property "FreeformDrawingPrecision"
   * </p>
   * @param plVal Mandatory int parameter.
   */

  @DISPID(1610743892) //= 0x60020054. The runtime will prefer the VTID if present
  @VTID(92)
  void freeformDrawingPrecision(
    int plVal);


  /**
   * <p>
   * Getter method for the COM property "FreeformDrawingSmoothing"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743894) //= 0x60020056. The runtime will prefer the VTID if present
  @VTID(93)
  int freeformDrawingSmoothing();


  /**
   * <p>
   * Setter method for the COM property "FreeformDrawingSmoothing"
   * </p>
   * @param plVal Mandatory int parameter.
   */

  @DISPID(1610743894) //= 0x60020056. The runtime will prefer the VTID if present
  @VTID(94)
  void freeformDrawingSmoothing(
    int plVal);


  /**
   * <p>
   * Getter method for the COM property "DeveloperMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743896) //= 0x60020058. The runtime will prefer the VTID if present
  @VTID(95)
  boolean developerMode();


  /**
   * <p>
   * Setter method for the COM property "DeveloperMode"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743896) //= 0x60020058. The runtime will prefer the VTID if present
  @VTID(96)
  void developerMode(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "ShowChooseDrawingTypePane"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743898) //= 0x6002005a. The runtime will prefer the VTID if present
  @VTID(97)
  boolean showChooseDrawingTypePane();


  /**
   * <p>
   * Setter method for the COM property "ShowChooseDrawingTypePane"
   * </p>
   * @param pShow Mandatory boolean parameter.
   */

  @DISPID(1610743898) //= 0x6002005a. The runtime will prefer the VTID if present
  @VTID(98)
  void showChooseDrawingTypePane(
    boolean pShow);


  /**
   * <p>
   * Getter method for the COM property "ShowShapeSearchPane"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743900) //= 0x6002005c. The runtime will prefer the VTID if present
  @VTID(99)
  boolean showShapeSearchPane();


  /**
   * <p>
   * Setter method for the COM property "ShowShapeSearchPane"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743900) //= 0x6002005c. The runtime will prefer the VTID if present
  @VTID(100)
  void showShapeSearchPane(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "ApplyThemesOnShapeAdd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743902) //= 0x6002005e. The runtime will prefer the VTID if present
  @VTID(101)
  boolean applyThemesOnShapeAdd();


  /**
   * <p>
   * Setter method for the COM property "ApplyThemesOnShapeAdd"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743902) //= 0x6002005e. The runtime will prefer the VTID if present
  @VTID(102)
  void applyThemesOnShapeAdd(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "SATextUI"
   * </p>
   * @return  Returns a value of type test.VisRegionalUIOptions
   */

  @DISPID(1610743904) //= 0x60020060. The runtime will prefer the VTID if present
  @VTID(103)
  org.belle.topit.visio.base.VisRegionalUIOptions saTextUI();


  /**
   * <p>
   * Getter method for the COM property "BIDITextUI"
   * </p>
   * @return  Returns a value of type test.VisRegionalUIOptions
   */

  @DISPID(1610743905) //= 0x60020061. The runtime will prefer the VTID if present
  @VTID(104)
  org.belle.topit.visio.base.VisRegionalUIOptions bidiTextUI();


  /**
   * <p>
   * Getter method for the COM property "KashidaTextUI"
   * </p>
   * @return  Returns a value of type test.VisRegionalUIOptions
   */

  @DISPID(1610743906) //= 0x60020062. The runtime will prefer the VTID if present
  @VTID(105)
  org.belle.topit.visio.base.VisRegionalUIOptions kashidaTextUI();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743907) //= 0x60020063. The runtime will prefer the VTID if present
  @VTID(106)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "ShowMoreShapeHandlesOnHover"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743908) //= 0x60020064. The runtime will prefer the VTID if present
  @VTID(107)
  boolean showMoreShapeHandlesOnHover();


  /**
   * <p>
   * Setter method for the COM property "ShowMoreShapeHandlesOnHover"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743908) //= 0x60020064. The runtime will prefer the VTID if present
  @VTID(108)
  void showMoreShapeHandlesOnHover(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "EnableAutoConnect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743910) //= 0x60020066. The runtime will prefer the VTID if present
  @VTID(109)
  boolean enableAutoConnect();


  /**
   * <p>
   * Setter method for the COM property "EnableAutoConnect"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743910) //= 0x60020066. The runtime will prefer the VTID if present
  @VTID(110)
  void enableAutoConnect(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "ApplyBackgroundToDocument"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743912) //= 0x60020068. The runtime will prefer the VTID if present
  @VTID(111)
  boolean applyBackgroundToDocument();


  /**
   * <p>
   * Setter method for the COM property "ApplyBackgroundToDocument"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743912) //= 0x60020068. The runtime will prefer the VTID if present
  @VTID(112)
  void applyBackgroundToDocument(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "TransitionsEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743914) //= 0x6002006a. The runtime will prefer the VTID if present
  @VTID(113)
  boolean transitionsEnabled();


  /**
   * <p>
   * Setter method for the COM property "TransitionsEnabled"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743914) //= 0x6002006a. The runtime will prefer the VTID if present
  @VTID(114)
  void transitionsEnabled(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "EnableFormulaAutoComplete"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743916) //= 0x6002006c. The runtime will prefer the VTID if present
  @VTID(115)
  boolean enableFormulaAutoComplete();


  /**
   * <p>
   * Setter method for the COM property "EnableFormulaAutoComplete"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743916) //= 0x6002006c. The runtime will prefer the VTID if present
  @VTID(116)
  void enableFormulaAutoComplete(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "DeleteConnectorsEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743918) //= 0x6002006e. The runtime will prefer the VTID if present
  @VTID(117)
  boolean deleteConnectorsEnabled();


  /**
   * <p>
   * Setter method for the COM property "DeleteConnectorsEnabled"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743918) //= 0x6002006e. The runtime will prefer the VTID if present
  @VTID(118)
  void deleteConnectorsEnabled(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "RecentTemplatesListSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743920) //= 0x60020070. The runtime will prefer the VTID if present
  @VTID(119)
  int recentTemplatesListSize();


  /**
   * <p>
   * Setter method for the COM property "RecentTemplatesListSize"
   * </p>
   * @param pNumFiles Mandatory int parameter.
   */

  @DISPID(1610743920) //= 0x60020070. The runtime will prefer the VTID if present
  @VTID(120)
  void recentTemplatesListSize(
    int pNumFiles);


  /**
   * @param resolution Mandatory test.VisRasterExportResolution parameter.
   * @param width Optional parameter. Default value is 0.0
   * @param height Optional parameter. Default value is 0.0
   * @param resolutionUnits Optional parameter. Default value is 0
   */

  @DISPID(1610743922) //= 0x60020072. The runtime will prefer the VTID if present
  @VTID(121)
  void setRasterExportResolution(
    org.belle.topit.visio.base.VisRasterExportResolution resolution,
    @Optional @DefaultValue("0") double width,
    @Optional @DefaultValue("0") double height,
    @Optional org.belle.topit.visio.base.VisRasterExportResolutionUnits resolutionUnits);


  /**
   * @param pResolution Mandatory Holder<test.VisRasterExportResolution> parameter.
   * @param pWidth Mandatory Holder<Double> parameter.
   * @param pHeight Mandatory Holder<Double> parameter.
   * @param pResolutionUnits Mandatory Holder<test.VisRasterExportResolutionUnits> parameter.
   */

  @DISPID(1610743923) //= 0x60020073. The runtime will prefer the VTID if present
  @VTID(122)
  void getRasterExportResolution(
    Holder<org.belle.topit.visio.base.VisRasterExportResolution> pResolution,
    Holder<Double> pWidth,
    Holder<Double> pHeight,
    Holder<org.belle.topit.visio.base.VisRasterExportResolutionUnits> pResolutionUnits);


  /**
   * @param size Mandatory test.VisRasterExportSize parameter.
   * @param width Optional parameter. Default value is 0.0
   * @param height Optional parameter. Default value is 0.0
   * @param sizeUnits Optional parameter. Default value is 0
   */

  @DISPID(1610743924) //= 0x60020074. The runtime will prefer the VTID if present
  @VTID(123)
  void setRasterExportSize(
    org.belle.topit.visio.base.VisRasterExportSize size,
    @Optional @DefaultValue("0") double width,
    @Optional @DefaultValue("0") double height,
    @Optional org.belle.topit.visio.base.VisRasterExportSizeUnits sizeUnits);


  /**
   * @param pSize Mandatory Holder<test.VisRasterExportSize> parameter.
   * @param pWidth Mandatory Holder<Double> parameter.
   * @param pHeight Mandatory Holder<Double> parameter.
   * @param pSizeUnits Mandatory Holder<test.VisRasterExportSizeUnits> parameter.
   */

  @DISPID(1610743925) //= 0x60020075. The runtime will prefer the VTID if present
  @VTID(124)
  void getRasterExportSize(
    Holder<org.belle.topit.visio.base.VisRasterExportSize> pSize,
    Holder<Double> pWidth,
    Holder<Double> pHeight,
    Holder<org.belle.topit.visio.base.VisRasterExportSizeUnits> pSizeUnits);


  /**
   * <p>
   * Getter method for the COM property "RasterExportDataFormat"
   * </p>
   * @return  Returns a value of type test.VisRasterExportDataFormat
   */

  @DISPID(1610743926) //= 0x60020076. The runtime will prefer the VTID if present
  @VTID(125)
  org.belle.topit.visio.base.VisRasterExportDataFormat rasterExportDataFormat();


  /**
   * <p>
   * Setter method for the COM property "RasterExportDataFormat"
   * </p>
   * @param pFormat Mandatory test.VisRasterExportDataFormat parameter.
   */

  @DISPID(1610743926) //= 0x60020076. The runtime will prefer the VTID if present
  @VTID(126)
  void rasterExportDataFormat(
    org.belle.topit.visio.base.VisRasterExportDataFormat pFormat);


  /**
   * <p>
   * Getter method for the COM property "RasterExportDataCompression"
   * </p>
   * @return  Returns a value of type test.VisRasterExportDataCompression
   */

  @DISPID(1610743928) //= 0x60020078. The runtime will prefer the VTID if present
  @VTID(127)
  org.belle.topit.visio.base.VisRasterExportDataCompression rasterExportDataCompression();


  /**
   * <p>
   * Setter method for the COM property "RasterExportDataCompression"
   * </p>
   * @param pCompressionType Mandatory test.VisRasterExportDataCompression parameter.
   */

  @DISPID(1610743928) //= 0x60020078. The runtime will prefer the VTID if present
  @VTID(128)
  void rasterExportDataCompression(
    org.belle.topit.visio.base.VisRasterExportDataCompression pCompressionType);


  /**
   * <p>
   * Getter method for the COM property "RasterExportColorReduction"
   * </p>
   * @return  Returns a value of type test.VisRasterExportColorReduction
   */

  @DISPID(1610743930) //= 0x6002007a. The runtime will prefer the VTID if present
  @VTID(129)
  org.belle.topit.visio.base.VisRasterExportColorReduction rasterExportColorReduction();


  /**
   * <p>
   * Setter method for the COM property "RasterExportColorReduction"
   * </p>
   * @param pReduction Mandatory test.VisRasterExportColorReduction parameter.
   */

  @DISPID(1610743930) //= 0x6002007a. The runtime will prefer the VTID if present
  @VTID(130)
  void rasterExportColorReduction(
    org.belle.topit.visio.base.VisRasterExportColorReduction pReduction);


  /**
   * <p>
   * Getter method for the COM property "RasterExportColorFormat"
   * </p>
   * @return  Returns a value of type test.VisRasterExportColorFormat
   */

  @DISPID(1610743932) //= 0x6002007c. The runtime will prefer the VTID if present
  @VTID(131)
  org.belle.topit.visio.base.VisRasterExportColorFormat rasterExportColorFormat();


  /**
   * <p>
   * Setter method for the COM property "RasterExportColorFormat"
   * </p>
   * @param pFormat Mandatory test.VisRasterExportColorFormat parameter.
   */

  @DISPID(1610743932) //= 0x6002007c. The runtime will prefer the VTID if present
  @VTID(132)
  void rasterExportColorFormat(
    org.belle.topit.visio.base.VisRasterExportColorFormat pFormat);


  /**
   * <p>
   * Getter method for the COM property "RasterExportOperation"
   * </p>
   * @return  Returns a value of type test.VisRasterExportOperation
   */

  @DISPID(1610743934) //= 0x6002007e. The runtime will prefer the VTID if present
  @VTID(133)
  org.belle.topit.visio.base.VisRasterExportOperation rasterExportOperation();


  /**
   * <p>
   * Setter method for the COM property "RasterExportOperation"
   * </p>
   * @param pOperation Mandatory test.VisRasterExportOperation parameter.
   */

  @DISPID(1610743934) //= 0x6002007e. The runtime will prefer the VTID if present
  @VTID(134)
  void rasterExportOperation(
    org.belle.topit.visio.base.VisRasterExportOperation pOperation);


  /**
   * <p>
   * Getter method for the COM property "RasterExportRotation"
   * </p>
   * @return  Returns a value of type test.VisRasterExportRotation
   */

  @DISPID(1610743936) //= 0x60020080. The runtime will prefer the VTID if present
  @VTID(135)
  org.belle.topit.visio.base.VisRasterExportRotation rasterExportRotation();


  /**
   * <p>
   * Setter method for the COM property "RasterExportRotation"
   * </p>
   * @param pRotation Mandatory test.VisRasterExportRotation parameter.
   */

  @DISPID(1610743936) //= 0x60020080. The runtime will prefer the VTID if present
  @VTID(136)
  void rasterExportRotation(
    org.belle.topit.visio.base.VisRasterExportRotation pRotation);


  /**
   * <p>
   * Getter method for the COM property "RasterExportFlip"
   * </p>
   * @return  Returns a value of type test.VisRasterExportFlip
   */

  @DISPID(1610743938) //= 0x60020082. The runtime will prefer the VTID if present
  @VTID(137)
  org.belle.topit.visio.base.VisRasterExportFlip rasterExportFlip();


  /**
   * <p>
   * Setter method for the COM property "RasterExportFlip"
   * </p>
   * @param plFlip Mandatory test.VisRasterExportFlip parameter.
   */

  @DISPID(1610743938) //= 0x60020082. The runtime will prefer the VTID if present
  @VTID(138)
  void rasterExportFlip(
    org.belle.topit.visio.base.VisRasterExportFlip plFlip);


  /**
   * <p>
   * Getter method for the COM property "RasterExportBackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743940) //= 0x60020084. The runtime will prefer the VTID if present
  @VTID(139)
  int rasterExportBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "RasterExportBackgroundColor"
   * </p>
   * @param pColor Mandatory int parameter.
   */

  @DISPID(1610743940) //= 0x60020084. The runtime will prefer the VTID if present
  @VTID(140)
  void rasterExportBackgroundColor(
    int pColor);


  /**
   * <p>
   * Getter method for the COM property "RasterExportTransparencyColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743942) //= 0x60020086. The runtime will prefer the VTID if present
  @VTID(141)
  int rasterExportTransparencyColor();


  /**
   * <p>
   * Setter method for the COM property "RasterExportTransparencyColor"
   * </p>
   * @param pColor Mandatory int parameter.
   */

  @DISPID(1610743942) //= 0x60020086. The runtime will prefer the VTID if present
  @VTID(142)
  void rasterExportTransparencyColor(
    int pColor);


  /**
   * <p>
   * Getter method for the COM property "RasterExportUseTransparencyColor"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743944) //= 0x60020088. The runtime will prefer the VTID if present
  @VTID(143)
  boolean rasterExportUseTransparencyColor();


  /**
   * <p>
   * Setter method for the COM property "RasterExportUseTransparencyColor"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(1610743944) //= 0x60020088. The runtime will prefer the VTID if present
  @VTID(144)
  void rasterExportUseTransparencyColor(
    boolean pVal);


  /**
   * <p>
   * Getter method for the COM property "RasterExportQuality"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743946) //= 0x6002008a. The runtime will prefer the VTID if present
  @VTID(145)
  int rasterExportQuality();


  /**
   * <p>
   * Setter method for the COM property "RasterExportQuality"
   * </p>
   * @param plQuality Mandatory int parameter.
   */

  @DISPID(1610743946) //= 0x6002008a. The runtime will prefer the VTID if present
  @VTID(146)
  void rasterExportQuality(
    int plQuality);


  // Properties:
}
