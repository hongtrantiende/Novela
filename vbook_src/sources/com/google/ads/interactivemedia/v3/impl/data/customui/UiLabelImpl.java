package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class UiLabelImpl extends UiElementImpl implements quc {
    private String text;

    public UiLabelImpl(String str, boolean z, String str2) {
        super(str, z);
        this.text = str2;
    }

    public static UiLabelImpl createFromJavaScriptMessage(JavaScriptUiLabelData javaScriptUiLabelData) {
        return new UiLabelImpl(javaScriptUiLabelData.id(), javaScriptUiLabelData.required(), javaScriptUiLabelData.text());
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }
}
