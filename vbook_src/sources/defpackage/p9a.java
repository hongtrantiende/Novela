package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p9a  reason: default package */
/* loaded from: classes3.dex */
public final class p9a implements o9a, h51 {
    public final o9a a;
    public final String b;
    public final Set c;

    public p9a(o9a o9aVar) {
        o9aVar.getClass();
        this.a = o9aVar;
        this.b = o9aVar.a() + '?';
        this.c = q1d.e(o9aVar);
    }

    @Override // defpackage.o9a
    public final String a() {
        return this.b;
    }

    @Override // defpackage.h51
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.o9a
    public final boolean c() {
        return true;
    }

    @Override // defpackage.o9a
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.o9a
    public final bze e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9a)) {
            return false;
        }
        if (c16.i(this.a, ((p9a) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.o9a
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.o9a
    public final String g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.o9a
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.o9a
    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.o9a
    public final o9a i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.o9a
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.o9a
    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
