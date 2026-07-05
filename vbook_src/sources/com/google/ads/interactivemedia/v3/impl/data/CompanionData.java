package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AdViewData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class CompanionData {
    private String companionId = "";

    public static CompanionData create(String str, String str2, String str3, String str4, AdViewData.Type type) {
        CompanionData create = create(str2, str3, str4, type, 0.0d);
        create.companionId = str;
        return create;
    }

    public abstract String clickThroughUrl();

    public String companionId() {
        return this.companionId;
    }

    public abstract double companionScaleTolerance();

    public abstract String size();

    public abstract String src();

    public final String toString() {
        String companionId = companionId();
        String size = size();
        String src = src();
        String clickThroughUrl = clickThroughUrl();
        String valueOf = String.valueOf(type());
        double companionScaleTolerance = companionScaleTolerance();
        int length = String.valueOf(companionId).length();
        int length2 = String.valueOf(size).length();
        int length3 = String.valueOf(src).length();
        int length4 = String.valueOf(clickThroughUrl).length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 6 + length3 + 18 + length4 + 7 + valueOf.length() + 26 + String.valueOf(companionScaleTolerance).length() + 1);
        nk2.C(sb, "CompanionData [companionId=", companionId, ", size=", size);
        nk2.C(sb, ", src=", src, ", clickThroughUrl=", clickThroughUrl);
        sb.append(", type=");
        sb.append(valueOf);
        sb.append(", companionScaleTolerance=");
        sb.append(companionScaleTolerance);
        sb.append("]");
        return sb.toString();
    }

    public abstract AdViewData.Type type();

    private static CompanionData create(String str, String str2, String str3, AdViewData.Type type, double d) {
        return new AutoValue_CompanionData(str, str2, str3, type, d);
    }

    public static CompanionData create(String str, String str2, String str3, String str4, AdViewData.Type type, double d) {
        CompanionData create = create(str2, str3, str4, type, d);
        create.companionId = str;
        return create;
    }
}
