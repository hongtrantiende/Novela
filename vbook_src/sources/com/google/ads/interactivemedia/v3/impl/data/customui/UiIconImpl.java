package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class UiIconImpl extends UiElementImpl implements ouc {
    private m6f clickUrl;
    private boolean clickable;
    private puc image;

    public UiIconImpl(String str, boolean z, puc pucVar, boolean z2, String str2) {
        super(str, z);
        this.clickable = false;
        this.clickUrl = c6f.a;
        this.image = pucVar;
        this.clickable = z2;
        this.clickUrl = m6f.d(str2);
    }

    public static UiIconImpl createFromJavaScriptMessage(JavaScriptUiIconData javaScriptUiIconData) {
        return new UiIconImpl(javaScriptUiIconData.id(), javaScriptUiIconData.required(), UiImageImpl.createFromJavaScriptMessage(javaScriptUiIconData.image()), javaScriptUiIconData.clickable(), javaScriptUiIconData.clickUrl());
    }

    public String getClickUrl() {
        return (String) this.clickUrl.a();
    }

    public boolean getClickable() {
        return this.clickable;
    }

    public puc getImage() {
        return this.image;
    }

    public void setClickUrl(String str) {
        this.clickUrl = m6f.c(str);
    }

    public void setClickable(boolean z) {
        this.clickable = z;
    }

    public void setImage(puc pucVar) {
        this.image = pucVar;
    }
}
