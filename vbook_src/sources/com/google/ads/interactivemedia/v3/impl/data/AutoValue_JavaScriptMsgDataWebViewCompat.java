package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_JavaScriptMsgDataWebViewCompat extends JavaScriptMsgDataWebViewCompat {
    private final String data;
    private final String id;
    private final String name;
    private final String sid;
    private final String type;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder extends JavaScriptMsgDataWebViewCompat.Builder {
        private String data;
        private String id;
        private String name;
        private String sid;
        private String type;

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat.Builder
        public JavaScriptMsgDataWebViewCompat build() {
            return new AutoValue_JavaScriptMsgDataWebViewCompat(this.name, this.type, this.sid, this.data, this.id, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat.Builder
        public JavaScriptMsgDataWebViewCompat.Builder setData(String str) {
            this.data = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat.Builder
        public JavaScriptMsgDataWebViewCompat.Builder setId(String str) {
            this.id = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat.Builder
        public JavaScriptMsgDataWebViewCompat.Builder setName(String str) {
            this.name = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat.Builder
        public JavaScriptMsgDataWebViewCompat.Builder setSid(String str) {
            this.sid = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat.Builder
        public JavaScriptMsgDataWebViewCompat.Builder setType(String str) {
            this.type = str;
            return this;
        }
    }

    private AutoValue_JavaScriptMsgDataWebViewCompat(String str, String str2, String str3, String str4, String str5) {
        this.name = str;
        this.type = str2;
        this.sid = str3;
        this.data = str4;
        this.id = str5;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat
    public String data() {
        return this.data;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptMsgDataWebViewCompat) {
            JavaScriptMsgDataWebViewCompat javaScriptMsgDataWebViewCompat = (JavaScriptMsgDataWebViewCompat) obj;
            String str = this.name;
            if (str != null ? str.equals(javaScriptMsgDataWebViewCompat.name()) : javaScriptMsgDataWebViewCompat.name() == null) {
                String str2 = this.type;
                if (str2 != null ? str2.equals(javaScriptMsgDataWebViewCompat.type()) : javaScriptMsgDataWebViewCompat.type() == null) {
                    String str3 = this.sid;
                    if (str3 != null ? str3.equals(javaScriptMsgDataWebViewCompat.sid()) : javaScriptMsgDataWebViewCompat.sid() == null) {
                        String str4 = this.data;
                        if (str4 != null ? str4.equals(javaScriptMsgDataWebViewCompat.data()) : javaScriptMsgDataWebViewCompat.data() == null) {
                            String str5 = this.id;
                            if (str5 != null ? str5.equals(javaScriptMsgDataWebViewCompat.id()) : javaScriptMsgDataWebViewCompat.id() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.name;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.type;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str3 = this.sid;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str4 = this.data;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        String str5 = this.id;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i4 ^ i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat
    public String name() {
        return this.name;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat
    public String sid() {
        return this.sid;
    }

    public String toString() {
        String str = this.name;
        int length = String.valueOf(str).length();
        String str2 = this.type;
        int length2 = String.valueOf(str2).length();
        String str3 = this.sid;
        int length3 = String.valueOf(str3).length();
        String str4 = this.data;
        int length4 = String.valueOf(str4).length();
        String str5 = this.id;
        StringBuilder sb = new StringBuilder(length + 43 + length2 + 6 + length3 + 7 + length4 + 5 + String.valueOf(str5).length() + 1);
        nk2.C(sb, "JavaScriptMsgDataWebViewCompat{name=", str, ", type=", str2);
        nk2.C(sb, ", sid=", str3, ", data=", str4);
        return nk2.v(sb, ", id=", str5, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat
    public String type() {
        return this.type;
    }

    public /* synthetic */ AutoValue_JavaScriptMsgDataWebViewCompat(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
        this(str, str2, str3, str4, str5);
    }
}
