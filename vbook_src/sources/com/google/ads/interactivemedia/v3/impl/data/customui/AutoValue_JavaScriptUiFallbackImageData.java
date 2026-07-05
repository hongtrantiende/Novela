package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_JavaScriptUiFallbackImageData extends JavaScriptUiFallbackImageData {
    private final String altText;
    private final int height;
    private final String id;
    private final String program;
    private final String url;
    private final int width;

    public AutoValue_JavaScriptUiFallbackImageData(String str, String str2, String str3, String str4, int i, int i2) {
        if (str != null) {
            this.id = str;
            if (str2 != null) {
                this.program = str2;
                if (str3 != null) {
                    this.url = str3;
                    if (str4 != null) {
                        this.altText = str4;
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
            xk5.k("Null program");
            throw null;
        }
        xk5.k("Null id");
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiFallbackImageData
    public String altText() {
        return this.altText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiFallbackImageData) {
            JavaScriptUiFallbackImageData javaScriptUiFallbackImageData = (JavaScriptUiFallbackImageData) obj;
            if (this.id.equals(javaScriptUiFallbackImageData.id()) && this.program.equals(javaScriptUiFallbackImageData.program()) && this.url.equals(javaScriptUiFallbackImageData.url()) && this.altText.equals(javaScriptUiFallbackImageData.altText()) && this.width == javaScriptUiFallbackImageData.width() && this.height == javaScriptUiFallbackImageData.height()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.program.hashCode()) * 1000003) ^ this.url.hashCode();
        return this.height ^ (((((hashCode * 1000003) ^ this.altText.hashCode()) * 1000003) ^ this.width) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiFallbackImageData
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiFallbackImageData
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiFallbackImageData
    public String program() {
        return this.program;
    }

    public String toString() {
        String str = this.id;
        int length = String.valueOf(str).length();
        String str2 = this.program;
        int length2 = String.valueOf(str2).length();
        String str3 = this.url;
        int length3 = String.valueOf(str3).length();
        String str4 = this.altText;
        int length4 = String.valueOf(str4).length();
        int i = this.width;
        int length5 = String.valueOf(i).length();
        int i2 = this.height;
        StringBuilder sb = new StringBuilder(length + 43 + length2 + 6 + length3 + 10 + length4 + 8 + length5 + 9 + String.valueOf(i2).length() + 1);
        nk2.C(sb, "JavaScriptUiFallbackImageData{id=", str, ", program=", str2);
        nk2.C(sb, ", url=", str3, ", altText=", str4);
        a82.t(i, i2, ", width=", ", height=", sb);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiFallbackImageData
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiFallbackImageData
    public int width() {
        return this.width;
    }
}
