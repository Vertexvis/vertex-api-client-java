package com.vertexvis.model;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

public class AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperationTest {

  @Test
  void serializesChangeVisibilityOperation() {
    AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation
        op
        =
        new AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
            new ChangeVisibilityOperation().type(
                ChangeVisibilityOperation.TypeEnum.CHANGE_VISIBILITY).visible(false));

    String expected = "{\"type\":\"change-visibility\",\"visible\":false}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesChangeMaterialOperation() {
    AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation
        op
        =
        new AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
            new ChangeMaterialOperation().type(ChangeMaterialOperation.TypeEnum.CHANGE_MATERIAL)
                .material(new ColorMaterial()));

    String expected = "{\"type\":\"change-material\",\"material\":{}}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesClearMaterialOperation() {
    AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation
        op
        =
        new AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
            new ClearMaterialOperation().type(ClearMaterialOperation.TypeEnum.CLEAR_MATERIAL));

    String expected = "{\"type\":\"clear-material\"}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesChangeTransformOperation() {
    AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation
        op
        =
        new AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
            new ChangeTransformOperation().type(ChangeTransformOperation.TypeEnum.CHANGE_TRANSFORM)
                .transform(new Matrix4()));

    String expected = "{\"type\":\"change-transform\",\"transform\":{}}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesClearTransformOperation() {
    AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation
        op
        =
        new AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
            new ClearTransformOperation().type(ClearTransformOperation.TypeEnum.CLEAR_TRANSFORM));

    String expected = "{\"type\":\"clear-transform\"}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesSelectOperation() {
    AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation
        op
        =
        new AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
            new SelectOperation().type(SelectOperation.TypeEnum.SELECT)
                .material(new ColorMaterial()));

    String expected = "{\"type\":\"select\",\"material\":{}}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesDeselectOperation() {
    AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation
        op
        =
        new AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
            new DeselectOperation().type(DeselectOperation.TypeEnum.DESELECT));

    String expected = "{\"type\":\"deselect\"}";

    assertEquals(expected, new JSON().serialize(op));
  }
}
