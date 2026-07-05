package com.reader.app.widget.tts;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class TTSWidgetReceiver extends GlanceAppWidgetReceiver implements p96 {
    public final ye6 b = ipe.x(sk6.a, new vm(this, 6));

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver
    public final aib b() {
        return new aib();
    }

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver, android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        super.onUpdate(context, appWidgetManager, iArr);
        ((djb) this.b.getValue()).d();
    }
}
