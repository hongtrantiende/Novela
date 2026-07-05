package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class UiImageImpl implements puc {
    private m6f altText;
    private int height;
    private String url;
    private int width;

    public UiImageImpl(String str, int i, int i2, String str2) {
        this.width = 0;
        this.height = 0;
        this.altText = c6f.a;
        this.url = str;
        this.width = i;
        this.height = i2;
        this.altText = m6f.d(str2);
    }

    public static UiImageImpl createFromJavaScriptMessage(JavaScriptUiImageData javaScriptUiImageData) {
        return new UiImageImpl(javaScriptUiImageData.url(), javaScriptUiImageData.width(), javaScriptUiImageData.height(), javaScriptUiImageData.altText());
    }

    public String getAltText() {
        return (String) this.altText.a();
    }

    public int getHeight() {
        return this.height;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAltText(String str) {
        this.altText = m6f.c(str);
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
