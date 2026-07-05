package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import com.vbook.android.R;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ey  reason: default package */
/* loaded from: classes.dex */
public final class ey {
    public final String a;
    public final AtomicBoolean b;
    public final xy0 c;
    public final aib d;
    public final ux e;
    public final ez4 f;
    public final sna g;
    public final boolean h;
    public final hm8 i;
    public final hm8 j;
    public Map k;
    public final y26 l;
    public final cza m;

    public ey(aib aibVar, ux uxVar, Bundle bundle, int i) {
        bundle = (i & 4) != 0 ? null : bundle;
        ez4 ez4Var = ez4.a;
        qna qnaVar = aibVar.b;
        this.a = jue.D(uxVar.a);
        this.b = new AtomicBoolean(true);
        this.c = xpe.a(Integer.MAX_VALUE, 6, null);
        this.d = aibVar;
        this.e = uxVar;
        this.f = ez4Var;
        this.g = qnaVar;
        this.h = true;
        int i2 = uxVar.a;
        if (Integer.MIN_VALUE <= i2 && i2 < -1) {
            vs.m("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
            throw null;
        }
        r0f r0fVar = r0f.J;
        this.i = new hm8(null, r0fVar);
        this.j = new hm8(bundle, r0fVar);
        this.k = ls3.a;
        this.l = k27.c();
        this.m = dza.a(null);
    }

    public final void a(Context context, Throwable th) {
        Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        if (this.h) {
            int i = this.e.a;
            this.d.getClass();
            AppWidgetManager.getInstance(context).updateAppWidget(i, new RemoteViews(context.getPackageName(), (int) R.layout.glance_error_layout));
            return;
        }
        throw th;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|(1:(1:(4:19|20|21|22)(1:(2:13|14)(3:16|17|18)))(1:23))(2:62|(2:64|65)(3:66|(1:68)|42))|24|25|26|27|28|29|(9:31|32|33|34|35|36|(1:38)|39|40)(2:57|58)))|69|6|(0)(0)|24|25|26|27|28|29|(0)(0)|(3:(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
        if (r3.b(r5) == r13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
        if (r3.b(r5) != r13) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0125, code lost:
        if (r3.b(r5) != r13) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (r3.b(r5) != r13) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[Catch: all -> 0x00cd, CancellationException -> 0x012c, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x012c, all -> 0x00cd, blocks: (B:30:0x0094, B:32:0x0099, B:34:0x00a1, B:38:0x00c3, B:40:0x00c7, B:43:0x00cf, B:51:0x00ee, B:52:0x0105), top: B:73:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee A[Catch: all -> 0x00cd, CancellationException -> 0x012c, TRY_ENTER, TryCatch #4 {CancellationException -> 0x012c, all -> 0x00cd, blocks: (B:30:0x0094, B:32:0x0099, B:34:0x00a1, B:38:0x00c3, B:40:0x00c7, B:43:0x00cf, B:51:0x00ee, B:52:0x0105), top: B:73:0x0094 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r21, defpackage.up3 r22, defpackage.n42 r23) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey.b(android.content.Context, up3, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r7, java.lang.Object r8, defpackage.n42 r9) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey.c(android.content.Context, java.lang.Object, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(5:11|12|13|14|(2:16|17)(5:19|20|(1:22)|24|25))(2:27|28))(6:29|30|20|(0)|24|25))(4:31|32|14|(0)(0))))|34|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r1.c(r8, r9, r0) == r4) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[Catch: lk1 -> 0x008f, TRY_LEAVE, TryCatch #0 {lk1 -> 0x008f, blocks: (B:13:0x002e, B:22:0x0058, B:26:0x006f, B:28:0x0077, B:18:0x0047, B:21:0x004e), top: B:34:0x0020 }] */
    /* JADX WARN: Type inference failed for: r7v6, types: [xt4] */
    /* JADX WARN: Type inference failed for: r7v7, types: [xt4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008c -> B:14:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r7, defpackage.gp r8, defpackage.n42 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.paa
            if (r0 == 0) goto L13
            r0 = r9
            paa r0 = (defpackage.paa) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            paa r0 = new paa
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.C
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L38
            qy0 r6 = r0.d
            xt4 r7 = r0.c
            android.content.Context r8 = r0.b
            ey r1 = r0.a
            defpackage.hre.r(r9)     // Catch: defpackage.lk1 -> L8f
        L31:
            r5 = r1
            r1 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r5
            goto L58
        L38:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L3f:
            qy0 r6 = r0.d
            xt4 r7 = r0.c
            android.content.Context r8 = r0.b
            ey r1 = r0.a
            defpackage.hre.r(r9)     // Catch: defpackage.lk1 -> L8f
            goto L6f
        L4b:
            defpackage.hre.r(r9)
            xy0 r9 = r6.c     // Catch: defpackage.lk1 -> L8f
            r9.getClass()     // Catch: defpackage.lk1 -> L8f
            qy0 r1 = new qy0     // Catch: defpackage.lk1 -> L8f
            r1.<init>(r9)     // Catch: defpackage.lk1 -> L8f
        L58:
            r0.a = r6     // Catch: defpackage.lk1 -> L8f
            r0.b = r7     // Catch: defpackage.lk1 -> L8f
            r0.c = r8     // Catch: defpackage.lk1 -> L8f
            r0.d = r1     // Catch: defpackage.lk1 -> L8f
            r0.C = r3     // Catch: defpackage.lk1 -> L8f
            java.lang.Object r9 = r1.a(r0)     // Catch: defpackage.lk1 -> L8f
            if (r9 != r4) goto L69
            goto L8e
        L69:
            r5 = r1
            r1 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r5
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: defpackage.lk1 -> L8f
            boolean r9 = r9.booleanValue()     // Catch: defpackage.lk1 -> L8f
            if (r9 == 0) goto L8f
            java.lang.Object r9 = r6.c()     // Catch: defpackage.lk1 -> L8f
            r7.invoke(r9)     // Catch: defpackage.lk1 -> L8f
            r0.a = r1     // Catch: defpackage.lk1 -> L8f
            r0.b = r8     // Catch: defpackage.lk1 -> L8f
            r0.c = r7     // Catch: defpackage.lk1 -> L8f
            r0.d = r6     // Catch: defpackage.lk1 -> L8f
            r0.C = r2     // Catch: defpackage.lk1 -> L8f
            java.lang.Object r9 = r1.c(r8, r9, r0)     // Catch: defpackage.lk1 -> L8f
            if (r9 != r4) goto L31
        L8e:
            return r4
        L8f:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey.d(android.content.Context, gp, n42):java.lang.Object");
    }

    public final Object e(Object obj, n42 n42Var) {
        Object e = this.c.e(n42Var, obj);
        if (e == n82.a) {
            return e;
        }
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dy
            if (r0 == 0) goto L13
            r0 = r5
            dy r0 = (defpackage.dy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dy r0 = new dy
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            yx r4 = r0.a
            defpackage.hre.r(r5)
            goto L4b
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            yx r5 = new yx
            y26 r1 = new y26
            y26 r3 = r4.l
            r1.<init>(r3)
            r5.<init>(r1)
            r0.a = r5
            r0.d = r2
            java.lang.Object r4 = r4.e(r5, r0)
            n82 r0 = defpackage.n82.a
            if (r4 != r0) goto L4a
            return r0
        L4a:
            r4 = r5
        L4b:
            y26 r4 = r4.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey.f(n42):java.lang.Object");
    }
}
