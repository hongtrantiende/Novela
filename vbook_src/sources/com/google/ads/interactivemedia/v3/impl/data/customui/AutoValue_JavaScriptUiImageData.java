package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_JavaScriptUiImageData extends JavaScriptUiImageData {
    private final String altText;
    private final int height;
    private final String url;
    private final int width;

    public AutoValue_JavaScriptUiImageData(String str, String str2, int i, int i2) {
        if (str != null) {
            this.url = str;
            if (str2 != null) {
                this.altText = str2;
                this.width = i;
                this.height = i2;
                return;
            }
            xk5.k("Null altText");
            throw null;
        }
        xk5.k("Null url");
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiImageData
    public String altText() {
        return this.altText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiImageData) {
            JavaScriptUiImageData javaScriptUiImageData = (JavaScriptUiImageData) obj;
            if (this.url.equals(javaScriptUiImageData.url()) && this.altText.equals(javaScriptUiImageData.altText()) && this.width == javaScriptUiImageData.width() && this.height == javaScriptUiImageData.height()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.height ^ ((((((this.url.hashCode() ^ 1000003) * 1000003) ^ this.altText.hashCode()) * 1000003) ^ this.width) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiImageData
    public int height() {
        return this.height;
    }

    public String toString() {
        String str = this.url;
        int length = String.valueOf(str).length();
        String str2 = this.altText;
        int length2 = String.valueOf(str2).length();
        int i = this.width;
        int length3 = String.valueOf(i).length();
        int i2 = this.height;
        StringBuilder sb = new StringBuilder(length + 36 + length2 + 8 + length3 + 9 + String.valueOf(i2).length() + 1);
        nk2.C(sb, "JavaScriptUiImageData{url=", str, ", altText=", str2);
        a82.t(i, i2, ", width=", ", height=", sb);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiImageData
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiImageData
    public int width() {
        return this.width;
    }
}
