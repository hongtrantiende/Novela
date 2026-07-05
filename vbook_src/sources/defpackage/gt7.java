package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gt7  reason: default package */
/* loaded from: classes.dex */
public final class gt7 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public gt7(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((tj5) iInterface).getClass();
        obj.getClass();
        this.a.b.remove((Integer) obj);
    }
}
