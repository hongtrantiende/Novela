package defpackage;

import androidx.glance.session.SessionWorker;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rba  reason: default package */
/* loaded from: classes3.dex */
public final class rba extends fb6 implements vt4 {
    public static final rba b = new rba(0);
    public final /* synthetic */ int a = 1;

    public /* synthetic */ rba(int i) {
        super(i);
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return k27.c();
            default:
                throw new IllegalStateException("No default glance id");
        }
    }

    public rba(SessionWorker sessionWorker) {
        super(0);
    }
}
