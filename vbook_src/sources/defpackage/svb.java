package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: svb  reason: default package */
/* loaded from: classes3.dex */
public final class svb implements qvb {
    public final qwb a;

    static {
        r76[] r76VarArr = qwb.A;
    }

    public svb(qwb qwbVar) {
        this.a = qwbVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|(1:(1:9)(2:36|37))(2:38|(4:40|(2:43|41)|44|45)(2:46|(1:48)))|10|11|12|13|(3:15|(2:18|16)|19)|(2:21|22)(1:24)))|49|6|(0)(0)|10|11|12|13|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
        r7 = r7.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        if (r7 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
        if (defpackage.jy.a() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
        r8 = defpackage.kw6.b;
        r0 = defpackage.iea.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
        if (r8.a.a.compareTo(r0) <= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
        r8.a(r0, "Log", r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(defpackage.n42 r8) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svb.a(n42):java.io.Serializable");
    }

    public final void b(List list) {
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mvb mvbVar = (mvb) it.next();
            arrayList.add(new pvb(mvbVar.a, mvbVar.b, mvbVar.c));
        }
        this.a.z.e(qwb.A[27], arrayList);
    }
}
