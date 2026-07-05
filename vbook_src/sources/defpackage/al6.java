package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: al6  reason: default package */
/* loaded from: classes.dex */
public abstract class al6 extends y28 {
    public Object d;

    @Override // defpackage.y28
    public final cp3 A() {
        return this.a;
    }

    public final String H() {
        return c(u());
    }

    public final void I() {
        String str;
        Object obj = this.d;
        if (!(obj instanceof j40)) {
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            j40 j40Var = new j40();
            this.d = j40Var;
            j40Var.n(u(), str);
        }
    }

    @Override // defpackage.y28
    public final String a(String str) {
        I();
        return super.a(str);
    }

    @Override // defpackage.y28
    public final String c(String str) {
        str.getClass();
        if (!(this.d instanceof j40)) {
            if (c16.i(u(), str)) {
                Object obj = this.d;
                obj.getClass();
                return (String) obj;
            }
            return "";
        }
        return super.c(str);
    }

    @Override // defpackage.y28
    public final void d(String str, String str2) {
        I();
        super.d("pubSysKey", str2);
    }

    @Override // defpackage.y28
    public final j40 e() {
        I();
        Object obj = this.d;
        obj.getClass();
        return (j40) obj;
    }

    @Override // defpackage.y28
    public final String f() {
        cp3 cp3Var = this.a;
        if (cp3Var != null) {
            cp3Var.getClass();
            return cp3Var.f();
        }
        return "";
    }

    @Override // defpackage.y28
    public final int g() {
        return 0;
    }

    @Override // defpackage.y28
    public final y28 k(y28 y28Var) {
        al6 al6Var = (al6) super.k(y28Var);
        Object obj = this.d;
        if (obj instanceof j40) {
            al6Var.d = ((j40) obj).clone();
        }
        return al6Var;
    }

    @Override // defpackage.y28
    public final List l() {
        return y28.c;
    }

    @Override // defpackage.y28
    public final boolean p() {
        return this.d instanceof j40;
    }

    @Override // defpackage.y28
    public final String v() {
        return H();
    }
}
