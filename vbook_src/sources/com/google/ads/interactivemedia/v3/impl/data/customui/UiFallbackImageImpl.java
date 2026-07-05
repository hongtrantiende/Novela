package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class UiFallbackImageImpl extends UiImageImpl {
    private String id;
    private String program;

    public UiFallbackImageImpl(String str, String str2, String str3, int i, int i2, String str4) {
        super(str3, i, i2, str4);
        this.id = str;
        this.program = str2;
    }

    public static UiFallbackImageImpl createFromJavaScriptMessage(JavaScriptUiFallbackImageData javaScriptUiFallbackImageData) {
        return new UiFallbackImageImpl(javaScriptUiFallbackImageData.id(), javaScriptUiFallbackImageData.program(), javaScriptUiFallbackImageData.url(), javaScriptUiFallbackImageData.width(), javaScriptUiFallbackImageData.height(), javaScriptUiFallbackImageData.altText());
    }

    public String getId() {
        return this.id;
    }

    public String getProgram() {
        return this.program;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setProgram(String str) {
        this.program = str;
    }
}
