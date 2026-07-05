package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public abstract class GlanceAppWidgetReceiver extends AppWidgetProvider {
    public final sw2 a = ab3.a;

    public static final void a(GlanceAppWidgetReceiver glanceAppWidgetReceiver, m82 m82Var, Context context) {
        z87.v(m82Var, null, null, new d53(context, glanceAppWidgetReceiver, (m42) null, 25), 3);
    }

    public abstract aib b();

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        yf2.u(this, this.a, new of(this, context, i, bundle, (m42) null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        yf2.u(this, this.a, new ty4(this, context, iArr, (m42) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[Catch: all -> 0x00a6, CancellationException -> 0x00af, TryCatch #2 {CancellationException -> 0x00af, all -> 0x00a6, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0047, B:22:0x004e, B:23:0x004f, B:24:0x0056, B:25:0x0057, B:41:0x00a2, B:31:0x006d, B:33:0x007f, B:35:0x008a, B:37:0x0096, B:36:0x0092, B:39:0x009a, B:40:0x00a1, B:28:0x0062), top: B:47:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[Catch: all -> 0x00a6, CancellationException -> 0x00af, TryCatch #2 {CancellationException -> 0x00af, all -> 0x00a6, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0047, B:22:0x004e, B:23:0x004f, B:24:0x0056, B:25:0x0057, B:41:0x00a2, B:31:0x006d, B:33:0x007f, B:35:0x008a, B:37:0x0096, B:36:0x0092, B:39:0x009a, B:40:0x00a1, B:28:0x0062), top: B:47:0x0002 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            java.lang.String r0 = "appWidgetIds"
            java.lang.String r1 = r9.getAction()     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            if (r1 == 0) goto L1b
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            r3 = -19011148(0xfffffffffedde9b4, float:-1.4748642E38)
            if (r2 == r3) goto L62
            r3 = 649033583(0x26af776f, float:1.2175437E-15)
            if (r2 == r3) goto L57
            r0 = 1989767543(0x76997177, float:1.5560991E33)
            if (r2 == r0) goto L1f
        L1b:
            r2 = r7
            r3 = r8
            goto La2
        L1f:
            java.lang.String r0 = "ACTION_TRIGGER_LAMBDA"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            if (r0 != 0) goto L28
            goto L1b
        L28:
            java.lang.String r0 = "EXTRA_ACTION_KEY"
            java.lang.String r5 = r9.getStringExtra(r0)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            if (r5 == 0) goto L4f
            java.lang.String r0 = "EXTRA_APPWIDGET_ID"
            r1 = -1
            int r4 = r9.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            if (r4 == r1) goto L47
            sw2 r9 = r7.a     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            of r1 = new of     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            r6 = 0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            defpackage.yf2.u(r2, r9, r1)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            return
        L47:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            java.lang.String r8 = "Intent is missing AppWidgetId extra"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            throw r7     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
        L4f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            java.lang.String r8 = "Intent is missing ActionKey extra"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            throw r7     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
        L57:
            r2 = r7
            r3 = r8
            java.lang.String r7 = "androidx.glance.appwidget.action.DEBUG_UPDATE"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            if (r7 != 0) goto L6d
            goto La2
        L62:
            r2 = r7
            r3 = r8
            java.lang.String r7 = "android.intent.action.LOCALE_CHANGED"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            if (r7 != 0) goto L6d
            goto La2
        L6d:
            android.appwidget.AppWidgetManager r7 = android.appwidget.AppWidgetManager.getInstance(r3)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            java.lang.String r8 = r3.getPackageName()     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            if (r1 == 0) goto L9a
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            r4.<init>(r8, r1)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            boolean r8 = r9.hasExtra(r0)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            if (r8 == 0) goto L92
            int[] r8 = r9.getIntArrayExtra(r0)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            r8.getClass()     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            goto L96
        L92:
            int[] r8 = r7.getAppWidgetIds(r4)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
        L96:
            r2.onUpdate(r3, r7, r8)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            return
        L9a:
            java.lang.String r7 = "no canonical name"
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            r8.<init>(r7)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            throw r8     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
        La2:
            super.onReceive(r3, r9)     // Catch: java.lang.Throwable -> La6 java.util.concurrent.CancellationException -> Laf
            return
        La6:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "GlanceAppWidget"
            java.lang.String r9 = "Error in Glance App Widget"
            android.util.Log.e(r8, r9, r7)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceAppWidgetReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        yf2.u(this, this.a, new l(this, context, iArr, (m42) null, 28));
    }
}
