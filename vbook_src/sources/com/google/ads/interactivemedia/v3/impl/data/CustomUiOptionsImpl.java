package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class CustomUiOptionsImpl implements ne2 {
    private boolean skippableSupport = false;
    private boolean aboutThisAdSupport = false;

    @Override // defpackage.ne2
    public boolean getAboutThisAdSupport() {
        return this.aboutThisAdSupport;
    }

    @Override // defpackage.ne2
    public boolean getSkippableSupport() {
        return this.skippableSupport;
    }

    public void setAboutThisAdSupport(boolean z) {
        this.aboutThisAdSupport = z;
    }

    public void setSkippableSupport(boolean z) {
        this.skippableSupport = z;
    }
}
