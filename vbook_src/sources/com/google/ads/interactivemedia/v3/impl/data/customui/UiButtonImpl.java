package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class UiButtonImpl extends UiLabelImpl implements luc {
    public UiButtonImpl(String str, boolean z, String str2) {
        super(str, z, str2);
    }

    public static UiButtonImpl createFromJavaScriptMessage(JavaScriptUiButtonData javaScriptUiButtonData) {
        return new UiButtonImpl(javaScriptUiButtonData.id(), javaScriptUiButtonData.required(), javaScriptUiButtonData.text());
    }
}
