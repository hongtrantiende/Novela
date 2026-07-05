package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r50  reason: default package */
/* loaded from: classes.dex */
public final class r50 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final l40 g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public r50(q50 q50Var) {
        this.a = q50Var.a;
        this.b = q50Var.b;
        this.c = q50Var.c;
        this.d = q50Var.d;
        this.e = q50Var.e;
        this.f = q50Var.f;
        this.g = q50Var.g;
        this.h = q50Var.h;
        this.i = q50Var.i;
        this.j = q50Var.j;
        this.k = q50Var.k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q50] */
    public final q50 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r50.class == obj.getClass()) {
                r50 r50Var = (r50) obj;
                if (this.a == r50Var.a && this.b == r50Var.b && this.c == r50Var.c && this.d == r50Var.d && this.e == r50Var.e && this.f == r50Var.f && this.h == r50Var.h && this.i == r50Var.i && this.j == r50Var.j && this.k == r50Var.k && this.g.equals(r50Var.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
