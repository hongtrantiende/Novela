package com.google.ads.interactivemedia.v3.impl.data;

import android.net.Uri;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_BridgeConfiguration extends BridgeConfiguration {
    private final Uri baseUri;
    private final String language;
    private final String packageName;
    private final long pageCorrelator;
    private final m6f testingConfiguration;

    public AutoValue_BridgeConfiguration(Uri uri, String str, String str2, m6f m6fVar, long j) {
        if (uri != null) {
            this.baseUri = uri;
            if (str != null) {
                this.language = str;
                if (str2 != null) {
                    this.packageName = str2;
                    if (m6fVar != null) {
                        this.testingConfiguration = m6fVar;
                        this.pageCorrelator = j;
                        return;
                    }
                    xk5.k("Null testingConfiguration");
                    throw null;
                }
                xk5.k("Null packageName");
                throw null;
            }
            xk5.k("Null language");
            throw null;
        }
        xk5.k("Null baseUri");
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration
    public Uri baseUri() {
        return this.baseUri;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BridgeConfiguration) {
            BridgeConfiguration bridgeConfiguration = (BridgeConfiguration) obj;
            if (this.baseUri.equals(bridgeConfiguration.baseUri()) && this.language.equals(bridgeConfiguration.language()) && this.packageName.equals(bridgeConfiguration.packageName()) && this.testingConfiguration.equals(bridgeConfiguration.testingConfiguration()) && this.pageCorrelator == bridgeConfiguration.pageCorrelator()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((this.baseUri.hashCode() ^ 1000003) * 1000003) ^ this.language.hashCode()) * 1000003) ^ this.packageName.hashCode()) * 1000003) ^ this.testingConfiguration.hashCode();
        long j = this.pageCorrelator;
        return ((int) (j ^ (j >>> 32))) ^ (hashCode * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration
    public String language() {
        return this.language;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration
    public String packageName() {
        return this.packageName;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration
    public long pageCorrelator() {
        return this.pageCorrelator;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration
    public m6f testingConfiguration() {
        return this.testingConfiguration;
    }

    public String toString() {
        m6f m6fVar = this.testingConfiguration;
        String valueOf = String.valueOf(this.baseUri);
        String valueOf2 = String.valueOf(m6fVar);
        int length = valueOf.length();
        String str = this.language;
        int length2 = String.valueOf(str).length();
        String str2 = this.packageName;
        int length3 = String.valueOf(str2).length();
        int length4 = valueOf2.length();
        long j = this.pageCorrelator;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 14 + length3 + 23 + length4 + 17 + String.valueOf(j).length() + 1);
        nk2.C(sb, "BridgeConfiguration{baseUri=", valueOf, ", language=", str);
        nk2.C(sb, ", packageName=", str2, ", testingConfiguration=", valueOf2);
        return a82.n(sb, ", pageCorrelator=", j, "}");
    }
}
