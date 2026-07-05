package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class UiSkipImpl implements suc {
    private luc button;
    private quc countdown;

    public UiSkipImpl(luc lucVar, quc qucVar) {
        this.button = lucVar;
        this.countdown = qucVar;
    }

    public static UiSkipImpl createFromJavaScriptMessage(JavaScriptUiSkipData javaScriptUiSkipData) {
        return new UiSkipImpl(UiButtonImpl.createFromJavaScriptMessage(javaScriptUiSkipData.button()), UiLabelImpl.createFromJavaScriptMessage(javaScriptUiSkipData.countdown()));
    }

    public luc getButton() {
        return this.button;
    }

    public quc getCountdown() {
        return this.countdown;
    }

    public void setButton(luc lucVar) {
        this.button = lucVar;
    }

    public void setCountdown(quc qucVar) {
        this.countdown = qucVar;
    }
}
