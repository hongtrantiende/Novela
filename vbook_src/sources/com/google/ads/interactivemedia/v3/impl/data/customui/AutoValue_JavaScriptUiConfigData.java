package com.google.ads.interactivemedia.v3.impl.data.customui;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class AutoValue_JavaScriptUiConfigData extends JavaScriptUiConfigData {
    private final JavaScriptUiLinkData adTitle;
    private final JavaScriptUiLabelData attribution;
    private final JavaScriptUiIconData authorIcon;
    private final JavaScriptUiLinkData authorName;
    private final JavaScriptUiButtonData callToAction;
    private final List<JavaScriptUiVastIconData> icons;
    private final JavaScriptUiSkipData skip;
    private final JavaScriptUiElementData videoOverlay;

    public AutoValue_JavaScriptUiConfigData(JavaScriptUiElementData javaScriptUiElementData, JavaScriptUiButtonData javaScriptUiButtonData, JavaScriptUiLabelData javaScriptUiLabelData, JavaScriptUiSkipData javaScriptUiSkipData, List<JavaScriptUiVastIconData> list, JavaScriptUiLinkData javaScriptUiLinkData, JavaScriptUiIconData javaScriptUiIconData, JavaScriptUiLinkData javaScriptUiLinkData2) {
        this.videoOverlay = javaScriptUiElementData;
        this.callToAction = javaScriptUiButtonData;
        this.attribution = javaScriptUiLabelData;
        this.skip = javaScriptUiSkipData;
        this.icons = list;
        this.adTitle = javaScriptUiLinkData;
        this.authorIcon = javaScriptUiIconData;
        this.authorName = javaScriptUiLinkData2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    public JavaScriptUiLinkData adTitle() {
        return this.adTitle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    public JavaScriptUiLabelData attribution() {
        return this.attribution;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    public JavaScriptUiIconData authorIcon() {
        return this.authorIcon;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    public JavaScriptUiLinkData authorName() {
        return this.authorName;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    public JavaScriptUiButtonData callToAction() {
        return this.callToAction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiConfigData) {
            JavaScriptUiConfigData javaScriptUiConfigData = (JavaScriptUiConfigData) obj;
            JavaScriptUiElementData javaScriptUiElementData = this.videoOverlay;
            if (javaScriptUiElementData != null ? javaScriptUiElementData.equals(javaScriptUiConfigData.videoOverlay()) : javaScriptUiConfigData.videoOverlay() == null) {
                JavaScriptUiButtonData javaScriptUiButtonData = this.callToAction;
                if (javaScriptUiButtonData != null ? javaScriptUiButtonData.equals(javaScriptUiConfigData.callToAction()) : javaScriptUiConfigData.callToAction() == null) {
                    JavaScriptUiLabelData javaScriptUiLabelData = this.attribution;
                    if (javaScriptUiLabelData != null ? javaScriptUiLabelData.equals(javaScriptUiConfigData.attribution()) : javaScriptUiConfigData.attribution() == null) {
                        JavaScriptUiSkipData javaScriptUiSkipData = this.skip;
                        if (javaScriptUiSkipData != null ? javaScriptUiSkipData.equals(javaScriptUiConfigData.skip()) : javaScriptUiConfigData.skip() == null) {
                            List<JavaScriptUiVastIconData> list = this.icons;
                            if (list != null ? list.equals(javaScriptUiConfigData.icons()) : javaScriptUiConfigData.icons() == null) {
                                JavaScriptUiLinkData javaScriptUiLinkData = this.adTitle;
                                if (javaScriptUiLinkData != null ? javaScriptUiLinkData.equals(javaScriptUiConfigData.adTitle()) : javaScriptUiConfigData.adTitle() == null) {
                                    JavaScriptUiIconData javaScriptUiIconData = this.authorIcon;
                                    if (javaScriptUiIconData != null ? javaScriptUiIconData.equals(javaScriptUiConfigData.authorIcon()) : javaScriptUiConfigData.authorIcon() == null) {
                                        JavaScriptUiLinkData javaScriptUiLinkData2 = this.authorName;
                                        if (javaScriptUiLinkData2 != null ? javaScriptUiLinkData2.equals(javaScriptUiConfigData.authorName()) : javaScriptUiConfigData.authorName() == null) {
                                            return true;
                                        }
                                    }
                                }
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
        int hashCode5;
        int hashCode6;
        int hashCode7;
        JavaScriptUiElementData javaScriptUiElementData = this.videoOverlay;
        int i = 0;
        if (javaScriptUiElementData == null) {
            hashCode = 0;
        } else {
            hashCode = javaScriptUiElementData.hashCode();
        }
        JavaScriptUiButtonData javaScriptUiButtonData = this.callToAction;
        if (javaScriptUiButtonData == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = javaScriptUiButtonData.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        JavaScriptUiLabelData javaScriptUiLabelData = this.attribution;
        if (javaScriptUiLabelData == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = javaScriptUiLabelData.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        JavaScriptUiSkipData javaScriptUiSkipData = this.skip;
        if (javaScriptUiSkipData == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = javaScriptUiSkipData.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        List<JavaScriptUiVastIconData> list = this.icons;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        JavaScriptUiLinkData javaScriptUiLinkData = this.adTitle;
        if (javaScriptUiLinkData == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = javaScriptUiLinkData.hashCode();
        }
        int i6 = (i5 ^ hashCode6) * 1000003;
        JavaScriptUiIconData javaScriptUiIconData = this.authorIcon;
        if (javaScriptUiIconData == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = javaScriptUiIconData.hashCode();
        }
        int i7 = (i6 ^ hashCode7) * 1000003;
        JavaScriptUiLinkData javaScriptUiLinkData2 = this.authorName;
        if (javaScriptUiLinkData2 != null) {
            i = javaScriptUiLinkData2.hashCode();
        }
        return i7 ^ i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    public List<JavaScriptUiVastIconData> icons() {
        return this.icons;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    public JavaScriptUiSkipData skip() {
        return this.skip;
    }

    public String toString() {
        JavaScriptUiLinkData javaScriptUiLinkData = this.authorName;
        JavaScriptUiIconData javaScriptUiIconData = this.authorIcon;
        JavaScriptUiLinkData javaScriptUiLinkData2 = this.adTitle;
        List<JavaScriptUiVastIconData> list = this.icons;
        JavaScriptUiSkipData javaScriptUiSkipData = this.skip;
        JavaScriptUiLabelData javaScriptUiLabelData = this.attribution;
        JavaScriptUiButtonData javaScriptUiButtonData = this.callToAction;
        String valueOf = String.valueOf(this.videoOverlay);
        String valueOf2 = String.valueOf(javaScriptUiButtonData);
        String valueOf3 = String.valueOf(javaScriptUiLabelData);
        String valueOf4 = String.valueOf(javaScriptUiSkipData);
        String valueOf5 = String.valueOf(list);
        String valueOf6 = String.valueOf(javaScriptUiLinkData2);
        String valueOf7 = String.valueOf(javaScriptUiIconData);
        String valueOf8 = String.valueOf(javaScriptUiLinkData);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        int length5 = valueOf5.length();
        int length6 = valueOf6.length();
        StringBuilder sb = new StringBuilder(length + 51 + length2 + 14 + length3 + 7 + length4 + 8 + length5 + 10 + length6 + 13 + valueOf7.length() + 13 + valueOf8.length() + 1);
        nk2.C(sb, "JavaScriptUiConfigData{videoOverlay=", valueOf, ", callToAction=", valueOf2);
        nk2.C(sb, ", attribution=", valueOf3, ", skip=", valueOf4);
        nk2.C(sb, ", icons=", valueOf5, ", adTitle=", valueOf6);
        nk2.C(sb, ", authorIcon=", valueOf7, ", authorName=", valueOf8);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    public JavaScriptUiElementData videoOverlay() {
        return this.videoOverlay;
    }
}
