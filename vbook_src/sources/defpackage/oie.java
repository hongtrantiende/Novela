package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oie  reason: default package */
/* loaded from: classes.dex */
public final class oie extends jhe {
    public final int a;
    public final int b;
    public final int c;
    public final lie d;

    public oie(int i, int i2, int i3, lie lieVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = lieVar;
    }

    public static odd b() {
        odd oddVar = new odd(10, false);
        oddVar.b = null;
        oddVar.c = null;
        oddVar.d = null;
        oddVar.e = lie.e;
        return oddVar;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.d != lie.e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oie)) {
            return false;
        }
        oie oieVar = (oie) obj;
        if (oieVar.a != this.a || oieVar.b != this.b || oieVar.c != this.c || oieVar.d != this.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(oie.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        return hl5.j(this.c, this.a, "-byte tag, and ", "-byte key)", s21.s("AesEax Parameters (variant: ", String.valueOf(this.d), ", ", this.b, "-byte IV, "));
    }
}
