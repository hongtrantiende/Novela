package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l32  reason: default package */
/* loaded from: classes3.dex */
public final class l32 implements o9a {
    public final q9a a;
    public final gi1 b;
    public final String c;

    public l32(q9a q9aVar, gi1 gi1Var) {
        gi1Var.getClass();
        this.a = q9aVar;
        this.b = gi1Var;
        this.c = q9aVar.a + '<' + gi1Var.g() + '>';
    }

    @Override // defpackage.o9a
    public final String a() {
        return this.c;
    }

    @Override // defpackage.o9a
    public final boolean c() {
        return false;
    }

    @Override // defpackage.o9a
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.o9a
    public final bze e() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        l32 l32Var;
        if (obj instanceof l32) {
            l32Var = (l32) obj;
        } else {
            l32Var = null;
        }
        if (l32Var != null && this.a.equals(l32Var.a) && c16.i(l32Var.b, this.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.o9a
    public final int f() {
        return this.a.c;
    }

    @Override // defpackage.o9a
    public final String g(int i) {
        return this.a.f[i];
    }

    @Override // defpackage.o9a
    public final List getAnnotations() {
        return this.a.d;
    }

    @Override // defpackage.o9a
    public final List h(int i) {
        return this.a.h[i];
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.o9a
    public final o9a i(int i) {
        return this.a.g[i];
    }

    @Override // defpackage.o9a
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.o9a
    public final boolean j(int i) {
        return this.a.i[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
