//# Do not modify this file -- YOUR CHANGES WILL BE ERASED!
//  Generated by SAP Cloud Platform Android SDK 2.0.0, on Fri Mar 15 17:00:06 BRT 2019
//  Proxy Generator Version: 18.11.0-9ee469-20181119

package com.example.sapinitialproject.ESPM;

public class PurchaseOrderItem extends com.sap.cloud.mobile.odata.EntityValue implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<PurchaseOrderItem> CREATOR = new android.os.Parcelable.Creator<PurchaseOrderItem>() {
        public PurchaseOrderItem createFromParcel(android.os.Parcel in) {
            com.sap.cloud.mobile.odata.JsonEntityProvider provider = com.sap.cloud.mobile.odata.JsonEntityProvider.withMetadata(ESPMContainerMetadata.document);
            ESPMContainer service = new ESPMContainer(provider);
            com.sap.cloud.mobile.odata.DataQuery query = com.sap.cloud.mobile.odata.FromJSON.entity(in.readString());
            query.setEntitySet(ESPMContainerMetadata.EntitySets.purchaseOrderItems);
            query.setEntityType(ESPMContainerMetadata.EntityTypes.purchaseOrderItem);
            com.sap.cloud.mobile.odata.EntityValue entity = service.executeQuery(query).getRequiredEntity();
            return (PurchaseOrderItem)entity;
        }

        public PurchaseOrderItem[] newArray(int size) {
            return new PurchaseOrderItem[size];
        }
    };

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(android.os.Parcel out, int flags) {
        out.writeString(com.sap.cloud.mobile.odata.ToJSON.entity(this, com.sap.cloud.mobile.odata.DataContext.FULL_METADATA));
    }

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property currencyCode = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("CurrencyCode");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property grossAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("GrossAmount");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property itemNumber = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("ItemNumber");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property netAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("NetAmount");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property productID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("ProductId");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property purchaseOrderID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("PurchaseOrderId");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property quantity = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("Quantity");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property quantityUnit = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("QuantityUnit");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property taxAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("TaxAmount");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property header = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("Header");

    public static volatile @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.Property productDetails = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("ProductDetails");

    /**
     ** See <a href='#PurchaseOrderItem-boolean-'>PurchaseOrderItem(boolean)</a>.
     **/
    public PurchaseOrderItem() {
        this(true);
    }

    public PurchaseOrderItem(final boolean withDefaults) {
        super(withDefaults, com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem);
    }

    public @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.example.sapinitialproject.ESPM.PurchaseOrderItem copy() {
        return com.example.sapinitialproject.ESPM.internal.Any_as_com_example_sapinitialproject_ESPM_PurchaseOrderItem.cast(this.copyEntity());
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getCurrencyCode() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.currencyCode));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable java.math.BigDecimal getGrossAmount() {
        return com.sap.cloud.mobile.odata.DecimalValue.toNullable(this.getOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.grossAmount));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable com.example.sapinitialproject.ESPM.PurchaseOrderHeader getHeader() {
        return com.example.sapinitialproject.ESPM.internal.Any_asNullable_com_example_sapinitialproject_ESPM_PurchaseOrderHeader.cast(this.getOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.header));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable Integer getItemNumber() {
        return com.sap.cloud.mobile.odata.IntValue.toNullable(this.getOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.itemNumber));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable java.math.BigDecimal getNetAmount() {
        return com.sap.cloud.mobile.odata.DecimalValue.toNullable(this.getOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.netAmount));
    }

    public @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.example.sapinitialproject.ESPM.PurchaseOrderItem getOld() {
        return com.example.sapinitialproject.ESPM.internal.Any_as_com_example_sapinitialproject_ESPM_PurchaseOrderItem.cast(this.getOldEntity());
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable com.example.sapinitialproject.ESPM.Product getProductDetails() {
        return com.example.sapinitialproject.ESPM.internal.Any_asNullable_com_example_sapinitialproject_ESPM_Product.cast(this.getOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.productDetails));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getProductID() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.productID));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getPurchaseOrderID() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.purchaseOrderID));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable java.math.BigDecimal getQuantity() {
        return com.sap.cloud.mobile.odata.DecimalValue.toNullable(this.getOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.quantity));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String getQuantityUnit() {
        return com.sap.cloud.mobile.odata.StringValue.toNullable(this.getOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.quantityUnit));
    }

    public @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable java.math.BigDecimal getTaxAmount() {
        return com.sap.cloud.mobile.odata.DecimalValue.toNullable(this.getOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.taxAmount));
    }

    /**
     ** {@inheritDoc}
     **/
    @java.lang.Override public boolean isProxy() {
        return true;
    }

    public static @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.EntityKey key(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable Integer itemNumber, final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String purchaseOrderID) {
        return new com.sap.cloud.mobile.odata.EntityKey().with("ItemNumber", com.sap.cloud.mobile.odata.IntValue.ofNullable(itemNumber)).with("PurchaseOrderId", com.sap.cloud.mobile.odata.StringValue.ofNullable(purchaseOrderID));
    }

    public static @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull java.util.List<com.example.sapinitialproject.ESPM.@org.jetbrains.annotations.NotNull PurchaseOrderItem> list(final @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.EntityValueList from) {
        return com.sap.cloud.mobile.odata.core.ListConverter.<com.sap.cloud.mobile.odata.EntityValue,com.example.sapinitialproject.ESPM.PurchaseOrderItem>convert(from.toGeneric());
    }

    public void setCurrencyCode(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.currencyCode, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setGrossAmount(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable java.math.BigDecimal value) {
        this.setOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.grossAmount, com.sap.cloud.mobile.odata.DecimalValue.ofNullable(value));
    }

    public void setHeader(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable com.example.sapinitialproject.ESPM.PurchaseOrderHeader value) {
        this.setOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.header, value);
    }

    public void setItemNumber(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable Integer value) {
        this.setOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.itemNumber, com.sap.cloud.mobile.odata.IntValue.ofNullable(value));
    }

    public void setNetAmount(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable java.math.BigDecimal value) {
        this.setOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.netAmount, com.sap.cloud.mobile.odata.DecimalValue.ofNullable(value));
    }

    public void setProductDetails(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable com.example.sapinitialproject.ESPM.Product value) {
        this.setOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.productDetails, value);
    }

    public void setProductID(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.productID, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setPurchaseOrderID(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.purchaseOrderID, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setQuantity(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable java.math.BigDecimal value) {
        this.setOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.quantity, com.sap.cloud.mobile.odata.DecimalValue.ofNullable(value));
    }

    public void setQuantityUnit(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable String value) {
        this.setOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.quantityUnit, com.sap.cloud.mobile.odata.StringValue.ofNullable(value));
    }

    public void setTaxAmount(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable java.math.BigDecimal value) {
        this.setOptionalValue(com.example.sapinitialproject.ESPM.PurchaseOrderItem.taxAmount, com.sap.cloud.mobile.odata.DecimalValue.ofNullable(value));
    }
}
