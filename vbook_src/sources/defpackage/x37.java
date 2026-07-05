package defpackage;

import androidx.media.MediaBrowserServiceCompat;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x37  reason: default package */
/* loaded from: classes.dex */
public class x37 extends bm1 {
    public final /* synthetic */ MediaBrowserServiceCompat E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x37(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.E = mediaBrowserServiceCompat;
    }

    @Override // defpackage.bm1
    public final void M() {
        w37 w37Var = new w37(this, this.E);
        this.b = w37Var;
        w37Var.onCreate();
    }
}
