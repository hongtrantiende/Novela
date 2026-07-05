package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q37  reason: default package */
/* loaded from: classes.dex */
public final class q37 extends Handler {
    public final WeakReference a;
    public WeakReference b;

    public q37(s37 s37Var) {
        this.a = new WeakReference(s37Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.b;
        if (weakReference != null && weakReference.get() != null) {
            WeakReference weakReference2 = this.a;
            if (weakReference2.get() != null) {
                Bundle data = message.getData();
                y57.a(data);
                s37 s37Var = (s37) weakReference2.get();
                Messenger messenger = (Messenger) this.b.get();
                try {
                    int i = message.what;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                                return;
                            }
                            y57.a(data.getBundle("data_options"));
                            y57.a(data.getBundle("data_notify_children_changed_options"));
                            String string = data.getString("data_media_item_id");
                            data.getParcelableArrayList("data_media_item_list");
                            if (s37Var.g == messenger) {
                                if (s37Var.e.get(string) == null) {
                                    if (u37.b) {
                                        Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
                                        return;
                                    }
                                    return;
                                }
                                throw new ClassCastException();
                            }
                            return;
                        }
                        s37Var.getClass();
                        return;
                    }
                    y57.a(data.getBundle("data_root_hints"));
                    data.getString("data_media_item_id");
                    MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) data.getParcelable("data_media_session_token");
                    s37Var.getClass();
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        s37Var.getClass();
                    }
                }
            }
        }
    }
}
