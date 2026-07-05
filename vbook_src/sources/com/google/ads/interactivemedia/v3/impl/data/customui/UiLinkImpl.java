package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class UiLinkImpl extends UiLabelImpl implements ruc {
    private String clickUrl;

    public UiLinkImpl(String str, boolean z, String str2, String str3) {
        super(str, z, str2);
        this.clickUrl = str3;
    }

    public static UiLinkImpl createFromJavaScriptMessage(JavaScriptUiLinkData javaScriptUiLinkData) {
        return new UiLinkImpl(javaScriptUiLinkData.id(), javaScriptUiLinkData.required(), javaScriptUiLinkData.text(), javaScriptUiLinkData.clickUrl());
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public void setClickUrl(String str) {
        this.clickUrl = str;
    }
}
