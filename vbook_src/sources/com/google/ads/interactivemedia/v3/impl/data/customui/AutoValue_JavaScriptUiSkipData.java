package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_JavaScriptUiSkipData extends JavaScriptUiSkipData {
    private final JavaScriptUiButtonData button;
    private final JavaScriptUiLabelData countdown;

    public AutoValue_JavaScriptUiSkipData(JavaScriptUiButtonData javaScriptUiButtonData, JavaScriptUiLabelData javaScriptUiLabelData) {
        if (javaScriptUiButtonData != null) {
            this.button = javaScriptUiButtonData;
            if (javaScriptUiLabelData != null) {
                this.countdown = javaScriptUiLabelData;
                return;
            } else {
                xk5.k("Null countdown");
                throw null;
            }
        }
        xk5.k("Null button");
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiSkipData
    public JavaScriptUiButtonData button() {
        return this.button;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiSkipData
    public JavaScriptUiLabelData countdown() {
        return this.countdown;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiSkipData) {
            JavaScriptUiSkipData javaScriptUiSkipData = (JavaScriptUiSkipData) obj;
            if (this.button.equals(javaScriptUiSkipData.button()) && this.countdown.equals(javaScriptUiSkipData.countdown())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.countdown.hashCode() ^ ((this.button.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        JavaScriptUiLabelData javaScriptUiLabelData = this.countdown;
        String valueOf = String.valueOf(this.button);
        String valueOf2 = String.valueOf(javaScriptUiLabelData);
        StringBuilder sb = new StringBuilder(valueOf.length() + 40 + valueOf2.length() + 1);
        nk2.C(sb, "JavaScriptUiSkipData{button=", valueOf, ", countdown=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
