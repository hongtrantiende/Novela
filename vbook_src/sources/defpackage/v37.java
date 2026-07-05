package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v37  reason: default package */
/* loaded from: classes.dex */
public class v37 extends MediaBrowserService {
    public final /* synthetic */ bm1 a;

    public v37(bm1 bm1Var, Context context) {
        this.a = bm1Var;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        y57.a(bundle);
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        bm1 bm1Var = this.a;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) bm1Var.d;
        int i2 = -1;
        if (bundle2 != null && bundle2.getInt("extra_client_version", 0) != 0) {
            bundle2.remove("extra_client_version");
            bm1Var.c = new Messenger((Handler) null);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("extra_service_version", 2);
            bundle3.putBinder("extra_messenger", ((Messenger) bm1Var.c).getBinder());
            ((ArrayList) bm1Var.f).add(bundle3);
            i2 = bundle2.getInt("extra_calling_pid", -1);
            bundle2.remove("extra_calling_pid");
        }
        new HashMap();
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    a67.a(i2, i, str);
                }
                mediaBrowserServiceCompat.a();
                return null;
            }
            vs.m("packageName should be nonempty");
            return null;
        }
        xk5.k("package shouldn't be null");
        return null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        ((MediaBrowserServiceCompat) this.a.d).b();
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        ((MediaBrowserService.Result) new n07(result, 25).b).sendResult(null);
    }
}
