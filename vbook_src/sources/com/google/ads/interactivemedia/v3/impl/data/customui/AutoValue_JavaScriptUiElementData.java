package com.google.ads.interactivemedia.v3.impl.data.customui;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_JavaScriptUiElementData extends JavaScriptUiElementData {
    private final String id;
    private final boolean required;

    public AutoValue_JavaScriptUiElementData(String str, boolean z) {
        if (str != null) {
            this.id = str;
            this.required = z;
            return;
        }
        xk5.k("Null id");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiElementData) {
            JavaScriptUiElementData javaScriptUiElementData = (JavaScriptUiElementData) obj;
            if (this.id.equals(javaScriptUiElementData.id()) && this.required == javaScriptUiElementData.required()) {
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
        return i ^ (hashCode * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiElementData
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiElementData
    public boolean required() {
        return this.required;
    }

    public String toString() {
        String str = this.id;
        int length = String.valueOf(str).length();
        boolean z = this.required;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(z).length() + 1);
        sb.append("JavaScriptUiElementData{id=");
        sb.append(str);
        sb.append(", required=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
