package androidx.core.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class RemoteViewsCompatService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        intent.getClass();
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra != -1) {
            int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
            if (intExtra2 != -1) {
                return new pn9(this, intExtra, intExtra2);
            }
            vs.k("No view id was present in the intent");
            return null;
        }
        vs.k("No app widget id was present in the intent");
        return null;
    }
}
