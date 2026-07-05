package com.google.ads.interactivemedia.v3.impl.data.customui;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class UiVastIconImpl extends UiIconImpl {
    private List<Object> fallbackImages;
    private String program;
    private m6f xPosition;
    private m6f yPosition;

    public UiVastIconImpl(String str, boolean z, puc pucVar, boolean z2, String str2, List<Object> list, String str3, String str4, String str5) {
        super(str, z, pucVar, z2, str3);
        this.program = "";
        c6f c6fVar = c6f.a;
        this.xPosition = c6fVar;
        this.yPosition = c6fVar;
        this.program = str2;
        this.fallbackImages = list;
        this.xPosition = m6f.d(str4);
        this.yPosition = m6f.d(str5);
    }

    public static UiVastIconImpl createFromJavaScriptMessage(JavaScriptUiVastIconData javaScriptUiVastIconData) {
        ArrayList arrayList = new ArrayList();
        for (JavaScriptUiFallbackImageData javaScriptUiFallbackImageData : javaScriptUiVastIconData.fallbackImages()) {
            arrayList.add(UiFallbackImageImpl.createFromJavaScriptMessage(javaScriptUiFallbackImageData));
        }
        return new UiVastIconImpl(javaScriptUiVastIconData.id(), javaScriptUiVastIconData.required(), UiImageImpl.createFromJavaScriptMessage(javaScriptUiVastIconData.image()), javaScriptUiVastIconData.clickable(), javaScriptUiVastIconData.program(), arrayList, javaScriptUiVastIconData.clickUrl(), javaScriptUiVastIconData.xPosition(), javaScriptUiVastIconData.yPosition());
    }

    public List<Object> getFallbackImages() {
        return this.fallbackImages;
    }

    public String getProgram() {
        return this.program;
    }

    public String getXPosition() {
        return (String) this.xPosition.a();
    }

    public String getYPosition() {
        return (String) this.yPosition.a();
    }

    public void setFallbackImages(List<Object> list) {
        this.fallbackImages = list;
    }

    public void setProgram(String str) {
        this.program = str;
    }

    public void setXPosition(String str) {
        this.xPosition = m6f.d(str);
    }

    public void setYPosition(String str) {
        this.yPosition = m6f.d(str);
    }
}
