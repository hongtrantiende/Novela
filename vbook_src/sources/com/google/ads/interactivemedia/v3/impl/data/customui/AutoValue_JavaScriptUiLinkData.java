package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_JavaScriptUiLinkData extends JavaScriptUiLinkData {
    private final String clickUrl;
    private final String id;
    private final boolean required;
    private final String text;

    public AutoValue_JavaScriptUiLinkData(String str, boolean z, String str2, String str3) {
        if (str != null) {
            this.id = str;
            this.required = z;
            if (str2 != null) {
                this.text = str2;
                if (str3 != null) {
                    this.clickUrl = str3;
                    return;
                } else {
                    xk5.k("Null clickUrl");
                    throw null;
                }
            }
            xk5.k("Null text");
            throw null;
        }
        xk5.k("Null id");
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLinkData
    public String clickUrl() {
        return this.clickUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiLinkData) {
            JavaScriptUiLinkData javaScriptUiLinkData = (JavaScriptUiLinkData) obj;
            if (this.id.equals(javaScriptUiLinkData.id()) && this.required == javaScriptUiLinkData.required() && this.text.equals(javaScriptUiLinkData.text()) && this.clickUrl.equals(javaScriptUiLinkData.clickUrl())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.id.hashCode() ^ 1000003;
        if (true != this.required) {
            i = 1237;
        } else {
            i = 1231;
        }
        return this.clickUrl.hashCode() ^ (((((hashCode * 1000003) ^ i) * 1000003) ^ this.text.hashCode()) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLinkData
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLinkData
    public boolean required() {
        return this.required;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLinkData
    public String text() {
        return this.text;
    }

    public String toString() {
        String str = this.id;
        int length = String.valueOf(str).length();
        boolean z = this.required;
        int length2 = String.valueOf(z).length();
        String str2 = this.text;
        int length3 = String.valueOf(str2).length();
        String str3 = this.clickUrl;
        StringBuilder sb = new StringBuilder(length + 35 + length2 + 7 + length3 + 11 + String.valueOf(str3).length() + 1);
        sb.append("JavaScriptUiLinkData{id=");
        sb.append(str);
        sb.append(", required=");
        sb.append(z);
        nk2.C(sb, ", text=", str2, ", clickUrl=", str3);
        sb.append("}");
        return sb.toString();
    }
}
