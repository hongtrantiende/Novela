package defpackage;

import android.content.Context;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wga  reason: default package */
/* loaded from: classes.dex */
public final class wga {
    public final py4 a;
    public final u7 b;
    public final Context c;
    public final String d;
    public final mfb e;
    public final Set f;

    public wga(Context context, String str, Set set, py4 py4Var, u7 u7Var) {
        Set G0;
        context.getClass();
        set.getClass();
        mm7 mm7Var = new mm7(26, context, str);
        this.a = py4Var;
        this.b = u7Var;
        this.c = context;
        this.d = str;
        this.e = new mfb(mm7Var);
        if (set == yga.a) {
            G0 = null;
        } else {
            G0 = sl1.G0(set);
        }
        this.f = G0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r4.isEmpty() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.vga
            if (r0 == 0) goto L13
            r0 = r6
            vga r0 = (defpackage.vga) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vga r0 = new vga
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r6)
            r0.c = r2
            py4 r6 = r4.a
            java.lang.Object r6 = r6.invoke(r5, r0)
            n82 r5 = defpackage.n82.a
            if (r6 != r5) goto L3c
            return r5
        L3c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 != 0) goto L47
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L47:
            mfb r5 = r4.e
            r6 = 0
            java.util.Set r4 = r4.f
            if (r4 != 0) goto L64
            java.lang.Object r4 = r5.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.util.Map r4 = r4.getAll()
            r4.getClass()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L62
            goto L90
        L62:
            r2 = r6
            goto L90
        L64:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L7a
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7a
            goto L62
        L7a:
            java.util.Iterator r4 = r4.iterator()
        L7e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L7e
        L90:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wga.a(java.lang.Object, n42):java.lang.Object");
    }
}
