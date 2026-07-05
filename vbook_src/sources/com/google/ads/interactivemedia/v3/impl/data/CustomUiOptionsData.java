package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class CustomUiOptionsData {
    public static CustomUiOptionsData createFromCustomUiOptions(ne2 ne2Var) {
        return new AutoValue_CustomUiOptionsData(ne2Var.getSkippableSupport(), ne2Var.getAboutThisAdSupport());
    }

    public abstract boolean aboutThisAdSupport();

    public abstract boolean skippableSupport();
}
