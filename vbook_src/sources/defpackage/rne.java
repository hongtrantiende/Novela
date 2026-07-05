package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rne  reason: default package */
/* loaded from: classes.dex */
public final class rne extends jhe {
    public final oce a;
    public final int b;

    public rne(int i, oce oceVar) {
        this.a = oceVar;
        this.b = i;
    }

    public static rne b(int i, oce oceVar) {
        if (i >= 8 && i <= 12) {
            return new rne(i, oceVar);
        }
        hfd.j("Salt size must be between 8 and 12 bytes");
        return null;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.a != oce.F) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rne) {
            rne rneVar = (rne) obj;
            if (rneVar.a == this.a && rneVar.b == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(rne.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return s21.k("X-AES-GCM Parameters (variant: ", this.b, String.valueOf(this.a), "salt_size_bytes: ", ")");
    }
}
