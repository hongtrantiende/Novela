package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ske  reason: default package */
/* loaded from: classes.dex */
public final class ske extends jhe {
    public final String a;
    public final zhe b;

    public ske(String str, zhe zheVar) {
        this.a = str;
        this.b = zheVar;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.b != zhe.E) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ske) {
            ske skeVar = (ske) obj;
            if (!skeVar.a.equals(this.a) || skeVar.b != this.b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(ske.class, this.a, this.b);
    }

    public final String toString() {
        return hl5.o("LegacyKmsAead Parameters (keyUri: ", this.a, ", variant: ", String.valueOf(this.b), ")");
    }
}
