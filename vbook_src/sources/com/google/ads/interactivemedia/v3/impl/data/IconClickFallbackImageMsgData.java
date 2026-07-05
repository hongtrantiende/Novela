package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class IconClickFallbackImageMsgData {
    public static IconClickFallbackImageMsgData create(int i, int i2, String str, String str2, String str3) {
        return new AutoValue_IconClickFallbackImageMsgData(i, i2, str, str2, str3);
    }

    public abstract String alternateText();

    public abstract String creativeType();

    public String getAlternateText() {
        return alternateText();
    }

    public String getCreativeType() {
        return creativeType();
    }

    public int getHeight() {
        return height();
    }

    public String getResourceUri() {
        return imageUrl();
    }

    public int getWidth() {
        return width();
    }

    public abstract int height();

    public abstract String imageUrl();

    public final String toString() {
        int width = width();
        int height = height();
        String imageUrl = imageUrl();
        String alternateText = alternateText();
        String creativeType = creativeType();
        int length = String.valueOf(width).length();
        int length2 = String.valueOf(height).length();
        int length3 = String.valueOf(imageUrl).length();
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 11 + length3 + 16 + String.valueOf(alternateText).length() + 15 + String.valueOf(creativeType).length() + 1);
        a82.t(width, height, "IconClickFallbackImageMsgData [width=", ", height=", sb);
        nk2.C(sb, ", imageUrl=", imageUrl, ", alternateText=", alternateText);
        return nk2.v(sb, ", creativeType=", creativeType, "]");
    }

    public abstract int width();
}
