package com.vertexvis.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import javax.annotation.Nullable;

public class AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation {
  private ChangeVisibilityOperation changeVisibilityOperation;
  private ChangeMaterialOperation changeMaterialOperation;
  private ClearMaterialOperation clearMaterialOperation;
  private ChangeTransformOperation changeTransformOperation;
  private ClearTransformOperation clearTransformOperation;
  private SelectOperation selectOperation;
  private DeselectOperation deselectOperation;

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation changeVisibilityOperation(
      ChangeVisibilityOperation changeVisibilityOperation) {
    setAllToNull();
    this.changeVisibilityOperation = changeVisibilityOperation;
    return this;
  }

  @Nullable
  @SerializedName("changeVisibilityOperation")
  public ChangeVisibilityOperation getChangeVisibilityOperation() {
    return this.changeVisibilityOperation;
  }

  public void setChangeVisibilityOperation(ChangeVisibilityOperation changeVisibilityOperation) {
    changeVisibilityOperation(changeVisibilityOperation);
  }

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation changeMaterialOperation(
      ChangeMaterialOperation changeMaterialOperation) {
    setAllToNull();
    this.changeMaterialOperation = changeMaterialOperation;
    return this;
  }

  @Nullable
  @SerializedName("changeMaterialOperation")
  public ChangeMaterialOperation getChangeMaterialOperation() {
    return this.changeMaterialOperation;
  }

  public void setChangeMaterialOperation(ChangeMaterialOperation changeMaterialOperation) {
    changeMaterialOperation(changeMaterialOperation);
  }

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation clearMaterialOperation(
      ClearMaterialOperation clearMaterialOperation) {
    setAllToNull();
    this.clearMaterialOperation = clearMaterialOperation;
    return this;
  }

  @Nullable
  @SerializedName("clearMaterialOperation")
  public ClearMaterialOperation getClearMaterialOperation() {
    return this.clearMaterialOperation;
  }

  public void setClearMaterialOperation(ClearMaterialOperation clearMaterialOperation) {
    clearMaterialOperation(clearMaterialOperation);
  }

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation changeTransformOperation(
      ChangeTransformOperation changeTransformOperation) {
    setAllToNull();
    this.changeTransformOperation = changeTransformOperation;
    return this;
  }

  @Nullable
  @SerializedName("changeTransformOperation")
  public ChangeTransformOperation getChangeTransformOperation() {
    return this.changeTransformOperation;
  }

  public void setChangeTransformOperation(ChangeTransformOperation changeTransformOperation) {
    changeTransformOperation(changeTransformOperation);
  }

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation clearTransformOperation(
      ClearTransformOperation clearTransformOperation) {
    setAllToNull();
    this.clearTransformOperation = clearTransformOperation;
    return this;
  }

  @Nullable
  @SerializedName("clearTransformOperation")
  public ClearTransformOperation getClearTransformOperation() {
    return this.clearTransformOperation;
  }

  public void setClearTransformOperation(ClearTransformOperation clearTransformOperation) {
    clearTransformOperation(clearTransformOperation);
  }

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation selectOperation(
      SelectOperation selectOperation) {
    setAllToNull();
    this.selectOperation = selectOperation;
    return this;
  }

  @Nullable
  @SerializedName("selectOperation")
  public SelectOperation getSelectOperation() {
    return this.selectOperation;
  }

  public void setSelectOperation(SelectOperation selectOperation) {
    selectOperation(selectOperation);
  }

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation deselectOperation(
      DeselectOperation deselectOperation) {
    setAllToNull();
    this.deselectOperation = deselectOperation;
    return this;
  }

  @Nullable
  @SerializedName("deselectOperation")
  public DeselectOperation getDeselectOperation() {
    return this.deselectOperation;
  }

  public void setDeselectOperation(DeselectOperation deselectOperation) {
    deselectOperation(deselectOperation);
  }

  private void setAllToNull() {
    this.changeVisibilityOperation = null;
    this.changeMaterialOperation = null;
    this.clearMaterialOperation = null;
    this.changeTransformOperation = null;
    this.clearTransformOperation = null;
    this.selectOperation = null;
    this.deselectOperation = null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation
        that =
        (AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation) o;
    return Objects.equals(changeVisibilityOperation, that.changeVisibilityOperation) &&
        Objects.equals(changeMaterialOperation, that.changeMaterialOperation) &&
        Objects.equals(clearMaterialOperation, that.clearMaterialOperation) &&
        Objects.equals(changeTransformOperation, that.changeTransformOperation) &&
        Objects.equals(clearTransformOperation, that.clearTransformOperation) &&
        Objects.equals(selectOperation, that.selectOperation) &&
        Objects.equals(deselectOperation, that.deselectOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeVisibilityOperation, changeMaterialOperation, clearMaterialOperation,
        changeTransformOperation, clearTransformOperation, selectOperation, deselectOperation);
  }

  @Override
  public String toString() {
    return
        "AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation{" +
            "changeVisibilityOperation=" + changeVisibilityOperation +
            ", changeMaterialOperation=" + changeMaterialOperation +
            ", clearMaterialOperation=" + clearMaterialOperation +
            ", changeTransformOperation=" + changeTransformOperation +
            ", clearTransformOperation=" + clearTransformOperation +
            ", selectOperation=" + selectOperation +
            ", deselectOperation=" + deselectOperation +
            '}';
  }
}
