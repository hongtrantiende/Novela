package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class ImageSize {
    public static ImageSize create(int i, int i2) {
        return new AutoValue_ImageSize(i, i2);
    }

    public static m6f createFromVastSizeString(String str) {
        if (str == null) {
            return c6f.a;
        }
        String[] split = str.split("x", -1);
        if (split.length != 2) {
            return m6f.c(create(0, 0));
        }
        try {
            return m6f.c(create(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
        } catch (NumberFormatException unused) {
            return m6f.c(create(0, 0));
        }
    }

    public abstract int height();

    public abstract int width();
}
