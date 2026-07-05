package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m8a  reason: default package */
/* loaded from: classes.dex */
public abstract class m8a {
    public static final Comparator[] a;
    public static final f8a b;

    static {
        kn4 kn4Var;
        Comparator[] comparatorArr = new Comparator[2];
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                kn4Var = kn4.f;
            } else {
                kn4Var = kn4.d;
            }
            comparatorArr[i] = new la3(new la3(kn4Var), 8);
        }
        a = comparatorArr;
        b = f8a.Q;
    }

    public static final void a(b8a b8aVar, ArrayList arrayList, jc jcVar, jc jcVar2, wu7 wu7Var) {
        u7a u7aVar = b8aVar.d;
        Object g = u7aVar.a.g(h8a.n);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) jcVar2.invoke(b8aVar)).booleanValue()) && ((Boolean) jcVar.invoke(b8aVar)).booleanValue()) {
            arrayList.add(b8aVar);
        }
        if (booleanValue) {
            wu7Var.i(b8aVar.f, b(b8aVar, jcVar, jcVar2, b8a.j(7, b8aVar)));
            return;
        }
        List j = b8a.j(7, b8aVar);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            a((b8a) j.get(i), arrayList, jcVar, jcVar2, wu7Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed A[LOOP:1: B:12:0x0046->B:35:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5 A[EDGE_INSN: B:53:0x00f5->B:37:0x00f5 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(defpackage.b8a r17, defpackage.jc r18, defpackage.jc r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8a.b(b8a, jc, jc, java.util.List):java.util.ArrayList");
    }
}
