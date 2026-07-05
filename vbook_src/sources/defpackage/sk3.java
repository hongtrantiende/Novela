package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sk3  reason: default package */
/* loaded from: classes.dex */
public final class sk3 implements ml5 {
    public final Drawable a;

    public sk3(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.ml5
    public final int d() {
        return n2d.a(this.a);
    }

    @Override // defpackage.ml5
    public final int e() {
        return n2d.b(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof sk3) && c16.i(this.a, ((sk3) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ml5
    public final long f() {
        Drawable drawable = this.a;
        long b = n2d.b(drawable) * 4 * n2d.a(drawable);
        if (b < 0) {
            return 0L;
        }
        return b;
    }

    @Override // defpackage.ml5
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ml5
    public final void h(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
