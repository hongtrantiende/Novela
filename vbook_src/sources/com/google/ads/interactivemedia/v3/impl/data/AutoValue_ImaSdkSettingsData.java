package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_ImaSdkSettingsData extends ImaSdkSettingsData {
    private final boolean autoPlayAdBreaks;
    private final boolean debugMode;
    private final l8f featureFlags;
    private final int numRedirects;
    private final String playerType;
    private final String playerVersion;
    private final String ppid;
    private final String sessionId;
    private final boolean supportsMultipleVideoDisplayChannels;
    private final TestingConfiguration testingConfig;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder extends ImaSdkSettingsData.Builder {
        private boolean autoPlayAdBreaks;
        private boolean debugMode;
        private l8f featureFlags;
        private int numRedirects;
        private String playerType;
        private String playerVersion;
        private String ppid;
        private String sessionId;
        private byte set$0;
        private boolean supportsMultipleVideoDisplayChannels;
        private TestingConfiguration testingConfig;

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData build() {
            if (this.set$0 != 15) {
                StringBuilder sb = new StringBuilder();
                if ((this.set$0 & 1) == 0) {
                    sb.append(" supportsMultipleVideoDisplayChannels");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" numRedirects");
                }
                if ((this.set$0 & 4) == 0) {
                    sb.append(" autoPlayAdBreaks");
                }
                if ((this.set$0 & 8) == 0) {
                    sb.append(" debugMode");
                }
                vs.k("Missing required properties:".concat(sb.toString()));
                return null;
            }
            return new AutoValue_ImaSdkSettingsData(this.supportsMultipleVideoDisplayChannels, this.ppid, this.playerType, this.playerVersion, this.numRedirects, this.autoPlayAdBreaks, this.debugMode, this.sessionId, this.testingConfig, this.featureFlags, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setAutoPlayAdBreaks(boolean z) {
            this.autoPlayAdBreaks = z;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setDebugMode(boolean z) {
            this.debugMode = z;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setFeatureFlags(Map<String, String> map) {
            l8f a;
            if (map == null) {
                a = null;
            } else {
                a = l8f.a(map);
            }
            this.featureFlags = a;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setNumRedirects(int i) {
            this.numRedirects = i;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setPlayerType(String str) {
            this.playerType = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setPlayerVersion(String str) {
            this.playerVersion = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setPpid(String str) {
            this.ppid = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setSupportsMultipleVideoDisplayChannels(boolean z) {
            this.supportsMultipleVideoDisplayChannels = z;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData.Builder
        public ImaSdkSettingsData.Builder setTestingConfig(TestingConfiguration testingConfiguration) {
            this.testingConfig = testingConfiguration;
            return this;
        }
    }

    private AutoValue_ImaSdkSettingsData(boolean z, String str, String str2, String str3, int i, boolean z2, boolean z3, String str4, TestingConfiguration testingConfiguration, l8f l8fVar) {
        this.supportsMultipleVideoDisplayChannels = z;
        this.ppid = str;
        this.playerType = str2;
        this.playerVersion = str3;
        this.numRedirects = i;
        this.autoPlayAdBreaks = z2;
        this.debugMode = z3;
        this.sessionId = str4;
        this.testingConfig = testingConfiguration;
        this.featureFlags = l8fVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public boolean autoPlayAdBreaks() {
        return this.autoPlayAdBreaks;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public boolean debugMode() {
        return this.debugMode;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        TestingConfiguration testingConfiguration;
        l8f l8fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImaSdkSettingsData) {
            ImaSdkSettingsData imaSdkSettingsData = (ImaSdkSettingsData) obj;
            if (this.supportsMultipleVideoDisplayChannels == imaSdkSettingsData.supportsMultipleVideoDisplayChannels() && ((str = this.ppid) != null ? str.equals(imaSdkSettingsData.ppid()) : imaSdkSettingsData.ppid() == null) && ((str2 = this.playerType) != null ? str2.equals(imaSdkSettingsData.playerType()) : imaSdkSettingsData.playerType() == null) && ((str3 = this.playerVersion) != null ? str3.equals(imaSdkSettingsData.playerVersion()) : imaSdkSettingsData.playerVersion() == null) && this.numRedirects == imaSdkSettingsData.numRedirects() && this.autoPlayAdBreaks == imaSdkSettingsData.autoPlayAdBreaks() && this.debugMode == imaSdkSettingsData.debugMode() && ((str4 = this.sessionId) != null ? str4.equals(imaSdkSettingsData.sessionId()) : imaSdkSettingsData.sessionId() == null) && ((testingConfiguration = this.testingConfig) != null ? testingConfiguration.equals(imaSdkSettingsData.testingConfig()) : imaSdkSettingsData.testingConfig() == null) && ((l8fVar = this.featureFlags) != null ? l8fVar.equals(imaSdkSettingsData.featureFlags()) : imaSdkSettingsData.featureFlags() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public l8f featureFlags() {
        return this.featureFlags;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int i2;
        int hashCode4;
        int hashCode5;
        String str = this.ppid;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = 1231;
        if (true != this.supportsMultipleVideoDisplayChannels) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i5 = hashCode ^ ((i ^ 1000003) * 1000003);
        String str2 = this.playerType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i6 = ((i5 * 1000003) ^ hashCode2) * 1000003;
        String str3 = this.playerVersion;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i7 = (((i6 ^ hashCode3) * 1000003) ^ this.numRedirects) * 1000003;
        if (true != this.autoPlayAdBreaks) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i8 = (i7 ^ i2) * 1000003;
        if (true != this.debugMode) {
            i4 = 1237;
        }
        int i9 = (i8 ^ i4) * 1000003;
        String str4 = this.sessionId;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i10 = (i9 ^ hashCode4) * 1000003;
        TestingConfiguration testingConfiguration = this.testingConfig;
        if (testingConfiguration == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = testingConfiguration.hashCode();
        }
        int i11 = (i10 ^ hashCode5) * 1000003;
        l8f l8fVar = this.featureFlags;
        if (l8fVar != null) {
            i3 = l8fVar.hashCode();
        }
        return i11 ^ i3;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public int numRedirects() {
        return this.numRedirects;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public String playerType() {
        return this.playerType;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public String playerVersion() {
        return this.playerVersion;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public String ppid() {
        return this.ppid;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public String sessionId() {
        return this.sessionId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public boolean supportsMultipleVideoDisplayChannels() {
        return this.supportsMultipleVideoDisplayChannels;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImaSdkSettingsData
    public TestingConfiguration testingConfig() {
        return this.testingConfig;
    }

    public String toString() {
        l8f l8fVar = this.featureFlags;
        String valueOf = String.valueOf(this.testingConfig);
        String valueOf2 = String.valueOf(l8fVar);
        boolean z = this.supportsMultipleVideoDisplayChannels;
        int length = String.valueOf(z).length();
        String str = this.ppid;
        int length2 = String.valueOf(str).length();
        String str2 = this.playerType;
        int length3 = String.valueOf(str2).length();
        String str3 = this.playerVersion;
        int length4 = String.valueOf(str3).length();
        int i = this.numRedirects;
        int length5 = String.valueOf(i).length();
        boolean z2 = this.autoPlayAdBreaks;
        int length6 = String.valueOf(z2).length();
        boolean z3 = this.debugMode;
        int length7 = String.valueOf(z3).length();
        String str4 = this.sessionId;
        int length8 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 63 + length2 + 13 + length3 + 16 + length4 + 15 + length5 + 19 + length6 + 12 + length7 + 12 + length8 + 16 + valueOf.length() + 15 + valueOf2.length() + 1);
        sb.append("ImaSdkSettingsData{supportsMultipleVideoDisplayChannels=");
        sb.append(z);
        sb.append(", ppid=");
        sb.append(str);
        nk2.C(sb, ", playerType=", str2, ", playerVersion=", str3);
        sb.append(", numRedirects=");
        sb.append(i);
        sb.append(", autoPlayAdBreaks=");
        sb.append(z2);
        sb.append(", debugMode=");
        sb.append(z3);
        sb.append(", sessionId=");
        sb.append(str4);
        nk2.C(sb, ", testingConfig=", valueOf, ", featureFlags=", valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public /* synthetic */ AutoValue_ImaSdkSettingsData(boolean z, String str, String str2, String str3, int i, boolean z2, boolean z3, String str4, TestingConfiguration testingConfiguration, l8f l8fVar, byte[] bArr) {
        this(z, str, str2, str3, i, z2, z3, str4, testingConfiguration, l8fVar);
    }
}
