package com.vertexvis.model;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

public class AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOpTest {

  @Test
  void serializesChangeVisibilityOperation() {
    AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp
        op
        =
        new AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
            new ChangeVisibilityOp().type(
                ChangeVisibilityOp.TypeEnum.CHANGE_VISIBILITY).visible(false));

    String expected = "{\"type\":\"change-visibility\",\"visible\":false}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesChangeMaterialOperation() {
    AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp
        op
        =
        new AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
            new ChangeMaterialOp().type(ChangeMaterialOp.TypeEnum.CHANGE_MATERIAL)
                .material(new ColorMaterial()));

    String expected = "{\"type\":\"change-material\",\"material\":{}}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesClearMaterialOperation() {
    AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp
        op
        =
        new AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
            new ClearMaterialOp().type(ClearMaterialOp.TypeEnum.CLEAR_MATERIAL));

    String expected = "{\"type\":\"clear-material\"}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesChangeTransformOperation() {
    AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp
        op
        =
        new AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
            new ChangeTransformOp().type(ChangeTransformOp.TypeEnum.CHANGE_TRANSFORM)
                .transform(new Matrix4()));

    String expected = "{\"type\":\"change-transform\",\"transform\":{}}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesClearTransformOperation() {
    AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp
        op
        =
        new AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
            new ClearTransformOp().type(ClearTransformOp.TypeEnum.CLEAR_TRANSFORM));

    String expected = "{\"type\":\"clear-transform\"}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesSelectOperation() {
    AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp
        op
        =
        new AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
            new SelectOp().type(SelectOp.TypeEnum.SELECT));

    String expected = "{\"type\":\"select\"}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesDeselectOperation() {
    AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp
        op
        =
        new AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
            new DeselectOperation().type(DeselectOperation.TypeEnum.DESELECT));

    String expected = "{\"type\":\"deselect\"}";

    assertEquals(expected, new JSON().serialize(op));
  }
}
