package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h8f  reason: default package */
/* loaded from: classes.dex */
public final class h8f extends wze {
    public final int a;
    public final int b;
    public final f8f c;
    public final g8f d;

    public h8f(int i, int i2, f8f f8fVar, g8f g8fVar) {
        this.a = i;
        this.b = i2;
        this.c = f8fVar;
        this.d = g8fVar;
    }

    public static odd b() {
        odd oddVar = new odd(18, false);
        oddVar.b = null;
        oddVar.c = null;
        oddVar.d = null;
        oddVar.e = f8f.e;
        return oddVar;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.c != f8f.e) {
            return true;
        }
        return false;
    }

    public final int c() {
        f8f f8fVar = f8f.e;
        int i = this.b;
        f8f f8fVar2 = this.c;
        if (f8fVar2 == f8fVar) {
            return i;
        }
        if (f8fVar2 == f8f.b) {
            return i + 5;
        }
        if (f8fVar2 == f8f.c) {
            return i + 5;
        }
        if (f8fVar2 == f8f.d) {
            return i + 5;
        }
        vs.k("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h8f)) {
            return false;
        }
        h8f h8fVar = (h8f) obj;
        if (h8fVar.a != this.a || h8fVar.c() != c() || h8fVar.c != this.c || h8fVar.d != this.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(h8f.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        return hl5.j(this.b, this.a, "-byte tags, and ", "-byte key)", nk2.y("HMAC Parameters (variant: ", String.valueOf(this.c), ", hashType: ", String.valueOf(this.d), ", "));
    }
}
