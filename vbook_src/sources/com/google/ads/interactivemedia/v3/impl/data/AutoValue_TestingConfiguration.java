package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_TestingConfiguration extends TestingConfiguration {
    private final boolean disableExperiments;
    private final boolean disableOnScreenDetection;
    private final boolean disableSkipFadeTransition;
    private final boolean enableMonitorAppLifecycle;
    private final boolean enableStrictJsonParsing;
    private final l8f extraParams;
    private final boolean forceAndroidTvMode;
    private final a8f forceExperimentIds;
    private final boolean forceTvMode;
    private final boolean ignoreStrictModeFalsePositives;
    private final boolean useTestStreamManager;
    private final boolean useVideoElementMock;
    private final float videoElementMockDuration;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static final class Builder implements TestingConfiguration.Builder {
        private boolean disableExperiments;
        private boolean disableOnScreenDetection;
        private boolean disableSkipFadeTransition;
        private boolean enableMonitorAppLifecycle;
        private boolean enableStrictJsonParsing;
        private l8f extraParams;
        private boolean forceAndroidTvMode;
        private a8f forceExperimentIds;
        private boolean forceTvMode;
        private boolean ignoreStrictModeFalsePositives;
        private short set$0;
        private boolean useTestStreamManager;
        private boolean useVideoElementMock;
        private float videoElementMockDuration;

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration build() {
            if (this.set$0 != 2047) {
                StringBuilder sb = new StringBuilder();
                if ((this.set$0 & 1) == 0) {
                    sb.append(" disableExperiments");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" disableOnScreenDetection");
                }
                if ((this.set$0 & 4) == 0) {
                    sb.append(" disableSkipFadeTransition");
                }
                if ((this.set$0 & 8) == 0) {
                    sb.append(" useVideoElementMock");
                }
                if ((this.set$0 & 16) == 0) {
                    sb.append(" videoElementMockDuration");
                }
                if ((this.set$0 & 32) == 0) {
                    sb.append(" useTestStreamManager");
                }
                if ((this.set$0 & 64) == 0) {
                    sb.append(" enableMonitorAppLifecycle");
                }
                if ((this.set$0 & 128) == 0) {
                    sb.append(" forceTvMode");
                }
                if ((this.set$0 & 256) == 0) {
                    sb.append(" forceAndroidTvMode");
                }
                if ((this.set$0 & 512) == 0) {
                    sb.append(" ignoreStrictModeFalsePositives");
                }
                if ((this.set$0 & 1024) == 0) {
                    sb.append(" enableStrictJsonParsing");
                }
                vs.k("Missing required properties:".concat(sb.toString()));
                return null;
            }
            return new AutoValue_TestingConfiguration(this.disableExperiments, this.disableOnScreenDetection, this.disableSkipFadeTransition, this.forceExperimentIds, this.useVideoElementMock, this.videoElementMockDuration, this.useTestStreamManager, this.enableMonitorAppLifecycle, this.forceTvMode, this.forceAndroidTvMode, this.ignoreStrictModeFalsePositives, this.enableStrictJsonParsing, this.extraParams, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder disableExperiments(boolean z) {
            this.disableExperiments = z;
            this.set$0 = (short) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder disableOnScreenDetection(boolean z) {
            this.disableOnScreenDetection = z;
            this.set$0 = (short) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder disableSkipFadeTransition(boolean z) {
            this.disableSkipFadeTransition = z;
            this.set$0 = (short) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder enableMonitorAppLifecycle(boolean z) {
            this.enableMonitorAppLifecycle = z;
            this.set$0 = (short) (this.set$0 | 64);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder enableStrictJsonParsing(boolean z) {
            this.enableStrictJsonParsing = z;
            this.set$0 = (short) (this.set$0 | 1024);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder extraParams(l8f l8fVar) {
            this.extraParams = l8fVar;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder forceAndroidTvMode(boolean z) {
            this.forceAndroidTvMode = z;
            this.set$0 = (short) (this.set$0 | 256);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder forceExperimentIds(a8f a8fVar) {
            this.forceExperimentIds = a8fVar;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder forceTvMode(boolean z) {
            this.forceTvMode = z;
            this.set$0 = (short) (this.set$0 | 128);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder ignoreStrictModeFalsePositives(boolean z) {
            this.ignoreStrictModeFalsePositives = z;
            this.set$0 = (short) (this.set$0 | 512);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder useTestStreamManager(boolean z) {
            this.useTestStreamManager = z;
            this.set$0 = (short) (this.set$0 | 32);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder useVideoElementMock(boolean z) {
            this.useVideoElementMock = z;
            this.set$0 = (short) (this.set$0 | 8);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
        public TestingConfiguration.Builder videoElementMockDuration(float f) {
            this.videoElementMockDuration = f;
            this.set$0 = (short) (this.set$0 | 16);
            return this;
        }
    }

    private AutoValue_TestingConfiguration(boolean z, boolean z2, boolean z3, a8f a8fVar, boolean z4, float f, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, l8f l8fVar) {
        this.disableExperiments = z;
        this.disableOnScreenDetection = z2;
        this.disableSkipFadeTransition = z3;
        this.forceExperimentIds = a8fVar;
        this.useVideoElementMock = z4;
        this.videoElementMockDuration = f;
        this.useTestStreamManager = z5;
        this.enableMonitorAppLifecycle = z6;
        this.forceTvMode = z7;
        this.forceAndroidTvMode = z8;
        this.ignoreStrictModeFalsePositives = z9;
        this.enableStrictJsonParsing = z10;
        this.extraParams = l8fVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableExperiments() {
        return this.disableExperiments;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableOnScreenDetection() {
        return this.disableOnScreenDetection;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableSkipFadeTransition() {
        return this.disableSkipFadeTransition;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean enableMonitorAppLifecycle() {
        return this.enableMonitorAppLifecycle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean enableStrictJsonParsing() {
        return this.enableStrictJsonParsing;
    }

    public boolean equals(Object obj) {
        a8f a8fVar;
        l8f l8fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TestingConfiguration) {
            TestingConfiguration testingConfiguration = (TestingConfiguration) obj;
            if (this.disableExperiments == testingConfiguration.disableExperiments() && this.disableOnScreenDetection == testingConfiguration.disableOnScreenDetection() && this.disableSkipFadeTransition == testingConfiguration.disableSkipFadeTransition() && ((a8fVar = this.forceExperimentIds) != null ? a8fVar.equals(testingConfiguration.forceExperimentIds()) : testingConfiguration.forceExperimentIds() == null) && this.useVideoElementMock == testingConfiguration.useVideoElementMock() && Float.floatToIntBits(this.videoElementMockDuration) == Float.floatToIntBits(testingConfiguration.videoElementMockDuration()) && this.useTestStreamManager == testingConfiguration.useTestStreamManager() && this.enableMonitorAppLifecycle == testingConfiguration.enableMonitorAppLifecycle() && this.forceTvMode == testingConfiguration.forceTvMode() && this.forceAndroidTvMode == testingConfiguration.forceAndroidTvMode() && this.ignoreStrictModeFalsePositives == testingConfiguration.ignoreStrictModeFalsePositives() && this.enableStrictJsonParsing == testingConfiguration.enableStrictJsonParsing() && ((l8fVar = this.extraParams) != null ? l8fVar.equals(testingConfiguration.extraParams()) : testingConfiguration.extraParams() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public l8f extraParams() {
        return this.extraParams;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean forceAndroidTvMode() {
        return this.forceAndroidTvMode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public a8f forceExperimentIds() {
        return this.forceExperimentIds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean forceTvMode() {
        return this.forceTvMode;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        a8f a8fVar = this.forceExperimentIds;
        int i10 = 0;
        if (a8fVar == null) {
            hashCode = 0;
        } else {
            hashCode = a8fVar.hashCode();
        }
        int i11 = 1231;
        if (true != this.disableExperiments) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true != this.disableOnScreenDetection) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i12 = i ^ 1000003;
        if (true != this.disableSkipFadeTransition) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i13 = (hashCode ^ (((((i12 * 1000003) ^ i2) * 1000003) ^ i3) * 1000003)) * 1000003;
        if (true != this.useVideoElementMock) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        int floatToIntBits = (((i13 ^ i4) * 1000003) ^ Float.floatToIntBits(this.videoElementMockDuration)) * 1000003;
        if (true != this.useTestStreamManager) {
            i5 = 1237;
        } else {
            i5 = 1231;
        }
        int i14 = (floatToIntBits ^ i5) * 1000003;
        if (true != this.enableMonitorAppLifecycle) {
            i6 = 1237;
        } else {
            i6 = 1231;
        }
        int i15 = (i14 ^ i6) * 1000003;
        if (true != this.forceTvMode) {
            i7 = 1237;
        } else {
            i7 = 1231;
        }
        int i16 = (i15 ^ i7) * 1000003;
        if (true != this.forceAndroidTvMode) {
            i8 = 1237;
        } else {
            i8 = 1231;
        }
        int i17 = (i16 ^ i8) * 1000003;
        if (true != this.ignoreStrictModeFalsePositives) {
            i9 = 1237;
        } else {
            i9 = 1231;
        }
        int i18 = (i17 ^ i9) * 1000003;
        if (true != this.enableStrictJsonParsing) {
            i11 = 1237;
        }
        int i19 = (i18 ^ i11) * 1000003;
        l8f l8fVar = this.extraParams;
        if (l8fVar != null) {
            i10 = l8fVar.hashCode();
        }
        return i19 ^ i10;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean ignoreStrictModeFalsePositives() {
        return this.ignoreStrictModeFalsePositives;
    }

    public String toString() {
        l8f l8fVar = this.extraParams;
        String valueOf = String.valueOf(this.forceExperimentIds);
        String valueOf2 = String.valueOf(l8fVar);
        boolean z = this.disableExperiments;
        int length = String.valueOf(z).length();
        boolean z2 = this.disableOnScreenDetection;
        int length2 = String.valueOf(z2).length();
        boolean z3 = this.disableSkipFadeTransition;
        int length3 = String.valueOf(z3).length();
        int length4 = valueOf.length();
        boolean z4 = this.useVideoElementMock;
        int length5 = String.valueOf(z4).length();
        float f = this.videoElementMockDuration;
        int length6 = String.valueOf(f).length();
        boolean z5 = this.useTestStreamManager;
        int length7 = String.valueOf(z5).length();
        boolean z6 = this.enableMonitorAppLifecycle;
        int length8 = String.valueOf(z6).length();
        boolean z7 = this.forceTvMode;
        int length9 = String.valueOf(z7).length();
        boolean z8 = this.forceAndroidTvMode;
        int length10 = String.valueOf(z8).length();
        boolean z9 = this.ignoreStrictModeFalsePositives;
        int length11 = String.valueOf(z9).length();
        boolean z10 = this.enableStrictJsonParsing;
        StringBuilder sb = new StringBuilder(length + 67 + length2 + 28 + length3 + 21 + length4 + 22 + length5 + 27 + length6 + 23 + length7 + 28 + length8 + 14 + length9 + 21 + length10 + 33 + length11 + 26 + String.valueOf(z10).length() + 14 + valueOf2.length() + 1);
        sb.append("TestingConfiguration{disableExperiments=");
        sb.append(z);
        sb.append(", disableOnScreenDetection=");
        sb.append(z2);
        sb.append(", disableSkipFadeTransition=");
        sb.append(z3);
        sb.append(", forceExperimentIds=");
        sb.append(valueOf);
        sb.append(", useVideoElementMock=");
        sb.append(z4);
        sb.append(", videoElementMockDuration=");
        sb.append(f);
        sb.append(", useTestStreamManager=");
        sb.append(z5);
        sb.append(", enableMonitorAppLifecycle=");
        sb.append(z6);
        sb.append(", forceTvMode=");
        sb.append(z7);
        sb.append(", forceAndroidTvMode=");
        sb.append(z8);
        sb.append(", ignoreStrictModeFalsePositives=");
        sb.append(z9);
        sb.append(", enableStrictJsonParsing=");
        sb.append(z10);
        return nk2.v(sb, ", extraParams=", valueOf2, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean useTestStreamManager() {
        return this.useTestStreamManager;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean useVideoElementMock() {
        return this.useVideoElementMock;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public float videoElementMockDuration() {
        return this.videoElementMockDuration;
    }

    public /* synthetic */ AutoValue_TestingConfiguration(boolean z, boolean z2, boolean z3, a8f a8fVar, boolean z4, float f, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, l8f l8fVar, byte[] bArr) {
        this(z, z2, z3, a8fVar, z4, f, z5, z6, z7, z8, z9, z10, l8fVar);
    }
}
