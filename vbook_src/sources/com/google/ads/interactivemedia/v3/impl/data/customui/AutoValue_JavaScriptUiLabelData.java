package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_JavaScriptUiLabelData extends JavaScriptUiLabelData {
    private final String id;
    private final boolean required;
    private final String text;

    public AutoValue_JavaScriptUiLabelData(String str, boolean z, String str2) {
        if (str != null) {
            this.id = str;
            this.required = z;
            if (str2 != null) {
                this.text = str2;
                return;
            } else {
                xk5.k("Null text");
                throw null;
            }
        }
        xk5.k("Null id");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiLabelData) {
            JavaScriptUiLabelData javaScriptUiLabelData = (JavaScriptUiLabelData) obj;
            if (this.id.equals(javaScriptUiLabelData.id()) && this.required == javaScriptUiLabelData.required() && this.text.equals(javaScriptUiLabelData.text())) {
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
        return this.text.hashCode() ^ (((hashCode * 1000003) ^ i) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLabelData
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLabelData
    public boolean required() {
        return this.required;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiLabelData
    public String text() {
        return this.text;
    }

    public String toString() {
        String str = this.id;
        int length = String.valueOf(str).length();
        boolean z = this.required;
        int length2 = String.valueOf(z).length();
        String str2 = this.text;
        StringBuilder sb = new StringBuilder(length + 36 + length2 + 7 + String.valueOf(str2).length() + 1);
        sb.append("JavaScriptUiLabelData{id=");
        sb.append(str);
        sb.append(", required=");
        sb.append(z);
        return nk2.v(sb, ", text=", str2, "}");
    }
}
