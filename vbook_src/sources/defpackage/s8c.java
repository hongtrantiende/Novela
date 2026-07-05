package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s8c  reason: default package */
/* loaded from: classes3.dex */
public final class s8c {
    public final wc4 a;
    public final wn5 b;
    public final im9 c;
    public jm9 i;
    public final hm8 d = yae.z(new zy5(0));
    public final hm8 e = yae.z(rk9.e);
    public final qra f = new qra();
    public final h23 g = yae.q(new q8c(this, 0));
    public final hm8 h = yae.z(null);
    public final LinkedHashMap j = new LinkedHashMap();
    public final sw7 k = new sw7();
    public final f82 l = ab3.a.j0(1);
    public final HashSet m = new HashSet();

    public s8c(wc4 wc4Var, wn5 wn5Var, im9 im9Var, p8c p8cVar) {
        this.a = wc4Var;
        this.b = wn5Var;
        this.c = im9Var;
    }

    public static final void a(s8c s8cVar, t8c t8cVar, vy5 vy5Var) {
        Iterator it = s8cVar.f.b.iterator();
        while (true) {
            z1 z1Var = (z1) it;
            if (z1Var.hasNext()) {
                Map.Entry entry = (Map.Entry) ((hza) it).next();
                s7c s7cVar = (s7c) entry.getValue();
                if (((t8c) entry.getKey()).a != t8cVar.a) {
                    vy5 vy5Var2 = s7cVar.b;
                    if (vy5Var2.a >= vy5Var.a && vy5Var2.b >= vy5Var.b && vy5Var2.c <= vy5Var.c && vy5Var2.d <= vy5Var.d) {
                        z1Var.remove();
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[Catch: all -> 0x00a9, TRY_ENTER, TryCatch #2 {all -> 0x00a9, blocks: (B:18:0x006a, B:28:0x0089, B:30:0x008f, B:31:0x0099, B:33:0x009f, B:36:0x00ae), top: B:115:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.s8c r22, defpackage.m82 r23, long r24, defpackage.rk9 r26, defpackage.n42 r27) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s8c.b(s8c, m82, long, rk9, n42):java.lang.Object");
    }
}
