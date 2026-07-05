package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ole  reason: default package */
/* loaded from: classes.dex */
public final class ole extends jhe {
    public final fje a;
    public final String b;
    public final lie c;
    public final jhe d;

    public ole(fje fjeVar, String str, lie lieVar, jhe jheVar) {
        this.a = fjeVar;
        this.b = str;
        this.c = lieVar;
        this.d = jheVar;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.a != fje.C) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ole) {
            ole oleVar = (ole) obj;
            if (oleVar.c != this.c || !oleVar.d.equals(this.d) || !oleVar.b.equals(this.b) || oleVar.a != this.a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(ole.class, this.b, this.c, this.d, this.a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        return nk2.w(nk2.y("LegacyKmsEnvelopeAead Parameters (kekUri: ", this.b, ", dekParsingStrategy: ", valueOf, ", dekParametersForNewKeys: "), String.valueOf(this.d), ", variant: ", String.valueOf(this.a), ")");
    }
}
