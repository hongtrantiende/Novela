package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kye  reason: default package */
/* loaded from: classes.dex */
public final class kye extends wze {
    public final hye a;
    public final fye b;
    public final eye c;
    public final gye d;

    public kye(hye hyeVar, fye fyeVar, eye eyeVar, gye gyeVar) {
        this.a = hyeVar;
        this.b = fyeVar;
        this.c = eyeVar;
        this.d = gyeVar;
    }

    public static odd b() {
        odd oddVar = new odd(16, false);
        oddVar.b = null;
        oddVar.c = null;
        oddVar.d = null;
        oddVar.e = gye.d;
        return oddVar;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.d != gye.d) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kye)) {
            return false;
        }
        kye kyeVar = (kye) obj;
        if (this.a != kyeVar.a || this.b != kyeVar.b || this.c != kyeVar.c || this.d != kyeVar.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kye.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.a);
        return nk2.w(nk2.y("HPKE Parameters (Variant: ", valueOf, ", KemId: ", valueOf2, ", KdfId: "), String.valueOf(this.b), ", AeadId: ", String.valueOf(this.c), ")");
    }
}
