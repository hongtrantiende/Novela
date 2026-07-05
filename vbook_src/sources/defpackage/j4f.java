package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j4f  reason: default package */
/* loaded from: classes.dex */
public final class j4f extends bfe {
    public final s6f a;

    public j4f(s6f s6fVar) {
        this.a = s6fVar;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (((ogf) this.a.b).z() != eif.RAW) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        ogf ogfVar = (ogf) this.a.b;
        if (obj instanceof j4f) {
            s6f s6fVar = ((j4f) obj).a;
            eif z = ogfVar.z();
            ogf ogfVar2 = (ogf) s6fVar.b;
            if (z.equals(ogfVar2.z()) && ogfVar.B().equals(ogfVar2.B()) && ogfVar.A().equals(ogfVar2.A())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        s6f s6fVar = this.a;
        return Objects.hash((ogf) s6fVar.b, (hlf) s6fVar.a);
    }

    public final String toString() {
        String str;
        ogf ogfVar = (ogf) this.a.b;
        String B = ogfVar.B();
        int i = o4f.a[ogfVar.z().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        return hl5.o("(typeUrl=", B, ", outputPrefixType=", str, ")");
    }
}
