

# UpdateSceneRequestDataAttributes


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**camera** | [**AnyOfCameraCameraFit**](AnyOfCameraCameraFit.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of the scene. |  [optional]
**suppliedId** | **String** | ID provided for correlation. For example, an existing ID from a PLM system. |  [optional]
**name** | **String** |  |  [optional]
**treeEnabled** | **Boolean** | Whether or not scene trees can be viewed for this scene. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
COMMIT | &quot;commit&quot;



