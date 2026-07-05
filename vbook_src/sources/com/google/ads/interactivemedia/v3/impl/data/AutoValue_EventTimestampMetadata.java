package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.EventTimestampMetadata;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_EventTimestampMetadata extends EventTimestampMetadata {
    private final String androidVersion;
    private final String manufacturer;
    private final String model;
    private final int requestCounter;
    private final String sdkVersion;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder implements EventTimestampMetadata.Builder {
        private String androidVersion;
        private String manufacturer;
        private String model;
        private int requestCounter;
        private String sdkVersion;
        private byte set$0;

        @Override // com.google.ads.interactivemedia.v3.impl.data.EventTimestampMetadata.Builder
        public EventTimestampMetadata.Builder androidVersion(String str) {
            if (str != null) {
                this.androidVersion = str;
                return this;
            }
            xk5.k("Null androidVersion");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.EventTimestampMetadata.Builder
        public EventTimestampMetadata build() {
            String str;
            String str2;
            String str3;
            String str4;
            if (this.set$0 == 1 && (str = this.model) != null && (str2 = this.manufacturer) != null && (str3 = this.sdkVersion) != null && (str4 = this.androidVersion) != null) {
                return new AutoValue_EventTimestampMetadata(str, str2, str3, str4, this.requestCounter, null);
            }
            StringBuilder sb = new StringBuilder();
            if (this.model == null) {
                sb.append(" model");
            }
            if (this.manufacturer == null) {
                sb.append(" manufacturer");
            }
            if (this.sdkVersion == null) {
                sb.append(" sdkVersion");
            }
            if (this.androidVersion == null) {
                sb.append(" androidVersion");
            }
            if ((this.set$0 & 1) == 0) {
                sb.append(" requestCounter");
            }
            vs.k("Missing required properties:".concat(sb.toString()));
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.EventTimestampMetadata.Builder
        public EventTimestampMetadata.Builder manufacturer(String str) {
            if (str != null) {
                this.manufacturer = str;
                return this;
            }
            xk5.k("Null manufacturer");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.EventTimestampMetadata.Builder
        public EventTimestampMetadata.Builder model(String str) {
            if (str != null) {
                this.model = str;
                return this;
            }
            xk5.k("Null model");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.EventTimestampMetadata.Builder
        public EventTimestampMetadata.Builder requestCounter(int i) {
            this.requestCounter = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.EventTimestampMetadata.Builder
        public EventTimestampMetadata.Builder sdkVersion(String str) {
            if (str != null) {
                this.sdkVersion = str;
                return this;
            }
            xk5.k("Null sdkVersion");
            return null;
        }
    }

    private AutoValue_EventTimestampMetadata(String str, String str2, String str3, String str4, int i) {
        this.model = str;
        this.manufacturer = str2;
        this.sdkVersion = str3;
        this.androidVersion = str4;
        this.requestCounter = i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.EventTimestampMetadata
    public String androidVersion() {
        return this.androidVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventTimestampMetadata) {
            EventTimestampMetadata eventTimestampMetadata = (EventTimestampMetadata) obj;
            if (this.model.equals(eventTimestampMetadata.model()) && this.manufacturer.equals(eventTimestampMetadata.manufacturer()) && this.sdkVersion.equals(eventTimestampMetadata.sdkVersion()) && this.androidVersion.equals(eventTimestampMetadata.androidVersion()) && this.requestCounter == eventTimestampMetadata.requestCounter()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.model.hashCode() ^ 1000003) * 1000003) ^ this.manufacturer.hashCode()) * 1000003) ^ this.sdkVersion.hashCode();
        return this.requestCounter ^ (((hashCode * 1000003) ^ this.androidVersion.hashCode()) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.EventTimestampMetadata
    public String manufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.EventTimestampMetadata
    public String model() {
        return this.model;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.EventTimestampMetadata
    public int requestCounter() {
        return this.requestCounter;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.EventTimestampMetadata
    public String sdkVersion() {
        return this.sdkVersion;
    }

    public String toString() {
        String str = this.model;
        int length = String.valueOf(str).length();
        String str2 = this.manufacturer;
        int length2 = String.valueOf(str2).length();
        String str3 = this.sdkVersion;
        int length3 = String.valueOf(str3).length();
        String str4 = this.androidVersion;
        int length4 = String.valueOf(str4).length();
        int i = this.requestCounter;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 13 + length3 + 17 + length4 + 17 + String.valueOf(i).length() + 1);
        nk2.C(sb, "EventTimestampMetadata{model=", str, ", manufacturer=", str2);
        nk2.C(sb, ", sdkVersion=", str3, ", androidVersion=", str4);
        sb.append(", requestCounter=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public /* synthetic */ AutoValue_EventTimestampMetadata(String str, String str2, String str3, String str4, int i, byte[] bArr) {
        this(str, str2, str3, str4, i);
    }
}
