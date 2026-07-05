package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lwe  reason: default package */
/* loaded from: classes.dex */
public final class lwe extends bfe {
    public final int a;
    public final jwe b;

    public lwe(int i, jwe jweVar) {
        this.a = i;
        this.b = jweVar;
    }

    public static hvc b() {
        hvc hvcVar = new hvc(16, false);
        hvcVar.b = null;
        hvcVar.c = jwe.d;
        return hvcVar;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.b != jwe.d) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lwe)) {
            return false;
        }
        lwe lweVar = (lwe) obj;
        if (lweVar.a != this.a || lweVar.b != this.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(lwe.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return s21.k("AesSiv Parameters (variant: ", this.a, String.valueOf(this.b), ", ", "-byte key)");
    }
}
