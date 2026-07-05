package androidx.glance.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class GlanceRemoteViewsService extends RemoteViewsService {
    public static final lz6 a = new lz6(1);

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra != -1) {
            int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
            if (intExtra2 != -1) {
                String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
                if (stringExtra != null && stringExtra.length() != 0) {
                    return new zy4(this, intExtra, intExtra2, stringExtra);
                }
                vs.k("No size info was present in the intent");
                return null;
            }
            vs.k("No view id was present in the intent");
            return null;
        }
        vs.k("No app widget id was present in the intent");
        return null;
    }
}
