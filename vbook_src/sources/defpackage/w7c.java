package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w7c  reason: default package */
/* loaded from: classes.dex */
public final class w7c extends aab implements mu4 {
    public sw7 C;
    public Object D;
    public sw7 E;
    public k8c F;
    public long G;
    public float H;
    public int I;
    public int J;
    public /* synthetic */ tj4 K;
    public /* synthetic */ ii0 L;
    public final /* synthetic */ k8c M;
    public qw7 a;
    public Object b;
    public List c;
    public sw7 d;
    public Object e;
    public hi0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7c(m42 m42Var, k8c k8cVar) {
        super(3, m42Var);
        this.M = k8cVar;
    }

    public static final ArrayList o(k8c k8cVar, List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hi0 hi0Var = (hi0) it.next();
            pi8 pi8Var = (pi8) k8cVar.l.get(hi0Var);
            if (pi8Var == null) {
                Set entrySet = k8cVar.l.entrySet();
                entrySet.getClass();
                Iterator it2 = entrySet.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        Map.Entry entry = (Map.Entry) obj;
                        if (c16.i(((hi0) entry.getKey()).a, hi0Var.a) && ((hi0) entry.getKey()).b == hi0Var.b) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 != null) {
                    pi8Var = (pi8) entry2.getValue();
                } else {
                    pi8Var = null;
                }
            }
            if (pi8Var != null) {
                arrayList.add(pi8Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        w7c w7cVar = new w7c((m42) obj3, this.M);
        w7cVar.K = (tj4) obj;
        w7cVar.L = (ii0) obj2;
        return w7cVar.invokeSuspend(pvc.a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x037e A[Catch: all -> 0x03b1, TryCatch #9 {all -> 0x03b1, blocks: (B:112:0x035f, B:113:0x0378, B:115:0x037e, B:117:0x038f, B:119:0x039d, B:121:0x03a5, B:126:0x03ba, B:128:0x03c7, B:129:0x03d3), top: B:165:0x035f }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c7 A[Catch: all -> 0x03b1, LOOP:1: B:127:0x03c5->B:128:0x03c7, LOOP_END, TryCatch #9 {all -> 0x03b1, blocks: (B:112:0x035f, B:113:0x0378, B:115:0x037e, B:117:0x038f, B:119:0x039d, B:121:0x03a5, B:126:0x03ba, B:128:0x03c7, B:129:0x03d3), top: B:165:0x035f }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0173 A[Catch: all -> 0x01fa, TRY_LEAVE, TryCatch #6 {all -> 0x01fa, blocks: (B:22:0x0167, B:24:0x0173), top: B:161:0x0167 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e4 A[Catch: all -> 0x0124, TryCatch #3 {all -> 0x0124, blocks: (B:13:0x011c, B:51:0x01df, B:53:0x01e4, B:49:0x01d6), top: B:155:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023b A[LOOP:2: B:74:0x0235->B:76:0x023b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e7 A[Catch: all -> 0x02ee, TRY_LEAVE, TryCatch #8 {all -> 0x02ee, blocks: (B:96:0x02dd, B:98:0x02e7), top: B:163:0x02dd }] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v6, types: [qw7] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [qw7] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x0413 -> B:136:0x0416). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x041e -> B:137:0x041b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0430 -> B:137:0x041b). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
