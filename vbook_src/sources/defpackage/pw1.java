package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pw1  reason: default package */
/* loaded from: classes.dex */
public final class pw1 implements l8c {
    public final tl0 a;
    public final jj b;

    public pw1(tl0 tl0Var) {
        this.a = tl0Var;
        Bitmap bitmap = tl0Var.a;
        bitmap.getClass();
        this.b = new jj(bitmap);
    }

    @Override // defpackage.l8c
    public final boolean b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pw1.class == obj.getClass()) {
            return this.a.equals(((pw1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "ComposeTileImage(tileImage=" + this.a + ")";
    }

    @Override // defpackage.l8c
    public final void a() {
    }
}
