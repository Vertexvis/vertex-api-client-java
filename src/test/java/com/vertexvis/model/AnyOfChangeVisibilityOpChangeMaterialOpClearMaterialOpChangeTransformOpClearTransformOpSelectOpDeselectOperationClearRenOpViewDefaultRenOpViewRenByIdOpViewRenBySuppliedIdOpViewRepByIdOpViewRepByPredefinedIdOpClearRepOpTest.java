package com.vertexvis.model;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

public class AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOpTest {

  @Test
  void serializesChangeVisibilityOperation() {
    SceneOperationOperationsInner
        op
        =
        new SceneOperationOperationsInner(
            new ChangeVisibilityOp().type(
                ChangeVisibilityOp.TypeEnum.CHANGE_VISIBILITY).visible(false));

    String expected = "{\"type\":\"change-visibility\",\"visible\":false}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesChangeMaterialOperation() {
    SceneOperationOperationsInner
        op
        =
        new SceneOperationOperationsInner(
            new ChangeMaterialOp().type(ChangeMaterialOp.TypeEnum.CHANGE_MATERIAL)
                .material(new ColorMaterial()));

    String expected = "{\"type\":\"change-material\",\"material\":{}}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesClearMaterialOperation() {
    SceneOperationOperationsInner
        op
        =
        new SceneOperationOperationsInner(
            new ClearMaterialOp().type(ClearMaterialOp.TypeEnum.CLEAR_MATERIAL));

    String expected = "{\"type\":\"clear-material\"}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesChangeTransformOperation() {
    SceneOperationOperationsInner
        op
        =
        new SceneOperationOperationsInner(
            new ChangeTransformOp().type(ChangeTransformOp.TypeEnum.CHANGE_TRANSFORM)
                .transform(new Matrix4()));

    String expected = "{\"type\":\"change-transform\",\"transform\":{}}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesClearTransformOperation() {
    SceneOperationOperationsInner
        op
        =
        new SceneOperationOperationsInner(
            new ClearTransformOp().type(ClearTransformOp.TypeEnum.CLEAR_TRANSFORM));

    String expected = "{\"type\":\"clear-transform\"}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesSelectOperation() {
    SceneOperationOperationsInner
        op
        =
        new SceneOperationOperationsInner(
            new SelectOp().type(SelectOp.TypeEnum.SELECT));

    String expected = "{\"type\":\"select\"}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesDeselectOperation() {
    SceneOperationOperationsInner
        op
        =
        new SceneOperationOperationsInner(
            new DeselectOperation().type(DeselectOperation.TypeEnum.DESELECT));

    String expected = "{\"type\":\"deselect\"}";

    assertEquals(expected, new JSON().serialize(op));
  }
}
