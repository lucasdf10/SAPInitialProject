//# Do not modify this file -- YOUR CHANGES WILL BE ERASED!
//  Generated by SAP Cloud Platform Android SDK 2.0.0, on Fri Mar 15 17:00:06 BRT 2019
//  Proxy Generator Version: 18.11.0-9ee469-20181119

package com.example.sapinitialproject.ESPM.internal;

/**
 ** <p>Utility class for unsafe type casting to non-nullable target type.
 **/
public abstract class Any_as_com_example_sapinitialproject_ESPM_ProductText {
    /**
     ** <p>Return <code>value</code> cast to AnyType.</p>
     ** <dl><dt><span class='strong'>Throws:</span></dt><dd>
     ** <p>{@link com.sap.cloud.mobile.odata.core.CastException} if <code>value</code> is not of type <code>AnyType</code>.</p>
     ** </dd></dl>
     ** @return `value` cast to AnyType.
     **/
    public static @android.support.annotation.NonNull @org.jetbrains.annotations.NotNull com.example.sapinitialproject.ESPM.ProductText cast(final @android.support.annotation.Nullable @org.jetbrains.annotations.Nullable Object value) {
        if (value instanceof com.example.sapinitialproject.ESPM.ProductText) {
            final com.example.sapinitialproject.ESPM.ProductText var_value = ((com.example.sapinitialproject.ESPM.ProductText)value);
            return var_value;
        } else {
            throw com.sap.cloud.mobile.odata.core.CastException.cannotCast(value, "com.example.sapinitialproject.ESPM.ProductText");
        }
    }
}
