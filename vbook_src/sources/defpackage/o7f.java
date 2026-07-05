package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o7f  reason: default package */
/* loaded from: classes.dex */
public final class o7f extends wze {
    public final int a;
    public final int b;
    public final oce c;

    public o7f(int i, int i2, oce oceVar) {
        this.a = i;
        this.b = i2;
        this.c = oceVar;
    }

    public static jje b() {
        jje jjeVar = new jje(12);
        jjeVar.d = null;
        jjeVar.b = null;
        jjeVar.c = oce.J;
        return jjeVar;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.c != oce.J) {
            return true;
        }
        return false;
    }

    public final int c() {
        oce oceVar = oce.J;
        int i = this.b;
        oce oceVar2 = this.c;
        if (oceVar2 == oceVar) {
            return i;
        }
        if (oceVar2 == oce.G) {
            return i + 5;
        }
        if (oceVar2 == oce.H) {
            return i + 5;
        }
        if (oceVar2 == oce.I) {
            return i + 5;
        }
        vs.k("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o7f)) {
            return false;
        }
        o7f o7fVar = (o7f) obj;
        if (o7fVar.a != this.a || o7fVar.c() != c() || o7fVar.c != this.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(o7f.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        return rs8.g(this.a, "-byte key)", s21.s("AES-CMAC Parameters (variant: ", String.valueOf(this.c), ", ", this.b, "-byte tags, and "));
    }
}
