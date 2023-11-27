package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp {
  private ChangeVisibilityOp changeVisibilityOperation;
  private ChangeMaterialOp changeMaterialOperation;
  private ClearMaterialOp clearMaterialOperation;
  private ChangeTransformOp changeTransformOperation;
  private ClearTransformOp clearTransformOperation;
  private SelectOp selectOperation;
  private DeselectOperation deselectOperation;

  public AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
      ChangeVisibilityOp changeVisibilityOperation) {
    this.changeVisibilityOperation = changeVisibilityOperation;
  }

  public AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
      ChangeMaterialOp changeMaterialOperation) {
    this.changeMaterialOperation = changeMaterialOperation;
  }

  public AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
      ClearMaterialOp clearMaterialOperation) {
    this.clearMaterialOperation = clearMaterialOperation;
  }

  public AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
      ChangeTransformOp changeTransformOperation) {
    this.changeTransformOperation = changeTransformOperation;
  }

  public AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
      ClearTransformOp clearTransformOperation) {
    this.clearTransformOperation = clearTransformOperation;
  }

  public AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
      SelectOp selectOperation) {
    this.selectOperation = selectOperation;
  }

  public AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp(
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
  public ChangeVisibilityOp getChangeVisibilityOperation() {
    return this.changeVisibilityOperation;
  }

  @Nullable
  public ChangeMaterialOp getChangeMaterialOperation() {
    return this.changeMaterialOperation;
  }

  @Nullable
  public ClearMaterialOp getClearMaterialOperation() {
    return this.clearMaterialOperation;
  }

  @Nullable
  public ChangeTransformOp getChangeTransformOperation() {
    return this.changeTransformOperation;
  }

  @Nullable
  public ClearTransformOp getClearTransformOperation() {
    return this.clearTransformOperation;
  }

  @Nullable
  public SelectOp getSelectOperation() {
    return this.selectOperation;
  }

  @Nullable
  public DeselectOperation getDeselectOperation() {
    return this.deselectOperation;
  }
}
