package defpackage;

import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zy4  reason: default package */
/* loaded from: classes.dex */
public final class zy4 implements RemoteViewsService.RemoteViewsFactory {
    public final GlanceRemoteViewsService a;
    public final int b;
    public final int c;
    public final String d;

    public zy4(GlanceRemoteViewsService glanceRemoteViewsService, int i, int i2, String str) {
        this.a = glanceRemoteViewsService;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
        if (r13 != null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.zy4 r12, defpackage.ux r13, defpackage.n42 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.yy4
            if (r0 == 0) goto L13
            r0 = r14
            yy4 r0 = (defpackage.yy4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            yy4 r0 = new yy4
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.b
            int r1 = r0.d
            pvc r2 = defpackage.pvc.a
            r3 = 3
            r4 = 1
            r9 = 0
            n82 r11 = defpackage.n82.a
            if (r1 == 0) goto L45
            if (r1 == r4) goto L3f
            r12 = 2
            if (r1 == r12) goto L37
            if (r1 != r3) goto L30
            defpackage.hre.r(r14)
            return r2
        L30:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            r12 = 0
            return r12
        L37:
            defpackage.hre.r(r14)
            w26 r14 = (defpackage.w26) r14
            r13 = r14
            goto La0
        L3f:
            zy4 r12 = r0.a
            defpackage.hre.r(r14)
            goto L91
        L45:
            defpackage.hre.r(r14)
            androidx.glance.appwidget.GlanceRemoteViewsService r14 = r12.a
            android.appwidget.AppWidgetManager r14 = android.appwidget.AppWidgetManager.getInstance(r14)
            int r1 = r12.b
            android.appwidget.AppWidgetProviderInfo r14 = r14.getAppWidgetInfo(r1)
            if (r14 == 0) goto L77
            android.content.ComponentName r14 = r14.provider
            if (r14 == 0) goto L77
            java.lang.String r14 = r14.getClassName()
            if (r14 == 0) goto L77
            java.lang.Class r14 = java.lang.Class.forName(r14)
            java.lang.reflect.Constructor r14 = r14.getDeclaredConstructor(r9)
            java.lang.Object r14 = r14.newInstance(r9)
            r14.getClass()
            androidx.glance.appwidget.GlanceAppWidgetReceiver r14 = (androidx.glance.appwidget.GlanceAppWidgetReceiver) r14
            aib r14 = r14.b()
            r8 = r14
            goto L78
        L77:
            r8 = r9
        L78:
            if (r8 == 0) goto L97
            lba r14 = defpackage.mba.a
            l r5 = new l
            r10 = 29
            r6 = r12
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r0.a = r6
            r0.d = r4
            java.lang.Object r14 = r14.a(r5, r0)
            if (r14 != r11) goto L90
            goto Lac
        L90:
            r12 = r6
        L91:
            r13 = r14
            w26 r13 = (defpackage.w26) r13
            if (r13 != 0) goto La0
            goto L98
        L97:
            r6 = r12
        L98:
            d38 r13 = androidx.glance.appwidget.UnmanagedSessionReceiver.a
            int r12 = r12.b
            defpackage.d38.p(r12)
            r13 = r9
        La0:
            if (r13 == 0) goto Lad
            r0.a = r9
            r0.d = r3
            java.lang.Object r12 = r13.join(r0)
            if (r12 != r11) goto Lad
        Lac:
            return r11
        Lad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy4.a(zy4, ux, n42):java.lang.Object");
    }

    public final hn9 b() {
        hn9 hn9Var;
        lz6 lz6Var = GlanceRemoteViewsService.a;
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        lz6 lz6Var2 = GlanceRemoteViewsService.a;
        synchronized (lz6Var2) {
            hn9Var = (hn9) lz6Var2.a.get(lz6.a(i, i2, str));
            if (hn9Var == null) {
                hn9Var = hn9.d;
            }
        }
        return hn9Var;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return b().a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return b().a[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return b().b[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.a.getPackageName(), (int) R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return b().c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        b().getClass();
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        z87.B(new o54(this, (m42) null, 7));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        lz6 lz6Var = GlanceRemoteViewsService.a;
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        lz6 lz6Var2 = GlanceRemoteViewsService.a;
        synchronized (lz6Var2) {
            lz6Var2.a.remove(lz6.a(i, i2, str));
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }
}
