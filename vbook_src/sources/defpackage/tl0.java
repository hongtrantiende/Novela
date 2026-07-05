package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tl0  reason: default package */
/* loaded from: classes.dex */
public final class tl0 implements l8c {
    public final Bitmap a;

    public tl0(Bitmap bitmap) {
        bitmap.getClass();
        this.a = bitmap;
        bitmap.getWidth();
        bitmap.getHeight();
        bitmap.getByteCount();
    }

    @Override // defpackage.l8c
    public final boolean b() {
        Bitmap bitmap = this.a;
        bitmap.getClass();
        return bitmap.isRecycled();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tl0.class == obj.getClass()) {
            return c16.i(this.a, ((tl0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapTileImage(bitmap=");
        Bitmap bitmap = this.a;
        bitmap.getClass();
        StringBuilder sb2 = new StringBuilder("Bitmap@");
        int hashCode = bitmap.hashCode();
        nqe.u(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb2.append(num);
        sb2.append('(');
        sb2.append(bitmap.getWidth());
        sb2.append('x');
        sb2.append(bitmap.getHeight());
        sb2.append(',');
        sb2.append(bitmap.getConfig());
        sb2.append(')');
        return s21.p(sb, sb2.toString(), ')');
    }

    @Override // defpackage.l8c
    public final void a() {
    }
}
