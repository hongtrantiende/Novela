package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dke  reason: default package */
/* loaded from: classes.dex */
public final class dke extends jhe {
    public final yhe a;

    public dke(yhe yheVar) {
        this.a = yheVar;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.a != yhe.D) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dke) && ((dke) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(dke.class, this.a);
    }

    public final String toString() {
        return hl5.n("ChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.a), ")");
    }
}
