//# Do not modify this file -- YOUR CHANGES WILL BE ERASED!
//  Generated by SAP Cloud Platform Android SDK 2.0.0, on Fri Mar 15 17:00:06 BRT 2019
//  Proxy Generator Version: 18.11.0-9ee469-20181119

package com.example.sapinitialproject.ESPM.internal;

public abstract class ESPMContainerMetadataChanges {
    public static void merge(final @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.csdl.CsdlDocument metadata) {
        metadata.setGeneratedProxies(true);
        metadata.setOpenEnumerations(true);
        com.example.sapinitialproject.ESPM.ESPMContainerMetadata.document = metadata;
        com.example.sapinitialproject.ESPM.internal.ESPMContainerMetadataChanges.merge1(metadata);
        com.example.sapinitialproject.ESPM.internal.ESPMContainerFactory.registerAll();
    }

    private static void merge1(final @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.sap.cloud.mobile.odata.csdl.CsdlDocument metadata) {
        com.sap.cloud.mobile.odata.core.Ignore.valueOf_any(metadata);
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ComplexTypes.address.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ComplexTypes.address = metadata.getComplexType("ESPM.Address");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer = metadata.getEntityType("ESPM.Customer");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product = metadata.getEntityType("ESPM.Product");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productCategory = metadata.getEntityType("ESPM.ProductCategory");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productText.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productText = metadata.getEntityType("ESPM.ProductText");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader = metadata.getEntityType("ESPM.PurchaseOrderHeader");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem = metadata.getEntityType("ESPM.PurchaseOrderItem");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader = metadata.getEntityType("ESPM.SalesOrderHeader");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem = metadata.getEntityType("ESPM.SalesOrderItem");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.stock.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.stock = metadata.getEntityType("ESPM.Stock");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier = metadata.getEntityType("ESPM.Supplier");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.customers.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.customers = metadata.getEntitySet("Customers");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.productCategories.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.productCategories = metadata.getEntitySet("ProductCategories");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.productTexts.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.productTexts = metadata.getEntitySet("ProductTexts");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.products.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.products = metadata.getEntitySet("Products");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.purchaseOrderHeaders.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.purchaseOrderHeaders = metadata.getEntitySet("PurchaseOrderHeaders");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.purchaseOrderItems.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.purchaseOrderItems = metadata.getEntitySet("PurchaseOrderItems");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.salesOrderHeaders.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.salesOrderHeaders = metadata.getEntitySet("SalesOrderHeaders");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.salesOrderItems.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.salesOrderItems = metadata.getEntitySet("SalesOrderItems");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.stock.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.stock = metadata.getEntitySet("Stock");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.suppliers.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntitySets.suppliers = metadata.getEntitySet("Suppliers");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ActionImports.generateSamplePurchaseOrders.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ActionImports.generateSamplePurchaseOrders = metadata.getDataMethod("GenerateSamplePurchaseOrders");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ActionImports.generateSampleSalesOrders.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ActionImports.generateSampleSalesOrders = metadata.getDataMethod("GenerateSampleSalesOrders");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ActionImports.resetSampleData.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ActionImports.resetSampleData = metadata.getDataMethod("ResetSampleData");
        }
        if (!com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ActionImports.updateSalesOrderStatus.isRemoved()) {
            com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ActionImports.updateSalesOrderStatus = metadata.getDataMethod("UpdateSalesOrderStatus");
        }
        if (!com.example.sapinitialproject.ESPM.Address.houseNumber.isRemoved()) {
            com.example.sapinitialproject.ESPM.Address.houseNumber = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("HouseNumber");
        }
        if (!com.example.sapinitialproject.ESPM.Address.street.isRemoved()) {
            com.example.sapinitialproject.ESPM.Address.street = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("Street");
        }
        if (!com.example.sapinitialproject.ESPM.Address.city.isRemoved()) {
            com.example.sapinitialproject.ESPM.Address.city = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("City");
        }
        if (!com.example.sapinitialproject.ESPM.Address.country.isRemoved()) {
            com.example.sapinitialproject.ESPM.Address.country = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("Country");
        }
        if (!com.example.sapinitialproject.ESPM.Address.postalCode.isRemoved()) {
            com.example.sapinitialproject.ESPM.Address.postalCode = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.ComplexTypes.address.getProperty("PostalCode");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.city.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.city = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("City");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.country.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.country = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("Country");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.customerID.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.customerID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("CustomerId");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.dateOfBirth.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.dateOfBirth = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("DateOfBirth");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.emailAddress.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.emailAddress = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("EmailAddress");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.firstName.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.firstName = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("FirstName");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.houseNumber.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.houseNumber = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("HouseNumber");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.lastName.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.lastName = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("LastName");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.phoneNumber.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.phoneNumber = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("PhoneNumber");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.postalCode.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.postalCode = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("PostalCode");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.street.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.street = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("Street");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.address.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.address = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("Address");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.updatedTimestamp.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.updatedTimestamp = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("UpdatedTimestamp");
        }
        if (!com.example.sapinitialproject.ESPM.Customer.salesOrders.isRemoved()) {
            com.example.sapinitialproject.ESPM.Customer.salesOrders = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.customer.getProperty("SalesOrders");
        }
        if (!com.example.sapinitialproject.ESPM.Product.category.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.category = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("Category");
        }
        if (!com.example.sapinitialproject.ESPM.Product.categoryName.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.categoryName = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("CategoryName");
        }
        if (!com.example.sapinitialproject.ESPM.Product.currencyCode.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.currencyCode = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("CurrencyCode");
        }
        if (!com.example.sapinitialproject.ESPM.Product.dimensionDepth.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.dimensionDepth = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("DimensionDepth");
        }
        if (!com.example.sapinitialproject.ESPM.Product.dimensionHeight.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.dimensionHeight = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("DimensionHeight");
        }
        if (!com.example.sapinitialproject.ESPM.Product.dimensionUnit.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.dimensionUnit = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("DimensionUnit");
        }
        if (!com.example.sapinitialproject.ESPM.Product.dimensionWidth.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.dimensionWidth = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("DimensionWidth");
        }
        if (!com.example.sapinitialproject.ESPM.Product.longDescription.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.longDescription = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("LongDescription");
        }
        if (!com.example.sapinitialproject.ESPM.Product.name.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.name = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("Name");
        }
        if (!com.example.sapinitialproject.ESPM.Product.pictureUrl.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.pictureUrl = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("PictureUrl");
        }
        if (!com.example.sapinitialproject.ESPM.Product.price.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.price = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("Price");
        }
        if (!com.example.sapinitialproject.ESPM.Product.productID.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.productID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("ProductId");
        }
        if (!com.example.sapinitialproject.ESPM.Product.quantityUnit.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.quantityUnit = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("QuantityUnit");
        }
        if (!com.example.sapinitialproject.ESPM.Product.shortDescription.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.shortDescription = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("ShortDescription");
        }
        if (!com.example.sapinitialproject.ESPM.Product.supplierID.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.supplierID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("SupplierId");
        }
        if (!com.example.sapinitialproject.ESPM.Product.updatedTimestamp.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.updatedTimestamp = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("UpdatedTimestamp");
        }
        if (!com.example.sapinitialproject.ESPM.Product.weight.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.weight = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("Weight");
        }
        if (!com.example.sapinitialproject.ESPM.Product.weightUnit.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.weightUnit = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("WeightUnit");
        }
        if (!com.example.sapinitialproject.ESPM.Product.stockDetails.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.stockDetails = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("StockDetails");
        }
        if (!com.example.sapinitialproject.ESPM.Product.supplierDetails.isRemoved()) {
            com.example.sapinitialproject.ESPM.Product.supplierDetails = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.product.getProperty("SupplierDetails");
        }
        if (!com.example.sapinitialproject.ESPM.ProductCategory.category.isRemoved()) {
            com.example.sapinitialproject.ESPM.ProductCategory.category = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.getProperty("Category");
        }
        if (!com.example.sapinitialproject.ESPM.ProductCategory.categoryName.isRemoved()) {
            com.example.sapinitialproject.ESPM.ProductCategory.categoryName = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.getProperty("CategoryName");
        }
        if (!com.example.sapinitialproject.ESPM.ProductCategory.mainCategory.isRemoved()) {
            com.example.sapinitialproject.ESPM.ProductCategory.mainCategory = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.getProperty("MainCategory");
        }
        if (!com.example.sapinitialproject.ESPM.ProductCategory.mainCategoryName.isRemoved()) {
            com.example.sapinitialproject.ESPM.ProductCategory.mainCategoryName = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.getProperty("MainCategoryName");
        }
        if (!com.example.sapinitialproject.ESPM.ProductCategory.numberOfProducts.isRemoved()) {
            com.example.sapinitialproject.ESPM.ProductCategory.numberOfProducts = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.getProperty("NumberOfProducts");
        }
        if (!com.example.sapinitialproject.ESPM.ProductCategory.updatedTimestamp.isRemoved()) {
            com.example.sapinitialproject.ESPM.ProductCategory.updatedTimestamp = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productCategory.getProperty("UpdatedTimestamp");
        }
        if (!com.example.sapinitialproject.ESPM.ProductText.id.isRemoved()) {
            com.example.sapinitialproject.ESPM.ProductText.id = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("Id");
        }
        if (!com.example.sapinitialproject.ESPM.ProductText.language.isRemoved()) {
            com.example.sapinitialproject.ESPM.ProductText.language = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("Language");
        }
        if (!com.example.sapinitialproject.ESPM.ProductText.longDescription.isRemoved()) {
            com.example.sapinitialproject.ESPM.ProductText.longDescription = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("LongDescription");
        }
        if (!com.example.sapinitialproject.ESPM.ProductText.name.isRemoved()) {
            com.example.sapinitialproject.ESPM.ProductText.name = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("Name");
        }
        if (!com.example.sapinitialproject.ESPM.ProductText.productID.isRemoved()) {
            com.example.sapinitialproject.ESPM.ProductText.productID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("ProductId");
        }
        if (!com.example.sapinitialproject.ESPM.ProductText.shortDescription.isRemoved()) {
            com.example.sapinitialproject.ESPM.ProductText.shortDescription = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.productText.getProperty("ShortDescription");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderHeader.currencyCode.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderHeader.currencyCode = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("CurrencyCode");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderHeader.grossAmount.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderHeader.grossAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("GrossAmount");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderHeader.netAmount.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderHeader.netAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("NetAmount");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderHeader.purchaseOrderID.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderHeader.purchaseOrderID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("PurchaseOrderId");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderHeader.supplierID.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderHeader.supplierID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("SupplierId");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderHeader.taxAmount.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderHeader.taxAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("TaxAmount");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderHeader.items.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderHeader.items = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("Items");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderHeader.supplierDetails.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderHeader.supplierDetails = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderHeader.getProperty("SupplierDetails");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderItem.currencyCode.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderItem.currencyCode = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("CurrencyCode");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderItem.grossAmount.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderItem.grossAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("GrossAmount");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderItem.itemNumber.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderItem.itemNumber = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("ItemNumber");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderItem.netAmount.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderItem.netAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("NetAmount");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderItem.productID.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderItem.productID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("ProductId");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderItem.purchaseOrderID.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderItem.purchaseOrderID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("PurchaseOrderId");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderItem.quantity.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderItem.quantity = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("Quantity");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderItem.quantityUnit.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderItem.quantityUnit = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("QuantityUnit");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderItem.taxAmount.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderItem.taxAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("TaxAmount");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderItem.header.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderItem.header = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("Header");
        }
        if (!com.example.sapinitialproject.ESPM.PurchaseOrderItem.productDetails.isRemoved()) {
            com.example.sapinitialproject.ESPM.PurchaseOrderItem.productDetails = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.purchaseOrderItem.getProperty("ProductDetails");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderHeader.createdAt.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderHeader.createdAt = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("CreatedAt");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderHeader.currencyCode.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderHeader.currencyCode = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("CurrencyCode");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderHeader.customerID.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderHeader.customerID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("CustomerId");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderHeader.grossAmount.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderHeader.grossAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("GrossAmount");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderHeader.lifeCycleStatus.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderHeader.lifeCycleStatus = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("LifeCycleStatus");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderHeader.lifeCycleStatusName.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderHeader.lifeCycleStatusName = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("LifeCycleStatusName");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderHeader.netAmount.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderHeader.netAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("NetAmount");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderHeader.salesOrderID.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderHeader.salesOrderID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("SalesOrderId");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderHeader.taxAmount.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderHeader.taxAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("TaxAmount");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderHeader.items.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderHeader.items = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("Items");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderHeader.customerDetails.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderHeader.customerDetails = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderHeader.getProperty("CustomerDetails");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderItem.currencyCode.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderItem.currencyCode = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("CurrencyCode");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderItem.deliveryDate.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderItem.deliveryDate = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("DeliveryDate");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderItem.grossAmount.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderItem.grossAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("GrossAmount");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderItem.itemNumber.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderItem.itemNumber = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("ItemNumber");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderItem.netAmount.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderItem.netAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("NetAmount");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderItem.productID.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderItem.productID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("ProductId");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderItem.quantity.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderItem.quantity = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("Quantity");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderItem.quantityUnit.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderItem.quantityUnit = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("QuantityUnit");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderItem.salesOrderID.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderItem.salesOrderID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("SalesOrderId");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderItem.taxAmount.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderItem.taxAmount = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("TaxAmount");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderItem.header.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderItem.header = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("Header");
        }
        if (!com.example.sapinitialproject.ESPM.SalesOrderItem.productDetails.isRemoved()) {
            com.example.sapinitialproject.ESPM.SalesOrderItem.productDetails = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.salesOrderItem.getProperty("ProductDetails");
        }
        if (!com.example.sapinitialproject.ESPM.Stock.lotSize.isRemoved()) {
            com.example.sapinitialproject.ESPM.Stock.lotSize = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("LotSize");
        }
        if (!com.example.sapinitialproject.ESPM.Stock.minStock.isRemoved()) {
            com.example.sapinitialproject.ESPM.Stock.minStock = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("MinStock");
        }
        if (!com.example.sapinitialproject.ESPM.Stock.productID.isRemoved()) {
            com.example.sapinitialproject.ESPM.Stock.productID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("ProductId");
        }
        if (!com.example.sapinitialproject.ESPM.Stock.quantity.isRemoved()) {
            com.example.sapinitialproject.ESPM.Stock.quantity = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("Quantity");
        }
        if (!com.example.sapinitialproject.ESPM.Stock.quantityLessMin.isRemoved()) {
            com.example.sapinitialproject.ESPM.Stock.quantityLessMin = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("QuantityLessMin");
        }
        if (!com.example.sapinitialproject.ESPM.Stock.updatedTimestamp.isRemoved()) {
            com.example.sapinitialproject.ESPM.Stock.updatedTimestamp = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("UpdatedTimestamp");
        }
        if (!com.example.sapinitialproject.ESPM.Stock.productDetails.isRemoved()) {
            com.example.sapinitialproject.ESPM.Stock.productDetails = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.stock.getProperty("ProductDetails");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.city.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.city = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("City");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.country.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.country = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("Country");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.emailAddress.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.emailAddress = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("EmailAddress");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.houseNumber.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.houseNumber = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("HouseNumber");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.phoneNumber.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.phoneNumber = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("PhoneNumber");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.postalCode.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.postalCode = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("PostalCode");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.street.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.street = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("Street");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.supplierID.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.supplierID = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("SupplierId");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.supplierName.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.supplierName = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("SupplierName");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.address.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.address = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("Address");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.updatedTimestamp.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.updatedTimestamp = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("UpdatedTimestamp");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.products.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.products = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("Products");
        }
        if (!com.example.sapinitialproject.ESPM.Supplier.purchaseOrders.isRemoved()) {
            com.example.sapinitialproject.ESPM.Supplier.purchaseOrders = com.example.sapinitialproject.ESPM.ESPMContainerMetadata.EntityTypes.supplier.getProperty("PurchaseOrders");
        }
    }
}