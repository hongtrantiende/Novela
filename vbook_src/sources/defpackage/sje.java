package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sje  reason: default package */
/* loaded from: classes.dex */
public final class sje extends jhe {
    public final int a;
    public final oce b;

    public sje(int i, oce oceVar) {
        this.a = i;
        this.b = oceVar;
    }

    public static hvc b() {
        hvc hvcVar = new hvc(14, false);
        hvcVar.b = null;
        hvcVar.c = oce.D;
        return hvcVar;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.b != oce.D) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sje)) {
            return false;
        }
        sje sjeVar = (sje) obj;
        if (sjeVar.a != this.a || sjeVar.b != this.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(sje.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return s21.k("AesGcmSiv Parameters (variant: ", this.a, String.valueOf(this.b), ", ", "-byte key)");
    }
}
