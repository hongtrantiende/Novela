package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pl5  reason: default package */
/* loaded from: classes3.dex */
public final class pl5 {
    public final jj a;
    public final long b;
    public final rq2 c;

    public pl5(jj jjVar) {
        this.a = jjVar;
        Bitmap bitmap = jjVar.a;
        long width = (bitmap.getWidth() << 32) | (bitmap.getHeight() & 4294967295L);
        this.b = width;
        this.c = new rq2(1, pc2.b(0L, width));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pl5) && this.a == ((pl5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageBitmapSrc(data=" + this.a + ")";
    }
}
