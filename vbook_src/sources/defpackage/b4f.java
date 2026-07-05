package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b4f  reason: default package */
/* loaded from: classes.dex */
public final class b4f extends bfe {
    public final String a;
    public final eif b;

    public b4f(String str, eif eifVar) {
        this.a = str;
        this.b = eifVar;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.b != eif.RAW) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        int i = g4f.a[this.b.ordinal()];
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
        return hl5.o("(typeUrl=", this.a, ", outputPrefixType=", str, ")");
    }
}
