package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pj9  reason: default package */
/* loaded from: classes.dex */
public final class pj9 {
    public final Context a;
    public final gp5 b;
    public final mfb c;
    public final mfb d;
    public final mfb e;
    public final nu1 f;

    public pj9(Context context, gp5 gp5Var, mfb mfbVar, mfb mfbVar2, mfb mfbVar3, nu1 nu1Var) {
        this.a = context;
        this.b = gp5Var;
        this.c = mfbVar;
        this.d = mfbVar2;
        this.e = mfbVar3;
        this.f = nu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pj9) {
            pj9 pj9Var = (pj9) obj;
            if (c16.i(this.a, pj9Var.a) && this.b.equals(pj9Var.b) && this.c == pj9Var.c && this.d == pj9Var.d && this.e == pj9Var.e && this.f == pj9Var.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = sz0.d.hashCode();
        return (this.f.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        sz0 sz0Var = sz0.d;
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + sz0Var + ", componentRegistry=" + this.f + ", logger=null)";
    }
}
