package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eh4  reason: default package */
/* loaded from: classes.dex */
public final class eh4 {
    public static final eh4 a = new Object();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static ch4 a(oba obaVar) {
        Map map = b;
        map.getClass();
        Object obj = map.get(obaVar);
        if (obj != null) {
            return (ch4) obj;
        }
        fb4.g(obaVar, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009b -> B:21:0x009c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.n42 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.dh4
            if (r0 == 0) goto L13
            r0 = r9
            dh4 r0 = (defpackage.dh4) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            dh4 r0 = new dh4
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r8 = r0.f
            int r9 = r0.D
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L3c
            if (r9 != r2) goto L36
            java.lang.Object r9 = r0.e
            java.util.Map r3 = r0.d
            java.util.Map r3 = (java.util.Map) r3
            oba r4 = r0.c
            java.util.Iterator r5 = r0.b
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.util.Map r6 = r0.a
            java.util.Map r6 = (java.util.Map) r6
            defpackage.hre.r(r8)
            goto L9c
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r1
        L3c:
            defpackage.hre.r(r8)
            java.util.Map r8 = defpackage.eh4.b
            r8.getClass()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            int r3 = r8.size()
            int r3 = defpackage.p17.k(r3)
            r9.<init>(r3)
            java.util.Set r8 = r8.entrySet()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r3 = r9
        L5d:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto Lb4
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r4 = r8.getKey()
            oba r4 = (defpackage.oba) r4
            java.lang.Object r8 = r8.getValue()
            ch4 r8 = (defpackage.ch4) r8
            t42 r6 = new t42
            r7 = 19
            r6.<init>(r8, r7)
            r8 = r3
            java.util.Map r8 = (java.util.Map) r8
            r0.a = r8
            r7 = r5
            java.util.Iterator r7 = (java.util.Iterator) r7
            r0.b = r7
            r0.c = r4
            r0.d = r8
            r0.e = r9
            r0.D = r2
            java.lang.Object r8 = defpackage.st0.r(r6, r0)
            n82 r6 = defpackage.n82.a
            if (r8 != r6) goto L9b
            return r6
        L9b:
            r6 = r3
        L9c:
            r4.getClass()
            ch4 r8 = a(r4)
            f92 r8 = r8.b
            if (r8 == 0) goto Lac
            r3.put(r9, r8)
            r3 = r6
            goto L5d
        Lac:
            java.lang.String r8 = "Subscriber "
            java.lang.String r9 = " has not been registered."
            defpackage.fb4.g(r4, r9, r8)
            return r1
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh4.b(n42):java.lang.Object");
    }
}
