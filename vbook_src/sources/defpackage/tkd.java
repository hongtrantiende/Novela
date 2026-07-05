package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tkd  reason: default package */
/* loaded from: classes.dex */
public final class tkd extends ContentObserver {
    public final /* synthetic */ xy0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkd(xy0 xy0Var, Handler handler) {
        super(handler);
        this.a = xy0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.j(pvc.a);
    }
}
