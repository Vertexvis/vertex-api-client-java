package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp;

import java.io.IOException;
import java.util.function.Supplier;

public class AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperationTypeAdapter
    extends
    TypeAdapter<AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp> {
  private final Supplier<Gson> gsonSupplier;

  public AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperationTypeAdapter(
      Supplier<Gson> gsonSupplier) {
    this.gsonSupplier = gsonSupplier;
  }

  @Override
  public void write(JsonWriter out,
                    AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp value)
      throws IOException {
    out.jsonValue(gsonSupplier.get().toJson(value.getOperation()));
  }

  @Override
  public AnyOfChangeVisibilityOpChangeMaterialOpClearMaterialOpChangeTransformOpClearTransformOpSelectOpDeselectOperationClearRenOpViewDefaultRenOpViewRenByIdOpViewRenBySuppliedIdOpViewRepByIdOpViewRepByPredefinedIdOpClearRepOp read(
      JsonReader in) throws IOException {
    throw new UnsupportedOperationException("Deserializing this is currently not supported.");
  }
}
