package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class ResizeAndPositionVideoMsgData {
    public static ResizeAndPositionVideoMsgData create(Integer num, Integer num2, Integer num3, Integer num4) {
        return new AutoValue_ResizeAndPositionVideoMsgData(num, num2, num3, num4);
    }

    public abstract Integer height();

    public final String toString() {
        Integer x = x();
        Integer y = y();
        Integer width = width();
        Integer height = height();
        int length = String.valueOf(x).length();
        int length2 = String.valueOf(y).length();
        StringBuilder sb = new StringBuilder(length + 37 + length2 + 8 + String.valueOf(width).length() + 9 + String.valueOf(height).length() + 1);
        sb.append("ResizeAndPositionVideoMsgData [x=");
        sb.append(x);
        sb.append(", y=");
        sb.append(y);
        sb.append(", width=");
        sb.append(width);
        sb.append(", height=");
        sb.append(height);
        sb.append("]");
        return sb.toString();
    }

    public abstract Integer width();

    public abstract Integer x();

    public abstract Integer y();
}
