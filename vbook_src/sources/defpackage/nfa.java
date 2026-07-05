package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nfa  reason: default package */
/* loaded from: classes3.dex */
public final class nfa {
    public final List a;
    public final float b;
    public final float c;

    public nfa(List list, float f, float f2) {
        this.a = list;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nfa) {
                nfa nfaVar = (nfa) obj;
                if (!this.a.equals(nfaVar.a) || Float.compare(this.b, nfaVar.b) != 0 || Float.compare(this.c, nfaVar.c) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + nk2.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FaceInfo(indices=" + this.a + ", depth=" + this.b + ", normalZ=" + this.c + ")";
    }
}
