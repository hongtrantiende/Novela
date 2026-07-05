package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ql0  reason: default package */
/* loaded from: classes.dex */
public final class ql0 implements ml5 {
    public final Bitmap a;

    public ql0(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.ml5
    public final int d() {
        return this.a.getHeight();
    }

    @Override // defpackage.ml5
    public final int e() {
        return this.a.getWidth();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ql0) && c16.i(this.a, ((ql0) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ml5
    public final long f() {
        return h50.m(this.a);
    }

    @Override // defpackage.ml5
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ml5
    public final void h(Canvas canvas) {
        canvas.drawBitmap(this.a, nae.e, nae.e, (Paint) null);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=true)";
    }
}
