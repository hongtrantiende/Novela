package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: snd  reason: default package */
/* loaded from: classes3.dex */
public final class snd implements o9a {
    public final String a;
    public final o9a b;

    public snd(String str, o9a o9aVar) {
        o9aVar.getClass();
        this.a = str;
        this.b = o9aVar;
    }

    @Override // defpackage.o9a
    public final String a() {
        return this.a;
    }

    @Override // defpackage.o9a
    public final boolean c() {
        return this.b.c();
    }

    @Override // defpackage.o9a
    public final int d(String str) {
        str.getClass();
        return this.b.d(str);
    }

    @Override // defpackage.o9a
    public final bze e() {
        return this.b.e();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof snd) {
                snd sndVar = (snd) obj;
                if (this.a.equals(sndVar.a) && c16.i(this.b, sndVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.o9a
    public final int f() {
        return this.b.f();
    }

    @Override // defpackage.o9a
    public final String g(int i) {
        return this.b.g(i);
    }

    @Override // defpackage.o9a
    public final List getAnnotations() {
        return this.b.getAnnotations();
    }

    @Override // defpackage.o9a
    public final List h(int i) {
        return this.b.h(i);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.o9a
    public final o9a i(int i) {
        return this.b.i(i);
    }

    @Override // defpackage.o9a
    public final boolean isInline() {
        return this.b.isInline();
    }

    @Override // defpackage.o9a
    public final boolean j(int i) {
        return this.b.j(i);
    }

    public final String toString() {
        return hc2.t(this);
    }
}
