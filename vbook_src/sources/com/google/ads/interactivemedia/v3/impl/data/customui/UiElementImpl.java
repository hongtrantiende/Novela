package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class UiElementImpl implements muc {
    private String id;
    private boolean required;

    public UiElementImpl(String str, boolean z) {
        this.id = str;
        this.required = z;
    }

    public static UiElementImpl createFromJavaScriptMessage(JavaScriptUiElementData javaScriptUiElementData) {
        return new UiElementImpl(javaScriptUiElementData.id(), javaScriptUiElementData.required());
    }

    public String getId() {
        return this.id;
    }

    public boolean getRequired() {
        return this.required;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setRequired(boolean z) {
        this.required = z;
    }
}
