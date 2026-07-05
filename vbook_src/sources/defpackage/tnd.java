package defpackage;

import android.graphics.Paint;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tnd  reason: default package */
/* loaded from: classes.dex */
public final class tnd {
    public static final tnd a = new Object();

    public final long a(Paint paint) {
        int i = zl1.j;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        if (j < 16) {
            return colorLong;
        }
        return (colorLong & (-64)) | (j + 1);
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(ff.D(i));
    }

    public final void c(Paint paint, long j) {
        paint.setColor(zpe.o(j));
    }
}
