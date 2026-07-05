package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vk3  reason: default package */
/* loaded from: classes.dex */
public abstract class vk3 {
    public static final ye6 a = ipe.x(sk6.c, new qk3(13));

    public static final long a(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return (Float.floatToRawIntBits(drawable.getIntrinsicWidth()) << 32) | (Float.floatToRawIntBits(drawable.getIntrinsicHeight()) & 4294967295L);
        }
        return 9205357640488583168L;
    }
}
