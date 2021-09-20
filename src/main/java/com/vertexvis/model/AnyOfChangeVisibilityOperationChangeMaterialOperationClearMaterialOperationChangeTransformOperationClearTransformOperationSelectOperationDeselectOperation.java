package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation {
  private ChangeVisibilityOperation changeVisibilityOperation;
  private ChangeMaterialOperation changeMaterialOperation;
  private ClearMaterialOperation clearMaterialOperation;
  private ChangeTransformOperation changeTransformOperation;
  private ClearTransformOperation clearTransformOperation;
  private SelectOperation selectOperation;
  private DeselectOperation deselectOperation;

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
      ChangeVisibilityOperation changeVisibilityOperation) {
    this.changeVisibilityOperation = changeVisibilityOperation;
  }

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
      ChangeMaterialOperation changeMaterialOperation) {
    this.changeMaterialOperation = changeMaterialOperation;
  }

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
      ClearMaterialOperation clearMaterialOperation) {
    this.clearMaterialOperation = clearMaterialOperation;
  }

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
      ChangeTransformOperation changeTransformOperation) {
    this.changeTransformOperation = changeTransformOperation;
  }

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
      ClearTransformOperation clearTransformOperation) {
    this.clearTransformOperation = clearTransformOperation;
  }

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
      SelectOperation selectOperation) {
    this.selectOperation = selectOperation;
  }

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation(
      DeselectOperation deselectOperation) {
    this.deselectOperation = deselectOperation;
  }

  public Object getOperation() {
    if (this.changeVisibilityOperation != null) {
      return this.changeVisibilityOperation;
    }
    if (this.changeMaterialOperation != null) {
      return this.changeMaterialOperation;
    }
    if (this.clearMaterialOperation != null) {
      return this.clearMaterialOperation;
    }
    if (this.changeTransformOperation != null) {
      return this.changeTransformOperation;
    }
    if (this.clearTransformOperation != null) {
      return this.clearTransformOperation;
    }
    if (this.selectOperation != null) {
      return this.selectOperation;
    }
    if (this.deselectOperation != null) {
      return this.deselectOperation;
    }

    return null;
  }

  @Nullable
  public ChangeVisibilityOperation getChangeVisibilityOperation() {
    return this.changeVisibilityOperation;
  }

  @Nullable
  public ChangeMaterialOperation getChangeMaterialOperation() {
    return this.changeMaterialOperation;
  }

  @Nullable
  public ClearMaterialOperation getClearMaterialOperation() {
    return this.clearMaterialOperation;
  }

  @Nullable
  public ChangeTransformOperation getChangeTransformOperation() {
    return this.changeTransformOperation;
  }

  @Nullable
  public ClearTransformOperation getClearTransformOperation() {
    return this.clearTransformOperation;
  }

  @Nullable
  public SelectOperation getSelectOperation() {
    return this.selectOperation;
  }

  @Nullable
  public DeselectOperation getDeselectOperation() {
    return this.deselectOperation;
  }
}
