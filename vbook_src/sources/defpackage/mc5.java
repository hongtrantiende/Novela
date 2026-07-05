package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mc5  reason: default package */
/* loaded from: classes3.dex */
public final class mc5 {
    public final String a;
    public final int[] b;

    public mc5(String str, int[] iArr) {
        str.getClass();
        this.a = str;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mc5) {
                mc5 mc5Var = (mc5) obj;
                if (!c16.i(this.a, mc5Var.a) || !this.b.equals(mc5Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("TextWithSourceBoundaries(value=", this.a, ", sourceBoundaryByTextOffset=", Arrays.toString(this.b), ")");
    }
}
