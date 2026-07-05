package defpackage;

import java.io.File;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yh0  reason: default package */
/* loaded from: classes3.dex */
public class yh0 extends b6d {
    public static final wg4 b = new Object();
    public final yh0 a;

    public yh0() {
        zfb.a.getClass();
        this.a = this;
    }

    @Override // defpackage.b6d
    public final Object l(String str, n42 n42Var) {
        s02 s02Var = new s02(new xh0(this, str, null, 0), 6);
        sw2 sw2Var = ab3.a;
        return z1d.G(s02Var, ru2.c);
    }

    @Override // defpackage.b6d
    public Object n(String str, l6d l6dVar, n42 n42Var) {
        str.getClass();
        return b.b(this, new File(str), l6dVar, str, n42Var);
    }

    @Override // defpackage.b6d
    public final Object q(String str, n42 n42Var) {
        return qye.k(new ge(this, str, null, 3), n42Var);
    }

    @Override // defpackage.b6d
    public final String toString() {
        return "LocalVfs";
    }
}
