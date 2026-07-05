package defpackage;

import android.util.SparseArray;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r40  reason: default package */
/* loaded from: classes.dex */
public final class r40 {
    public static final mm9 e;
    public static final r40 f;
    public static final mm9 g;
    public static final rm9 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final qs5 c;
    public final qs5 d;

    static {
        mm9 r = qs5.r(12);
        e = r;
        f = new r40(qs5.r(q40.d), r, mm9.e);
        Object[] objArr = {2, 5, 6};
        yte.o(3, objArr);
        g = qs5.h(3, objArr);
        kj kjVar = new kj(4);
        kjVar.v(5, 6);
        kjVar.v(17, 6);
        kjVar.v(7, 6);
        kjVar.v(30, 10);
        kjVar.v(18, 6);
        kjVar.v(6, 8);
        kjVar.v(8, 8);
        kjVar.v(14, 8);
        h = kjVar.d(true);
    }

    public r40(mm9 mm9Var, List list, List list2) {
        for (int i = 0; i < mm9Var.d; i++) {
            q40 q40Var = (q40) mm9Var.get(i);
            this.a.put(q40Var.a, q40Var);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((q40) this.a.valueAt(i3)).b);
        }
        this.b = i2;
        this.c = qs5.l(list);
        this.d = qs5.l(list2);
    }

    public static mm9 a(int i, int[] iArr) {
        ls5 i2 = qs5.i();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            i2.b(new q40(i3, i));
        }
        return i2.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
        if (r0.equals("Xiaomi") == false) goto L46;
     */
    /* JADX WARN: Type inference failed for: r11v4, types: [ss5, hs5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.r40 b(android.content.Context r8, android.content.Intent r9, defpackage.l40 r10, android.media.AudioDeviceInfo r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r40.b(android.content.Context, android.content.Intent, l40, android.media.AudioDeviceInfo, java.util.List):r40");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ca, code lost:
        if (r8 != 5) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair c(defpackage.l40 r13, defpackage.vq4 r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r40.c(l40, vq4):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r40) {
                r40 r40Var = (r40) obj;
                if (a2d.m(this.a, r40Var.a) && this.b == r40Var.b && Objects.equals(this.c, r40Var.c) && Objects.equals(this.d, r40Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n = a2d.n(this.a);
        int hashCode = Objects.hashCode(this.c);
        return Objects.hashCode(this.d) + ((hashCode + ((n + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
