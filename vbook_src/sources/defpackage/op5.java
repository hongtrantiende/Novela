package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: op5  reason: default package */
/* loaded from: classes.dex */
public abstract class op5 {
    public static final u4 a = new u4(c48.a, 2);
    public static final u4 b = new u4(n2d.b, 2);
    public static final u4 c = new u4((Object) null, 2);
    public static final u4 d;
    public static final u4 e;
    public static final u4 f;
    public static final u4 g;

    static {
        Boolean bool = Boolean.TRUE;
        d = new u4(bool, 2);
        e = new u4((Object) null, 2);
        f = new u4(bool, 2);
        g = new u4(Boolean.FALSE, 2);
    }

    public static final void a(fp5 fp5Var, boolean z) {
        v94 v94Var;
        Object obj = fp5Var.q;
        if (obj instanceof v94) {
            v94Var = (v94) obj;
        } else if (obj instanceof w94) {
            v94 v94Var2 = new v94((w94) obj);
            fp5Var.q = v94Var2;
            v94Var = v94Var2;
        } else {
            cp8.i();
            return;
        }
        v94Var.a.put(f, Boolean.valueOf(z));
    }

    public static final Bitmap.Config b(xe8 xe8Var) {
        return (Bitmap.Config) fca.k(xe8Var, b);
    }

    public static final ColorSpace c(xe8 xe8Var) {
        return p1a.f(fca.k(xe8Var, c));
    }
}
