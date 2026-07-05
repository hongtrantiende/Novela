package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_JavaScriptUiIconData extends JavaScriptUiIconData {
    private final String clickUrl;
    private final boolean clickable;
    private final String id;
    private final JavaScriptUiImageData image;
    private final boolean required;

    public AutoValue_JavaScriptUiIconData(String str, boolean z, String str2, boolean z2, JavaScriptUiImageData javaScriptUiImageData) {
        if (str != null) {
            this.id = str;
            this.required = z;
            if (str2 != null) {
                this.clickUrl = str2;
                this.clickable = z2;
                if (javaScriptUiImageData != null) {
                    this.image = javaScriptUiImageData;
                    return;
                } else {
                    xk5.k("Null image");
                    throw null;
                }
            }
            xk5.k("Null clickUrl");
            throw null;
        }
        xk5.k("Null id");
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiIconData
    public String clickUrl() {
        return this.clickUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiIconData
    public boolean clickable() {
        return this.clickable;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiIconData) {
            JavaScriptUiIconData javaScriptUiIconData = (JavaScriptUiIconData) obj;
            if (this.id.equals(javaScriptUiIconData.id()) && this.required == javaScriptUiIconData.required() && this.clickUrl.equals(javaScriptUiIconData.clickUrl()) && this.clickable == javaScriptUiIconData.clickable() && this.image.equals(javaScriptUiIconData.image())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.id.hashCode() ^ 1000003;
        int i2 = 1231;
        if (true != this.required) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode2 = ((((hashCode * 1000003) ^ i) * 1000003) ^ this.clickUrl.hashCode()) * 1000003;
        if (true != this.clickable) {
            i2 = 1237;
        }
        return this.image.hashCode() ^ ((hashCode2 ^ i2) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiIconData
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiIconData
    public JavaScriptUiImageData image() {
        return this.image;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiIconData
    public boolean required() {
        return this.required;
    }

    public String toString() {
        String valueOf = String.valueOf(this.image);
        String str = this.id;
        int length = String.valueOf(str).length();
        boolean z = this.required;
        int length2 = String.valueOf(z).length();
        String str2 = this.clickUrl;
        int length3 = String.valueOf(str2).length();
        boolean z2 = this.clickable;
        StringBuilder sb = new StringBuilder(length + 35 + length2 + 11 + length3 + 12 + String.valueOf(z2).length() + 8 + valueOf.length() + 1);
        sb.append("JavaScriptUiIconData{id=");
        sb.append(str);
        sb.append(", required=");
        sb.append(z);
        sb.append(", clickUrl=");
        sb.append(str2);
        sb.append(", clickable=");
        sb.append(z2);
        return nk2.v(sb, ", image=", valueOf, "}");
    }
}
